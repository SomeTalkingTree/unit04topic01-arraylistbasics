import java.util.ArrayList;

public class ArrayListUtilities {//done
    public static int getListMax(ArrayList<Integer> items) {
        int max = 0;
        for(int n:items){
            if(max<n){
                max=n;
            }
        }
        return max;
    }
    public static ArrayList<String> withoutLongWords(ArrayList<String> words){//done
        ArrayList<String> senceten= new ArrayList<>();
        for(String text:words){
            if(text.length()<6){
                senceten.add(text); 
            }
        }
        return senceten;
        
    }
    public static void removeLongWords(ArrayList<String> listofwords){
        for(String text:listofwords){
            if(text.length()<6){
                listofwords.remove(text); 
            }
        }
    }
}