/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.femass.model.Emprestimo;
import org.femass.model.Leitor;
import org.femass.model.Livro;

/**
 *
 * @author enzoappi
 */
public class EmprestimoDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Emprestimo emprestimo = (Emprestimo) object; //parse de object para Emprestimo afim de que a implementação do metodo se faça.
        String sql = "Insert into emprestimo (id_leitor, id_livro, finalizado) values (?, ?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //O segundo parametro eh pra que as chaves sejam retornadas ao serem criadas no banco
        ps.setInt(1, emprestimo.getLeitor().getId());
        ps.setInt(2, emprestimo.getLivro().getId());
        ps.setBoolean(3, emprestimo.getFinalizado());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys(); //pegar as chaves que sao retornadas apos o comando sql cria-las
        chaves.next(); //fazer com que o ponteiro ande na pilha ou lista de retorno.
        emprestimo.setId(chaves.getInt(1));
        emprestimo.getLivro().setEmprestado(Boolean.TRUE);
        new LivroDao().alterar(emprestimo.getLivro());
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Emprestimo emprestimo = (Emprestimo) object;
        String sql = "update emprestimo set finalizado = true where id_leitor = ? and id_livro = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, emprestimo.getLeitor().getId());
        ps.setInt(2, emprestimo.getLivro().getId());

        ps.executeUpdate();  
    }

    @Override
    public void apagar(Object object) throws SQLException {
        return;
    }

    @Override
    public List<Emprestimo> getLista() throws SQLException {
        String sql = "Select "
                + "id_leitor, "
                + "leitor.nome as leitornome, "
                + "id_livro, "
                + "livro.nome as livronome, "
                + "livro.editora as editora, "
                + "livro.emprestado as emprestado "
                + "from emprestimo "
                + "inner join livro on livro.id = emprestimo.id_livro "
                + "inner join leitor on leitor.id = emprestimo.id_leitor "
                + "where finalizado = false"; //constroi-se a query
        PreparedStatement ps = getConexao().prepareStatement(sql); //conecto-me ao banco
        
        ResultSet rs = ps.executeQuery(); //executo a query
        
        List<Emprestimo> emprestimos = new ArrayList(); //instancio a List para armazenar os valores de retorno da query
        while(rs.next()) { //enquanto nao chego ao fim da lista de retorno
            Emprestimo emprestimo = new Emprestimo(); //instancio um aluno para gravar os valores
            emprestimo.setFinalizado(false);
            Livro livro = new Livro();
            livro.setEditora(rs.getString("editora"));
            livro.setId(rs.getInt("id_livro"));
            livro.setNome(rs.getString("livronome"));
            emprestimo.setLivro(livro);
            Leitor leitor = new Leitor();
            leitor.setId(rs.getInt("id_leitor"));
            leitor.setNome(rs.getString("leitornome"));
            emprestimo.setLeitor(leitor);
            emprestimos.add(emprestimo);
        }
        return emprestimos; //retorno todos os alunos gravados na List
    }
}
