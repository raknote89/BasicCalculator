import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type desired function: ");
        String input = scanner.nextLine();
        String inputCopy = input.toLowerCase();
        System.out.println();
        System.out.print("Please enter first number: ");
        input= scanner.nextLine();
        double firstNumber = Double.parseDouble(input);
        System.out.print("Please enter second number:  ");
        input = scanner.nextLine();
        double secondNumber = Double.parseDouble(input);
        switch (inputCopy) {
            case "add":
                System.out.println(firstNumber + secondNumber);
                break;
            case "subtract":
                System.out.println(firstNumber - secondNumber);
                break;
            case "multiply":
                System.out.println(firstNumber * secondNumber);
                break;
            case "divide":
                while (true) {
                    while (secondNumber <= 0) {
                        System.out.println("Cannot divide by number less than or equal to 0. Enter another number.");
                        input = scanner.nextLine();
                         secondNumber = Double.parseDouble(input);

                    }
                    System.out.println(firstNumber / secondNumber);
                    break;
                }

        }

//            private double getValidInput(Scanner scanner) {
//                double number = scanner.nextDouble();
//                while (true){
//                    if(number <= 0){
//                        System.out.print("Please enter valid number: ");
//                    } else{
//                        break;
//                    }
//                    return getValidInput;
//                }
    }
}
