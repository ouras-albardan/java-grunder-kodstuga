public class PersonCard {
    public static void main(String [] args){
            String firstName = "Lisa";
            String lastName = "Andersson";
            int age = 28;
            int ageNextYear = age + 1;
            double height = 1.72;
            char grade = 'B';
            boolean likesJava = true;

            //Förbättra variabelnamnen
            String carBrand = "Volvo";
            int modelYear = 2022;
            double price = 185000;
            boolean isElectric = true;

        System.out.println("Namn: " + firstName + " " + lastName);
        System.out.println("Ålder: " + age);
        System.out.println("Längd: " + height);
        System.out.println("Betyg: " + grade);
        System.out.println("Gillar Java: " + likesJava);
        System.out.println("Nästa år är "+ firstName +" "+ ageNextYear +" år.");
            }
    
}
