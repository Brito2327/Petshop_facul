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
public class Raca {
    
    private int idRaca;
    private String Nome;

    public Raca() {
    }

    public Raca(int idRaca, String Nome) {
        this.idRaca = idRaca;
        this.Nome = Nome;
    }

    public int getIdRaca() {
        return idRaca;
    }

    public void setIdRaca(int idRaca) {
        this.idRaca = idRaca;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
    
    
    
}
