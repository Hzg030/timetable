package Dao.DaoUtil;

import java.sql.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

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



//    public static void main(String[] args){
//    // 本题为考试单行多行输入输出规范示例，无需提交，不计分。
//        Scanner in = new Scanner(System.in);
//        String a = in.nextLine();
//        String b = in.nextLine();
//
//        for(int i = 0;i<a.length();i++){
//            if(a.charAt(i)>='A'&&a.charAt(i)<='Z'){
//                System.out.print((char)((int)'a'+(((int)a.charAt(i)%(int)'A'+1)%26)));
//            }else if(a.charAt(i)>='a'&&a.charAt(i)<='z'){
//                System.out.print((char)((int)'A'+(((int)a.charAt(i)%(int)'a'+1)%26)));
//            }else if((int)a.charAt(i)<='9'&&(int)a.charAt(i)>='0'){
//                System.out.print((char)((int)'0'+(((int)a.charAt(i)+1)%(int)'0')%10));
//            }
//        }
//        System.out.println();
//        for(int i = 0;i<b.length();i++){
//            if(b.charAt(i)>='A'&&b.charAt(i)<='Z'){
//                if((int)'a'+(((int)b.charAt(i)%(int)'A'-1))<0){
//                    System.out.print('z');
//                }else {
//                    System.out.print((char)((int)'a'+(((int)b.charAt(i)%(int)'A'-1)%26)));
//
//                }
//            }else if(b.charAt(i)>='a'&&b.charAt(i)<='z'){
//                if(((int)b.charAt(i)%(int)'a'-1)<0){
//                    System.out.print('Z');
//                }else {
//                    System.out.print((char)((int)'A'+(((int)b.charAt(i)%(int)'a'-1)%26)));
//                }
//            }else if((int)b.charAt(i)<='9'&&(int)b.charAt(i)>='0'){
//                if(((int)b.charAt(i)-1)<0){
//                    System.out.print('9');
//                }else {
//                    System.out.print((char)((int)'0'+(((int)b.charAt(i)-1)%(int)'0')%10));
//                }
//            }
//        }
//
//    }

}
