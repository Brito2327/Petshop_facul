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
    
    private String Nome;
    private int cidade;

    public bairro() {
    }

    public bairro(String Nome, int cidade) {
        this.Nome = Nome;
        this.cidade = cidade;
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
