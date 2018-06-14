package concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joyghosh on 14/06/18.
 */
public class StringTutorial {

    public static void main(String[] args){
//        String s0 = "ABCDEFG";
//        reverseUsingRecursion(s0);
//        String s1 = "AAGBHHF";
//        System.out.println(removeDuplicates(s1));
//        String s2 = "a,b$c";
//        System.out.println(reverseButSpecialChars(s2));
//        String s3 = "Ab,c,de!$";
//        System.out.println(reverseButSpecialChars(s3));
//        String s4 = "The quick brown fox jumps over the lazy dog";
//        System.out.println(s4+" is a pangram: "+isPangram(s4));
//        String s5 = "The quick brown fox jumps over the dog";
//        System.out.println(s5+" is a pangram: "+isPangram(s5));

//        String s6 = "g eeks for ge eeks ";
//        System.out.println(replaceSpacesUsingPredefinedMethods(s6));
//        System.out.println(replaceSpaces(s6));
        String s7 = new String("Geeks-for-Geeks");
//        split(s7);
        System.out.println(mostFrequentCharacter(s7));
    }

    public static void reverseUsingRecursion(String s){
        if(s == null || s.length() == 1){
            System.out.println(s);
        }else{
            System.out.print(s.charAt(s.length()-1));
            reverseUsingRecursion(s.substring(0, s.length()-1));
        }
    }

    public static String removeDuplicates(String s){
        if(s == null || s.length() == 0 || s.length() == 1) return s;

        StringBuilder result = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<i; j++){
                if(s.charAt(j) == s.charAt(i)){
                    break;
                }
            }

            if(i==j){
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public static String reverseButSpecialChars(String s){
        if(s == null || s.length() <= 1) return s;

        char[] strArr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while(l<r){
            if(!Character.isAlphabetic(strArr[l])){
                ++l;
            }else if(!Character.isAlphabetic(strArr[r])){
                --r;
            }else{
                char tmp = strArr[l];
                strArr[l] = strArr[r];
                strArr[r] = tmp;
                ++l;
                --r;
            }
        }

        return new String(strArr);
    }

    public static boolean isPangram(String s){
        if(s == null || s.length() < 26) return false;

        boolean[] alphabets = new boolean[26];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                alphabets[s.charAt(i)-'A'] = true;
            }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                alphabets[s.charAt(i)-'a'] = true;
            }
        }

        for(int i=0; i<alphabets.length; i++){
            if(!alphabets[i]){
                return false;
            }
        }

        return true;
    }

    public static String replaceSpacesUsingPredefinedMethods(String s){
        if(s == null || s.length() == 0) return s;

        return s.replaceAll("\\s", "");
    }

    public static String replaceSpaces(String s){
        if(s == null || s.length() == 0) return s;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void split(String s){
        if(s == null || s.length() <= 1) return;

        for(String str: s.split("-", 2)){
            System.out.println(str);
        }

        System.out.println();

        for(String str: s.split("-")){
            System.out.println(str);
        }
    }

//    public static Character mostFrequentCharacter(String s){
//        if(s == null || s.length() == 0) return null;
//
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//
//        int max = Integer.MIN_VALUE;
//        int currCount = 1;
//        Character maxChar = chars[0];
//        for(int i=1; i<chars.length; i++){
//            while(maxChar == chars[i]){
//                ++currCount;
//            }
//
//            if(currCount > max){
//                maxChar = chars[i-1];
//            }
//        }
//    }

    public static Character mostFrequentCharacter(String s){
        if(s == null || s.length() <= 1) return null;

        Map<Character, Integer> frequency = new HashMap<>();

        for(Character c: s.toCharArray()){
            if(frequency.containsKey(c)){
                frequency.put(c, frequency.get(c)+1);
            }else{
                frequency.put(c, 1);
            }
        }

        Character result = null;
        int maxCount = 0;
        for(Map.Entry<Character, Integer> e: frequency.entrySet()){
            if(e.getValue() > maxCount){
                maxCount = e.getValue();
                result = e.getKey();
            }
        }

        return result;
    }
}
