
package Definicoes;

import java.util.Date;

/**
 *
 * @author Evelyn
 */
public class Horarios {
    
   private Date Horario; //não criei o id, precisa? 
   private String Pessoa;

    public Horarios() {
    }

    public Horarios(Date Horario, String Pessoa) {
        this.Horario = Horario;
        this.Pessoa = Pessoa;
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
