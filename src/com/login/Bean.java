/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author khalid hasan
 */
public class Bean {
    private String  fullname;
    private String Email;
    private  String password ;
    Bean(String f, String e,String p){
       this. fullname =f;
       this. Email=e;
       this. password=p;
    }
    public void setfname(String f){
    fullname=f;}
    public String getfname(){
    return fullname;}
    public void setemail(String e){
    Email=e ;}
    public String getemail(){
    return Email;}
    public void setpassword(String p){
    password =p;}
    public String getpassword(){
    return password;}
    
    
    
}
