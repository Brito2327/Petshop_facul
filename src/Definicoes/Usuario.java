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
    
    private String login;
    private String senha;
    
    public Usuario(){
        
    }

    public Usuario(String login,String senha){
        this.senha = senha;
        this.login = login;
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
