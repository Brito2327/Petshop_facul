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
public class cidade {
    
    private int idcidade;
    private String Nome;

    public cidade() {
    }

    public cidade(int idcidade, String Nome) {
        this.idcidade = idcidade;
        this.Nome = Nome;
    }

    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
}
