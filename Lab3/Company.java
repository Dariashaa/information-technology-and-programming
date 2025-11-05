package lab3;
import java.util.LinkedList;

public class Company<K, V> {
    private LinkedList<Entry<K,V>>[] table;
    private int size;
    private int capacity;

    public Company(int capacity){
        this.capacity = capacity;
        table = new LinkedList[capacity];
        size = 0;
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
        for (Entry< K, V> entry : table[index]) {
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

    public static void main(String[] args) {
        Company<Integer, Employee> company = new Company<>(10);

        Employee emp1 = new Employee("Иван Иванов", "Разработчик", 100000);
        Employee emp2 = new Employee("Петр Петров", "Менеджер", 80000);
        Employee emp3 = new Employee("Мария Сидорова", "Дизайнер", 90000);

        company.put(101, emp1);
        company.put(102, emp2);
        company.put(103, emp3);

        System.out.println(company.size());

        System.out.println("Сотрудник с ID 102: " + 
            company.get(102).getName() + " - " + 
            company.get(102).getPosition());

        Employee upd = new Employee("Петр Петров", "Старший менеджер", 95000);
        company.put(102, upd);

        company.remove(103);
        System.out.println("После удаления ID 103: " + company.get(103));

        Employee emp4 = new Employee("Иван Иванов", "Разработчик", 100000);
        System.out.println("emp1.equals(emp4): " + emp1.equals(emp4));
        System.out.println("emp1 hashCode: " + emp1.hashCode());
        System.out.println("emp4 hashCode: " + emp4.hashCode());
    }
}
