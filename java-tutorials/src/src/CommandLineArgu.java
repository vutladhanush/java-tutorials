public class CommandLineArgu {
    public static void main(String[] args) {


        if (args.length < 2) {
            System.out.println("Error: Please provide two numbers.");
            System.out.println("Example usage: java CommandLineExample 5 10");
            return;
        }

        // 2. Command-line arguments always start as text (Strings)
        String firstArgument = args[0];  // The first input
        String secondArgument = args[1]; // The second input

        // 3. Use Wrapper Classes to convert the text into real primitive numbers
        int number1 = Integer.parseInt(firstArgument);
        int number2 = Integer.parseInt(secondArgument);

        // 4. Do the math and print the result
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
