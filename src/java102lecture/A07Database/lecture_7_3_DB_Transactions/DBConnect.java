package java102lecture.A07Database.lecture_7_3_DB_Transactions;

import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/kodluyoruz";
    public static final String DB_USERNAME = "ots";
    public static final String DB_PASSWORD = "ots";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        String selectQuery = "select * from student";
        String insertQuery = "insert into student (student_name,student_class) values ('Damla','4')";
        String preparedInsertQuery = "insert into student (student_name,student_class) values (?,?)";
        String updateQuery = "update student set student_name = 'Mahmut Çetindağ' where student_id = 1";
        String preparedUpdateQuery = "update student set student_name = ? where student_id = ?";
        String deleteQuery = "delete from student where student_id = 4";
        String preparedDeleteQuery = "delete from student where student_id = ?";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            statement = connection.createStatement();
//            ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY
//            statement.executeUpdate(insertQuery);

//            PreparedStatement preparedStatement = connection.prepareStatement(preparedInsertQuery);
//            preparedStatement.setString(1, "Hasan Kemal");
//            preparedStatement.setString(2, "3");
//            preparedStatement.executeUpdate();
//            preparedStatement.close();

//            statement.executeUpdate(updateQuery);
//            PreparedStatement preparedStatement = connection.prepareStatement(preparedUpdateQuery);
//            preparedStatement.setString(1, "Mahmut Mustafa Çetindağ");
//            preparedStatement.setLong(2, 1);
//            preparedStatement.executeUpdate();
//            preparedStatement.close();
//            ResultSet data = statement.executeQuery(selectQuery);
//
            statement.executeUpdate(deleteQuery);
            PreparedStatement preparedStatement = connection.prepareStatement(preparedDeleteQuery);
            preparedStatement.setLong(1, 3);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            ResultSet data = statement.executeQuery(selectQuery);
            statement.close();
            preparedStatement.close();
            connection.close();
            while (data.next()) {
                System.out.println("ID : " + data.getLong("student_id"));
                System.out.println("Ad : " + data.getString("student_name"));
                System.out.println("Sınıf : " + data.getString("student_class"));
                System.out.println("****************");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}