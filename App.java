import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        String namaTamu;
        String alamat;
        String namaPenantiTamu;
        String idPenantiTamu;
        Integer noTelp;
        Integer noTamu;
        Integer noMeja;

        Login login = new Login();

        Scanner input = new Scanner(System.in);
        System.out.print("Nama Tamu: ");
        namaTamu = input.next();
        System.out.print("Alamat: ");
        alamat = input.next();
        System.out.print("Nomor Telpon: ");
        noTelp = input.nextInt();
        System.out.print("Nomor Tamu: ");
        noTamu = input.nextInt();
        System.out.print("Nomor Meja: ");
        noMeja = input.nextInt();
        System.out.print("Nama Penanti Tamu: ");
        namaPenantiTamu = input.next();
        System.out.print("ID Penanti Tamu: ");
        idPenantiTamu = input.next();

        listUndangan listUndangan = new listUndangan(namaTamu, namaPenantiTamu, idPenantiTamu, noTamu, alamat, noTelp, noMeja);

        input.close();

    }
}
