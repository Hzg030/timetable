package Dao.DaoUtil;

import java.sql.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SqlUtil {

    private static String DRIVER = null;
    private static String URL = null;
    private static String USERNAME = null;
    private static String PASSWORD = null;

    public SqlUtil() throws IOException {
        Properties properties = new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流Z
        InputStream in = SqlUtil.class.getClassLoader().getResourceAsStream("sqlConfig.properties");
        // 使用properties对象加载输入流
        properties.load(in);
        //获取key对应的value值
        DRIVER = properties.getProperty("mysql.driver");
        URL = properties.getProperty("mysql.url");
        USERNAME = properties.getProperty("mysql.username");
        PASSWORD = properties.getProperty("mysql.password");
    }


    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }



    public static void main(String[] args) throws IOException {
//        SqlUtil sqlUtil = new SqlUtil();
//        String sql = "select * from room";
//        Connection connection = sqlUtil.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt(1));
//            System.out.println(resultSet.getInt(2));
//            System.out.println(resultSet.getInt(3));
//        }
//        connection.close();

    }
}
