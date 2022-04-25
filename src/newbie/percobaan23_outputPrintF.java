package newbie;

public class percobaan23_outputPrintF {
    public static void main(String[] args) {
        String nama = "anton";
        int umur = 21;
        float tinggiBadan = 170.4f;
        double beratBadan = 71.78;
        boolean kawin = true;
        char jenisKelamin ='P';
        int Oktal12 = 014;
        System.out.println("Nama : %s\n",nama);
        System.out.println("Umur : %d\n",umur);
        System.out.println("Tinggi badan : %f\n",tinggiBadan);
        System.out.println("Berat badan : %1f\n",beratBadan);
        System.out.println("Sudah menikah : %b\n",kawin);
        System.out.println("Jenis kelamin : %c\n",jenisKelamin);
        System.out.println("Bilangan oktal 12 : %s\n",Oktal12);
    }
}
