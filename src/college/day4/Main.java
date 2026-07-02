package college.day4;

import java.sql.*;

public class Main {
    static void main(String[] args) throws SQLException {
        String url = "";
        String user = "";
        String password = "";

        Connection connection = DriverManager.getConnection(url, user, password);

        if (!connection.isClosed()) {
            System.out.println("Connected");
        } else {
            System.out.println("Connection Failed");
        }

        Statement statement = connection.createStatement();

        String q = "select * from students";

        ResultSet resultSet = statement.executeQuery(q);

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            System.out.println(name + " " + age);
        }



        statement.close();
        connection.close();
    }
}
