import java.util.Scanner;

/**
 * @author Raphael Porto
 */

public class Tabuada {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número que deseja tabuar: ");
        int num = entrada.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
