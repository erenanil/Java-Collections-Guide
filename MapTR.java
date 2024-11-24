import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
// Dipnot:  "/* */" tırnak içerisindeki ifadenin silinmesiyle örnekleri kolaylıkla çalıştırabilirsiniz.
public class MapTR {
    public static void mapYazdirString(Map<String, Integer> map){
        map.put("C++", 10);
        map.put("Java", 5);
        map.put("Python",1);
        map.put("Php",2);
        map.put("C", 100);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key : "+entry.getKey() + " Value : "+ entry.getValue());
        }

    }

    public static void mapYazdirInteger(Map<Integer, String> map){
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key : "+entry.getKey() + " Value : "+ entry.getValue());
        }

        //Sadece anahtarları görüntüleriz;
        //System.out.println(map.keySet());

        //Farklı alternatif kullanımlar
        /*
        for (Integer key: map.keySet()){
            System.out.println("Key : " + key + " Value: " + map.get(key));
        }
        */

        /*         
        Collection<String> values = map.values();
        for ( String s: values){
            System.out.println("values : "+s);
        }
        */
    }
    public static void main(String[] args) {
/*
//1. Map Arayüzü (Map Interface):
//    - Map, bir anahtar (key) ile bir değer (value) arasındaki ilişkiyi saklamak için kullAnilır.
//    - Her anahtar eşsizdir (unique), ancak değerler aynı olabilir (duplicate).
//    - Temel metotlar:
//        - put(key, value): Anahtar-değer çifti ekler.
//        - get(key): Anahtara karşılık gelen değeri döner.
//        - remove(key): Anahtara karşılık gelen değeri kaldırır.
//        - containsKey(key): Anahtarın var olup olmadığını kontrol eder.
//        - containsValue(value): Değerin var olup olmadığını kontrol eder.
//        - keySet(): Tüm anahtarları döner.
//        - values(): Tüm değerleri döner.
//    - Map bir interface olduğu için doğrudan kullanılamaz; HashMap, LinkedHashMap veya TreeMap ile kullanilır.

// 2. HashMap:
//    - Map arayüzünün bir implementasyonudur.
//    - Özellikler:
//        - Anahtarlar ve değerler sırasız bir şekilde saklanır (insertion order korunmaz).
//        - Hızlıdır çünkü verileri bir hash tablosunda saklar.
//        - null anahtarına ve birden fazla null değerine izin verir.
//    - Kullanım Örnekleri:
//        - Veritabanı ID'lerini ve ilgili kayıtları eşleştirmek.
//        - Kullanıcı kimlik bilgilerini saklamak.
//    - Örnek:
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Anil", 30);
        map.put("Eda", 25);
//        System.out.println(map.get("Anil")); // Çıktı: 30

// 3. LinkedHashMap:
//    - HashMap'in bir alt sınıfıdır, ancak ekleme sırasını korur (insertion order).
//    - Özellikler:
//        - Daha fazla hafıza gerektirir (çünkü bir çift bağlı liste kullanır).
//        - HashMap'e kıyasla sıralama avantajı sağlar.
//        - null anahtarına ve birden fazla null değerine izin verir.
//    - Kullanım Örnekleri:
//        - Bir kullanıcı işlem geçmişini sıralı bir şekilde saklamak.
//    - Örnek:
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Anil", 30);
        map1.put("Eda", 25);
        System.out.println(map1); // Çıktı: {Anil=30, Eda=25}

// 4. TreeMap:
//    - Map arayüzünün sıralı bir implementasyonudur (doğal sıralama ya da bir Comparator ile belirlenmiş sıralama).
//    - Özellikler:
//        - Anahtarlar sıralı bir şekilde saklanır.
//        - HashMap veya LinkedHashMap'e kıyasla daha yavaştır (çünkü bir ağacı kullanır - Red-Black Tree).
//        - null anahtarına izin vermez ancak null değerlerine izin verir.
//    - Kullanım Örnekleri:
//        - Alfabetik sıralama gereken durumlar (örneğin, bir telefon rehberi).
//    - Örnek:
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("Anil", 30);
        map2.put("Eda", 25);
        System.out.println(map2); // Çıktı: {Anil=30, Eda=25}
*/
 
        Map<Integer, String> hashMap= new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap= new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap= new TreeMap<Integer, String>();
        
        Map<String, Integer> hashMap2= new HashMap<String, Integer>();
        Map<String, Integer> linkedHashMap2= new LinkedHashMap<String, Integer>();
        Map<String, Integer> treeMap2= new TreeMap<String, Integer>();

        //Integer anahtarlar
        System.out.println("******HashMap*******");
        mapYazdirInteger(hashMap);
        System.out.println("******LinkedHashMap*********");
        mapYazdirInteger(linkedHashMap);
        System.out.println("********TreeMap*******");
        mapYazdirInteger(treeMap);
        
        //String anahtarlar
        System.out.println("******HashMap*******");
        mapYazdirString(hashMap2);
        System.out.println("******LinkedHashMap*********");
        mapYazdirString(linkedHashMap2);
        System.out.println("********TreeMap*******");
        mapYazdirString(treeMap2);



    }
}
