import java.util.Scanner;

public class Car {

    //POLA
    private int weight;
    private String manufacturer;
    private String model;

    //KONSTRUKTOR
    public Car(int weight, String manufacturer, String model) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    //MODYFIKATORY DOSTEPU
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println("Weight: " + weight + " " + "Manufacturer: " + manufacturer + " " + "Model: " + model);
    }


    //METODA
    // Sporo czasu zajelo mi to ze kolejnosc wprowadzania danych ma znaczenie, poniewz
    // gdy int byl pierwszy to reszta przeskakiwala do ostatniego czyli model ale jak
    // zrobilem int ostatni to juz jest ok .
    public static void createCarFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car manufacturer: ");
        String manufacturer = scanner.nextLine();

        System.out.println("Enter car model: ");
        String model = scanner.nextLine();

        System.out.println("Enter car weight: ");
        int weight = scanner.nextInt();

        //dodanie nowego auta
        Car newCar = new Car(weight,manufacturer,model);
        // wydrukowanie
        newCar.print();

    }
}

//
//Stwórz nową klasę Car.java; - DONE
//Dodaj 3 pola do tej klasy: - DONE
//private int weight; - DONE
//private String manufacturer; DONE
//private String model; DONE
//Dodaj konstruktor do tej klasy, który pozwoli stworzyć nowe obiekty z odpowiednimi wartościami pól (sekcja Tworzenie obiektu); - DONE
//Dodaj metody getter i setter do każdego z pól (sekcja Modyfikatory dostępu); - DONE
//Stwórz 3 różne instancje obiektu danej klasy (różne wagi, modele, marka); - DONE
//Używając System.out.println wydrukuj do konsoli nowo powstałe obiekty. Jaką widzisz wartość? DONE
//Zaimplementuj metodę wewnątrz klasy Car, która wydrukuje wszystkie informacje na temat danego samochodu: DONE
//public void print() DONE
//Wywołaj tę metodę na wszystkich 3 obiektach. DONE


//Wykorzystując klasę Car, napisz program, który przyjmie od użytkownika dane na temat samochodu, a następnie wydrukuj dane na temat nowostworzonego obiektu.
//Stwórz metodę public static void createCarFromUserInput(), która najpierw zapyta użytkownika od dane odnośnie samochodu, następnie stworzy nowy samochód i wywoła metodę print()