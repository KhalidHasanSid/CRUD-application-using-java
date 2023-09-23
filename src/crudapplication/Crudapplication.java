/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudapplication;

import com.databaseCon.DB;
import com.login.Bean;
import com.login.LoginFRAME;
import com.login.signup;

/**
 *
 * @author khalid hasan
 */
public class Crudapplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
      DB db=new DB();
        LoginFRAME ob= new  LoginFRAME();
   //  signup ob= new signup();
   
    
  //      DB db=new DB();
    //  ob1.show();
        
        
    ob.show();
  ob.setLocationRelativeTo(null);
  db.loadConnection();
      
        
    }
    
}
