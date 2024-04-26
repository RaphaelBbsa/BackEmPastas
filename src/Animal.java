import java.util.Scanner;

/**
 * @author Raphael.porto
 */

public class Animal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        String texto = entrada.next();
        String animal = exemplo(texto);
        System.out.println(animal);
    }

    public static String exemplo(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")){
            result = "animal doméstico";
        } else if (animal.equals("TIGER")){
            result = "animal tiger";
        }
        else {
            result = "Animal desconhecido";
        }
        return result;
    }
}
