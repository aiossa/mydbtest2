package database;

import animal.Animal;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

//import java.beans.Statement;
import java.sql.*;

/**
 * Created by Aleksandr on 16.01.2016.
 */
public class main {



    public static void main(String[] args) {
       // Connection connection;
//        try {
//            Driver driver= new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try(Connection connection = DriverManager.getConnection(URL, USER, PASS); Statement statement=connection.createStatement()) {
//            System.out.println(connection.isClosed());
//            //int res =statement.executeUpdate("Update animals SET anim_name='New Name' WHERE idanimals=1;");
//            //System.out.println(res + " changes");
//            //ResultSet res =statement.executeQuery("select * from animals");
//            statement.addBatch("INSERT into animals (anim_name, anim_desc) VALUES ('Batch 1', 'desc')");
//            statement.addBatch("INSERT into animals (anim_name, anim_desc) VALUES ('Batch 2', 'desc')");
//            statement.addBatch("INSERT into animals (anim_name, anim_desc) VALUES ('Batch 3', 'desc')");
//            statement.executeBatch();
//            statement.clearBatch();
//            System.out.println(statement.isClosed());
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        String query="Select * from animals";

        DBWorker worker=new DBWorker();
        try {
            Statement statement=worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(\\"test.sql");
            while (resultSet.next()){
                Animal first_animal=new Animal(resultSet.getString("anim_name"), resultSet.getInt("anim_num"));

                System.out.println(first_animal.getAnim_name() + " " + first_animal.getAnim_num());
                System.out.println("next one");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
