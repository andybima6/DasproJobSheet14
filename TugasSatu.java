import java.util.Scanner;
public class TugasSatu {
    static  int rekursif031D (int n){
        if ( n == 0 ){
        return 0;
    }else {
        System.out.print(n + " ");
        return (rekursif031D(n-1));
    }
}
    static void iteratif031D (int n) {
        for (int i = n; i >= 0; i--){
            System.out.print(i + "  ");
        }
    }
    public static void main (String[]args){
        Scanner  andyNugraha031D = new Scanner(System.in);
        System.out.print("Masukkan Batas Angka : ");
        int n = andyNugraha031D.nextInt();
        System.out.println("Menggunakan Rekursi :");
        System.out.println(rekursif031D(n));
        System.out.println("Menggunakan Iteratif : ");
        iteratif031D(n);
    }
    
}