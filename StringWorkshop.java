public class StringWorkshop {
    public static void main (String[] args){
        String firstName = "Anna";
        String lastName = "Andersson";

        String fullName = firstName + " " + lastName;

        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println("Hej! Jag heter "+fullName+".");
        System.out.println("Mitt namn innehålle "+fullName.length()+ "tecken.");
        System.out.println(fullName+ " bor i "+ city + " och utbildar sig till "+ profession+".");

    }
}
