/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restoran;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
  private static Connection konekdb;
  public static Connection KoneksiDB()throws SQLException{
      if (konekdb == null){
          try{
               String url = "jdbc:mysql://localhost:3306/restoran";
                String user = "root";
                String password = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                konekdb=(Connection)DriverManager.getConnection(url, user, password);
          }catch(ClassNotFoundException | SQLException ex){
              ex.printStackTrace();
          }
      }return konekdb;
  }
}
