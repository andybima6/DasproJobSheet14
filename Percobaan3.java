import java.util.Scanner;
public class Percobaan3 {
    static double hitungLaba031D (double saldo031D, int tahun031D) {
        if ( tahun031D == 0 ) {
            return(saldo031D);//basecall
        }else {
            return ( 1.11 * hitungLaba031D(saldo031D, tahun031D - 1));//recursion call
        }
    }
    public static void main (String[]args){
        Scanner andyNugraha031D = new Scanner(System.in);
    System.out.print(" Jumlah Saldo Setelah :" );
    int saldoAwal031D = andyNugraha031D.nextInt();
    System.out.print("Lamanya Investasi(tahun) :");
    int tahun031D = andyNugraha031D.nextInt();

    System.out.print("Jumlah Saldo Setelah " + tahun031D);
    System.out.print(hitungLaba031D(saldoAwal031D, tahun031D));
}
}
