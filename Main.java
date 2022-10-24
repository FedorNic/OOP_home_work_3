package Home_Tasks.HT_9;

import Home_Tasks.HT_9.Fruits.Fruit;
import Home_Tasks.HT_9.Fruits.Orange;
import Home_Tasks.HT_9.Fruits.Apple;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Fruitbox<Apple> fruitsApple1 = new Fruitbox(new ArrayList());
        for (int i=0; i<5; i++) {
            fruitsApple1.addFruits(new Apple());
        }
        System.out.println(fruitsApple1 + "Вес коробки = " + fruitsApple1.getWeight() +"\n");

        Fruitbox<Orange> fruitsOrange1 = new Fruitbox(new ArrayList());
        for (int i=0; i<5; i++) {
            fruitsOrange1.addFruits(new Orange());
        }
        System.out.println(fruitsOrange1 + "Вес коробки = " + fruitsOrange1.getWeight() +"\n");

        Fruitbox<Apple> fruitsApple2 = new Fruitbox(new ArrayList());
        for (int i=0; i<3; i++) {
            fruitsApple2.addFruits(new Apple());
        }
        System.out.println(fruitsApple2 + "Вес коробки = " + fruitsApple2.getWeight() +"\n");

        System.out.println("Результат сравнения коробки с яблоками 1 и 2 - " + fruitsApple1.compare(fruitsApple2));
        System.out.println("Количество яблок в первой коробке - " + fruitsApple1.getFruits().size());
        System.out.println("Количество яблок во второй коробке - " + fruitsApple2.getFruits().size());

        System.out.println();
        moveSomeFruits(fruitsApple1, fruitsApple2);
        System.out.println();
        System.out.println(fruitsApple1);
        System.out.println(fruitsApple2);

    }

    public static <T extends Fruit> void moveSomeFruits(Fruitbox<? extends T> source, Fruitbox<? super T> dest) {
        System.out.println("Начинаю перекладывать фрукты из коробки/");
        while (source.getFruits().size() > 0) {
            dest.addFruits(source.pop());
        }
        System.out.println("Перекладывание фруктов из коробки окончено.");
    }
}