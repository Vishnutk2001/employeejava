package com.harman.java;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        try {
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false","root","");

            Scanner input = new Scanner(System.in);
            String code, name, designation, salary, phonenum;
            System.out.println("enter code");
            code = input.next();
            System.out.println("enter name");
            name = input.next();
            System.out.println("enter designation");
            designation = input.next();
            System.out.println("enter salary");
            salary = input.next();
            System.out.println("enter phonenum");
            phonenum = input.next();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO `employee`(`code`, `name`, `designation`, `salary`, `phonenumber`) " +
                    "VALUES("+code+",'"+name+"','"+designation+"',"+salary+","+phonenum+")");
            System.out.println("Inserted successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

