import java.sql.*;
import java.util.*;

public class Create {

    private static final String URL = "jdbc:mysql://localhost:3306/anggota";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void insertEmployeeData(Scanner scanNEW) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO anggota (nama_anggota, id_anggota, pass_anggota) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("CREATE DATA TAMU");
                System.out.println("===================================================");

                System.out.print("Masukkan Nama Penanti Tamu      : ");
                String usernameValue = scanNEW.next();

                System.out.print("Masukkan Id Penanti Tamu       : ");
                Integer IDValue = scanNEW.nextInt();

                System.out.print("Masukkan Password Penanti Tamu         : ");
                Integer passwordValue = scanNEW.nextInt();

                preparedStatement.setString(1, usernameValue);
                preparedStatement.setInt(2, IDValue);
                preparedStatement.setInt(3, passwordValue);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Berhasil Menambahkan Data Anda");
                } else {
                    System.out.println("Silahkan Masukkan Kembali Data Anda");
                }

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}