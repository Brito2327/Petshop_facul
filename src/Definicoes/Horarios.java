
package Definicoes;

import java.util.Date;

/**
 *
 * @author Evelyn
 */
public class Horarios {
   
   private int idHorarios; 
   private Date Horario;
   private String Pessoa;

    public Horarios() {
    }

    public Horarios(int idHorarios, Date Horario, String Pessoa) {
        this.idHorarios = idHorarios;
        this.Horario = Horario;
        this.Pessoa = Pessoa;
    }

    public int getIdHorarios() {
        return idHorarios;
    }

    public void setIdHorarios(int idHorarios) {
        this.idHorarios = idHorarios;
    }

    public Date getHorario() {
        return Horario;
    }

    public void setHorario(Date Horario) {
        this.Horario = Horario;
    }

    public String getPessoa() {
        return Pessoa;
    }

    public void setPessoa(String Pessoa) {
        this.Pessoa = Pessoa;
    }

   
}
