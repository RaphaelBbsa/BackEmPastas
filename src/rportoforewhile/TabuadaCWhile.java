package rportoforewhile;
import java.util.Scanner;

public class TabuadaCWhile {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deseja gerar alguma tabuada ?");
        String resposta = entrada.next();

        while (resposta.equals("Sim")){
            System.out.println("Digite o número que você quer tabuar: ");
            int numeroTab= entrada.nextInt();

            for(int i=0; i<=10; i++){
                System.out.println(numeroTab + " x " + i + " = " + numeroTab*i);
            }
        }

    }
}
