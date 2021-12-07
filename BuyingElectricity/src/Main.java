import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String cashpowerNumber;
    public static Integer amount;
    public static Double units;
    public static Integer token;
    public static FileOutputStream outputStream = null;
    public static FileInputStream inputStream = null;
    public static String names;
    public static String category;

    public static void main(String[] args) throws IOException {
        outputStream = new FileOutputStream("purchase_history.txt",  true);
        inputStream = new FileInputStream("purchase_history.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("   WELCOME TO ELECTRICITY BUYING SYSTEM    ");
        System.out.println("   Enter your cashpower number: ");
        cashpowerNumber = scan.nextLine();

        System.out.println("   Enter amount for buying electricity:     ");
        amount = scan.nextInt();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        Boolean checkCashpowerValidity = checkCashPowerValidity(cashpowerNumber);

        generateToken();
        if(!checkCashpowerValidity){
            System.out.println("   THE CASHPOWER NUMBER IS NOT REGISTERED WE ARE GOING TO REGISTER IT: ");
            System.out.println("   Enter your Category either residential or non-residential: ");
            Scanner scanner = new Scanner(System.in);
            category = scanner.nextLine();
        }
        else{
            category = "residential";
        }

        if(category.equals("residential")){
            residential(amount);
        }
        else if(category.equals("non-residential")){
            non_residential(amount);
        }
        else{
            System.out.println("Please enter an appropriate category (residential or non-residential)");
            System.exit(0);
        }

        Save(cashpowerNumber,now,amount);

        System.out.println("------------------------------------------------------------");
        System.out.println("                ELECTRICITY BUYING RECEIPT                   ");
        System.out.println("- TOKEN: "+token);
        System.out.println("- Cash power number: "+cashpowerNumber);
        System.out.println("- Amount Paid: "+amount+" frw");
        System.out.println("- Units Generated: "+(Math.floor(units * 10)/10));
        System.out.println("- Purchased at: "+dtf.format(now));
        System.out.println("");
        System.out.println("                THANK YOU FOR USING THIS PROGRAM              ");
        System.out.println("----------------------------------------------------------------");
    }

    public static void Save(String cashpowerNumber, LocalDateTime PurchaseDate, Integer amount) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("   Enter your Names: ");
        names = scan.nextLine();

        String data = ""+ cashpowerNumber+", Names: "+names + ", Category: "+category + ", PurchaseDate: "+PurchaseDate + ", PurchasedUnits: " + units + ", paidElectricityCost: "+amount + "\n";
        byte[] bytesArray = data.getBytes();
        outputStream.write(bytesArray);

    }

    public static Boolean checkCashPowerValidity(String cashpowerNumber) throws IOException {
        int data;
        String line = null;
        String token =null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        while(reader.ready()) {
            line = reader.readLine();
            token = (String)line.split(",")[0];
            if (token.equals(cashpowerNumber)) {
                return true;
            }
        }
        return false;
    }

    public static void residential(Integer amount){
        if(amount>=89){
            double result = 0;
            double units1 = 15.0 * 89.0;
            if(amount > units1){
                double newAmount = amount - units1;
                if(newAmount >1335 && newAmount<7420){
                    double units2 = newAmount / 212;
                    units = result + units2;
                }
                else if(newAmount >= 7420){
                    double units3 = newAmount -7420;
                    units3 = units3 / 249;
                    units = result + units3 + 35;
                }
                else{
                    units = result + (newAmount / 212);
                }
            }
            else{
                units = amount / 89.0;
            }
        }
        else{
            units = 0.0;
        }
    }

    public static void non_residential(Integer amount){
        double result;
        if(amount >= 227){
            if(amount <= 22700){
                units = amount / 227.0;
            }
            else{
                result = amount - 22700;
                units = (result / 255) + 100;
            }
        }
        else{
            units = 0.0;
        }
    }

    public static void generateToken(){
        Random rand = new Random();
        token = rand.nextInt(1000000000) + 999999999;
    }
}
