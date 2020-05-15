package spark.IO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class sqlDataSource {

    private static sqlDataSource dataSource;
    private String url;
    private String user;
    private String password;


    private sqlDataSource() {
        this.url = System.getProperty("database.url", "jdbc:postgresql://3.18.215.89/project1");
		this.user = System.getProperty("database.username", "project1");
		this.password = System.getProperty("database.password", "project1");
    }


    public static sqlDataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new sqlDataSource();
        }
        return dataSource;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }



    
}