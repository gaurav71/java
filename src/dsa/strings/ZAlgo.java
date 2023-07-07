package dsa.strings;

// Find Pattern in a String
public class ZAlgo {

    static int countMatching(String str, int i, int j) {
        int p1 = i;
        int p2 = j;

        while (p1 < str.length() && p2 < str.length() && str.charAt(p1) == str.charAt(p2)) {
            p1++;
            p2++;
        }

        return p2 - j;
    }

    /*
     * arr[i] = size of longest substring starting at index i matching with prefix of the string
     * arr[0] = size of the array
     *
     * zbox[i] = j where str[i,..,j] == str[0,..k]
     * */
    static int[] getZArray(String str) {
        int[] arr = new int[str.length()];
        int l = 0;
        int r = -1;

        for (int i=1; i<str.length(); i++) {
            // If index is lying between the zbox
            if (i >= l && i <= r) {
                // use the already computed value of zarr from prefix
                arr[i] = Math.min(arr[i-l], r-i+1);

                // if zarr value is equal to the length of the remaining zbox
                // then there could be more matching chars outside the zbox for current index
                if (arr[i] == r-i+1) {
                    arr[i] += countMatching(str, arr[i], r+1);
                    l = i;
                    r = i + arr[i] - 1;
                }
            } else {
                arr[i] = countMatching(str, 0, i);
                l = i;
                r = i + arr[i] - 1;
            }

            System.out.print(arr[i]+", ");
        }

        return arr;
    }

    static int countNumberOfTimesPatternOccurs(String str, String pattern) {
        String temp = pattern + "$" + str;
        int[] zArr = getZArray(temp);
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
