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
public class cargo {
    
    private int idcargo;
    private String Nome;

    public cargo() {
    }

    public cargo(int idcargo, String Nome) {
        this.idcargo = idcargo;
        this.Nome = Nome;
    }

    public int getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

   
    
    
    
}
