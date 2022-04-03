
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class toomain {

    static boolean salir = false;
    static int opc;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Deck deck = new Deck();

        while (!salir) {

            if (deck.cardList.size() > 0);
            {
                showMenu();

                switch (opc) {
                    case 1:

                        deck.Shuffle();
                        break;

                    case 2:

                        deck.Head();
                        break;

                    case 3:

                        deck.Pick();
                        break;
                    case 4:

                        deck.Hand();
                        break;

                    case 0:
                        salir = true;
                        break;

                    default:
                        if (opc >= 5 || opc <= -1) {
                            System.out.printf("Opción no válida\n");
                        }
                }//switch

            }//  if


        }//while

    }//Main

    static void showMenu() throws IOException {

        System.out.println("-----POKER-----");
        System.out.println("1. Mezclar");
        System.out.println("2. Sacar Primera Carta");
        System.out.println("3. Sacar Carta al Azar");
        System.out.println("4. Generar una mano de 5 Cartas");
        System.out.println("0. Salir");
        try {
            opc = sc.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println("ERROR: SOLO NUMEROS");

        }
    }//ShowMenu

}//Clase

