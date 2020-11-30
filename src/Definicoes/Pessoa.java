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
   
    private int idPessoa;
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

    public Pessoa(int idPessoa, String Nome, String Cpf, boolean ativo_pessoa, int endereco, int contato, int usuario, int cargo, int pet) {
        this.idPessoa = idPessoa;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.ativo_pessoa = ativo_pessoa;
        this.endereco = endereco;
        this.contato = contato;
        this.usuario = usuario;
        this.cargo = cargo;
        this.pet = pet;
    }
    

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
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

    public boolean isAtivo_pessoa() {
        return ativo_pessoa;
    }

    public void setAtivo_pessoa(boolean ativo_pessoa) {
        this.ativo_pessoa = ativo_pessoa;
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
