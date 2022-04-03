
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.io.IOException;


public class Deck {

    Card cartas[] = new Card[52];
    List<Card> cardList;

    public Deck() {

        String color[] = {"Rojo", "Negro"};
        String palo[] = {"Corazones", "Diamantes", "Picas", "Treboles"};
        String valor[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 13; j++) {
                cartas[index] = new Card();
                cartas[index].color = color[0];
                cartas[index].palo = palo[i];
                cartas[index].valor = valor[j];
                index++;
            }
        }

        for (int i = 2; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cartas[index] = new Card();
                cartas[index].color = color[1];
                cartas[index].palo = palo[i];
                cartas[index].valor = valor[j];
                index++;
            }
        }

        cardList = new LinkedList<Card>(Arrays.asList(this.cartas));
    }

    public void Shuffle() {
        Collections.shuffle(this.cardList);
        System.out.println("Se mezclo el deck");
    }

    public void Head() throws IOException {
        try {
            System.out.print(cardList.get(0).color + " ");
            System.out.print(cardList.get(0).palo + " ");
            System.out.println(cardList.get(0).valor);
            cardList.remove(0);
            System.out.println("Quedan " + cardList.size());
        } catch (Exception e) {
            System.out.println("Se han agotado las Cartas");
        }
    }

    public void Pick() throws IOException {
        try {
            int sacarCarta = (int) Math.floor(Math.random() * (cardList.size()));
            System.out.print(cardList.get(sacarCarta).color + " ");
            System.out.print(cardList.get(sacarCarta).palo + " ");
            System.out.println(cardList.get(sacarCarta).valor);
            cardList.remove(sacarCarta);
            System.out.println("Quedan " + cardList.size());

        } catch (Exception e) {
            System.out.println("Se han agotado las Cartas");
        }
    }

    public void Hand() throws IOException {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print(cardList.get(0).color + " ");
                System.out.print(cardList.get(0).palo + " ");
                System.out.println(cardList.get(0).valor);
                cardList.remove(0);
            }
            System.out.println("Quedan " + cardList.size());

        } catch (Exception e) {
            System.out.println("Se han agotado las Cartas");
        }
    }

    public void Imprimir() throws IOException {
        try {
            for (int i = 0; i < cardList.size(); i++) {
                System.out.print(cardList.get(i).color + " ");
                System.out.print(cardList.get(i).palo + " ");
                System.out.println(cardList.get(i).valor);
            }
        } catch (Exception e) {
            System.out.println("Se han agotado las Cartas");
        }
    }


}
