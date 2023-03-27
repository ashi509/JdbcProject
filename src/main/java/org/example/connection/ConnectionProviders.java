package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProviders {
private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private static ConnectionProviders connectionProviders;

    public static ConnectionProviders getInstance(){
    if(connectionProviders==null)
        connectionProviders=new ConnectionProviders();
    return connectionProviders;
}
private ConnectionProviders(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "Jdbc:mysql://localhost:3306/school_management";
        String username = "root";
        String password = "root";
        connection = DriverManager.getConnection(url, username, password);
    }catch (Exception exception){
        exception.printStackTrace();
    }
}
}