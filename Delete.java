import java.sql.*;
import java.util.*;

public class Delete {

    private static final String URL = "jdbc:mysql://localhost:3306/anggota";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void deleteEmployeeById() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "DELETE FROM anggota WHERE Id_anggota = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                Scanner del = new Scanner(System.in);
                System.out.println("MENGHAPUS DATA ANGGOTA");
                System.out.println("===================================================");

                System.out.print("Masukkan Id Anda : ");
                int employeeId = del.nextInt();
                preparedStatement.setInt(1, employeeId);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data anda telah dihapus");
                } else {
                    System.out.println("Data yang anda masukkan tidak terdaftar");
                }
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
