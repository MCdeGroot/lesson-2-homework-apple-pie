public class Ingredient {

    private String name;
    private String unit;
    private double amount;

    public Ingredient();
    public Ingredient(String name, String unit, double amount){
        this.name = name;
        this.unit = unit;
        this.amount = amount;
    }

    //setters for variables
    public void setName(String name){
        this.name = name;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    public double setAmount(double amount){
        this.amount = amount;
        return amount;
    }

    // getters for variables
    public String getName(){
        return name;
    }
    public String getUnit(){
        return unit;
    }
    public double getAmount(){
        return amount;
    }


}
