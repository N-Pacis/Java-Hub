package rent;

import enums.ECars;
import enums.EDays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import org.apache.commons.lang3.EnumUtils;

public class Rent {
    public GenerateInvoice invoice;

    Sedan sedan = new Sedan(10000, 5000,15000, 9350, 8400,  8400);
    Coupe coupe = new Coupe(12000, 8500, 13500, 7460, 8400, 8000);
    Minivan minivan = new Minivan(7500, 350, 1100, 5600, 8400, 8000);

    public Rent() {
    }

    public void getUserInput() throws IOException {
        System.out.println("   RENTING CARS SYSTEM                 ");
        System.out.println("   Enter your name :   ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" Enter rented on day  ");
        String rentedOn = scanner.nextLine().toUpperCase();
        while(!EnumUtils.isValidEnum(EDays.class,rentedOn)){
            System.out.println(" Invalid day of the week! ");
            System.out.println(" Enter rented on day again ");
            rentedOn = scanner.nextLine().toUpperCase();
        }
        System.out.println(" Enter return on day  ");
        String returnedOn = scanner.nextLine().toUpperCase();
        while(!EnumUtils.isValidEnum(EDays.class,returnedOn)){
            System.out.println(" Invalid day of the week! ");
            System.out.println(" Enter returned on day again ");
            returnedOn = scanner.nextLine().toUpperCase();
        }
        System.out.println(" Which car type ?  ");
        String car = scanner.nextLine().toUpperCase();
        while(!EnumUtils.isValidEnum(ECars.class,car)){
            System.out.println(" Invalid Car type! ");
            System.out.println(" Enter car type again ");
            car = scanner.nextLine().toUpperCase();
        }
        invoice = new GenerateInvoice(name, rentedOn, returnedOn, car,0.0);
        }
        public void generateInvoice() throws IOException {

            System.out.println(invoice.getCustomerName()+" "+ invoice.getCarType()+" " + invoice.getRentedOn()+" "+ invoice.getRentedOn());


            if (invoice.getCarType().equals("SEDAN")){
                SwitchDays switchDays = new SwitchDays();
                switchDays.switchDaysSedan(sedan, invoice);
            }
            if (invoice.getCarType().equals("COUPE")){
                SwitchDays switchDays = new SwitchDays();
                switchDays.switchDaysCoupe(coupe, invoice);
            }
            if (invoice.getCarType().equals("MINIVAN")){
                SwitchDays switchDays = new SwitchDays( );
                switchDays.switchDaysCoupe(coupe, invoice);
            }
            invoice.Save();

        }









}
