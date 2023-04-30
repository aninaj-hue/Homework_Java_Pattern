package org.example;

public class Main {
    public static void main(String[] args) {
        //o instanță a clasei Config folosind metoda getInstance(), care folosește Singleton Pattern
        //pentru a asigura că există o singură instanță a clasei Config în întregul program
        Config config = Config.getInstance();

        //returnează valoarea pentru culoare stocată în instanța de Config
        String color = config.getColor();

        //returnează valoarea pentru greutate stocată în instanța de Config
        int weight = config.getWeight();

        // afisare in consola
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
