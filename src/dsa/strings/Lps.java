package dsa.strings;

public class Lps {
    /*
    LPS = length of longest prefix which is also suffix and also not the entire string
    * abcab
    * lps = 2 (ab = ab)

    lps[i] = lps of substring [0,..,i] (longest substring ending at index i which is also a prefix)
    * */

    private static int[] createLpsArray(String str) {
       int[] lps = new int[str.length()];

       for (int i=1; i<str.length(); i++) {
           int j = lps[i-1];

           while (str.charAt(j) != str.charAt(i)) {
               if (j == 0) {
                   j = -1;
                   break;
               }

               j = lps[j-1];
           }

           lps[i] = j + 1;
       }

       return lps;
    }

    private static int countNumberOfTimesPatternOccurs(String str, String pattern) {
        String temp = pattern + "$" + str;
        int[] zArr = createLpsArray(temp);
        int count = 0;

        for (int i=1; i<zArr.length; i++) {
            int size = zArr[i];
            if (size == pattern.length()) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "bcdefafdefg";
        String pattern = "def";
        int count = countNumberOfTimesPatternOccurs(str, pattern);
        System.out.println(count);
    }
}
