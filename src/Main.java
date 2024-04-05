import java.util.Random;
import java.util.Scanner;
/*@autot Gercodex ©.  Versión del juego de adivinar número*/
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int rango = 100;
        int aleatorio = random.nextInt(rango);
        int intentos = 5;
        int intento = 1;
        int valorIntento;
        /*System.out.println(aleatorio);*/
        Scanner scanner = new Scanner(System.in);
        String mensajeAdivinado;
        System.out.println("Bienvenido al juego de adivinar el número.");
        while (intentos > 0) {
            System.out.printf("Escribe un número del 0 al %d para adivinar:%n", rango);
            valorIntento = scanner.nextInt();
            if (aleatorio == valorIntento){
                mensajeAdivinado = """
                Felicidades! Has adivinado el número '%d' en %d
                """.formatted(aleatorio, intento) + (intento == 1 ? "intento" :  "intentos");
                System.out.println(mensajeAdivinado);
                break;
            } else {
                intentos--;
                System.out.print("El número es " + ((aleatorio < valorIntento) ? "mayor" : "menor"));
                System.out.println((" quedan %d intentos").formatted(intentos) + "\n");
                if (intentos == 0){
                    System.out.println("Intentos agotados, Juego terminado. \n");
                }
            }
            intento++;
        }
    }
}