package edu.missouriwestern.noynaert.csc254;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This program calculates entropy of passwords, and checks to see if passwords
 * are on a list of common passwords.
 *
 * @author YOUR NAME
 * @since DATE YOU STARTED ON THE PROGRAM
 */
public class Entropy {
    static final String AUTHOR = "YOUR NAME";

    public static void main(String[] args) {
        String fileName = getFileNameFromArgs(args);
        int n = 0;
        try {
            Scanner input = new Scanner(new File(fileName));
            System.out.printf("%8s %8s %8s %8s %8s %8s %s\n",
                    "Length", "Upper", "Lower", "Digits", "Symbols", "Range", "Pass Phrase");
            while(input.hasNextLine()) {
                String line = input.nextLine().trim();
                boolean hasUpper = hasUpper(line);
                //boolean hasLower = hasLower(line);
                //boolean hasDigit = hasDigit(line);
                //int symbolCount =  calculateRange(line);
                int length = line.length();
                //int entropy = calculateEntropy(line);
                System.out.printf("%8d %8b %8b %8b %8d %8d %s\n",
                        length, hasUpper, false, false, 0, 0, line);
                n++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.printf("The file \"%s\" does not exist.", fileName);
            System.exit(1);
        }

        System.out.printf("\nRecords processed: %d\n", n);
        System.out.println("Programmed by " + AUTHOR);
    }

    private static boolean hasUpper(String word) {
        return word.matches(".*[A-Z].*");
    }

    /**
     * If the args array is empty, then the file name is "input.txt"
     * If the args array is not empty, then the file name is set to args[0]
     *
     * @param args  An array of strings.  Normally this will be args from the main(String[] args) method.
     * @return A potential file name.  A file with the corresponding name is not guaranteed to exist.
     */
    public static String getFileNameFromArgs(String[] args) {
        String fileName = (args.length==0) ? "input.txt" : args[0];
        return fileName;
    }

    /**
     * Calculates the base 10 log of a number
     *
     * @param x  A real number.  The number should be positive
     * @return   The log<sub>10</sub> value of x
     */
    public static double log10(double x) {
        double result = Math.log(x) / Math.log(10);
        return result;
    }

    /**
     * @TODO Fill this in
     *
     * @param x
     * @return
     */
    public static double log2(double x){
        double result = Double.NaN;
        return result;
    }

    /**
     * Calculates the range of a string.  The string s is scanned.
     * The range is initially 0.
     * <pre>
     *    Add 26 to the range if the string contains at least 1 upper case letter
     *    Add 26 to the range if the string contains at least 1 lower case letter
     *    Add 10 to the range if the string contains at least 1 digit
     *    Add 1 to the range for each of the special characters in
     *            "`~!@#$%^&*()-_=+[{]}\|;:'",<.>/?</.>"
     * </pre>
     * @param s
     * @return
     */
    public static int range(String word){
        int result = 0;
        if(hasUpper(word))
             result += 26;
        //@TODO to add other tests
        return result;
    }
}
