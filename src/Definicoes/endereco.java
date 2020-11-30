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
public class endereco {
    
    private int idendereco;
    private int Cep;
    private int Numero_casa;
    private String Complemento;
    private int rua;

    public endereco() {
    }

    public endereco(int idendereco, int Cep, int Numero_casa, String Complemento, int rua) {
        this.idendereco = idendereco;
        this.Cep = Cep;
        this.Numero_casa = Numero_casa;
        this.Complemento = Complemento;
        this.rua = rua;
    }

    public int getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(int idendereco) {
        this.idendereco = idendereco;
    }

    public int getCep() {
        return Cep;
    }

    public void setCep(int Cep) {
        this.Cep = Cep;
    }

    public int getNumero_casa() {
        return Numero_casa;
    }

    public void setNumero_casa(int Numero_casa) {
        this.Numero_casa = Numero_casa;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public int getRua() {
        return rua;
    }

    public void setRua(int rua) {
        this.rua = rua;
    }

   
    
}
