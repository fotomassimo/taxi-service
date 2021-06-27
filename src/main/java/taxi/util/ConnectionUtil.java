package taxi.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

public class ConnectionUtil {
    private static final Properties properties = new Properties();
    private static final String PROPERTIES_FILE_NAME = "mysql.properties";

    static {
        try {
            File file = new File(Objects.requireNonNull(ConnectionUtil.class
                    .getClassLoader()
                    .getResource(PROPERTIES_FILE_NAME))
                    .getFile());
            properties.load(new FileReader(file));
            Class.forName((String) properties.get("db.driver"));
        } catch (ClassNotFoundException exception) {
            throw new RuntimeException("Can't load JDBC driver for DB", exception);
        } catch (IOException exception) {
            throw new RuntimeException("Can't read properties file: " + PROPERTIES_FILE_NAME,
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
