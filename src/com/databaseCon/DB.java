/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.databaseCon;

/**
 *
 * @author khalid hasan
 */
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 import java.sql.Connection;
 import java.sql.*;
public class DB {
    public static Connection con=null;
    public static void loadConnection(){
    String url="jdbc:mysql://localhost:3306/crud_app";
    String root="root";
    String pass="";
    
       try {
            con=DriverManager.getConnection(url, root, "khalidkhalid22");
             if(con!=null)
                 JOptionPane.showMessageDialog(null, "succeessfully  connected!");
      
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, "not connected");
            e.printStackTrace();
        }}

    
    
}