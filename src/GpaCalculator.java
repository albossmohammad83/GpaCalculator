/*
 * Lab 3
 * Description: takes user's input percentage and display it in letter grade, and GPA
 * Name: Mohammad Abdelrahman
 * ID: 920158652
 * Class: CSC 211-02
 * Semester: fall 2020
 */
import java.util.Scanner;
public class GpaCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); // creat an objet input to store the user input
        // prompt user to enter percentage
        System.out.print("Enter overall percentage for a single class from 0.0 - 100.0: ");
        double percentage = input.nextDouble(); // store the user input to percentage variable

        if(percentage >= 97.0){ // prints percentage, letter grade and GPA for percentages 97.0 to 100.0
            System.out.println("Your percentage: "+percentage+"% Letter grade: A+ and the GPA 4.0");
        }
        else if(percentage >= 93.0){// prints percentage, letter grade and GPA for percentages 93.0 to 96.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: A and the GPA 4.0");
        }
        else if(percentage >= 90.0){// prints percentage, letter grade and GPA for percentages 90.0 to 92.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: A- and the GPA 3.7");
        }
        else if(percentage >= 87.0){// prints percentage, letter grade and GPA for percentages 87.0 to 89.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: B+ and the GPA 3.3");
        }
        else if(percentage >= 83.0){// prints percentage, letter grade and GPA for percentages 83.0 to 86.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: B and the GPA 3.0");
        }
        else if(percentage >= 80.0){// prints percentage, letter grade and GPA for percentages 80.0 to 82.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: B- and the GPA 2.7");
        }
        else if(percentage >= 77.0){// prints percentage, letter grade and GPA for percentages 77.0 to 79.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: C+ and the GPA 2.3");
        }
        else if(percentage >= 70.0){// prints percentage, letter grade and GPA for percentages 70.0 to 76.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: C and the GPA 2.0");
        }
        else if(percentage >= 67.0){// prints percentage, letter grade and GPA for percentages 67.0 to 69.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: D+ and the GPA 1.7");
        }
        else if(percentage >= 60.0){// prints percentage, letter grade and GPA for percentages 60.0 to 66.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: D and the GPA 1.0");
        }
        else{// prints percentage, letter grade and GPA for percentages 0.0 to 59.9
            System.out.println("Your percentage: "+percentage+"% Letter grade: F and the GPA 0.1");
            }
        }
    }

