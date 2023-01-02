import java.util.Scanner;
public class TugasTiga {
    static int cekPrimaRekursif031D (int a, int b ) {
        if ( a == 1){
            return 1;
        }else if ( b % a == 0 ){
            return 0;
        }else {
            return cekPrimaRekursif031D(a - 1,b);
        }
    }
    public static void main (String[]args){
        Scanner andyNugraha031D = new Scanner (System.in);
        System.out.println("Masukkan Angka Yang ingin Anda Masukkan : ");
        int b = andyNugraha031D.nextInt();

        int a = cekPrimaRekursif031D(b-1, b);
        if ( b > 1){
            if ( a == 1 ){
                System.out.println("Bilangan Prima");
            }else {
                System.out.println("Bukan Bilangan Prima");
            }
        }else{
            System.out.println("Bukan Bilangan Prima");
        }

    }
}
