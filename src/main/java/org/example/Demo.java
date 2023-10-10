package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) {
//driver name,connection url ,username and pwd
        String url = "jdbc:mysql://localhost:3306/Car";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

//            try (Statement statement = connection.createStatement()) {
//                String createTableQuery = "create table Car1(id int primary key,name varchar(20),price int)";
//                statement.executeUpdate(createTableQuery);
//                System.out.println("the table is created successfully....");
//            }
            try (Statement statement = connection.createStatement()) {
//                String insertQuery = "insert into Car1(id,name,price)values(5,'MG', 3900000)";
//                String insertQuery1 = "insert into Car1(id,name,price)values(4,'Chervolet', 1900000)";
//                statement.executeUpdate(insertQuery);
//                statement.executeUpdate(insertQuery1);
//                String createQuery = "create table Car2(id int primary key,name varchar(30),price int, color varchar(10))";
//                statement.execute(createQuery);
                String insertQuery = "insert into Car2(id,name,price, color)values(1,'Jaguar', 7900000, 'Black')";
                String insertQuery1 = "insert into Car2(id,name,price,color)values(2,'Jeep', 8900000, 'Blue')";
                statement.executeUpdate(insertQuery);
                statement.executeUpdate(insertQuery1);
                System.out.println("Table Created Sucessfully");
            }
        } catch (SQLException ex) {
            System.out.println("Some error");
            ex.printStackTrace();
        }
    }
}