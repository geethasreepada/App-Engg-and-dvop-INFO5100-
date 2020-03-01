import jdk.dynalink.beans.StaticClass;

import javax.management.loading.ClassLoaderRepository;

public class Account {
   protected String FirstName;
   protected String LastName;
   protected double CurBalance;
    public Account(String fname,String lname,double Curbalance) {
        this.FirstName = fname;
        this.LastName = lname;
        this.CurBalance = Curbalance;

    }
    public String getAcctType(){
        return this.getClass().getName();
    }
public double DebitTransaction(double debitAmount){
      this.CurBalance=this.CurBalance-debitAmount;
      return this.CurBalance;
}
    public double CreditTransaction (double creditAmount){
        this.CurBalance=this.CurBalance+creditAmount;
        return this.CurBalance;
    }
    public String toString(){
        return "The account name is "+this.FirstName +" "+ this.LastName+" "+ getAcctType() + " "+"and the total balance is" + this.CurBalance;

    }
    public static void main(String[] args){
        Account acc=new Account("Geetha","Sreepada",5000);

        acc.DebitTransaction(300);
        System.out.println(acc.toString());

        acc.CreditTransaction(500);
        System.out.println(acc.toString());
    }

}





