package comandosrepeticao;

import java.util.Scanner;

public class ExerciciocomWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pares =0;
        int impares = 0;
        int i = 1;

        while (i<10){
            System.out.println("Digite o " + i + "º numero: ");
            int numero = sc.nextInt();

            if (numero % 2==0){
                pares++;
            }else{
                impares++;
        }
        i++;
    }
        System.out.println("\nQuantidae de numeros paraes: "+ pares);
        System.out.println("\nQuantidae de numeros impares: "+ impares);
}

}