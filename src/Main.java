import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Patryk";
        String surname = "Miller";
        String city = "Swidnik";

        System.out.println("Name: " + name + "\n" + "Surname: " + surname + "\n" + "City: " + city + "\n");

        System.out.println("ZADANIE 1: " + "\n");

        // Trzy rozne instancje projektu :

        Car one = new Car(2230, "Audi", "Q8");
        Car two = new Car(1500, "Fiat", "500");
        Car three = new Car(1730, "Opel", "Astra");


        one.print();
        two.print();
        three.print();

        Car.createCarFromUserInput();
        // tutuaj musialem dodac Car bo inaczej nie dziala
    }
}