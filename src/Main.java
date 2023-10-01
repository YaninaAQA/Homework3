import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // task 1

        int length = 2;
        int width = 3;
        int area = (length * width);
        System.out.println(area);

        // task 2

        double weight = 57.5;
        double height = 164.5;
        double bodyMassIndex = weight / (height * height);
        System.out.println(bodyMassIndex);

        // task 3 "Temperature Converter"

        double tempCelsius = 36.6;
        double tempFahrenheit = ((9.0 / 5.0) * tempCelsius) + 32.0;
        System.out.println(tempFahrenheit);

        // task 4

        int maxNumber = 2147483647;
        maxNumber++;
        System.out.println(maxNumber);

        // task 5 “Rounding a number”
        double fractionalNumber = 5.555;
        int truncatedNumber = (int) fractionalNumber;
        System.out.println(fractionalNumber);
        System.out.println(truncatedNumber);


        // task 6 "Checking age"

        int age = 15;
        boolean compare = age >= 18;
        System.out.println(compare);


        // task 7 "Encryption of symbols"

        char anyChar = 'a';
        System.out.println(anyChar);
        anyChar += 3; // anyChar = anyChar + 3
        System.out.println(anyChar);

        // task 8 "Data processing"

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = in.nextInt();
        System.out.println("Enter number 2");
        int b = in.nextInt();
        System.out.println(a * b);


    }
}
