package com.example.demo.democaching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class connectionDataBase {
    private static final String URL_POSTGRES = "jdbc:postgresql://mandala.db1.com.br:5432/postgres_db";

    private static final String DRIVER_CLASS = "org.postgresql.Driver";

    private static final String USER = "postgres-user";

    private static final String PASS = "1234";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER_CLASS);
            System.out.println("Banco conectado");
            return DriverManager.getConnection(URL_POSTGRES, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
