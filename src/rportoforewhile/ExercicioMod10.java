package rportoforewhile;
import java.util.Scanner;

public class ExercicioMod10 {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Me diga suas 4 notas para avaliarmos se você passou ou reprovou");

        int soma = 0;
                for(int i = 1; i <= 4; i++){
                    System.out.print("Nota " + i + " : " );
                  int nota =  entrada.nextInt();
                    soma += nota;
                }
            double media = soma / 4;

                if(media >= 7){
                    System.out.println("Você está aprovado! Sua média foi: " + media);
                }

                else if (media >= 5 && media < 7 ){
                    System.out.println("Você está de recuperação! Sua média foi: " + media);
        }
                else{
                    System.out.println("Você está reprovado! Sua média foi " + media);
                }
                entrada.close();
    }
}
