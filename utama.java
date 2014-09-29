import javax.swing.JOptionPane;
import transaksi.simpanambil;
    public class utama {
    public static void main(String[] args) {
        String isi,pil_pil,ulang_lang;
        int pil,ulang;
        simpanambil nasb=new simpanambil();
        do
        {  isi="1. Pendaftaran Nasabah\n"+"2. Tambah Saldo\n"+"3. Ambil Saldo\n"+
                        "4. Cetak Saldo\n"+"5. Keluar\n"+"Masukkan Pilihan Anda";
                        pil_pil=JOptionPane.showInputDialog(null,isi, "BANK SEDERHANA",
                        JOptionPane.QUESTION_MESSAGE);
                        pil=Integer.parseInt(pil_pil);
                        switch(pil)
        {  case 1:
            {          nasb.masuk_nasb();     }
                        break;
            case 2:
        {  nasb.ambilData();
             nasb.masuk_setor();    }
            break;
            case 3:
        {  nasb.masuk_ambil();    }
            break;
            case 4:
        {  nasb.cetak2();  }          }
        ulang_lang=JOptionPane.showInputDialog("Anda Mau Transaksi Lagi?\nJika Ya Input 1," +
        "Jika Tidak Input 0\n"+"Masukkan Pilihan");
        ulang=Integer.parseInt(ulang_lang);
            }
        while(ulang==1);
    }   
    }