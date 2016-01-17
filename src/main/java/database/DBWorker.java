package database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Aleksandr on 16.01.2016.
 */
public class DBWorker {
    public static final String URL="jdbc:mysql://localhost:3306/mydbtest";
    public static String USER="root";
    public static String PASS="root";

    public Connection getConnection() {
        return connection;
    }

    private Connection connection;
    public DBWorker(){
        try {
            connection=DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}
