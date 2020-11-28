/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Definicoes;

import java.util.Date;

/**
 *
 * @author alexander.brito
 */
public class Pessoa {
   
    private String Nome;
    private String Cpf;
    private boolean ativo_pessoa;
    private int endereco;
    private int contato;
    private int usuario;
    private int cargo;
    private int pet;
    
    
    public Pessoa(){
        
    }
   
    public String getNome() {
        return Nome;
    }

    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }


    public int getEndereco() {
        return endereco;
    }

   
    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    
    public int getUsuario() {
        return usuario;
    }

    
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

   
    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getPet() {
        return pet;
    }

    
    public void setPet(int pet) {
        this.pet = pet;
    }
    
    
    
    
    
    
}
