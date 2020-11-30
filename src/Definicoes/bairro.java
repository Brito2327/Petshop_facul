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
public class bairro {
    
    private int idbairro;
    private String Nome;
    private int cidade;

    public bairro() {
    }

    public bairro(int idbairro, String Nome, int cidade) {
        this.idbairro = idbairro;
        this.Nome = Nome;
        this.cidade = cidade;
    }

    public int getIdbairro() {
        return idbairro;
    }

    public void setIdbairro(int idbairro) {
        this.idbairro = idbairro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    
    
    
}
