package InterviewAsked.Paypal_SDE2_2023;

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
                    System.out.println(s.charAt(i) + " -- " + s.charAt(j) + "--" + (j - i + 1) +"--" + "i:"+i +"j:"+j );
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
    }

    /*
     * Try to implement sliding window but my code is not working.
     */
}

/*
 * Given - string s, char c, int count
Find continuous substring in 's' which has the lowest length and has count 'count' of char 'c '.

Ex: s - 'abrtbopkbxb', c - 'b', count - 2
Ans: 2 - continuous substring 'bxb'
 */
