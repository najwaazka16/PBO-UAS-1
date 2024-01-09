public class listUndangan extends tamuUndangan {
    
    public String namaTamu;
    public Integer noTamu;
    public String alamat;
    public Integer noTelp;
    public Integer noMeja;
    public static Integer faktur;

 
    public listUndangan (String namaTamu, String namaPenantiTamu, String idPenantiTamu, Integer noTamu, String alamat, Integer noTelp, Integer noMeja) {
        super(namaPenantiTamu, idPenantiTamu);
        this.namaTamu = namaTamu;
        this.noTamu = noTamu;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.noMeja = noMeja;

        cetakTiket();
    }


    public void cetakTiket(){
        System.out.println("====================================");
        System.out.println("SELAMAT DATANG DI PERNIKAHAN");
        System.out.println("====================================");
        System.out.println("DATA PENANTI TAMU");
        System.out.println("------------------------------------");
        System.out.println("nama Tamu : " + namaTamu);
        System.out.println("Alamat    : " + alamat);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("DATA TAMU UNDANGAN");
        System.out.println("------------------------------------");
        System.out.println("Nomor Undangan  : " + noTamu);
        System.out.println("Nomor Telpon    : " + noTelp);
        System.out.println("Nomor Meja  : " + noMeja);
        System.out.println("========================================");
        System.out.println("Penanti Tamu :" + namaPenantiTamu);
        System.out.println("TERIMA KASIH SUDAH MENGHADIRI PERNIKAHAN KAMI");


    }
}
