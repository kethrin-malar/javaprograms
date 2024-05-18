
public class EnumStringComparison {
	public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        // Convert string to Enum
        DayOfWeek inputDay = null;
        try {
            inputDay = DayOfWeek.valueOf("MONDAY");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day of the week.");
            return;
        }

        // Compare Enum with string
        if (inputDay == DayOfWeek.MONDAY) {
            System.out.println("The Enum value represents Monday.");
        } else {
            System.out.println("The Enum value does not represent Monday.");
        }
    }
}


