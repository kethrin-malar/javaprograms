package basicprogram;


public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append strings to the StringBuffer
        stringBuffer.append("Hi");
        stringBuffer.append(" ");
        stringBuffer.append("world");

        // Print the StringBuffer
        System.out.println("StringBuffer content: " + stringBuffer);

        // Insert into the StringBuffer
        stringBuffer.insert(5, " beautiful");
        System.out.println("StringBuffer content after insert: " + stringBuffer);

        // Replace in the StringBuffer
        stringBuffer.replace(6, 15, "Java");
        System.out.println("StringBuffer content after replace: " + stringBuffer);

        // Delete from the StringBuffer
        stringBuffer.delete(0, 5);
        System.out.println("StringBuffer content after delete: " + stringBuffer);

        // Reverse the StringBuffer
        stringBuffer.reverse();
        System.out.println("StringBuffer content after reverse: " + stringBuffer);
    }
}

