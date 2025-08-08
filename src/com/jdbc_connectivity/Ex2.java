package com.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java7am", "root", "root");

            System.out.println("Enter the name of food");
            String name = s.nextLine();

            System.out.println("Enter the Price of food");
            Double price = s.nextDouble();

            System.out.println("Connected successfully");

            PreparedStatement ps = con.prepareStatement("insert into practice (name, price) values(?,?) ");
            ps.setString(1, name);
            ps.setDouble(2, price);

            ps.setString(1, "Curd rice");
            ps.setDouble(2, 45);

            ps.executeUpdate();
            ps.execute();

            System.out.println("Data inserted successfully");
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
