public class Test {

    public static void main(String[] args) {
        String st = "Hello my name Hem";
        String smallest = "";
        String largest = "";
        String[] arry = st.split(" ");
        for(int i = 1; i < arry.length;i++){
            int min =arry[0].length();
            if(arry[i].length() < min ){
                smallest = arry[i];
            }
        }
        System.out.println(smallest);
    }
}

