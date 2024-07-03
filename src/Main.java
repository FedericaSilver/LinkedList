import java.util.LinkedList;

/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Arancia"));
        fruits.add(new Fruit("Kiwi"));
        fruits.add(new Fruit("Cocomero"));
        fruits.add(new Fruit("Banana"));
        System.out.println("Lista frutta:");
        fruits.forEach(System.out::println);
        fruits.addFirst(new Fruit("Fragola"));
        fruits.addLast(new Fruit("Pesca"));
        System.out.println("Lista frutta aggiornata:");
        fruits.forEach(System.out::println);



    }
}