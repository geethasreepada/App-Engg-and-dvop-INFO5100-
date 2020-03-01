import java.util.Calendar;

public class Dog extends Pet implements Boardable {

    private String Size;
    private int startDay,startMonth,startYear;
    private int endDay,endMonth,endYear;
    private int Year;
    public Dog(String name,String ownername,String colour,String size){
        super(name,ownername,colour);
        this.Size=size;

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
  Calendar c = Calendar.getInstance();
  c.set(month,day,year);
  Calendar start=Calendar.getInstance() ;
  start.set(month,day,year);
  Calendar end= Calendar.getInstance();
  end.set(month,day,year);
  if(c.compareTo(start)>=0 || c.compareTo(end)<=0){
      return true;
  }
  return false;
}
public String getSize(){
       return this.Size;
}
public String toString(){
        return "petname:"+getPetName()+"\n owned by:"+getOwnerName()+"\ncolour:"+getColour()+"\n size:"+getSize();

}
public static void main(String[] args){
        Dog d=new Dog("Chiku","geeSar","white","medium");
        d.setBoardStart(2,12,1994);
        d.setBoardEnd(8,2,2000);
    boolean flag=    d.boarding(9,5,1997);

    System.out.println(d.toString());
    if(flag==true){
        System.out.println("date is valid");
    }
    else{
    System.out.println("date is invalid");
}
}}
