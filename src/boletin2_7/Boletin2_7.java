
package boletin2_7;
import java.util.Scanner;

public class Boletin2_7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float centigrados,kelvin,farenhein;
        System.out.println("teclea centigrados:");
        centigrados =sc.nextFloat();
        kelvin=centigrados + 273f;
        farenhein =centigrados *1.8f +32f;
        System.out.println( centigrados+" grados centrigrados son"+kelvin+"grados kelvin y" + farenhein+"grados farenhein");
    }
    
}
