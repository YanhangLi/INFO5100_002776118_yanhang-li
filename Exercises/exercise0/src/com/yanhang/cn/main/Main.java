package com.yanhang.cn.main;

import com.yanhang.cn.pojo.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal(1, "tom", "felidae", "blue", "male", 20, 50, "fish", 18, new Date());
        Animal dog1 = new Animal(2, "John", "canine", "black", "female", 80, 200, "bone", 8, new Date());
        Animal dog2 = new Animal(3, "bit", "canine", "black", "female", 82, 150, "bone", 8, new Date());

        Computer macbookPro = new Computer(1, "macbook Pro", "M2 Pro", 120, 16, "120", 10, 2);
        Computer macbookAir = new Computer(2, "macbook air", "M1 integrated graphics card", 120, 13, "120", 10, 2);
        Computer macbookAir2 = new Computer(3, "macbook air2", "M2 integrated graphics card", 120, 13, "120", 10, 2);

        Bag ck = new Bag(1, 100, "ck", "Pink", "Small square bag", new Date(), 30.00, 40.00);
        Bag ck2 = new Bag(2, 1000, "ck", "blue", "Small square bag", new Date(), 30.00, 50.00);
        Bag ck3 = new Bag(3, 200, "ck", "green", "Small square bag", new Date(), 30.00, 40.00);

        Book book1 = new Book(1, "Compilation principle", "Alfred V. Aho Monica S. Lam Ravi Sethi Jeffrev D. Ullman","programming", "001", "002", "003", "13");
        Book book2 = new Book(2, "Thinking in Java", "Mark Allen Weiss","programming", "002", "003", "004", "30");
        Book book3 = new Book(3, "Data structure and algorithm analysis", "Bruce Eckel","programming", "003", "004", "005", "20");

        Car volvo =  new Car(1, "volvo", "ea888", 400, 800, 30, 30, 20);
        Car honda =  new Car(2, "honda", "ea900", 400, 800, 30, 30, 20);
        Car benz =  new Car(3, "benz", "ea888", 400, 800, 30, 30, 20);

        Colthes colthes1 = new Colthes(1, "Sema", "001", "001", "black", "cotton", "Line", "Partial thickness");
        Colthes colthes2 = new Colthes(2, "Sema", "002", "002", "blue", "cotton", "Line", "Partial thickness");
        Colthes colthes3 = new Colthes(3, "Sema", "003", "003", "red", "cotton", "Line", "Partial thickness");

        Dog siberianHusky = new Dog(1, "Siberian Husky", "canine", "black", "female", 80, 200, "bone", 8, new Date());
        Dog pekingese = new Dog(2, "Pekingese", "canine", "black", "female", 80, 200, "bone", 8, new Date());
        Dog sausage = new Dog(3, "Sausage", "canine", "black", "female", 80, 200, "bone", 8, new Date());

        Food apple = new Food(1, "apple", "001", 100, 100, "001", "00z1", "Shandong, China");
        Food raisin = new Food(2, "raisin", "001", 100, 100, "002", "00z2", "Shandong, China");
        Food banana = new Food(3, "banana", "001", 100, 100, "003", "00z3", "Shandong, China");


        Keyboard key1 = new Keyboard(1, "k1", 80, "Bluetooth", "green axis", "blue", "black", "fast charging");
        Keyboard key2 = new Keyboard(2, "k2", 66, "Bluetooth", "green axis", "blue", "black", "fast charging");
        Keyboard key3 = new Keyboard(3, "k3", 80, "Bluetooth", "green axis", "blue", "black", "fast charging");

        Association a1 = new Association(1, "Thinkcentre", "M510", 120, 16, "120", 10, 2);
        Association a2 = new Association(2, "Thinkpad air", "M520", 120, 13, "120", 10, 2);
        Association a3 = new Association(3, "Xiaoxin", "A8150", 120, 13, "120", 10, 2);


    }
}
