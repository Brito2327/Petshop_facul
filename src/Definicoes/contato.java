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
public class contato {
    
    private String contato;
    private int tipo_contato;

    public contato() {
    }

    public contato(String contato, int tipo_contato) {
        this.contato = contato;
        this.tipo_contato = tipo_contato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getTipo_contato() {
        return tipo_contato;
    }

    public void setTipo_contato(int tipo_contato) {
        this.tipo_contato = tipo_contato;
    }
    
    
    
}
