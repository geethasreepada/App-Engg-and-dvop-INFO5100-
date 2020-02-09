
    public class DesertShoppe {
        public static final String nameOfStore = "M & M Dessert Shoppe";
        public static final double taxRate = 3.5;
        public static final int sizeOfItem = 15;
        public static final int widthOfSpaceBetweenNameAndPrice = 10;

        public static String cents2dollarsAndCentsmethod(int cents) {
            float priceInDollars = cents / 100;
            return Float.toString(priceInDollars);
        }

        public static String printItemInReceipt(String name, String price) {
            String formattedString = "";
            int mod = name.length() % sizeOfItem;
            int quot = name.length() / sizeOfItem;
            int start = 0;
            int end = 0;
            if (mod != 0) {
                quot = quot + 1;
            }
            for (int i = 1; i < quot; i++) {
                start = end;
                end = i * sizeOfItem;
                formattedString = formattedString + name.substring(start, end) + "\n";
            }
            start = end;
            end = name.length();
            int padding=(quot*sizeOfItem)-end;
            formattedString = formattedString + name.substring(start, end);

            return formattedString+returnStringWithWhiteSpaces(padding)+"\t\t"+price;

        }

        private static String returnStringWithWhiteSpaces(int padding){
            String output="";
            for(int j=0;j<padding;j++){
                output+=" ";
            }
            return output;
        }

    }

