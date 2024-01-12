/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enrollment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author maxedo
 */
public class Enrollment {
    // Connection to Dataabse
    public static Connection connect(){
     String user = "root";
     String pass = "";
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/what_course?zeroDateTimeBehavior=CONVERT_TO_NULL",user,pass);
    
     return conn;
     
    }catch(ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
    }
        return null;
    
    }
    public static void main(String[] args) {
        new college_admission().show();
    }
}
