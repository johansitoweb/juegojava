import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario = 0;

        System.out.println("¡Bienvenido a Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (numeroUsuario != numeroAleatorio) {
            System.out.print("Ingresa tu número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Más alto. Intenta de nuevo.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("Más bajo. Intenta de nuevo.");
            }
        }

        System.out.println("¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
        scanner.close();
    }
}