import java.io.File;
import java.util.Scanner;
import java.util.Calendar;
class Drum {
    int year = Calendar.getInstance().get(Calendar.YEAR);
    private String manufacturer;
    private String model;
    private String producingCountry;
    private String type;
    private String material;
    private String color;
    private double price;
    private double radius;
    private int yearOfPurchase;

    // Constructor with initial values
    public Drum(String manufacturer, String model, String producingCountry, String type,
                String material, String color, double price, double radius, int yearOfPurchase) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.producingCountry = producingCountry;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.radius = radius;
        this.yearOfPurchase = yearOfPurchase;
    }

    // Getter and setter methods
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

    public String getProducingCountry() {
        return producingCountry;
    }
    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }
    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public int getAge(int yearOfPurchase) {
        return year - yearOfPurchase;
    }

    public String getDescription() {
        return "Manufacturer: " + manufacturer + "\nModel: " + model + "\nProducing country: " + producingCountry
                + "\nType: " + type + "\nMaterial: " + material + "\nColor: " + color + "\nPrice: " + price
                + "\nRadius:" + radius + "\"" + "\nAge: " + getAge(getYearOfPurchase());
    }
    public String getTitle() {
        return "Manufacturer: " + manufacturer + "\nModel" + model + "\nType: " + type;
    }
}

class Collection {
    // Fields
    private int count;
    private Drum[] drums;

    // Getters & Setters
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Drum[] getArray() {
        return drums;
    }

    public void setArray(Drum[] drums) {
        this.drums = drums;
    }

    // Constructor
    public Collection(int capacity) {
        count = 0;
        drums = new Drum[capacity];
    }

    public void add(Drum newDrum) {
        if (count < drums.length) {
            drums[count] = newDrum;
            count++;
        } else {
            System.out.println("Collection is full. Cannot add more drums.");
        }
    }

    public void remove(int number) {
        if (number >= 0 && number <= count) {
            for (int i = number; i < count; i++) {
                drums[count] = drums[count + 1];
            }
            drums[count - 1] = null;
            count--;
        } else {
            System.out.println("Invalid number.");
        }
    }
    public String printDrumList() {
        for (int i = 0; i < count; i++) {
            System.out.println("Drum " + (i + 1) + ": " + drums[i].getManufacturer() + " " + drums[i].getModel() + ", "
            + drums[i].getType() + ", $" + drums[i].getPrice());
            System.out.println();
        }
        return "";
    }

    public void printOne(int i) {
        if (i >= 0 && i < count) {
            System.out.println("Drum: " + (i + 1) + ":");
            System.out.println("Manufacturer: " + drums[i].getManufacturer());
            System.out.println("Model: " + drums[i].getModel());
            System.out.println("Producing country: " + drums[i].getProducingCountry());
            System.out.println("Type: " + drums[i].getType());
            System.out.println("Material: " + drums[i].getMaterial());
            System.out.println("Color: " + drums[i].getColor());
            System.out.println("Price: $" + drums[i].getPrice());
            System.out.println("Radius: " + drums[i].getRadius() + "\"");
            System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
            System.out.println("Age: " + drums[i].getAge(2018));
            System.out.println();
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to output the full description of the drums
    public String print() {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Drum: " + (i + 1) + ":");
                System.out.println("Manufacturer: " + drums[i].getManufacturer());
                System.out.println("Model: " + drums[i].getModel());
                System.out.println("Producing country: " + drums[i].getProducingCountry());
                System.out.println("Type: " + drums[i].getType());
                System.out.println("Material: " + drums[i].getMaterial());
                System.out.println("Color: " + drums[i].getColor());
                System.out.println("Price: $" + drums[i].getPrice());
                System.out.println("Radius: " + drums[i].getRadius() + "\"");
                System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
                System.out.println("Age: " + drums[i].getAge(2018));
                System.out.println();
            }
        } else System.out.println("Empty collection.");
        return "";
    }

