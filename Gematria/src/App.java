/*
 * Hello! This is a simple Gematria calculator for English alphabet with each 
 * scores ranging from 1 to 26.  
 */

import java.util.TreeMap;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // asking for input string
        String answer1 = JOptionPane.showInputDialog("Please type your name: ");
        String answer2 = JOptionPane.showInputDialog("Please type your name: ");

        answer1 = answer1.toLowerCase();
        answer2 = answer2.toLowerCase();

        // converting input string into char []
        char[] wordAsArrayOfCharactres1 = answer1.toCharArray();
        char[] wordAsArrayOfCharactres2 = answer2.toCharArray();

        // calling the method to calculate score
        int totalScore1 = totalScore(wordAsArrayOfCharactres1);
        int totalScore2 = totalScore(wordAsArrayOfCharactres2);

        // output
        String output = "the total score for: " + answer1 + " " + totalScore1 + "\n" + "the total score for: " + answer2
                + " " + totalScore2;
        JOptionPane.showMessageDialog(null, output);

    }

    // method to score the characters
    public static int scoreGiver(char theCharacter) {

        char characterOrginal = 'a';
        int asciiO = (int) characterOrginal;
        int asciiV = (int) theCharacter;

        int score = asciiV - asciiO + 1;

        return score;
    }

    // method to calculate the total score
    public static int totalScore(char[] wordAsArrayOfCharactres) {
        int totalScore = 0;
        for (char character : wordAsArrayOfCharactres) {

            if (Character.isWhitespace(character) != true) {

                int theScore = scoreGiver(character);

                totalScore = totalScore + theScore;

            }

        }

        return totalScore;
    }
}
