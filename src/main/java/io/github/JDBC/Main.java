package io.github.JDBC;

// 9. БД эксперимента (химические пробы и бригады, которые проводят эксперимент)

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/chemistry";
        String user = "postgres";
        String password = "postgres";

        Connection conn = DriverManager.getConnection(url, user, password);

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(
                "SELECT * FROM sample");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id_sample") + ". " +
                            rs.getString("name") + " — " +
                            rs.getString("substance"));
        }

        System.out.println("");

        rs = stmt.executeQuery(
                "SELECT * FROM sample WHERE id_brigade = 1");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id_sample") + ". " +
                            rs.getString("name") + " — " +
                            rs.getString("substance"));
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}