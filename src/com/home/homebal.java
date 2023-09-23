/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import com.databaseCon.DB;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author khalid hasan
 */
public class homebal {
    public void insertdatainhome(homebean hobeanobj){
         try{
    String q ="insert into  employee values(?,?,?,?,?,?) ";
    PreparedStatement ps=DB.con.prepareStatement(q);
    ps.setString(1, hobeanobj.id);
     ps.setString(2, hobeanobj.fullname);
      ps.setString(3, hobeanobj.lastname);
       ps.setString(4, hobeanobj.gender);
        ps.setString(5, hobeanobj.city);
         ps.setString(6, hobeanobj.address);
   
     ps.executeUpdate();
     JOptionPane.showMessageDialog(null, "data of employee inserted succesfully");
    
    
        }
        catch (Exception e) {
        JOptionPane.showMessageDialog(null, ""+e);}
    
    
    }
    
}
