public class WrapperClassDemo{
        public static void main(String[] args) {


            Integer myBoxedNumber = 5;

            int myRawNumber = myBoxedNumber;

            System.out.println("Boxed Object: " + myBoxedNumber);
            System.out.println("Raw Primitive: " + myRawNumber);



            String textNumber = "100";


            int convertedNumber = Integer.parseInt(textNumber);

            System.out.println("Converted Text to Number: " + (convertedNumber + 5)); // Outputs 105
        }
    }

