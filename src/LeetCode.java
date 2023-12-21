public class LeetCode {
//    public static int[] twoSum(int[] nums, int target) {
//        int sum = 0;
//        int[] arr = new int[2];
//        for(int i =0;i < nums.length;i++){
//            for(int j = i+1;j<nums.length;j++){
//                sum = nums[i] + nums[j];
//                if(sum==target){
//                  arr[0] = i;
//                  arr[1] = j;
//                  break;
//                }
//            }
//        }
//        return arr;
//    }
//
//    public static int lengthOfLongestSubstring(String s) {
//        int result = 0;
//        for(int i = 0;i < s.length();i++){
//            for(int j= i; j < s.length();j++){
//                if(isUnique(s,i,j)){
//                    result = Math.max(result,j-i + 1);
//                }
//            }
//        }
//        return result;
//    }
//
//    public static boolean isUnique(String str, int start, int end){
//        Set<Character> chars = new HashSet<>();
//        for(int i = start;i<=end;i++){
//            if(chars.contains(str.charAt(i))){
//                return false;
//            }
//            chars.add(str.charAt(i));
//        }
//        return true;
//    }
//
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int sum1 =0;
//        int sum2 =0;
//        double res;
//        int len = nums1.length + nums2.length;
//        for(int i = 0;i<nums1.length;i++){
//            sum1 += nums1[i];
//        }
//        for(int i = 0;i<nums1.length;i++){
//            sum2 += nums2[i];
//        }
//        res = (sum1 + sum2)/len;
//        return res;
//    }
//
//    public static String longestPalindrome(String s) {
//        String largest = "";
//        int length = 0;
//
//        for(int i =0;i<s.length();i++) {
//            for (int j = i; j < s.length(); j++) {
//                String palin = "";
//                for (int k = i; k <= j; k++) {
//                    palin += s.charAt(k);
//                }
//                if (isPalindrome(palin)) {
//                    if (palin.length() > length) {
//                        length = palin.length();
//                        largest = palin;
//                    }
//                }
//            }
//        }
//        return largest;
//    }
//
//    public static boolean isPalindrome(String str){
//        String rev = "";
//        for(int i = str.length() -1;i>=0;i--){
//            rev += str.charAt(i);
//        }
//        if(str.equals(rev)){
//            return true;
//        }
//        return false;
//    }

    public static int reverse(int x) {
        boolean isNegative = x < 0 ? true : false;
        if(isNegative){
            x = x * -1;
        }

        int rev = 0;
        int rem;
        while (x > 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
        }

        return isNegative == true? rev*-1 : rev;
    }

    public static boolean isPalindrome(int x) {
        boolean isNegative = x < 0 ? true : false;
        if(isNegative){
            return false;
        }
        int rem;
        int rev = 0;
        int num = x;
        while (num > 0){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        return rev == x ? true : false;
    }

    public static void main(String args[]){
//        int array[] = new int[]{3,2,4};
//        int res[] = twoSum(array,6);
//        for (int i = 0;i<res.length;i++){
//            System.out.println(res[i]);
//        }

//        System.out.println(lengthOfLongestSubstring("abcabc"));

//        System.out.println(longestPalindrome("babad"));

//        System.out.println(reverse(-123));

        System.out.println(isPalindrome(121));
    }
}
