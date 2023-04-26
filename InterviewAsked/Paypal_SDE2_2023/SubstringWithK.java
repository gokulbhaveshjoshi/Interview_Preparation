package InterviewAsked.Paypal_SDE2_2023;

import java.util.ArrayList;

public class SubstringWithK {
    // TC O(N*N)
    // SC O(1)
    public static int substringSize(String s, int count, char c){
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) { // O (N)
            if (s.charAt(i) == c) {
                ans = Math.min(ans, helper(s, count - 1, c, i)); // O(N)
            }
        }
        return ans;
    }

    private static int helper(String s, int count, int c, int i) {
        if (s.length() - 1 == i) {
            return Integer.MAX_VALUE;
        }

        for (int j = i + 1; j < s.length(); j++) { 
            if (s.charAt(j) == c) {
                count--;
                if (count == 0) {
                    //System.out.println(s.charAt(i) + " -- " + s.charAt(j) + "--" + (j - i + 1) +"--" + "i:"+i +"j:"+j );
                    return j - i + 1;
                }
            }

        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        String s = "abrtbopkbxb";
        char c = 'b';
        int count = 2;
        int result = SubstringWithK.substringSize(s, count, c);
        System.out.println(result);

        result = SubstringWithK.countAllChar(s, count, c);
        System.out.println(result);
    }

    /*
     * Try to implement sliding window but my code is not working.
     */

    /* countAllChar(String, int count, char c)
     * Find the index of char c and store in ArrayList.
     * like string abrtbopkbxb [1, 5, 9, 11] 
     * find min len of count of char if count is 2 -> i + count - 1 
     * (-1 because position i has also char c)
     * i = 0 (frist char) => len = (al[0 + 2 - 1] - al[0]) = 5 - 1  = 4
     * i = 1 (sec char)   => len = (al[1 + 2 - 1] - al[1]) = 9 - 5  = 4
     * i = 2 (sec char)   => len = (al[2 + 2 - 1] - al[2]) = 11 - 9  = 3
     */
    // TC O(n) and SC = O(n)
    private static int countAllChar(String s, int count, char c) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (c == ch)  {
                al.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < al.size() - count; i++) {
            min = Math.min(min, al.get(i + count -1) - al.get(i));
        }
        return min;
    } 
}

/*
 * Given - string s, char c, int count
Find continuous substring in 's' which has the lowest length and has count 'count' of char 'c '.

Ex: s - 'abrtbopkbxb', c - 'b', count - 2
Ans: 2 - continuous substring 'bxb'
 */
