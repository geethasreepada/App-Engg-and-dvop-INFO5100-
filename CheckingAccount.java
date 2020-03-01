public class CheckingAccount extends Account{
    double minBalance=600;
    double penalityFee=50;

    public CheckingAccount(String fname, String lname, double Curbalance) {
        super(fname, lname, Curbalance);
    }
    public void chargeFee (){
        if(this.CurBalance<minBalance){
this.CurBalance=this.CurBalance-penalityFee;
    }

}
public double DebitTransaction(double debitAmount){
    super.DebitTransaction(debitAmount);
    chargeFee();
    return this.CurBalance;
    }
    public double CreditTranscation(double creditAmount){
        super.CreditTransaction(creditAmount) ;
        return this.CurBalance;
    }
public static void main(String[] args){
        CheckingAccount acc=new CheckingAccount("Geetha","Sreepada",5000);
        acc.DebitTransaction(4500);
    System.out.println(acc.toString());
}
}

