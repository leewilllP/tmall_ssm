/*
package cn.absalom.tmall.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTmall {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tmall_ssm?useUnicode=true&" +
                "characterEncoding=utf8","root","admin");
            Statement s = c.createStatement();) {
            for (int i = 0;i<10;i++){
                String sqlFormat = "insert into category values(null,'absalom%d')";
                String sql = String.format(sqlFormat,i);
                s.execute(sql);
            }
            System.out.println("已经创建10条分类测试数据");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/
