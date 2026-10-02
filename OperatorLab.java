public class OperatorLab {
   
    public static void main(String[] args) {
        // Lägg övningens kod här.
        int a = 10;
        int b = 3;
        int number = 18;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(number % 2);
        /* Vad händer om number ändras till 18? Vad kan % 2 användas till?
        That means % 2 is useful for checking whether a number is even or odd:
            - remainder 0 → even
            - remainder 1 → odd 
            18 % 2 = 0*/
       
//Del 3 – Booleanexperiment

         int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        boolean hasTicket = true;
        boolean isAdult = true;

        boolean allowed = hasTicket || isAdult;

        

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

        
        System.out.println(allowed );

    }
}
    




