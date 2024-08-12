package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/bookstore";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "dfdff";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("\nConnected");

            // Insert operation
            insertBook(con, "New Book", "New Author", "20.00");

            // Update operation
            updateBook(con, 1, "Updated Book", "Updated Author", "25.00");

            // Delete operation
            deleteBook(con, 2);

            // Select operation
            selectBooks(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertBook(Connection con, String name, String author, String price) throws SQLException {
        String query = "INSERT INTO book (name, author, price) VALUES ('" + name + "', '" + author + "', '" + price + "')";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Book inserted successfully!");
    }

    private static void updateBook(Connection con, int id, String name, String author, String price) throws SQLException {
        String query = "UPDATE book SET name = '" + name + "', author = '" + author + "', price = '" + price + "' WHERE id = " + id;
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Book updated successfully!");
    }

    private static void deleteBook(Connection con, int id) throws SQLException {
        String query = "DELETE FROM book WHERE id = " + id;
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Book deleted successfully!");
    }

    private static void selectBooks(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM book";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("Id : " + rs.getInt(1) + " Author :" + rs.getString(2) + " Name:" + rs.getString(3) + " Price: " + rs.getString(4));
        }
    }
}