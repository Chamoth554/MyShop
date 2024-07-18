import java.util.Scanner;

//super class
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

    }

    void displayItem() {
        System.out.println("Brand name:" + productName);
        System.out.println("Price:Rs." + price);

    }

}

// sub class for laptops (sub class 01)
class Laptop extends Product {
    String proName = "Laptop";
    String gen;
    String ram;

    public Laptop(String lName, double lprice, String gen, String ram) {
        super(lName, lprice);
        this.gen = gen;
        this.ram = ram;

    }

    void displayItem() {

        System.out.println("..............");
        System.out.println("..............");
        System.out.println("....LAPTOP....");
        super.displayItem();
        System.out.println("Generation:" + gen);
        System.out.println("Ram:" + ram);
        System.out.println("..............");
        // System.out.println("..............");
    }

}

// sub class for phone (sub class 02)
class phone extends Product {
    String proName = "Phone";
    String model;

    public phone(String pName, double pPrice, String model) {
        super(pName, pPrice);
        this.model = model;

    }

    void displayItem() {
        System.out.println("..............");
        System.out.println("..............");
        System.out.println("....PHONES....");
        super.displayItem();
        System.out.println("Model:" + model);
        System.out.println("..............");
        // System.out.println("..............");

    }

}

class Menu {

    void dMenu() {
        System.out.println(".......*****.........");
        System.out.println("....**TANGO PC**....");
        System.out.println("Item Menu*");
        System.out.println(".....................");
        System.out.println("Item No  Product Name");

    }

}

class Buy {
    private int tot;

    void total(int sprice) {
        tot = sprice;
        System.out.println();
        System.out.println("Full cost=Rs." + tot + "/=");
        System.out.println();

    }

    void total(int sprice, int qnt) {
        tot = sprice * qnt;
        System.out.println();
        System.out.println("Full cost=Rs." + tot + "/=");
        System.out.println();

    }

    void oneI() {
        int ftotal = tot;
    }

}

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Application menu
        // Menu m1 = new Menu();
        // creat object for laptop class
        Laptop lp1 = new Laptop("DELL", 120000, "i5 2nd Gen", "8GB");
        // lp1.displayItem();
        // creat object for phone class
        phone p1 = new phone("SAMSUNG", 65000, "S8");
        // p1.displayItem();
        //boolean y = true;

        try {
            boolean x = true;
            while (x) {

                Menu m1 = new Menu();
                m1.dMenu();
                System.out.print(" 01---------");
                System.out.println(lp1.proName);
                System.out.print(" 02---------");
                System.out.println(p1.proName);
                System.out.print(" 03--------");
                System.out.println(" exit");
                System.out.println(".....................");
                System.out.print("Select item No:");
                
                int itemNo = sc.nextInt();

                switch (itemNo) {
                    case 1:
                        lp1.displayItem();
                        System.out.println("1==> Buy 1 item");
                        System.out.println("2==> Buy more item");
                        System.out.println("3==> Back");
                        System.out.print("Select No:");
                        int select1 = sc.nextInt();
                        switch (select1) {
                            case 1:
                                Buy l1 = new Buy();
                                l1.total(120000);

                                break;
                            case 2:
                                System.out.print("Input quntity:");
                                int qnt1 = sc.nextInt();
                                if (qnt1 != 1) {
                                    Buy more1 = new Buy();
                                    System.out.println();
                                    System.out.print("Buy " + qnt1 + " laptops");
                                    more1.total(120000, qnt1);
                                } else {
                                    System.out.println("! No of '01' quntity not accept !");

                                }
                                break;

                            case 3:
                                break;

                            default:
                                System.out.println("Invalid Input!");
                                break;
                        }

                        break;
                    case 2:
                        p1.displayItem();
                        System.out.println("1==> Buy 1 item");
                        System.out.println("2==> Buy more item");
                        System.out.println("3==> Back");
                        System.out.print("Select No:");
                        int select2 = sc.nextInt();
                        switch (select2) {
                            case 1:
                                Buy s1 = new Buy();
                                s1.total(65000);
                                break;
                            case 2:
                                System.out.print("Input quntity:");
                                int qnt1 = sc.nextInt();
                                if (qnt1 != 1) {
                                    Buy more1p = new Buy();
                                    System.out.println();
                                    System.out.print("Buy " + qnt1 + " phones");
                                    more1p.total(65000, qnt1);
                                } else {
                                    System.out.println("! No of '01' quntity not accept !");

                                }
                                break;
                            case 3:
                                break;

                            default:
                                System.out.println("Invalid Input!");
                                break;
                        }

                        break;
                    case 3:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Input!");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid Input system close!");

        }

    }
}
