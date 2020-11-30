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
public class rua {
    
    private int idrua;
    private String nome;
    private String bairro;

    public rua() {
    }

    public rua(int idrua, String nome, String bairro) {
        this.idrua = idrua;
        this.nome = nome;
        this.bairro = bairro;
    }

    public int getIdrua() {
        return idrua;
    }

    public void setIdrua(int idrua) {
        this.idrua = idrua;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
}
