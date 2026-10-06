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
                "SELECT " +
                        "s.id_sample, " +
                        "s.name AS sample_name, " +
                        "s.substance, " +
                        "b.id_brigade, " +
                        "b.name AS brigade_name " +
                        "FROM sample AS s " +
                        "LEFT JOIN brigade AS b ON s.id_brigade = b.id_brigade"
        );


        String separator = "+-----+---------------------------+----------------------+---------------------------+";

        System.out.println(separator);
        System.out.printf("| %-3s | %-25s | %-20s | %-25s |%n",
                "ID", "Название", "Вещество", "Бригада");
        System.out.println(separator);

        while (rs.next()) {
            System.out.printf("| %-3d | %-25s | %-20s | %-25s |%n",
                    rs.getInt("id_sample"),
                    rs.getString("sample_name"),
                    rs.getString("substance"),
                    rs.getString("brigade_name")
            );
        }

        System.out.println(separator);



        rs.close();
        stmt.close();
        conn.close();
    }
}