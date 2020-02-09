public class Sundae extends Icecream {

    private int costOfTopping;
    private String topping;

    public Sundae(String itemName, int cost, String topping, int costOfTopping) {

        super(itemName,cost);
        this.topping=topping;
        this.costOfTopping=costOfTopping;

    }
    public int getCost() {
        return this.cost+this.costOfTopping;
    }

    public String toString(){		//Individual toString method for every Dessert item to define Price description and name
        String cost = DesertShoppe.cents2dollarsAndCentsmethod(getCost());
        String nameToPrint = topping +" sundae with " + name;
        return DesertShoppe.printItemInReceipt(nameToPrint, cost);
    }
}