import java.util.ArrayList;

public class Checkout {

        ArrayList<DesertItem> listOfItems = new ArrayList<DesertItem>();
        public Checkout()
        {

        }
        public void enterItem(DesertItem item) {
            listOfItems.add(item);
        }



        public int numberOfItems() {
            // TODO Auto-generated method stub
            return listOfItems.size();
        }

        public int totalCost() {
            int cost = 0;
            for(DesertItem list:listOfItems){
                cost+=list.getCost();
            }
            return cost;
        }

        public int totalTax() {
            double tax=0;
            for(DesertItem list:listOfItems){
                tax+=(list.getCost()*(DesertShoppe.taxRate/100));
            }
            return (int) tax;
        }

        public void clear() {
            listOfItems.clear();
        }

        //concatenate all the dessert items name using list
        public String toString(){
            String billReceipt="\t"+DesertShoppe.nameOfStore+"\t\n\t"+"- - - - - - - - - -\n";
            for(DesertItem list:listOfItems){
                billReceipt=billReceipt+list.toString()+"\n";
            }
            billReceipt=billReceipt+"Tax\t\t\t\t"+DesertShoppe.cents2dollarsAndCentsmethod(totalTax())+"\nTotal Cost\t\t\t"+DesertShoppe.cents2dollarsAndCentsmethod(totalCost()+totalTax());
            return billReceipt;

        }
    }

