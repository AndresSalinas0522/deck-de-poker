package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cartas;

    // Constructor para inicializar el deck con 52 cartas
    public Deck() {
        cartas = new ArrayList<>();
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        // Crear las 52 cartas respetando el color de cada palo
        for (String palo : palos) {
            String color = (palo.equals("Corazones") || palo.equals("Diamantes")) ? "Rojo" : "Negro";
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    // Método shuffle para mezclar el deck
    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    // Método head para mostrar y remover la primera carta
    public void head() {
        if (!cartas.isEmpty()) {
            Card carta = cartas.remove(0);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    // Método pick para seleccionar una carta al azar
    public void pick() {
        if (!cartas.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(cartas.size());
            Card carta = cartas.remove(index);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    // Método hand para regresar cinco cartas y removerlas del deck
    public void hand() {
        if (cartas.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card carta = cartas.remove(0);
                System.out.println(carta);
            }
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas para una mano.");
        }
    }
}
