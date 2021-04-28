public class CountDown {
    public static void main(String[] args) {     
        int number;
        number = 6;
        
        do {
        
        number--;
        System.out.println(number);
        } while (number > 1);
       /*  while (number > 0) {
            System.out.println(number);
            number--;
        } */
         System.out.println("BOOM!");
    }
}
