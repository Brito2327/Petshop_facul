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
public class Agendamentos_servicos { //esta classe é uma associativa, criei, mas se não for necessária excluo.
    
    private int idAgendamentos_servicos;
    private int servico;
    private int agendamentos;

    public Agendamentos_servicos() {
    }

    public Agendamentos_servicos(int idAgendamentos_servicos, int servico, int agendamentos) {
        this.idAgendamentos_servicos = idAgendamentos_servicos;
        this.servico = servico;
        this.agendamentos = agendamentos;
    }

    public int getIdAgendamentos_servicos() {
        return idAgendamentos_servicos;
    }

    public void setIdAgendamentos_servicos(int idAgendamentos_servicos) {
        this.idAgendamentos_servicos = idAgendamentos_servicos;
    }

    public int getServico() {
        return servico;
    }

    public void setServico(int servico) {
        this.servico = servico;
    }

    public int getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(int agendamentos) {
        this.agendamentos = agendamentos;
    }

    
    
}
