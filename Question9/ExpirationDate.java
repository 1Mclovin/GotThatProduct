package Question9;

public class ExpirationDate extends Product{
    private String month;
    private String day;
    private String year;

    public ExpirationDate(String name, double price) {
        super(name, price);
    }


    public String toString() {
        return null;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
