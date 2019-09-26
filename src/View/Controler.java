/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author thiago
 */
class Controler {

    public void vender(Produto produto) {
        new DaoProduto().vender(produto);
    }

    void registrar(Produto produto, String tipo, String date, String time) {
        new DaoProduto().registrar(produto, tipo, date, time);
    }

    void cadastrarProduto(Produto produto) {
        new DaoProduto().cadastrarProduto(produto);
    }

    boolean excluirProduto(String nome) {
        if(new DaoProduto().excluiProduto(nome)==true){
            return true;
        }
        return false;
    }

    Produto getCtrlNome(String nome) {
        return new DaoProduto().exibirProduto(nome);
    }

    boolean updateProduto(Produto produto) {
        return new DaoProduto().updateProduto(produto);
    }
    
}
