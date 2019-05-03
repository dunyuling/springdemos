package com.rc.data.jdbc.base;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @ClassName JDBCUtils
 * @Description jdbc 工具类
 * @Author liux
 * @Date 19-5-2 下午6:01
 * @Version 1.0
 */
public class JDBCUtils {

    /*
     * @Author liux
     * @Description 获取连接
     * @Date 19-5-2 下午6:17
     * @param
     * @return java.sql.Connection
     **/
    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
//        try {
        InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        String driverClassName = properties.getProperty("jdbc.driverClassName");
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");

        Class.forName(driverClassName);
        return DriverManager.getConnection(url, username, password);
//        } catch (ClassNotFoundException | SQLException | IOException e) {
//            e.printStackTrace();
//        }
//        return null;
    }

    /*
     * @Author liux
     * @Description 释放资源
     * @Date 19-5-2 下午6:17
     * @param resultSet
     * @param statement
     * @param connection
     * @return void
     **/
    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }


            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
