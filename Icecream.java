public class Icecream extends DesertItem {


        int cost;
        public Icecream(String itemName, int cost) {
            super(itemName);
            this.cost=cost;
        }

        public int getCost() {
            return this.cost;
        }

        public String toString(){	//Individual toString method for every Dessert item to define Price description and name
            String cost = DesertShoppe.cents2dollarsAndCentsmethod(getCost());

            return DesertShoppe.printItemInReceipt(name, cost);
        }

    }

