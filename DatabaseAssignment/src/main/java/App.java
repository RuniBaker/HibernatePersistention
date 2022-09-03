import entity.User;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choice = 0;


        while (choice != 7) {
            System.out.println("Dobro došli u bazu podataka, ");
            System.out.println("1 - Prikaz svih podataka baze ");
            System.out.println("2 - Unos korisnika u bazu ");
            System.out.println("3 - Izmjena podataka o korisniku u bazi ");
            System.out.println("4 - Brisanje korisnika iz baze ");
            System.out.println("5 - Prikaz svih korisnika određene starosti ");
            System.out.println("6 - Prikaz svih korisnika određenog imena ");
            System.out.println("7 - exit");
            System.out.println("\n");
            System.out.print("\nodaberite akciju unošenjem broja pored odabrane akcije: ");




            Scanner scan1 = new Scanner(System.in);
            String Schoice = scan1.nextLine();
            choice = Integer.parseInt(Schoice);

            PETLJA:
                switch (choice) {
                    case 1: {
                        System.out.println(User.loadAll().toString());
                    }
                    break PETLJA;
                    case 2:
                        System.out.print("\nUnesite ime: ");
                        Scanner nameS = new Scanner(System.in);
                        String newName = nameS.nextLine();

                        System.out.print("\nUnesite prezime: ");
                        Scanner lnameS = new Scanner(System.in);
                        String newLname = lnameS.nextLine();

                        System.out.print("\nUnesite broj godina: ");
                        Scanner ageS = new Scanner(System.in);
                        String Sage = ageS.nextLine();
                        int newAge = Integer.parseInt(Sage);

                        System.out.print("\nUnesite adresu stanovanja: ");
                        Scanner adreS = new Scanner(System.in);
                        String newAdre = adreS.nextLine();

                        System.out.print("\nUnesite visinu dohotka: ");
                        Scanner incS = new Scanner(System.in);
                        String sInc = incS.nextLine();
                        double newInc = Double.parseDouble(sInc);

                        User newUser = new User();
                        newUser.setName(newName);
                        newUser.setLast_name(newLname);
                        newUser.setAge(newAge);
                        newUser.setAdress(newAdre);
                        newUser.setIncome(newInc);

                        newUser.save();

                        break PETLJA;

                    case 3: {

                        System.out.print("\nUnesite ID korisnika: ");
                        Scanner iDs = new Scanner(System.in);
                        String Sidd = iDs.nextLine();
                        int ids = Integer.parseInt(Sidd);

                        System.out.print("\nUnesite ime: ");
                        Scanner nameSs = new Scanner(System.in);
                        String newwName = nameSs.nextLine();

                        System.out.print("\nUnesite prezime: ");
                        Scanner lnameSS = new Scanner(System.in);
                        String newwLname = lnameSS.nextLine();

                        System.out.print("\nUnesite broj godina: ");
                        Scanner ageSS = new Scanner(System.in);
                        String SSage = ageSS.nextLine();
                        int newwAge = Integer.parseInt(SSage);

                        System.out.print("\nUnesite adresu stanovanja: ");
                        Scanner adreSs = new Scanner(System.in);
                        String newwAdre = adreSs.nextLine();

                        System.out.print("\nUnesite visinu dohotka: ");
                        Scanner incSs = new Scanner(System.in);
                        String ssInc = incSs.nextLine();
                        double newwInc = Double.parseDouble(ssInc);

                        User.update(ids, newwName, newwLname, newwAge, newwAdre, newwInc);
                }
                    break PETLJA;

                    case 4: {
                        System.out.print("\nUnesite ID korisnika: ");
                        Scanner idS = new Scanner(System.in);
                        String Sid = idS.nextLine();
                        int id = Integer.parseInt(Sid);

                       User.delete(id);

        }
        break PETLJA;

                    case 5:
                        System.out.print("\nUnesite godine: ");
                        Scanner ageScan = new Scanner(System.in);
                        String SAge = ageScan.nextLine();
                        int inAge = Integer.parseInt(SAge);

                        System.out.println(User.loadbyAge(inAge).toString());
                        break PETLJA;

                    case 6:
                        System.out.print("\n Unesite ime: ");
                        Scanner nameScan = new Scanner(System.in);
                        String inName = nameScan.nextLine();

                        System.out.println(User.loadbyName(inName).toString());
                        break PETLJA;

                    case 7:
                        System.exit(1);

                    default:
                        System.out.println("WRONG INPUT!");
                        System.exit(1);
        }
     }
     }
    }
