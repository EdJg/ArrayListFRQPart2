import java.util.ArrayList;

public class WordScramble
{
    /** Scrambles a given word.
     *
     *  @param word  the word to be scrambled
     *  @return  the scrambled word (possibly equal to word)
     *
     *  Precondition: word is either an empty string or contains only uppercase letters.
     *  Postcondition: the string returned was created from word as follows:
     *  - the word was scrambled, beginning at the first letter and continuing from left to right
     *  - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
     *  - letters were swapped at most once
     */
    public static String scrambleWord(String word)
    {
        String temp = "";
        for (int index = 0; index + 2 < word.length(); index ++)
        {
            if (word.substring(index, index + 1).equals("A"))
            {
                if (!(word.substring(index + 2, index + 3).equals("A")))
                {
                    temp += word.substring(index + 2, index + 3) + word.substring(index + 1, index + 2) + word.substring(index, index + 1);
                }
            }
            else if (word.substring(index + 1, index + 2).equals("A"))
            {
                if (!(word.substring(index + 2, index + 3).equals("A")))
                {
                    temp += word.substring(index, index + 1) + word.substring(index + 2, index + 3) + word.substring(index + 1, index + 2);
                }
            }
        }
        return temp;
    }

    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *
     *  @param wordList the list of words
     *
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was
     *    before the method was called
     */
    public static void scrambleOrRemove(ArrayList<String> wordList)
    {
        /* to be implemented in part (b) */
    }
}