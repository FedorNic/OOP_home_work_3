package Home_Tasks.HT_9;

import Home_Tasks.HT_9.Fruits.Fruit;

import java.util.ArrayList;

public class Fruitbox<T extends Fruit> {

    private ArrayList<? super T> fruits;

    public Fruitbox(ArrayList<? super T> fruits) {
        this.fruits = fruits;
    }

    public void addFruits(T fruit) {this.fruits.add(fruit);}

    public ArrayList<? super T> getFruits() {return fruits;}

    // вытаскиваем фрукт из коробки
    public T pop() {
        if (this.fruits.size() > 0) {
            T fr = (T) this.fruits.remove((this.fruits.size() - 1));
            return fr;
        }
        return null;
    }

    // Считаем вес коробки
    public float getWeight() {
        float sum = 0.0f;
        for (int i = 0; i < this.fruits.size(); i++) {
            sum += ((T) this.fruits.get(i)).weight();
        }
        return sum;
    }

    // метод сравнивнения коробки
    public boolean compare(Fruitbox<? extends Fruit> o1) {
        if (Math.abs(o1.getWeight() - this.getWeight()) < 0.001) return true;
        else return false;
    }

    @Override
    public String toString() {
        StringBuilder rez = new StringBuilder();
        rez.append("Fruitbox:\n");
        if(this.fruits.size() == 0) {
            rez.append("Коробка пуста.\n");
        } else {
            for (int i = 0; i < this.fruits.size(); i++) {
                rez.append(((T) this.fruits.get(i)).getName() + " №" + i + "\n");
            }
        }
        return rez.toString();
    }
}