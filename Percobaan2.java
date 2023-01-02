import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat031D (int x,int y) {
        if ( y == 0 ){
            System.out.print(1 + " = ");
            return (1);
        }else {
            System.out.print(x + "x" );
            return ( x * hitungPangkat031D(x, y - 1));
        }
    }
    public static void main (String[]args) {
    Scanner andyNugraha031D = new Scanner(System.in);
    int Bilangan031D;
    int pangkat031D;
    
    System.out.print("Bilangan Yang Dihitung : ");
    Bilangan031D = andyNugraha031D.nextInt();
    System.out.println("Pangkat : ");
    pangkat031D = andyNugraha031D.nextInt();
    System.out.println(hitungPangkat031D(Bilangan031D,pangkat031D));
}
}
