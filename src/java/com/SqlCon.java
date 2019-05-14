/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Ruthvik m r
 */
import java.sql.*;
public class SqlCon {
    public static Connection con=null;
    static{
        try{
            String url="jdbc:mysql://localhost:3306/";
            String dbname="openelective";
            String driver="com.mysql.jdbc.Driver";
            String user="root";
            String pass="";
            con=DriverManager.getConnection(url+dbname,user,pass);
            Class.forName(driver);
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
    public static Connection getCon(){
        return con;
    }
}
