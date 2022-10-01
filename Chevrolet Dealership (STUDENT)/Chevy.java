package Unit3_LAB.soln;

public class Chevy {
    private  int year;
    private int mileage;
    private double fuelEffiency;
    private double basePrice;
    private double baseUpgrades;
    private double total;
    private String model;
    private String color;
    private boolean luxuryPackageStatus;
    private boolean WDPackageStatus;
    private boolean sportsPackageStatus;
     String vehicle = "Chevrolet";
     double taxRate = 12.2;
     double luxaryIncrease = (basePrice * 0.2) + basePrice;
     double WDincrease = 3500.0;
     double sportIncrease = ((basePrice * 0.15) + basePrice) -  (0.20 * fuelEffiency);

     int fuelEffiecencyDeduc;
    public Chevy( ){
        year = 2021;
        color = "White";
        model = "Trax";
        total = 16000.0;
        basePrice = 16000.0;
        baseUpgrades = 0.0;
        fuelEffiency = 35.0;
        mileage = 0;
        luxuryPackageStatus = false;
        WDPackageStatus = false;
        sportsPackageStatus = false;

    }
    public Chevy(int y, int m, double f, double b, String mo, String co, boolean lux, boolean wd, boolean sport){
        year = y;
        mileage = m;
        fuelEffiency = f;
        basePrice = b;
        baseUpgrades = getBaseUpgrades();
        total = getTotal();
        model = mo;
        color = co;
        luxuryPackageStatus = lux;
        WDPackageStatus = wd;
        sportsPackageStatus = sport;
    }
    public int compareTo(Chevy chevyOBJ){
    int output;
      int objMiles =chevyOBJ.getMileage();
        int miles = this.mileage;
        if(objMiles == miles){
            output = 1;
        }
        else{
            output = 0;
        }
        return output;

    }
    public double calcPrice(){
        baseUpgrades = basePrice;

        if(isLuxuryPackageStatus()){
            baseUpgrades+= basePrice + luxaryIncrease;


        }
        if(isWDPackageStatus()){
            baseUpgrades+= WDincrease + basePrice;
        }
        if(isSportsPackageStatus()){
            baseUpgrades+= sportIncrease + basePrice;
        }
        else{
            baseUpgrades+= basePrice;
        }
        this.total= ((basePrice * taxRate) + basePrice) + baseUpgrades;
        return total;
    }


    public boolean equals(Chevy obj) {

        if (obj.getModel() == this.model) {
            if (obj.getColor() == this.color) {
                if ((obj.getMileage() < 200 && this.mileage < 200) || (obj.getMileage() >= 200 && this.mileage >= 200)){
                    return true;
                }
            }
        }

        return  false;
    }
    public String toString(){
        String output = " ";
        output+= this.year + " Chevrolet " + this.model + " (" + this.color + ") " + "\n";
        output+= "Base Price: " + this.basePrice + "\n";
        output+= "Miles: " + this.mileage + "\n";
        output+= "Fuel efficency:" + this.fuelEffiency + "mpg \n";
        output+= "Packages: " + this.luxuryPackageStatus + "\n";

        if(luxuryPackageStatus){
            output+= "- luxary package";
        }
        else{
            output+=" ";
        }
        if(WDPackageStatus){
            output += "- WD package";
        }
        else{
            output+="none";

        }
        if(sportsPackageStatus){
            output+= "- sports package";
        }
        else{
            output+= "";
        }
        output+= "Price with Upgrades: " + baseUpgrades + "\n";
        output+= "Final Price with Tax: " + calcPrice();

        return output;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEffiency() {
        return fuelEffiency;
    }

    public void setFuelEffiency(double fuelEffiency) {
        this.fuelEffiency = fuelEffiency;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBaseUpgrades() {
        return baseUpgrades;
    }

    public void setBaseUpgrades(double baseUpgrades) {
        this.baseUpgrades = baseUpgrades;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxuryPackageStatus() {
        return luxuryPackageStatus;
    }

    public void setLuxuryPackageStatus(boolean luxuryPackageStatus) {
        this.luxuryPackageStatus = luxuryPackageStatus;
    }

    public boolean isWDPackageStatus() {
        return WDPackageStatus;
    }

    public void setWDPackageStatus(boolean WDPackageStatus) {
        this.WDPackageStatus = WDPackageStatus;
    }

    public boolean isSportsPackageStatus() {
        return sportsPackageStatus;
    }

    public void setSportsPackageStatus(boolean sportsPackageStatus) {
        this.sportsPackageStatus = sportsPackageStatus;
    }
}
