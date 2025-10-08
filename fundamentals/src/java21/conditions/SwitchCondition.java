package java21.conditions;

public class SwitchCondition {

    public static void main(String[] args) {
        String day = "WEDNESDAY";

        // Traditional switch statement
        switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" ->
                    System.out.println(day.length());
            case "TUESDAY" ->
                    System.out.println(day.length());
            case "THURSDAY", "SATURDAY" ->
                    System.out.println(day.length());
            case "WEDNESDAY" ->
                    System.out.println(day.length());
            default ->
                    System.out.println("Invalid day: " + day.length());
        }

        // Switch expression with yield
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> {
                System.out.println("Invalid day: " + day);
                yield -1;
            }
        };
        System.out.println("Number of letters in the day: " + numLetters);
    }
}
