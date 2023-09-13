import java.io.*;
import java.util.*;

public class ExtractWords
{
   public static void main (String [] args)
   {
      readWords("words.txt", 8, 20);
   
   }
   
   /**
      Reads words from a file and displays those that are of the specified length 
      and have no duplicate characters.
      @param fileName the name of a file containing one word per line
      @length the desired length of the select words
      @howMany the number of words to be included in the output
   */
   public static void readWords(String fileName, int length, int howMany)
   {
      int number = 0;
      try
      {
         Scanner in = new Scanner(new File(fileName));
         while (in.hasNextLine() && number < howMany)
         {
            String word = in.next();
            if (length == word.length() && !hasDuplicateCharacters(word))
            {
               System.out.println(word);
               number++;
            }
            in.nextLine();
         }
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
   }

   /**
      Determines whether the word passed as argument has any duplicate characters.
      @param aWord the word to be tested
      @return true if the word has at least one duplicate character, false otherwise
   */
   public static boolean hasDuplicateCharacters(String aWord)
   {
      for (int i = 0; i < aWord.length(); i++) // iterate over each character in the word
      {
         char currentChar = aWord.charAt(i); // store the current character being compared against subsequent characters
         
         for (int j = i + 1; j < aWord.length(); j++) // iterate over subsequent characters to compare them against the current character
         {
            char comparedChar = aWord.charAt(j); // store the character being compared against the current character
            
            if (comparedChar == currentChar) // if a duplicate is found, return true
            {
               return true;
            }
         }
      }
      return false;
   }

}