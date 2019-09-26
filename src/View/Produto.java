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
public class Produto {
    private String nome;
    private int qtd;
    private String tipo;
    private int id;
    
    public Produto(String nome, int qtd, String tipo) {
        this.nome = nome;
        this.qtd = qtd;
        this.tipo = tipo;
        this.id = 0;
    }

    public Produto() {
        this.nome = "";
        this.qtd = 0;
        this.tipo = "";
        this.id = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
