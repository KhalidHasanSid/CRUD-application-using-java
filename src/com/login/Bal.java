/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author khalid hasan
 */
import  com.databaseCon.DB;
 import java.sql.Connection;
 import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;

public class Bal {
    public void insertData(Bean objbean){
        try{
    String q ="insert into signup values(?,?,?) ";
    PreparedStatement ps=DB.con.prepareStatement(q);
    ps.setString(1, objbean.getfname());
    ps.setString(2,objbean.getemail() );
     ps.setString(3,objbean.getpassword() );
     ps.executeUpdate();
     JOptionPane.showMessageDialog(null, "signup successfully");
    
    
        }
        catch (Exception e) {
        JOptionPane.showMessageDialog(null, ""+e);}
    
    
    }
    public boolean checklogin(String loginemail,String loginpassword){
       boolean check =false;
        String chkEmail=null ;
                String chkPassword=null;
       try{
       String q="select email,password from signup " ;
   //  String q="select * from employee   " ;
      Statement st=DB.con.createStatement();
       ResultSet rs=st.executeQuery(q);
        
            if(rs.next()) {
                 chkEmail = rs.getString("email");
  
                 chkPassword = rs.getString("password");
         }
                           System.out.println(chkEmail);
              System.out.println(chkPassword);
                if(loginemail.equals(chkEmail)&&loginpassword.equals(chkPassword)){
                check =true;
                return check;
                }
                else{ 
                return check;
                }
                }
       
       catch (Exception e){
           JOptionPane.showMessageDialog(null, ""+e);
       }
       
       
               
        return check;
    }
    
}
