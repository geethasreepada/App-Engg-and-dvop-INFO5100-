import java.util.Calendar;

public class Cat extends Pet implements Boardable {

private int startDay,startMonth,startYear;
private int endDay,endMonth,endYear;
private int Year;
private String Hairlength;
public Cat(String name,String ownerName,String colour,String hairlength){
    super(name, ownerName, colour);
    this.Hairlength=hairlength;
}
String getHairlength(){
    return this.Hairlength;
}
public String toString(){
    return "petname:"+getPetName()+"\nowned by:"+getOwnerName()+"\nColour:"+getColour()+"\nSex:"+getSex()+"\nHair:"+getHairlength();

}

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.startDay=day;
        this.startMonth=month;
        this.startYear=year;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
this.endDay=day;
this.endMonth=month;
this.endYear=year;

    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Calendar c= Calendar.getInstance();
        c.set(month,day,year);
        Calendar start=Calendar.getInstance();
        start.set(month,day,year);
        Calendar end=Calendar.getInstance();
        end.set(month,day,year);
        if(c.compareTo(start)>=0 || c.compareTo(end)<=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Cat c = new Cat("sundari", "Sarada", "black", "puffy and short");

        c.setBoardStart(8, 02, 1994);
        c.setBoardEnd(8, 02, 1996);
     boolean flag=   c.boarding(9, 03, 1995);
c.setSex(2);
        System.out.println(c.toString());
        if( flag==true) {
            System.out.println("Date is valid");
        }
            else{
                System.out.println("date is invalid");
            }

        }

    }

