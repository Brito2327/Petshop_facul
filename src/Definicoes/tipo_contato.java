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
public class tipo_contato {
    
    private int idcontato;
    private String contato;
    private String tipo_contato;

    public tipo_contato() {
    }

    public tipo_contato(int idcontato, String contato, String tipo_contato) {
        this.idcontato = idcontato;
        this.contato = contato;
        this.tipo_contato = tipo_contato;
    }

    public int getIdcontato() {
        return idcontato;
    }

    public void setIdcontato(int idcontato) {
        this.idcontato = idcontato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipo_contato() {
        return tipo_contato;
    }

    public void setTipo_contato(String tipo_contato) {
        this.tipo_contato = tipo_contato;
    }

    
    
    
}
