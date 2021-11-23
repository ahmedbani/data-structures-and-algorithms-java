package hashTable.LeftJoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {
    public List<String> leftJoin(HashMap hashMap1, HashMap hashMap2){
        List<String> list = new ArrayList<>();
        for(Object key: hashMap1.keySet()){
            if(hashMap2.containsKey(key)){
                list.add(key +  ": " + hashMap1.get(key)+ "& " + hashMap2.get(key));
            }
            else{
                list.add(key + ": " + hashMap1.get(key) + "& " + null);
            }
        }
        return list;
    }
}
