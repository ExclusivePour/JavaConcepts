import java.util.List;
import java.util.HashMap;
import java.util.Collections;
public class HashMapConcepts {

    public static void main(String[] args){

        List<String>  names = List.of("apple", "banana", "apple" , "banana" , "banana","pear", "kiwi" , "pomegranate");
        HashMap<String,Integer> count = new HashMap<>();
        for(String name: names){
            if(count.containsKey(name)){
                count.replace(name,count.get(name)+1);
            }else{
                count.put(name,1);
            }
        }


    }
}