public class Cookie extends DesertItem{

    private int number;
    private int pricePerDozen;
    public Cookie(String itemName, int number, int pricePerDozen) {
        this.itemName=itemName;
        this.number=number;
        this.pricePerDozen=pricePerDozen;
    }

    public int getCost() {
        double cost=(this.number)*(pricePerDozen/12.00);
        cost=Math.round(cost);
        return (int) cost;
    }

    public String toString(){
        String costDesc = number+" @ "+DesertShoppe.cents2dollarsAndCentsmethod(pricePerDozen)+" /dz " + "\n";
        String cost = DesertShoppe.cents2dollarsAndCentsmethod(getCost());
        String formattedName = DesertShoppe.printItemInReceipt(name, cost);
        return costDesc + formattedName;
    }
}