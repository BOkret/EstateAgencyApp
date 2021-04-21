public class Property implements Comparable<Property> {
    private String city;
    private double price;
    private double area;
    private double perMeter;

    public Property(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
        this.perMeter = pricePerMeter();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public double getPerMeter() {
        return perMeter;
    }

    public void setPerMeter(double perMeter) {
        this.perMeter = perMeter;
    }

    double pricePerMeter() {
        return Math.round((price / area) * 100) / 100;
    }

    @Override
    public String toString() {
        return city + ", " + price + "zł" + ", " + area + "mkw, " + perMeter + "zł/mkw";
    }

    @Override
    public int compareTo(Property property) {
            //return (int)(perMeter - property.getPerMeter());
            return Double.compare(perMeter, property.getPerMeter());
    }
}
