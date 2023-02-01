package chapter11;


import java.util.ArrayList;
import java.util.Objects;

public class PlayGround11 {
    public static void main(String[] args) {
        Direction d = Direction.EAST;
        System.out.println(d);
    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Box<T> {

    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

//    public static void printAll(ArrayList<? extends Fruit> list1, ArrayList<? extends Fruit> list2) {
//        // ...
//    }

    public static <T extends Fruit> void printAll(ArrayList<T> list1, ArrayList<T> list2) {
        // ...
    }
}

enum Direction {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    private final int value;
    private final String symbol;

    Direction(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}


class Fruit {}
class Apple extends Fruit {}
class Grape extends Fruit {}

class FruitBox<T extends Fruit> extends Box<T> {}
