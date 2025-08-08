package com.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex1 {
    public static void main(String[] args) {
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java7am", "root","root");
                System.out.println("Connected successfully");
                Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from practice");

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");

                System.out.println("Id : " + id + " Name : " + name + " Price : " + price );
            }

            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
