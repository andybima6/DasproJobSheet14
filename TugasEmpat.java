import java.util.Scanner;
public class TugasEmpat {
    static int Fibonacci031D(int a){
        if ( a <= 1 ) {
            return a;
        }else {
            return (Fibonacci031D(a-1)+Fibonacci031D(a-2));
        }
    }
    public static void main (String[]args){
        System.out.println(Fibonacci031D(12));
    }
}
