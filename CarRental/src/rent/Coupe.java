package rent;

public class Coupe {


    private Integer mondayPrice;
    private Integer tuesdayPrice;
    private Integer wednesdayPrice;
    private Integer thursdayPrice;
    private Integer fridayPrice;
    private Integer saturdayPrice;
    private Integer sundayPrice;

    public Coupe(Integer mondayPrice, Integer tuesdayPrice, Integer thursdayPrice, Integer fridayPrice, Integer saturdayPrice, Integer sundayPrice) {
        this.mondayPrice = mondayPrice;
        this.tuesdayPrice = tuesdayPrice;
        this.thursdayPrice = thursdayPrice;
        this.fridayPrice = fridayPrice;
        this.saturdayPrice = saturdayPrice;
        this.sundayPrice = sundayPrice;
    }

    public Integer getMondayPrice() {
        return mondayPrice;
    }

    public void setMondayPrice(Integer mondayPrice) {
        this.mondayPrice = mondayPrice;
    }

    public Integer getTuesdayPrice() {
        return tuesdayPrice;
    }

    public void setTuesdayPrice(Integer tuesdayPrice) {
        this.tuesdayPrice = tuesdayPrice;
    }

    public Integer getWednesdayPrice() {
        return wednesdayPrice;
    }

    public void setWednesdayPrice(Integer wednesdayPrice) {
        this.wednesdayPrice = wednesdayPrice;
    }

    public Integer getThursdayPrice() {
        return thursdayPrice;
    }

    public void setThursdayPrice(Integer thursdayPrice) {
        this.thursdayPrice = thursdayPrice;
    }

    public Integer getFridayPrice() {
        return fridayPrice;
    }

    public void setFridayPrice(Integer fridayPrice) {
        this.fridayPrice = fridayPrice;
    }

    public Integer getSaturdayPrice() {
        return saturdayPrice;
    }

    public void setSaturdayPrice(Integer saturdayPrice) {
        this.saturdayPrice = saturdayPrice;
    }

    public Integer getSundayPrice() {
        return sundayPrice;
    }

    public void setSundayPrice(Integer sundayPrice) {
        this.sundayPrice = sundayPrice;
    }
}
