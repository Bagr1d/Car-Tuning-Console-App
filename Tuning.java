package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tuning extends Auto {
    static List<Auto> autoWserwisie = new ArrayList<>();

    public Tuning(String nazwa, String kolor, int rokProdukcji) {
        super(nazwa, kolor, rokProdukcji, autoWserwisie.size());
    }

    public static void dodaj(Auto x) {
        autoWserwisie.add(x);
    }

    public static void wypiszAuta() {
        for (Auto a : autoWserwisie)
            System.out.println(a);
    }

    public static void main(String[] args) {
        autoWserwisie.add(new Tuning("Chevrolet Camaro", "Biały", 2018));
        dodaj(new Tuning("Subaru Impreza RSX", "Czerwony", 2003));

        System.out.println("Auta w serwisie tuningowym");
        System.out.println(autoWserwisie.get(0));
        System.out.println(autoWserwisie.get(1));

        for (int i = 0; i <= 1; i++) {
            i = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Witamy w serwisie Janusza Pawlacza!");
            System.out.println("1. Wybierz auto");
            System.out.println("2. Pokaż listę aut");
            System.out.println("3. Zgłoś nowe auto");
            System.out.println("4. Zmień kolor auta");
            System.out.println("5. Zakończ program");
            String polecenie = scanner.nextLine();
            switch (polecenie) {
                case "1":
                    System.out.println("Podaj id auta:");
                    int podaneId = Integer.parseInt(scanner.nextLine());
                    if (podaneId > autoWserwisie.size()) {
                        System.out.println("Nie ma takiego auta :(");
                    } else {
                        Auto x = autoWserwisie.get(podaneId);
                        System.out.println(x);
                        System.out.println("Obecny kolor lakieru: " + x.kolor + ". Podaj zmieniony kolor i typ lakieru: ");
                        x.kolor = scanner.nextLine();
                        System.out.println("Obecne dane auta dane auta:");
                        System.out.println("Id:" + x.id + ", Model: " + x.nazwa + ", Kolor: " + x.kolor + ", Rok produkcji:" + x.rokProdukcji + ".");
                    }
                    break;
                case "2":
                    wypiszAuta();
                    break;
                case "3":
                    System.out.println("Model auta:");
                    String nModel = scanner.nextLine();
                    System.out.println("Kolor auta:");
                    String nKolor = scanner.nextLine();
                    System.out.println("Rok produkcji:");
                    int nRok = 1;
                    if(scanner.hasNextInt()) {
                        nRok = Integer.parseInt(scanner.nextLine());
                    }else System.out.println("Podano błędny rok produkcji");
                    dodaj(new Tuning(nModel, nKolor, nRok));
                    break;
                case "5":
                    i++;
                case "4":
                    System.out.println("Podaj id auta:");
                    int podaneIdd = Integer.parseInt(scanner.nextLine());
                    if (podaneIdd > autoWserwisie.size()) {
                        System.out.println("Nie ma takiego auta :(");
                    } else {
                        Auto x = autoWserwisie.get(podaneIdd);
                        System.out.println(x);
                        System.out.println("Obecny kolor lakieru: " + x.kolor + ". Podaj zmieniony kolor i typ lakieru: ");
                        x.kolor = scanner.nextLine();
                        System.out.println("Obecne dane auta dane auta:");
                        System.out.println("Id:" + x.id + ", Model: " + x.nazwa + ", Kolor: " + x.kolor + ", Rok produkcji:" + x.rokProdukcji + ".");
                        System.out.println("Program zakończony");
                    }
                        break;
                        default: System.out.println("Wybierz dostępną opcję");
            }
        }
    }
}
