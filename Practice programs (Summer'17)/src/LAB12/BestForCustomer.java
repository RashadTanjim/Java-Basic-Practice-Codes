package LAB12;


public class BestForCustomer implements Discount {

    private double percentage;
    private double threshold;
    private double discount;

    public BestForCustomer() {

    }

    public BestForCustomer(double percentage, double threshold, double discount) {
        this.percentage = percentage;
        this.threshold = threshold;
        this.discount = discount;

    }

    public double getPercentage() {
        return percentage;

    }

    public double getThreshold() {
        return threshold;

    }

    public double getDiscount() {
        return discount;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double discountedPrice(double price) {
        double a;
        if (price >= threshold) {
            a = price - discount;
        } else {
            a = price;
        }
        
        double b = price - (price * percentage / 100);
        return (a < b) ? a : b;

    }
}
