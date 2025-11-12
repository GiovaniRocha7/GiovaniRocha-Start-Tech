package comandosrepeticao;

import java.util.Scanner;

public class ExercicioParouImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pares = 0; //contador de numeros pares
        int impares = 0; //contador de numeros impares

        //laço for para ler 10 numeros
        for (int i =1; i <= 10; i++){
            System.out.println("Digite o " + i + "º numero: ");
            int numero = sc.nextInt();

        //Verifica se o numero é par ou impar
        if (numero % 2 == 0){
            pares++;
        }else{
            impares++;
        }

        }
        System.out.println("\nQuantidae de numeros paraes: "+ pares);
        System.out.println("\nQuantidae de numeros impares: "+ impares);
    }

}
