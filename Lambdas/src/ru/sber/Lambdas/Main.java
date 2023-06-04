package ru.sber.Lambdas;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Sounding> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());

        list.forEach(Sounding::sound);


        list.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("kukareku");
            }
        });
        list.forEach(Sounding::sound);


        list.add(() -> System.out.println("ror"));
        list.forEach(Sounding::sound);


        list.add(Main::methodReference);
        list.forEach(Sounding::sound);


        list.forEach(Sounding::sound);
    }
    public static void methodReference() {
        System.out.println("beee");
    }
}