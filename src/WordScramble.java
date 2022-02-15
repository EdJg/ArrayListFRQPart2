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
        int index = 0;
        while (index < word.length() - 1)
        {
            if (word.substring(index, index + 1).equals("A") && !word.substring(index + 1, index + 2).equals("A"))
            {
                temp += word.substring(index + 1, index + 2);
                temp += "A";
                index += 2;
            }
            else
            {
                temp += word.substring(index, index + 1);
                index ++;
            }
        }
        if (index < word.length())
        {
            temp += word.substring(index);
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
        int index = 0;
        while (index < wordList.size())
        {
            String word = wordList.get(index);
            String scram = scrambleWord(word);
            if (word.equals(scram))
            {
                wordList.remove(index);
            }
            else
            {
                wordList.set(index, scram);
                index ++;
            }
        }
    }
}