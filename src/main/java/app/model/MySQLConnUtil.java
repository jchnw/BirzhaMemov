package app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtil {

    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {
        // Примечание: Изменить параметры соединения соответствующе.
        String hostName = "localhost";
        String dbName = "memes";
        String userName = "root";
        String password = "root";
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException,
            ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        // Структура URL Connection для MySQL:
        // Например:
        // jdbc:mysql://localhost:3306/simplehr
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}