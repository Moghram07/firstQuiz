import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q1. write a java program that accept three numbers from
        // the user and prinnt the largest number
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        for (int i = 0; i<3; i++){
            System.out.println("Q.1 Enter numbers to find the largest one: ");
            int num = scanner.nextInt();
            if (num > largest){
                largest = num;
            }
        }
        System.out.println("largest number is: "+ largest);

        //Q2. Write a java program that accept a string and a number
        // from the user, then print the character in the given index
        scanner.nextLine();
        System.out.println("Q.2 Enter a word: ");
        String userWord = scanner.nextLine();
        System.out.println("Enter the index number: ");
        int numInd = scanner.nextInt();
        System.out.println(userWord.charAt(numInd));

        //Q3. Write a program to enter the numbers till the user wants
        // and at the end it should display the sum entered.
        int sum = 0;
        String answer;
        do{
            System.out.println("Q.3 Enter any number: ");
            int num1 = scanner.nextInt();
            sum += num1;
            scanner.nextLine();
            System.out.println("to exit press n or press any key to continue: ");
            answer = scanner.nextLine();

        }while(!answer.equals("n"));

        System.out.println("The sum of numbers is : " + sum);

        //Q4. write a java program to find positive and
        // negative numbers of a given array
        int []arr = {10, -21 , 30 , 31 , -25};
        for(int n: arr){
            if (n>0){
                System.out.println(n + " is a positive number");
            }else{
                System.out.println(n + " is a negative number");
            }
        }

        //Q5. Write a java program to find a shortest word of a given array:
        String[] words = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        int shortest = 10;
        String shortestWord = "";
        for (String n : words) {
            if (n.length() < shortest) {
                shortest = n.length();
                shortestWord = n;
            }
        }
        System.out.println("shortest word is: " + shortestWord);
    }

    }
