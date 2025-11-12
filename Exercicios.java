package comandosrepeticao;

import java.util.Scanner;
public class Exercicios {
    public static void main(String[] args) {


       double numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        numero = entrada.nextDouble();

        if (numero % 2== 0){
            System.out.println("Esse numero é PAR!!!");
        }else{
            System.out.println("Esse numero é IMPAR!!!");
        }
    }

}
