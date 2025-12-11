package Lab6;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ShopMap {
    private ConcurrentHashMap<String, Integer> shopMap;
    private int allSales; 

    public ShopMap(){
        this.shopMap = new ConcurrentHashMap<String, Integer>();
        this.allSales = 0; 
    }

    public void addSale(String key, int value){
        shopMap.merge(key, value, Integer::sum);
        allSales+=value;
    }
    
    public void showMap(){
        System.out.println(shopMap.toString());
    }

    public int allSales(){
        return allSales;
    }

    public String popular(){
        if (shopMap.isEmpty()) {
        return "Нет продаж";
    }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(shopMap.entrySet());
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
        Map.Entry<String, Integer> entry = list.get(0);
        return entry.getKey() + " = " + entry.getValue();
    }

    public static void main(String[] args) {
        ShopMap store1 = new ShopMap();

        System.out.println(store1.popular());
        store1.addSale("1984", 5);
        store1.addSale("1984", 3);
        store1.addSale("The Hobbit", 2);
        store1.addSale("Dune", 6);
        store1.showMap();
        System.out.println(store1.allSales());
        System.out.println(store1.popular());
    }
}
