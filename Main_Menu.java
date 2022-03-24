import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Deck mazo = new Deck();
        int opc;
        boolean validar;
       /*  System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());

        for (Card elemento : mazo.getDeck()) {
            System.out.print(elemento + " / ");
        }


        /* System.out.println("\n");
        mazo.shuffle();
        System.out.println("\n");
        mazo.head();
        System.out.println("\n");
        mazo.pick();
        System.out.println("\n");
        mazo.hand();*/




            Scanner scanner = new Scanner(System.in);

            do {

                System.out.println("Bienvenido al Poker!");
                System.out.println("Selecciona una Opcion");
                System.out.println("1. Mezclar Deck");
                System.out.println("2. Sacar una Carta");
                System.out.println("3. Carta al Azar");
                System.out.println("4. Generar una mano de 5 Cartas");
                System.out.println("0. Salir");
                Scanner sc = new Scanner(System.in);
                opc = sc.nextInt();

                if (opc >=5 || opc <=-1 ){
                    System.out.printf("Opción no válida\n");
                    System.out.println("----------------");
                    validar = true;
                }else{
                    validar = false;
                }

            }while(validar);

            switch (opc){
                case 1:
                    System.out.println("Mezclar cartas");
                    mazo.shuffle();
                    break;
                case 2:
                    System.out.println("Sacar una Carta");
                    mazo.head();
                    break;
                case 3:
                    System.out.println("Carta al Azar ");
                    mazo.pick();
                    break;
                case 4:
                    System.out.println("Generar una Mano de 5 Cartas");
                    mazo.hand();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }//switch

        }//DO
    }


