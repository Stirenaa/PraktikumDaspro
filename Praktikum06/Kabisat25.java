import java.util.Scanner;
public class Kabisat25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tahun;
        System.out.println("Masukkan Tahun");
        tahun = sc.nextInt();
        
        if ((tahun & 400) == 0 || (tahun % 100) != 0){
            System.out.println("Tahun Kabisat");
        }else if ((tahun & 400) == 0)
            System.out.println("Bukan Tahun Kabisat");
        else {
            System.out.println( "Bukan Tahun Kabisat");
             }
    }
}
     
    
    

