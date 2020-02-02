public class Driver {

    public static void main(String[] args) {
        PsychiatristObject P= new PsychiatristObject();

        MoodyObject happyObj= new HappyObject();
        MoodyObject sadObj= new SadObject();
        P.examine(happyObj);
        happyObj.expressFeelings();
        P.observe(happyObj);
        P.examine(sadObj);
        sadObj.expressFeelings();
        P.observe(sadObj);

    }
}



abstract class MoodyObject {

    protected abstract String getMood();

    protected abstract void expressFeelings();

    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today");
    }
}


class SadObject extends MoodyObject {

    protected String getMood() {
        String mood = "sad";
        return mood;
    }


    protected void expressFeelings() {
        System.out.println("  'sob' 'weep' ");

    }

    public String toString() {
        return "Subject cries a lot";
    }
}



class HappyObject extends MoodyObject {


    protected String getMood() {
        String mood = "happy";
        return mood;
    }


    protected void expressFeelings() {
        System.out.println("HAHAHAHAHA");

    }


    public String toString() {
        return "Subject laughs a lot";

    }
}



 class PsychiatristObject {
    public void examine(MoodyObject moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    public void observe(MoodyObject moodyObject) {
        System.out.println(moodyObject.toString());
    }

}





