public abstract class DesertItem {

        protected String name;
    protected String itemName;

    public DesertItem(){

        }

        public DesertItem(String name){
            this.name=name;
        }

        public final String getName(){
            return name;
        }

        public abstract int getCost();
    }

