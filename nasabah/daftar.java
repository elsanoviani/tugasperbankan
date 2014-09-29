package nasabah;
import javax.swing.JOptionPane;
import transaksi.simpanambil;
     public class daftar {
     private String nama,norek,awal_wal;
     private int jenis_tab;
     double awal;
            public void masuk_nasb()
            {
            norek=JOptionPane.showInputDialog("Masukkan Nomor Rekening");
            nama=JOptionPane.showInputDialog("Masukkan Nama Anda");
            String jenis="1. Britama\n"+"2. Simpedes\n"+"Masukkan Pilihan";
            String pilih_string=JOptionPane.showInputDialog(null,jenis,"PILIH JENIS TABUNGAN",
              JOptionPane.QUESTION_MESSAGE);
            awal_wal=JOptionPane.showInputDialog("Masukkan Jumlah Saldo Awal Anda");
            awal=Double.parseDouble(awal_wal);
            jenis_tab=Integer.parseInt(pilih_string);
            }
    public int ambil_jenistab()
    {      int j_tab=jenis_tab;
            return j_tab;
    }
    public String ambil_nama()
    {      return nama;
    }
    public String ambil_norek()
    {      return norek;
     }
    public double ambil_awal()
    {      return awal;
    }
}