package comandosrepeticao;

import java.util.Scanner;
public class ExercicioFor03 {
    public static void main(String[] args) {
        int numero;
        int soma = 0;


        Scanner entrada = new Scanner(System.in);

        for( int i=1; i<=5; i++){
            System.out.println("Digite o numero: ");
            numero = entrada.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos 5 numeros é:" +soma);
        System.out.println("A media dos 5 numeros é:" +(soma/5));
    }



















}
