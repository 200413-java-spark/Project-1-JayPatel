package spark;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

public class sqlRepo {
    
    private static sqlDataSource dataSource;

    public void insertAll(String s, String l) {
        String stmt = "insert into Project1Table(category, numbers) values(?,?)";

        try (Connection conn = dataSource.getConnection(); PreparedStatement prepedStmt = conn.prepareStatement(stmt)) {
            prepedStmt.setString(1, s);
            prepedStmt.setString(2, l);
            prepedStmt.addBatch();

            prepedStmt.executeBatch();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static HashMap<String, String> readAll(String getStmt) {
        HashMap<String, String> table = new HashMap<>();

        try (Connection conn = dataSource
                .getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(getStmt);){
                
                while (rs.next()) {
                    table.put(rs.getString("category"), rs.getString("numbers"));
                }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return table;
            
    }

}