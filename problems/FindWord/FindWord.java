// Program finds how many times a word occurs in text file.

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
class FindWord {
    public static void main(String args[]) throws FileNotFoundException {
        // TODO: Create class object
        FindWord obj = //...

        // Create File object for the file name entered by user in command line.
        File textfile = new File(args[0]);

        // Remember count of occurences of word in text file.
        int occurences = 0;

        // Input word to be searched in text file.
        String word = "";
        try (Scanner scan = new Scanner(System.in)) {
            // Prompt user to input the word to be searched
            System.out.print("Search-word: ");
            word = scan.nextLine();
        }
        // Create Scanner object to read from text file.
        try (Scanner scan = new Scanner(textfile)) {

            // Check if there is a next line in text file
            while (scan.hasNextLine()) {

                // Get next line from text file.
                String text = scan.nextLine();

                // Count total number of occurences of the word in the text
                occurences += obj.find(word, text);
            }
        }

        // TODO: Display count of occurences by calling display().
        
    }

    // Find total number of occurences.
    int find(String word, String text) {

        // Remember count of occurences.
        int count = 0;

        // TODO: Find length of text.
        int lineLength = //...

        // Temporary variable to store words from text.
        String tmp = "";
        
        // TODO: Go through the line of text to find count of occurences.
        for (int index = 0; index < lineLength; index++) {

        }

        return count;
    }

    // Display count of occurences.
    void display(int occurences) {
        // TODO: Print occurences
        
    }
}
