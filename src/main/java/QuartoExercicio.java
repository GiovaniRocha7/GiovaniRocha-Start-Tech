import java.util.Scanner;



public class QuartoExercicio {
    public static void main(String args[]) {
        float altura = 1.70f;
        float peso = 63;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o seu peso: ");
        peso = entrada.nextFloat();

        System.out.println("Entre com o seu altura: ");
        altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu imc é: " + imc);

        if (imc < 18.5) {
            System.out.println("Voce está ABAIXO DO PESO ");

        } else if (imc <= 24.9) {
            System.out.println("Voce está no PESO ideal");

        } else if (imc <= 29.9) {
            System.out.println("voce esta levementa acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("voce esta com obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("voce esta com obesidade grau 2");
        } else {
            System.out.println("voce esta com obesidade grau 3");

        }
    }
}
