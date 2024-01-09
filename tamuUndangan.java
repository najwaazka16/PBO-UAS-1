import java.text.SimpleDateFormat;
import java.util.Date;

public class tamuUndangan implements Undangan {

    
public String namaPenantiTamu;
public String idPenantiTamu;

public tamuUndangan (String namaPenantiTamu, String idPenantiTamu) {
    this.namaPenantiTamu = namaPenantiTamu;
    this.idPenantiTamu = idPenantiTamu;

     Date time = new Date();

     SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, dd MMMM yyyy");
     SimpleDateFormat waktu = new SimpleDateFormat("HH : mm : ss");
     String format = tanggal.format(time);
     String String = waktu.format(time);

     System.out.println("Tanggal\t : " + format);
     System.out.println("Waktu\t : " + String);

}

@Override
public void cetakTiket() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cetakTiket'");
}

}
 