    public void findDrum(String s) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (drums[i].getType().equals(s)) {
                System.out.println("Found drum: ");
                System.out.println("Drum: " + (i + 1) + ":");
                System.out.println("Manufacturer: " + drums[i].getManufacturer());
                System.out.println("Model: " + drums[i].getModel());
                System.out.println("Producing country: " + drums[i].getProducingCountry());
                System.out.println("Type: " + drums[i].getType());
                System.out.println("Material: " + drums[i].getMaterial());
                System.out.println("Color: " + drums[i].getColor());
                System.out.println("Price: $" + drums[i].getPrice());
                System.out.println("Radius: " + drums[i].getRadius() + "\"");
                System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
                System.out.println("Age: " + drums[i].getAge(2018));
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching drums found.");
        }
    }

    public void findDrumByPrice(double n) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (drums[i].getPrice() == (n)) {
                System.out.println("Found drum: ");
                System.out.println("Drum: " + (i + 1) + ":");
                System.out.println("Manufacturer: " + drums[i].getManufacturer());
                System.out.println("Model: " + drums[i].getModel());
                System.out.println("Producing country: " + drums[i].getProducingCountry());
                System.out.println("Type: " + drums[i].getType());
                System.out.println("Material: " + drums[i].getMaterial());
                System.out.println("Color: " + drums[i].getColor());
                System.out.println("Price: $" + drums[i].getPrice());
                System.out.println("Radius: " + drums[i].getRadius() + "\"");
                System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
                System.out.println("Age: " + drums[i].getAge(2018));
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching drums found.");
        }
    }

    public void sortDrums() {
        boolean swapped;
        for (int i = 0; i < count - 1; i++) {
            swapped = false;
            for (int j = 0; j < count - i - 1; j++) {
                if (drums[j].getPrice() > drums[j + 1].getPrice()) {
                    swapped = true;
                    Drum temp = drums[j];
                    drums[j] = drums[j + 1];
                    drums[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void newFile(Drum drum) {

    }
    public void saveToFile(Collection collection, Scanner in) {
        Collection newfile = new Collection(5); {
            for (int i = 0; i < count; i++) {

            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Collection collection = new Collection(5);

        System.out.println("Welcome to the drum collection!");
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print drum list");
            System.out.println("2. Add drum to collection");
            System.out.println("3. Remove drum from collection");
            System.out.println("4. Print all drums");
            System.out.println("5. Print one drum");
            System.out.println("6. Sort drums by price");
            System.out.println("7. Search in drums by type");
            System.out.println("8. Search in drums by price");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int number = in.nextInt();
            in.nextLine();
            switch (number) {
                case 1:
                    printDrumList(collection);
                    break;
                case 2:
                    inputDrum(collection, in);
                    break;
                case 3:
                    removeDrum(collection, in);
                    break;
                case 4:
                    printAllDrums(collection);
                    break;
                case 5:
                    printOne(collection, in);
                    break;
                case 6:
                    sortByPrice(collection, in);
                    break;
                case 7:
                    searchByType(collection, in);
                    break;
                case 8:
                    searchByPrice(collection, in);
                    break;
                case 9:
                    System.out.println("Thanks for using our program!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again");
            }
        }
    }

    public static void inputDrum(Collection collection, Scanner in) {
        System.out.println("Enter drum properties: ");

        System.out.println("Manufacturer: ");
        String manufacturer = in.nextLine();

        System.out.println("Model: ");
        String model = in.nextLine();

        System.out.println("Producing country: ");
        String producingCountry = in.nextLine();

        System.out.println("Type: ");
        String type = in.nextLine();

        System.out.println("Material: ");
        String material = in.nextLine();

        System.out.println("Color: ");
        String color = in.nextLine();

        System.out.println("Price: ");
        double price = in.nextDouble();

        System.out.println("Radius: ");
        double radius = in.nextDouble();

        System.out.println("Year of purchase: ");
        int yearOfPurchase = in.nextInt();

        collection.add(new Drum(manufacturer, model, producingCountry,
                type, material, color, price, radius, yearOfPurchase));
        System.out.println("Drum added to the collection");
    }
    public static void removeDrum(Collection collection, Scanner in) {
        System.out.println("Enter the number of the drum to remove it:");
        int i = in.nextInt();
        collection.remove(i-1);
        System.out.println("Removed!");
    }
    public static void printDrumList(Collection collection) {
        System.out.println("Printing drums short list: ");
        collection.printDrumList();
    }
    public static void printAllDrums(Collection collection) {
        System.out.println("Printing all drums in collection: ");
        collection.print();
    }
    public static void printOne(Collection collection, Scanner in) {
        System.out.println("Enter a number of the drum to print it: ");
        int i = in.nextInt();
        collection.printOne(i-1);
    }
    public static void sortByPrice(Collection collection, Scanner in) {
        System.out.println("Sorting drums by price...");
        collection.sortDrums();
        System.out.println("Sorted!");
    }
    public static void searchByType(Collection collection, Scanner in) {
        System.out.println("Enter the type of the drum: ");
        String type = in.nextLine();
        collection.findDrum(type);
    }
    public static void searchByPrice(Collection collection, Scanner in) {
        System.out.println("Enter the price of the drum: ");
        double price = in.nextDouble();
        collection.findDrumByPrice(price);
    }
}