package rent;

import enums.EDays;

public class SwitchDays {
    double vat = 0.18;
    double wednesVat = 0.05;
    public void switchDaysSedan(Sedan sedan, GenerateInvoice invoice){
        switch (invoice.getRentedOn()){
            case "MONDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getMondayPrice()+(vat*sedan.getMondayPrice())));
                break;
            case "TUESDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getTuesdayPrice()+(vat*sedan.getTuesdayPrice())));
                break;
            case "THURSDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getThursdayPrice()+(vat*sedan.getThursdayPrice())));
                break;
            case "FRIDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getFridayPrice()+(vat*sedan.getFridayPrice())));
                break;
            case "SATURDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSaturdayPrice()+(vat*sedan.getSaturdayPrice())));
                break;
            case "SUNDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSundayPrice()));
                break;
            default:
                System.out.println("Error occured");
        }
        switch (invoice.getReturnDate()){
            case "MONDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getMondayPrice()+(vat*sedan.getMondayPrice())));
                break;
            case "TUESDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getTuesdayPrice()+(vat*sedan.getTuesdayPrice())));
                break;
            case "THURSDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getThursdayPrice()+(vat*sedan.getThursdayPrice())));
                break;
            case "FRIDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getFridayPrice()+(vat*sedan.getFridayPrice())));
                break;
            case "SATURDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSaturdayPrice()+(vat*sedan.getSaturdayPrice())));
                break;
            case "SUNDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSundayPrice()));
                break;
            default:
                System.out.println("Error occured");
        }

    }

    public void switchDaysCoupe(Coupe sedan, GenerateInvoice invoice){
        switch (invoice.getRentedOn()){
            case "MONDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getMondayPrice()+(vat*sedan.getMondayPrice())));
                break;
            case "TUESDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getTuesdayPrice()+(vat*sedan.getTuesdayPrice())));
                break;
            case "THURSDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getThursdayPrice()+(vat*sedan.getThursdayPrice())));
                break;
            case "FRIDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getFridayPrice()+(vat*sedan.getFridayPrice())));
                break;
            case "SATURDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSaturdayPrice()+(vat*sedan.getSaturdayPrice())));
                break;
            case "SUNDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSundayPrice()));
                break;
            default:
                System.out.println("Error occured");
        }
        switch (invoice.getReturnDate()){
            case "MONDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getMondayPrice()+(vat*sedan.getMondayPrice())));
                break;
            case "TUESDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getTuesdayPrice()+(vat*sedan.getTuesdayPrice())));
                break;
            case "THURSDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getThursdayPrice()+(vat*sedan.getThursdayPrice())));
                break;
            case "FRIDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getFridayPrice()+(vat*sedan.getFridayPrice())));
                break;
            case "SATURDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSaturdayPrice()+(vat*sedan.getSaturdayPrice())));
                break;
            case "SUNDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSundayPrice()));
                break;
            default:
                System.out.println("Error occured");
        }

    }

    public void switchDaysMiniVan(Minivan sedan, GenerateInvoice invoice){
        switch (invoice.getRentedOn()){
            case "MONDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getMondayPrice()+(vat*sedan.getMondayPrice())));
                break;
            case "TUESDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getTuesdayPrice()+(vat*sedan.getTuesdayPrice())));
                break;
            case "THURSDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getThursdayPrice()+(vat*sedan.getThursdayPrice())));
                break;
            case "FRIDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getFridayPrice()+(vat*sedan.getFridayPrice())));
                break;
            case "SATURDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSaturdayPrice()+(vat*sedan.getSaturdayPrice())));
                break;
            case "SUNDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSundayPrice()));
                break;
            default:
                System.out.println("Error occured");
        }
        switch (invoice.getReturnDate()){
            case "MONDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getMondayPrice()+(vat*sedan.getMondayPrice())));
                break;
            case "TUESDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getTuesdayPrice()+(vat*sedan.getTuesdayPrice())));
                break;
            case "THURSDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getThursdayPrice()+(vat*sedan.getThursdayPrice())));
                break;
            case "FRIDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getFridayPrice()+(vat*sedan.getFridayPrice())));
                break;
            case "SATURDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSaturdayPrice()+(vat*sedan.getSaturdayPrice())));
                break;
            case "SUNDAY":
                invoice.setTotalPrice(invoice.getTotalPrice()+ (sedan.getSundayPrice()));
                break;
            default:
                System.out.println("Error occured");
        }

    }
}
