package newbie;
import java.io.IOException;
import java.util.Scanner;
public class percobaan22_inputtypescannerB {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama = ");
        String name = input.nextLine();
        System.out.print("Masukkan umur = ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan = ");
        Double height = input.nextDouble();
        System.out.print("Sudah menikah (true/false) = ");
        Boolean married = input.nextBoolean();
        System.out.println("Nama : "+name);
        System.out.println("Umur : "+age);
        System.out.println("Tinggi badan : "+height);
        System.out.println("Sudah menikah : "+married);
    }
}
