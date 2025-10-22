import java.util.Scanner;


public class QuintoExercico{

    public static void main(String args[]){


        float nota1 ;
        float nota2 ;
        float nota3 ;
        float nota4 ;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Insira a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Insira a terceira nota: ");
        nota3 = entrada.nextFloat();

        System.out.println("Insira a quarta nota: ");
        nota4 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 6) {
            System.out.println("Voce foi Aprovado");

        } else if (media>=5) {
            System.out.println("Voce Está de Recuperação");

        } else if (media <= 5){
                System.out.println("Voce foi Reprovado");

            }
        }
    }

