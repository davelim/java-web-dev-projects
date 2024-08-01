package org.launchcode;

import java.util.Scanner;

public class Strings {
    static final String ALICE = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
    static final int X = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide search term:");
        String searchTerm = input.nextLine();
        if (searchTerm.length() > ALICE.length()) {
            System.out.println("Could not find '" + searchTerm +"'.");
        }

        int idx = ALICE.toLowerCase().indexOf(searchTerm.toLowerCase());
        if (idx == -1) {
            System.out.println("Could not find '" + searchTerm + "'.");
        } else {
            int begin = idx - X < 0 ? 0 : idx - X;
            int end = idx + searchTerm.length() + X > ALICE.length()
                    ? ALICE.length() - 1
                    : idx + searchTerm.length() + X;
            System.out.println("Found '" + searchTerm + "'... " + ALICE.substring(begin, end));
        }
    }
}
