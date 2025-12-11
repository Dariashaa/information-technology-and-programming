package Lab6;
import java.io.*;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "C://Users//darju//OneDrive//Рабочий стол//javareal//Lab6//text.txt";
        File file = new File(filePath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String,Integer> map = new HashMap<>();
        scanner.useDelimiter("[\\p{Punct}\\s—«»„\"\"]+");
        while(scanner.hasNext()){
            var word = scanner.next().toLowerCase();
            if(!map.containsKey(word)){
                map.put(word, 1);
            } else {
                map.put(word, map.get(word)+1);
            }
        }
        scanner.close();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry< String,Integer>>(){
            @Override
            public int compare(Map.Entry< String, Integer> o1,
            Map.Entry< String, Integer> o2) {
                int valueCompare = o2.getValue().compareTo(o1.getValue());
                if (valueCompare !=0){
                    return valueCompare;
                }
                return o1.getKey().compareTo(o2.getKey());
            }         
        });   
        int limit = Math.min(10, list.size());
        for (var i = 0; i<limit;i++){
            Map.Entry<String, Integer> entry = list.get(i);
            int place = i+1;
            System.out.println( place +". "+ entry.getKey() +" = "+ entry.getValue());
        }
    }
}
    

