// Program finds how many times a word occurs in text file.

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
class FindWord {
    public static void main(String args[]) throws FileNotFoundException {
        // Create class object
        FindWord obj = new FindWord();

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

                // Find total number of occurences of the word in the text
                occurences += obj.find(word, text);
            }
        }

        // Display count of occurences.
        obj.display(occurences);
    }

    // Find total number of occurences.
    int find(String word, String text) {

        // Remember count of occurences.
        int count = 0;
        // Find length of text.
        int lineLength = text.length();
        // Temporary variable to store words from text.
        String tmp = "";
        
        // Go through the line of text to find count of occurences.
        for (int index = 0; index < lineLength; index++) {

            // Extract character
            char ch = text.charAt(index);

            // Check if end of a word in text or end of text
            if ((ch == ' ') || (index == lineLength - 1)) {

                // Check for an occurence of word.
                if (tmp.equals(word)) {
                    // Increment count.
                    ++count;
                }
                // Empty temporary variable to store next word if any.
                tmp = "";
            }
            // If not an end of a word from text or end of text itself.
            else {
                /* Concatenate character to temporary variable,
                   to create the next word in text */
                tmp += ch;
            }
        }

        return count;
    }

    // Display count of occurences.
    void display(int occurences) {
        System.out.println("Occurences: " + occurences);
    }
}
