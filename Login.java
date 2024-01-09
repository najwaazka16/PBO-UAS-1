import java.util.Scanner;

public class Login {

    public Login() {
        String url = "jdbc:mysql://localhost:3306/pegawai";
        String username = "root";
        String password = "";
       
        System.out.println("SELAMAT DATANG DI PERNIKAHAN AF");
        System.out.println("====================================");
        System.out.println("Log in  ");

        do {
            Scanner cin = new Scanner(System.in);
            System.out.print("Username     : ");
            username = cin.next();
            System.out.print("Password     : ");
            password = cin.next();

            if (username.equalsIgnoreCase("najwaazka") && password.equals("azkthlt")) {
                int attempt = 0;

                System.out.println("Selamat, Anda berhasil login!");
                break;
            } else {
                System.out.println("Maaf username atau password anda salah, silahkan coba lagi.");
            }
        } while (!username.equals("najwaazka") || !password.equals("azkthlt"));
    }
}