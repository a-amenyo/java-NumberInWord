public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(-2);
    }

    public static void printNumberInWord(int number) {

        if (number == 0) {
            System.out.println("ZERO");
        }
        if (number == 1) {
            System.out.println("ONE");
        }
        if (number == 2) {
            System.out.println("TWO");
        }
        if (number == 3) {
            System.out.println("THREE");
        }
        if (number == 4) {
            System.out.println("FOUR");
        }
        if (number == 5) {
            System.out.println("FIVE");
        }
        if (number == 6) {
            System.out.println("SIX");
        }
        if (number == 7) {
            System.out.println("SEVEN");
        }
        if (number == 8) {
            System.out.println("EIGHT");
        }
        if (number == 9) {
            System.out.println("NINE");
        } else if ( number > 9 || number < 0){
            System.out.println("OTHER");
        }
    }
}//Agbesi.Amenyo

