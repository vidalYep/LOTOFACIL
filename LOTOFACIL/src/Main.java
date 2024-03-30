
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.exit;

public class Main {


    public static void main(String[] args) {

        int escolha = -1;
        Scanner scn = new Scanner(System.in);

        System.out.print(
                """
                **************************
                Menu LOTOFÁCIL:
                1) Apostar de 0 a 100
                2) Apostar de A à Z
                3) Apostar em par ou ímpar
                0) Sair
                **************************
                Digite um número para jogar, para sair digite 0.
                """
        );

        escolha = scn.nextInt();

        switch (escolha) {
            case 1:
                aposta1();
            break;

            case 2:
                aposta2();
            break;

            case 3:
                aposta3();
            break;

            case 0:
                exit(0);
            break;

            default:
                System.out.println("Escolha inválida");
        }

    }

    //APOSTA 1: NÚMEROS

    private static void aposta1() {

        //ARMAZENA O NUMERO DIGITADO EM UMA VARIAVEL
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 100");

        //GERA UM NÚMERO ALEATORIO DE 0 A 100
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(101);

        num = scn.nextInt();


        //É FEITO O TESTE SE O NUMERO DIGITADO ESTA REALMENTE ENRE 0 E 100
        if (num >= 0 && num <= 100){

            if(num == aleatorio){
                System.out.println("Parabéns! Você ganhou R$ 1.000,00 reais. O número sorteado foi o mesmo que vc escolheu.");
            }else{
                System.out.println("Que pena! O número sorteado foi: " + aleatorio);
            }
        //CASO NAO É, RETORNA ESSA MENSAGEM
        }else{
            System.out.println("Aposta inválida");
        }

    }




    //APOSTA 2: LETRAS

    private static void aposta2() {
        Scanner scn = new Scanner(System.in);

        //ARMAZENAMOS O CARACTERE DIGITADO NA VARIVEL: `Caractere`
        System.out.println("Digite uma Letra:");
        char Caractere = scn.next().charAt(0);

        //VERIFICAR SE O CARACCTERE DIGITADO É UMA LETRA
        if(Character.isLetter(Caractere)){

            //TRANSFORMAR O CARACTERE EM MAISCULO
            char MaisculoCaractere = Character.toUpperCase(Caractere);
            char LetraPremiada = 'S';

                //AQUI É FEITA A COMPARAÇAO COM A LETRA SORTEADA E A DIGITADA
                if(MaisculoCaractere == LetraPremiada){
                    System.out.println("Letra correta, Parabéns! Você ganhou R$ 500,00 reais.");
                }else{
                    System.out.println("Que pena! A letra sorteada foi: " + LetraPremiada);
                }

        }else{

            System.out.println("caractere inválido");
        }

    }

    //APOSTA 3: PAR OU IMPAR

    private static void aposta3() {

        //ARMAZENA O NUMERO DIGITADO EM UMA VARIAVEL
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite qualquer número: ");
        num = scn.nextInt();

        //VALIDA SE O NUMERO DIGITADO É PAR OU IMPAR
        if(num % 2 == 1){
            System.out.println("Que pena!O número digitado é ímpar e a premiação foi para números pares.");
        }else{
            System.out.println("Número par, Parabéns! Você ganhou R$ 100,00 reais.");
        }

    }




}