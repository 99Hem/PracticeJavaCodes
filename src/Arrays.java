import java.util.HashMap;

public class Arrays {

    public static void removeduplicates() {

        int a[] = {1, 1, 3, 3, 3, 4, 4};
        int n = a.length;
        if (n == 0 || n == 1) {

        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        for (int m = 0; m < j; m++) {
            System.out.print(a[m] + " ");
        }
    }

    public static void ascendingArray() {
        int[] arry = {1, 1,3, 4, 5, 2, 7, 6, 8, 2, 9};
        int temp = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[i] > arry[j]) {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        for (int n = 0; n < arry.length; n++) {
            System.out.print(arry[n] + " ");
            //System.out.print(String.valueOf(arry));
        }
    }

    public static void Occuranceofcharinstring(String st) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = st.toCharArray();
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for (char c : ch) {
            if (map.get(c) != 1){

            }else{
                System.out.println(c);
            }
        }
    }

    public static void swaptwonumbers(int x,int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap: " +x+ " "+y);
    }

    public static void primenumber(int num){
        boolean flag = false;
        for(int i = 2; i <= num; i++){
            int m = i/2;
            for(int div = 2; div <= m; div++){
                if(i%div == 0){
                    break;
                }else {flag = true;}
                //System.out.println(div);
            }if(flag == true){
                System.out.println(i);
            }

            flag = false;
        }

    }

    public static void  FibonacciSeries(int num){
        int x = 0;
        int y = 1;
        int z ;
        System.out.print(x +" "+y+" " );
        for(int i = 2;i<=num;i++ ){
            z = x + y;
            System.out.print(z +" ");
            x = y;
            y = z;
        }
    }

    public static void Palindrome(String str){
        String reverse = "";
        char[] ch = str.toCharArray();
        for(int i = ch.length-1;i >=0;i--){
            reverse = reverse + ch[i];
        }
        System.out.println(reverse);
        if(str.equals(reverse)){
            System.out.println(str +" is a Palindrome");
        }
    }

    public static void substring(String strng){
        String First = strng.substring(1,7);
        String[] split = strng.split("\\s");
        System.out.println(First);
        System.out.println(split[0]);
    }

    public static void swapStrings(String a,String b){
        a = a + b;
        b = a.substring(0,a.length() - b.length());
        a = a.substring(b.length());
        System.out.println(a +" " +b);
    }

    public static void SeparateAlphaAndNum(String Alphanum){
        char[] ch = Alphanum.toCharArray();
        String Alpha = "";
        String nums = "";
        String Splchr = "";
        for(int i = 0; i < ch.length ; i++){
            if(Character.isAlphabetic(ch[i])){
                Alpha += ch[i];
            }
            else if (Character.isDigit(ch[i])){
                nums += ch[i];
            }else{
                Splchr += ch[i];
            }
        }
        System.out.println(Alpha);
        System.out.println(nums);
        System.out.println(Splchr);
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0){
                output += "Fizz";
            }
            if(i % 5 == 0){
                output += "Buzz";
            }if(output == ""){
                output += i;
            }
            System.out.println(output);
        }
    }

    public static void pushZerosToEnd(int[] arr){
        int n = arr.length;
        int count = 0 ;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n){
            arr[count++] = 0;
        }
        for(int i = 0; i<n;i++)
            System.out.print(arr[i] +" ");
    }



    public static void main(String[] args) {
//        ascendingArray();
//        System.out.println();
//        removeduplicates();
//        System.out.println();
//        Occuranceofcharinstring("HHeelo");
//        swaptwonumbers(10,15);
//        primenumber(31);
//        FibonacciSeries(56);
//        System.out.println();
//        Palindrome("Hem");
//        System.out.println();
//        substring("Hem Atul Shah");
//        System.out.println();
//        swapStrings("Hello","world");
//        System.out.println();
//        SeparateAlphaAndNum("Hello12jhu^%$dwjm32");
//        fizzBuzz();
//        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
//        pushZerosToEnd(arr);
        String st = "Hello world, how are you";
        String newst = st.replace("o", "0");
        System.out.println(newst);

    }
}
