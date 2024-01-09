import java.sql.*;
import java.util.*;

public class Update {
    private static final String URL = "jdbc:mysql://localhost:3306/anggota";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    
    public static void updateEmployeeCredentials(Scanner scanner) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE anggota SET Nama_anggota = ?, Pass_anggota = ? WHERE Id_anggota = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("UPDATE DATA PENANTI TAMU");
                System.out.println("===================================================");
                
                System.out.print("Username baru     : ");
                String newUsername = scanner.next();

                System.out.print("ID Penanti Tamu        : ");
                int employeeId = scanner.nextInt();
                

                System.out.print("Password Baru     : ");
                int newPassword = scanner.nextInt();

                preparedStatement.setString(1, newUsername);
                preparedStatement.setInt(2, employeeId);
                preparedStatement.setInt(3, newPassword);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data yang anda masukkan telah terdaftar");
                } else {
                    System.out.println("Data yang anda masukkan tidak terdaftar");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
