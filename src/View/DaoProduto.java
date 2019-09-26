/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thiago
 */
public class DaoProduto {
    ConexaoMySql conexao;
    public DaoProduto() {
        this.conexao  = new ConexaoMySql();
    }

    public void vender(Produto produto) {
        
        
        try {
            conexao.conectar();
            
            conexao.executarSQL("SELECT * FROM loja.produto WHERE nome = '"+produto.getNome()+"';");
            int qtdAtual = 0;
            int id = 0;
            while(conexao.getResultSet().next()){
                qtdAtual = conexao.getResultSet().getInt("quantidade");
                id = conexao.getResultSet().getInt("id");
            }
            
            int novaQtd = qtdAtual-produto.getQtd();
            String sql = "UPDATE `loja`.`produto` SET `quantidade`='"+ novaQtd +"' WHERE `id`='"+id+"';";
            
             conexao.insertSQL(sql);
        } catch (Exception e) {
        } finally{
            conexao.fecharConexao();
        }
    }

    public void registrar(Produto produto, String tipo, String date, String time) {
        try {
            conexao.conectar();
            
            String sql = "INSERT INTO `loja`.`registro` (`nome`, `quantidade`, `tipo`, `date`, `time`) VALUES ('"+produto.getNome()+"', '"+produto.getQtd()+"', '"+tipo+"', '"+date+"', '"+time+"');";
            
            conexao.insertSQL(sql);
        } catch (Exception e) {
        } finally{
            conexao.fecharConexao();
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Produto> read() {
        Connection con;
        con = ConnectionFactory.getConnection();
        //Variáveis para o BD     
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Conexão entre a lista e a classe Paciente
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            //Passa o comando para o CMD MySQL
            stmt = con.prepareStatement("SELECT * FROM produto;");
            rs = stmt.executeQuery();
            //Cria um laço de repetição para adicionar os registros
            while (rs.next()) {
                //Chama um nova Paciente
                Produto produto = new Produto(rs.getString("nome"), rs.getInt("quantidade"), rs.getString("tipo"));
                //Adiciona a Lista
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }

    public int cadastrarProduto(Produto produto) {
        try {
            conexao.conectar();
            String sql = "INSERT INTO `loja`.`produto` (`nome`, `quantidade`, `tipo`) VALUES ('"+produto.getNome()+"', '"+produto.getQtd()+"', '"+produto.getTipo()+"');";
            
            return conexao.insertSQL(sql);
        } catch (Exception e) {
            return 0;
        } finally{
            conexao.fecharConexao();
        }
    }

    boolean excluiProduto(String nome) {
        try {
            conexao.conectar();
            
            String sql = "DELETE FROM `loja`.`produto` WHERE `nome`='"+nome+"';";
            if (conexao.insertSQL(sql)!=0){
                return true;
            }
        } catch (Exception e) {
            return false;
        } finally{
            conexao.fecharConexao();
        }
        return false;
    }

    Produto exibirProduto(String nome) {
        Produto produto = new Produto();
        conexao.conectar();
        try {
            String sql = "SELECT * FROM loja.produto WHERE nome='"+nome+"';";
            conexao.executarSQL(sql);
            
            while (conexao.getResultSet().next()){
                produto.setNome(conexao.getResultSet().getString("nome"));
                produto.setQtd(conexao.getResultSet().getInt("quantidade"));
                produto.setTipo(conexao.getResultSet().getString("tipo"));
                produto.setId(conexao.getResultSet().getInt("id"));
            }
        } catch (Exception e) {
        } finally{
            conexao.fecharConexao();
        }
        return produto;
    }
    /*
    NÃO ESTÁ FUNCIONANDOOOOOOO
    */
    boolean updateProduto(Produto produto) {
        try {
            conexao.conectar();
            String url = "UPDATE `loja`.`produto` SET `nome`='"+produto.getNome()+"', `quantidade`='"+produto.getQtd()+"', `tipo`='"+produto.getTipo()+"' WHERE `id`='"+produto.getId()+"';";
            conexao.executarSQL(url);
            return true;
        } catch (Exception e) {
            return false;
        } finally{
            conexao.fecharConexao();
        }
    }

    ArrayList<Produto> readName(String nome) {
        Connection con;
        con = ConnectionFactory.getConnection();
        //Variáveis para o BD     
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Conexão entre a lista e a classe Paciente
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            //Passa o comando para o CMD MySQL
            stmt = con.prepareStatement("SELECT * FROM produto WHERE nome = '"+ nome  +"';");
            rs = stmt.executeQuery();
            //Cria um laço de repetição para adicionar os registros
            while (rs.next()) {
                //Chama um nova Paciente
                Produto produto = new Produto(rs.getString("nome"), rs.getInt("quantidade"), rs.getString("tipo"));
                //Adiciona a Lista
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }

    ArrayList<Registro> readRegistro() {

        Connection con;
        con = ConnectionFactory.getConnection();
        //Variáveis para o BD     
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Conexão entre a lista e a classe Paciente
        ArrayList<Registro> registros = new ArrayList<>();

        try {
            //Passa o comando para o CMD MySQL
            stmt = con.prepareStatement("SELECT * FROM registro;");
            rs = stmt.executeQuery();
            //Cria um laço de repetição para adicionar os registros
            while (rs.next()) {
                //Chama um nova Paciente
                Registro registro = new Registro(rs.getString("tipo"), rs.getString("nome"), rs.getInt("quantidade"), rs.getString("date"), rs.getString("time"));
                //Adiciona a Lista
                registros.add(registro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return registros;
        
    }
    
}
