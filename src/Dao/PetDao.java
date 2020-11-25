/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Definicoes.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Crud do pet
 *
 * @author alexander.brito
 */
public class PetDao {

    private Connection conexao = null;

    public PetDao() {
        conexao = new Conexao().getConnection();
    }

    public boolean save(Pet pet) {
        String sql = "INSERT INTO pet (NomePet,Obs) VALUES (?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getObs());            
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        } finally {
            new Conexao().closedConnection();
        }

        return true;
    }
    
    public ArrayList<Pet> ListaPets(){
        String sql = "SELECT * FROM  pet";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Pet> listaPets = new ArrayList<Pet>();
        
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Pet pet = new Pet(rs.getNString("NomePet"),rs.getNString("Obs"));
                listaPets.add(pet);                
            }
            
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());            
        } finally {
            new Conexao().closedConnection();
        }
        
        return listaPets;
    }
}
