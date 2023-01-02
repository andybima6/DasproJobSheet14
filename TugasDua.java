import java.util.Scanner;
public class TugasDua {
 static int jumlahRekursif031D (int n, int batas031D) {
    if ( n == batas031D){
        System.out.printf("%d = ", batas031D);
        return batas031D;
    }else{
        System.out.printf("%d + ", n);
        return( n + jumlahRekursif031D(n+ 1, batas031D));
    }
 }
    public static void main (String[]args){
            Scanner andyNugraha031D = new Scanner (System.in);
        System.out.println("Bilangan Yang Akan Dihitung :");
        int a = andyNugraha031D.nextInt();  
        
        System.out.println(jumlahRekursif031D(1, a));
    }
}
