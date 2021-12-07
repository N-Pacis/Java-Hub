import enums.ECars;
import enums.EDays;
import rent.Rent;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Rent rent = new Rent();
        rent.getUserInput();
        rent.generateInvoice();

    }
}
