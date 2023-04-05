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
    public static void removeLongWords(){
        ArrayListUtilitiesTest tests = new ArrayListUtilitiesTest();
       // ArrayList<String> Fullwordlist = ;
        //for(String text:){
        //    if(text.length()<6){
        //        listofwords.remove(text); 
        //    }
        //}
    }

    public static ArrayList<Double> reversed(ArrayList<Double> Listofnums){
        ArrayList<Double> revsent = new ArrayList<>();
        for(int num=Listofnums.size()-1;num>-1;num--){
            Double text = Listofnums.get(num);
            revsent.add(text);
        }     
        return revsent;

    }
}