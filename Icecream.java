public class Icecream extends DesertItem {


        int cost;
        public Icecream(String itemName, int cost) {
            super(itemName);
            this.cost=cost;
        }

        public int getCost() {
            return this.cost;
        }

        public String toString(){
            String cost = DesertShoppe.cents2dollarsAndCentsmethod(getCost());

            return DesertShoppe.printItemInReceipt(name, cost);
        }

    }

