package controller;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;


public class koneksi {
    static Connection kon;
    
    public static Connection connection() {
        if (kon == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("toko");
            data.setUser("root");
            data.setPassword("");
            try {
                kon = data.getConnection();
                System.out.println("sudah konek");
            } catch (Exception e) {
                System.out.println("tidak konek");
            }
        }
        return kon;
    }
}