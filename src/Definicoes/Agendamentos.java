/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Definicoes;

import java.util.Date;

/**
 *
 * @author Evelyn
 */
public class Agendamentos {
    
    private Date Data_hora;
    private int Pessoa;
    private int Pet;

    public Agendamentos() {
    }

    public Agendamentos(Date Data_hora, int Pessoa, int Pet) {
        this.Data_hora = Data_hora;
        this.Pessoa = Pessoa;
        this.Pet = Pet;
    }

    public Date getData_hora() {
        return Data_hora;
    }

    public void setData_hora(Date Data_hora) {
        this.Data_hora = Data_hora;
    }

    public int getPessoa() {
        return Pessoa;
    }

    public void setPessoa(int Pessoa) {
        this.Pessoa = Pessoa;
    }

    public int getPet() {
        return Pet;
    }

    public void setPet(int Pet) {
        this.Pet = Pet;
    }
    
    
    
}
