/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Definicoes;

/**
 *
 * @author alexander.brito
 */
public class Usuario {
    
    private int idusuarios;
    private String login;
    private String senha;
    
    public Usuario(){
        
    }

    public Usuario(int idusuarios, String login, String senha) {
        this.idusuarios = idusuarios;
        this.login = login;
        this.senha = senha;
    }

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    
}
