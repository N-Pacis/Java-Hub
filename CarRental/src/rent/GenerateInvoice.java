package rent;

import enums.ECars;
import enums.EDays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenerateInvoice {
    private String customerName;
    private String rentedOn;
    private String returnDate;
    private String carType;
    private Double totalPrice;
    private FileOutputStream outputStream = null;

    public GenerateInvoice(String customerName, String rentedOn, String returnDate, String carType, Double totalPrice) throws IOException{
        this.customerName = customerName;
        this.rentedOn = rentedOn;
        this.returnDate = returnDate;
        this.carType = carType;
        this.totalPrice = totalPrice;
        File newFile = new File("invoice.txt");
        if(!newFile.exists()){
            newFile.createNewFile();
        }
        outputStream = new FileOutputStream(newFile);
    }

    public void Save() throws IOException {

        String data = "- Customer Names: "+this.customerName +", Rented On: "+this.rentedOn +", To Be Returned On: "+this.returnDate +", CarType: "+this.carType+", TotalPrice: "+this.totalPrice;
        byte[] bytesArray = data.getBytes();
        outputStream.write(bytesArray);
        System.out.println("Saved Successfully");
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public GenerateInvoice() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRentedOn() {
        return rentedOn;
    }

    public void setRentedOn(String rentedOn) {
        this.rentedOn = rentedOn;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public GenerateInvoice(String customerName, String rentedOn, String returnDate, String carType) {
        this.customerName = customerName;
        this.rentedOn = rentedOn;
        this.returnDate = returnDate;
        this.carType = carType;
    }
}
