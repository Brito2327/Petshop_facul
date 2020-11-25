/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Definicoes;

import java.sql.Date;

/**
 *
 * @author alexander.brito
 */
public class Pet {

  
    private int idPet;
    private String Nome;
    private Date dataNasc;
    private String Obs;
    private int Tipo;
    private int Sexo;
    private int Raca;
    private int Dono;
    
    public Pet(String nome,String Obs){
        super();        
        this.Nome = nome;
       // this.dataNasc = dataNasc;
        this.Obs = Obs;
       // this.Tipo = tipo;
       // this.Sexo = sexo;
       // this.Raca = raca;
       // this.Dono = dono;
    }
    
      /**
     * @return the idPet
     */
    public int getIdPet() {
        return idPet;
    }

    /**
     * @param idPet the idPet to set
     */
    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the dataNasc
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * @return the Obs
     */
    public String getObs() {
        return Obs;
    }

    /**
     * @param Obs the Obs to set
     */
    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    /**
     * @return the Tipo
     */
    public int getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Sexo
     */
    public int getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Raca
     */
    public int getRaca() {
        return Raca;
    }

    /**
     * @param Raca the Raca to set
     */
    public void setRaca(int Raca) {
        this.Raca = Raca;
    }

    /**
     * @return the Dono
     */
    public int getDono() {
        return Dono;
    }

    /**
     * @param Dono the Dono to set
     */
    public void setDono(int Dono) {
        this.Dono = Dono;
    }
    
}
