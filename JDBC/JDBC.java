/* backend 
how to connect to a database using JDBC
db use to store data permanently
JDBC is a java API to connect and execute query with database 
  
  
 step 1: Register the drvier class
 Class.forName("com.mysql.cj.jdbc.Driver"); //predifen class so class ka c captial// for name is factory method(jo kisi aur class ka object de)

 step 2 create the connection
Connection con = DriverManager.getConnection("connection url","root","password"); ///getConnection is factory meethod(jo kisi aur class ka object de)

 step 3 Create Statement
 Statement stmt = con.createStatement(); //createStatement is factory method (class koi aur and object koi aur ka ) 

 step 4 Excute the query (only for select query) but excute update for insert ,update,delete
 ResultSet rs = stmt.executeQuery("select * from emp"); //executeQuery is factory method (class koi aur and object koi aur ka  AND only select liye excutequery ,resultset givel data

  step 5 . close the connection
  con.close(); //close is factory method (class koi aur and object koi aur ka )
 * 
 *  use thin driver (pure java me h so no other driver required)
 * 
 * when change the database then change 1, 2 but when table change 3,4 change
 * 
 */
//package com.dfg; package name

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
    public static void main(String[] args) {
        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection( 
                "jdbc:mysql://localhost:3306/studentdb", "root", "abhishek"
            );

//            Statement stmt = con.createStatement();//prepared statement security ,  fast as compare
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM students");
          ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Print results
            while (rs.next()) {
                // ✅ Columns start from 1, adjust as per your table
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));//in table first
            }

            // Close connection
            con.close();
        } catch (Exception e) {
          System.out.println(e);  // ✅ show error if something fails
        }
    }
}
