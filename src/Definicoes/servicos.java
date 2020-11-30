/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Definicoes;

/**
 *
 * @author Evelyn
 */
public class servicos {
    
    private int idservicos;
    private String Nome;
    private String Descricao;
    private float Valor;

    public servicos() {
    }

    public servicos(int idservicos, String Nome, String Descricao, float Valor) {
        this.idservicos = idservicos;
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.Valor = Valor;
    }

    public int getIdservicos() {
        return idservicos;
    }

    public void setIdservicos(int idservicos) {
        this.idservicos = idservicos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

   
}
