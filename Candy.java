public class Candy extends DesertItem{

    private double weight;
    private int pricePerPound;
    public Candy(String itemName, double weight, int pricePerPound) {
        super(itemName);
        this.weight=weight;
        this.pricePerPound=pricePerPound;
    }

    public int getCost() {
        double cost=this.weight*pricePerPound;
        cost=Math.round(cost);
        return (int) cost;

    }

    public String toString(){

        String costDesc = weight+" lbs. @ "+DesertShoppe.cents2dollarsAndCentsmethod(pricePerPound)+" /lb " + "\n";
        String cost = DesertShoppe.cents2dollarsAndCentsmethod(getCost());
        String formattedName = DesertShoppe.printItemInReceipt(name, cost);
        return costDesc + formattedName;

    }


}