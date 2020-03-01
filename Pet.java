public class Pet {
    String PetName="";
    String ownerName="";
    String colour="";
    protected Integer Sex;
private static final Integer MALE=0;
    private static final Integer FEMALE=1;
    private static final Integer SPAYED=2;
    private static final Integer NEUTERED=3;

    public Pet(String name,String ownerName,String colour){
        this.ownerName=ownerName;
        this.PetName=name;
        this.colour=colour;
    }
    public String getPetName(){
        return this.PetName;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getColour(){
        return this.colour;
    }
    void setSex(int sexid){
this.Sex=sexid;
    }
    String getSex(){
        switch (this.Sex){
            case 1:
                return "MALE";
            case 2:
                return "FEMALE";
            case 3:
                return "SPAYED";
            case 4:
                return "NEUTERED";
        }
        return "Sex not provided";
    }

public String toString(){
        return "Name of the pet is"+getPetName()+" "+" \n"+ getOwnerName()
+"is its owner \n" +"its a \n" +getSex()+" "+"its in"+getColour()+" "+"colour" ;
}

public static void main(String[] args){
        Pet p=new Pet("Jacky","Geetha","White");
    p.setSex(1);

    System.out.println(p.toString());
}
}







