import java.util.Scanner;
public class Percobaan1 {
    static int faktorialRekursif031D(int n){
        if ( n == 0 ) {
            return(1);
        }else {
            return ( n * faktorialRekursif031D(n-1));
        }
    }
    static int faktorialIteratif031D(int n){
        int faktor031D = 1;
        for (int i = n;i >= 1; i--){
            faktor031D = faktor031D * i;
        }
        return faktor031D;
    }

    public static void main (String[]args) {
        System.out.println(faktorialRekursif031D(5));
        System.out.println(faktorialIteratif031D(5));
    }
}
