package java102lecture.A07Database.lecture_7_4_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/kodluyoruz";
    public static final String DB_USERNAME = "ots";
    public static final String DB_PASSWORD = "ots";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student (student_name,student_class) values (?,?)");

            connection.setAutoCommit(false);
            preparedStatement.setString(1, "John Doe");
            preparedStatement.setString(2, "1");
            preparedStatement.executeUpdate();

            if (true) {
                throw new SQLException();
            }

            preparedStatement.setString(1, "Jane Doe");
            preparedStatement.setString(2, "2");
            preparedStatement.executeUpdate();

            connection.commit();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}