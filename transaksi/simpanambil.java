package transaksi;
import javax.swing.JOptionPane;
import nasabah.daftar;
    public class simpanambil extends daftar
    {      String norek,nama,setor_tor,ambil_bil,j;
            int j_tab;
            double awal,setor,saldo,ambil;
             public void ambilData()
            {          nama=ambil_nama();
                        norek=ambil_norek();
                        awal=ambil_awal();
                        j_tab=ambil_jenistab();
            }
            public double masuk_setor()
            {          setor_tor=JOptionPane.showInputDialog("Masukkan Jumlah Setoran");
                        setor=Integer.parseInt(setor_tor);
                        saldo=awal+setor;
                        return saldo;
    }
            public double masuk_ambil()
            {          ambil_bil=JOptionPane.showInputDialog("masukkan jumlah yang akan diambil");
                        ambil=Integer.parseInt(ambil_bil);
                        saldo=saldo-ambil;
                        return saldo;
            }
            public void cetak2()
            {          if (j_tab==1) j="Britama";
                        else if(j_tab==2) j="Simpedes";
                        JOptionPane.showMessageDialog(null,
                        "No Rekening    \t    : "+norek+"\n"
              + "Nama           \t          : "+nama+"\n"
              + "Jenis Tabungan \t : "+j+"\n"
              + "Jumlah Saldo   \t   : "+saldo);
    }      }
