package lab3;
import java.util.LinkedList;

public class HashTable<K, V> {
    private LinkedList<Entry<K,V>>[] table;
    private int size;
    private int capacity;
    
    public HashTable(int capacity){
        this.capacity = capacity;
        this.table = new LinkedList[capacity];
        this.size=0; 
    }


    private int hash(K key){
        return Math.abs(key.hashCode()%capacity);
    }

    public class Entry<K,V> {
    private K key;
    private V value;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }
    
    public void setValue(V value){
        this.value = value;
    }
}

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList< Entry< K, V> > ();
        }

        for (Entry<K, V> entry : table[index]) {
        if (entry.getKey().equals(key)) {
            entry.setValue(value);
            return;
        }
    }

        table[index].add(new Entry< K, V> (key, value));
        size++ ;
    }
    

    public V get(K key){
        int index = hash(key);
        if (table[index] == null){
            return null;
        } 

        for (Entry< K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
  
        }
        return null;

    }

    public V remove(K key){
        int index = hash(key);
        if (table[index] != null){
           for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                V oldV = entry.getValue();
                table[index].remove(entry);
                size--;

                if (table[index].isEmpty()){
                    table[index] = null;
                }

                return oldV;
            }
  
        } 
    } 
    return null;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


     public static void main(String[] args) {
        HashTable<String, Integer> example = new HashTable<>(5);

        example.put("apple", 3);  
        example.put("red",4);  
        example.put("mom", 7);  

        System.out.println(example.get("apple"));

        System.out.println(example.size());
        System.out.println(example.remove("red"));

        System.out.println(example.get("red"));
        System.out.println(example.size());


        HashTable<String, String> testTable = new HashTable<>(3); 
        
        testTable.put("apple", "яблоко");
        testTable.put("banana", "банан");
        testTable.put("orange", "апельсин");
        testTable.put("grape", "виноград"); 
        
        System.out.println("apple: " + testTable.get("apple"));
        System.out.println("grape: " + testTable.get("grape"));

     }
}

