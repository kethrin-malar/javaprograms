package basicprogram;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello");
        stringBuilder.append("world");

        // Print the StringBuilder
        System.out.println("StringBuilder content: " + stringBuilder);

        // Insert into the StringBuilder
        stringBuilder.insert(5, " beautiful");
        System.out.println("StringBuilder content after insert: " + stringBuilder);

        // Replace in the StringBuilder
        stringBuilder.replace(6, 15, "Java");
        System.out.println("StringBuilder content after replace: " + stringBuilder);

        // Delete from the StringBuilder
        stringBuilder.delete(0, 5);
        System.out.println("StringBuilder content after delete: " + stringBuilder);

        // Reverse the StringBuilder
        stringBuilder.reverse();
        System.out.println("StringBuilder content after reverse: " + stringBuilder);
    }
}
