package poker;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();  // Mezclar el deck
        deck.head();     // Mostrar y remover la primera carta
        deck.pick();     // Seleccionar una carta al azar
        deck.hand();     // Sacar cinco cartas (mano)
    }
}
