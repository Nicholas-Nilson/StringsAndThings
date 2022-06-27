package io.zipcoder;


import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */

    String[] input = {"hey there governor"};
    public Integer countYZ(String input){
        String[] words = input.split(" ");
        Integer count = 0;
        Integer reverseIterator = 1;
        for (int i =0; i < words.length; i++) {
            //below checks if last character is a numeric digit. If it is, it is marked true.
            boolean reverseFlag = Character.isDigit(words[i].charAt(words[i].length() - reverseIterator));
              if (reverseFlag) {
                reverseIterator++ ;
                i = i-1;
            }
              else if (words[i].charAt(words[i].length() - reverseIterator) == 'y' || words[i].charAt(words[i].length() - reverseIterator) == 'z' ) {
                  count++;
                  reverseIterator = 1;
              }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String alteredString = base;
        while (alteredString.contains(remove)) {
            alteredString = alteredString.replaceFirst(remove, "");
        }
        return alteredString;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    //Jiayong had a nice way of doing this. He compared the length of the original string to a string with all the 'is''s
    // and another with all the 'not's removed.
    public Boolean containsEqualNumberOfIsAndNot(String input){
//        Integer isCount = 0;
//        Integer notCount =0;
//        boolean match = false;
//        String modifiedString = input;
//        while (modifiedString.contains("is")) {
//            modifiedString = modifiedString.replaceFirst("is", "");
//            isCount++;
//        }while (modifiedString.contains("not")) {
//            modifiedString = modifiedString.replaceFirst("not", "");
//            notCount++;
//        } if (isCount == notCount) {
//            return match = true;
//        }
//        return match;

        //the method Jiayong shared. Avoids using loops. More efficient, no loops.
        String isString = input;
        String notString =input;
        isString.replace("is", "");
        notString.replace("not", "");
        if (isString.length() -isString.length() / "is".length() == notString.length() - notString.length() / "not".length()) {
            return true;
        }
        return false;

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }


}
