import java.util.Scanner;

public class Segitiga25{
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        
        luas = alas * tinggi / 2;
        System.out.print("Luas Segitiga" + luas);




    }
}