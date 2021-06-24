package taxi.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    /* public static final String URL = "jdbc:mysql://localhost:3306/taxi_app";
     public static final String USERNAME = "root";
     public static final String PASSWORD = "1234";
     public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

     static {
         try {
             Class.forName(JDBC_DRIVER);
         } catch (ClassNotFoundException e) {
             throw new RuntimeException("Can't find SQL Driver", e);
         }
     }

     public static Connection getConnection() throws SQLException {
         Properties dbProperties = new Properties();
         dbProperties.setProperty("user", USERNAME);
         dbProperties.setProperty("password", PASSWORD);
         return DriverManager.getConnection(URL, dbProperties);
     }
 */
    private static final Properties properties = new Properties();
    private static final String PROPERTIES_FILE_PATH = "src/main/resources/mysql.properties";

    static {
        try {
            properties.load(new FileReader(PROPERTIES_FILE_PATH));
            Class.forName((String) properties.get("db.driver"));
        } catch (ClassNotFoundException exception) {
            throw new RuntimeException("Can't load JDBC driver for MySQL", exception);
        } catch (IOException exception) {
            throw new RuntimeException("Can't read properties file: " + PROPERTIES_FILE_PATH,
                    exception);
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection((String) properties.get("db.url"), properties);
        } catch (SQLException exception) {
            throw new RuntimeException("Can't create connection to DB "
                    + properties.get("schema"), exception);
        }
    }
}
