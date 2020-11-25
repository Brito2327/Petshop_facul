package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alexander.brito
 */
public class Conexao {
   //biblioteca
    private Connection conexao = null;
    
  //Atributos
    private String hostName = null;
    private String userName = null;
    private String password = null;
    private String url = null;
    private String jdbcDriver = null;
    private String dataBaseName = null;
    private String dataBasePrefix = null;
    private String dataBasePort = null;
    
    
    public Conexao()
    {
        super();
        
       // "jdbc: mysql:/localhost:3306/meu_bd";
  hostName = "localhost";
  userName = "root";
  password = "Alex@A1e2i3o4";
  jdbcDriver = "com.mysql.jdbc.Driver";
  dataBaseName = "petshop";
  dataBasePrefix = "jdbc:mysql://";
  dataBasePort = "3306";

  url = dataBasePrefix + hostName + ":"+dataBasePort+"/" + dataBaseName;


    }
    
    public  Connection getConnection()
    {
        try{
            if (conexao == null) {
                Class.forName(jdbcDriver);
                conexao = DriverManager.getConnection(url,userName,password);
                JOptionPane.showMessageDialog(null, "Foii");
            }
            else if(conexao.isClosed()){
                conexao = null;
                return getConnection();
            }
 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e){
            
            e.printStackTrace();
        }
        return conexao;
    }
    
    public void closedConnection(){
        if(conexao != null){
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


