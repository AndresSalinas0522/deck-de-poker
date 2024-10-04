# Deck de Poker

Este proyecto implementa un deck o baraja de cartas de poker en Java. Utiliza la programación orientada a objetos para representar las cartas y el deck, y proporciona métodos para mezclarlas, seleccionar cartas específicas, y repartir manos de cinco cartas.

## Instalación y Configuración

### 1. Requisitos previos

Asegúrate de tener instalados los siguientes componentes en tu sistema:

- **Java Development Kit (JDK) 11** o superior.
- **IntelliJ IDEA** o cualquier otro IDE compatible con Java.
- **Git** para el control de versiones.

### 2. Clonar el repositorio

Clona este repositorio en tu máquina local utilizando Git. Abre una terminal y ejecuta:

```bash
git clone https://github.com/tuusuario/poker-deck.git
3. Abrir el proyecto en IntelliJ IDEA
Abre IntelliJ IDEA.
Selecciona la opción Open y navega hasta la carpeta donde clonaste el repositorio.
Asegúrate de configurar el JDK 11 en el proyecto.
Uso del Programa
1. Ejecutar el sistema
Para ejecutar el programa:

Abre la clase Main.java ubicada en el paquete poker.
Haz clic derecho y selecciona Run Main.
El sistema mostrará opciones para:

Mezclar el deck: Utiliza el método shuffle().
Mostrar la primera carta (head()): Elimina la primera carta del deck.
Seleccionar una carta al azar (pick()): Remueve una carta seleccionada al azar del deck.
Repartir una mano (hand()): Remueve cinco cartas del deck.

2. Ejemplo de salida
Después de ejecutar el programa, verás una salida similar a la siguiente:
Se mezcló el Deck.
Corazones, Rojo, A
Quedan 51 cartas en el deck.
Tréboles, Negro, 10
Quedan 50 cartas en el deck.
Corazones, Rojo, 7
Diamantes, Rojo, K
Picas, Negro, 5
Tréboles, Negro, J
Quedan 45 cartas en el deck.

Descripción de la Solución
1. Clases Implementadas
El proyecto incluye dos clases principales y una clase de prueba:

Card: Representa una carta individual del deck, con los atributos palo, color, y valor.
Deck: Representa el conjunto completo de 52 cartas y proporciona métodos para:
shuffle(): Mezclar el deck.
head(): Mostrar y eliminar la primera carta del deck.
pick(): Seleccionar y eliminar una carta al azar del deck.
hand(): Seleccionar y eliminar cinco cartas del deck.
Main: Clase principal que permite interactuar con la baraja ejecutando las acciones antes mencionadas.
2. Funcionamiento de la Baraja de Poker
El deck de poker consta de 52 cartas, divididas en cuatro palos:
Tréboles (negro)
Picas (negro)
Corazones (rojo)
Diamantes (rojo)
Los valores posibles para cada palo son 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A.
Cada carta tiene un palo, un color y un valor.
3. Uso del Collection Framework
El deck se almacena usando una Lista (List<Card>) del Java Collection Framework. Esta lista permite realizar operaciones como mezclar las cartas (shuffle), eliminar elementos (con remove), y seleccionar cartas al azar.
