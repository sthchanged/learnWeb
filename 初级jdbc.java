/**
 * Created by cheny on 2017/6/27.
 * 配置jdbc.jar for Mysql（idea在 [project structure]-[modules]-[Dependencies]中配置）
 */
import  java.sql.*;

public class jdbc {
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    static String DB_URL = "jdbc:mysql://localhost/EXAMPLE";
    static String DB_URL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSl=false";
        static String USER = "root";
    static String PASS = "password";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");

            //2. 获取数据库链接
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating statement ...");

            //3. 获取数据操作对象
            stmt = conn.createStatement();
            String sql;

            //4. 执行sql语句
            sql = "SELECT id, username, password FROM userTable";
            ResultSet rs = stmt.executeQuery(sql);

            //5. 处理查询结果集
            while(rs.next()){
                int id = rs.getInt("id");
                int password = rs.getInt("password");
                String username = rs.getString("username");
                System.out.print("ID:" + id);
                System.out.print(", Username: " + username);
                System.out.print(", Password: " + password);
                System.out.println();
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException se){
            se.printStackTrace();;
        }catch(Exception e){
            e.printStackTrace();
        }
        //finally用于关闭操作
        finally {
            try{
                if(stmt!=null)
                    stmt.close();
            }catch (SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}