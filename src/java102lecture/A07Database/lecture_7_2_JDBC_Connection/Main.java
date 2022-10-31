package java102lecture.A07Database.lecture_7_2_JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        String url = "jdbc:postgresql://localhost:5432/kodluyoruz?user=ots&password=ots";
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
