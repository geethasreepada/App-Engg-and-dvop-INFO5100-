public class Candy extends DesertItem{

    private double weight;
    private int priceperpound;
    public Candy(String itemName, double weight, int priceperPound) {
        super(itemName);
        this.weight=weight;
        this.priceperPound=priceperPound;
    }

    public int getCost() {
        double cost=this.weight*pricePerPound;
        cost=Math.round(cost);
        return (int) cost;

    }

    public String toString(){

        String costDesc = weight+" lbs. @ "+DesertShoppe.cents2dollarsAndCentsmethod(priceperpound)+" /lb " + "\n";
        String cost = DesertShoppe.cents2dollarsAndCentsmethod(getCost());
        String formattedName = DesertShoppe.printItemInReceipt(name, cost);
        return costDesc + formattedName;

    }


}
