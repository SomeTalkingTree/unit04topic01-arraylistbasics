import java.util.ArrayList;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int max = 0;
        for(int n:items){
            if(max<n){
                max=n;
            }
        }
        return max;
    }
    public static String withoutLongWords(ArrayList<String> words){ //This error needs to be returned
        ArrayList<String> senceten;
        for(String text:words){
            if(text.length()<6){
                senceten.add(text); // this needs to be changed
            }
        }
    }
}