package co.edu.sena.proyecttwo.util;

import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args) {
        String url =
                "jdbc:mysql://localhost:3306/my_app?serveTimezone=America/Bogota";

        String username = "dylan";
        String password = "JosueDiaz0612";

        String sql = "SELECT * FROM my_app.users_tbl";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {

                System.out.println(rs.getString("user_firstname"));
                System.out.println(rs.getString("user_lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } //end try-catch
    } // main
}
