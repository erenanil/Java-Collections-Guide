import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsTR {
    public static void main(String[] args) {
        /*
# Set Arayüzü, HashSet, LinkedHashSet ve TreeSet

## Set Arayüzü
- **Set**, Java'da bir **Collection** türüdür.
- **Yinelenen elemanlara izin vermez.** (Her eleman benzersizdir.)
- Elemanların sırasını garanti etmez (istisnalar: LinkedHashSet ve TreeSet).
- Temel uygulamalar: **HashSet**, **LinkedHashSet**, **TreeSet**.

---

## HashSet
- **Sırasız bir koleksiyon** sağlar (ekleme sırasını korumaz).
- **Bir null değere** izin verir.
- Elemanları bir **hash algoritması** kullanarak saklar.
- **Performans:**
  - Arama, ekleme ve silme işlemleri genellikle **O(1)**'dir.
- **Avantaj:** Hızlı.
- **Dezavantaj:** Sıra bilgisi sağlamaz.

---

## LinkedHashSet
- HashSet'e benzer, ancak elemanların **eklenme sırasını korur**.
- **Daha fazla bellek** kullanır, çünkü elemanlarla birlikte bir bağlı liste yapısı saklar.
- **Performans:**
  - Arama, ekleme ve silme işlemleri genellikle **O(1)**'dir.
- **Avantaj:** Sıra koruma + hızlı işlemler.
- **Dezavantaj:** HashSet'e göre biraz daha yavaştır.

---

## TreeSet
- Elemanları, onların **doğal sırasına** (veya tanımlanmış bir **Comparator**'a) göre sıralar.
- **Yinelenen elemanlara izin vermez.**
- **Null değerlere izin vermez.**
- Bir **Dengeli Ağaç (AVL veya Red-Black Tree)** kullanır.
- **Performans:**
  - Arama, ekleme ve silme işlemleri **O(log n)**'dir.
- **Avantaj:** Sıralı veri sağlar.
- **Dezavantaj:** HashSet ve LinkedHashSet'e göre daha yavaştır.

---

## Karşılaştırma Tablosu

| Özellik               | **HashSet**       | **LinkedHashSet**         | **TreeSet**       |
|-----------------------|-------------------|---------------------------|-------------------|
| **Sıra Garantisi**    | Yok               | Ekleme sırasını korur     | Doğal sıra        |
| **Performans**        | O(1)              | O(1)                      | O(log n)          |
| **Null Desteği**      | Bir null değere izin var | Bir null değere izin var | Null yok    |
| **Kullanım Alanı**    | Hızlı erişim      | Hızlı erişim + sıra koruma | Sıralı veri      |

---

## Genel Notlar
1. **Set Arayüzü** ile çalışırken, elemanların **benzersiz** olması gerektiğini unutmayın.
2. Eğer:
   - **Hız** istiyorsanız → `HashSet` kullanın
   - **Sıra + hız** istiyorsanız → `LinkedHashSet` kullanın
   - **Sıralı bir koleksiyon** istiyorsanız → `TreeSet` kullanın
3. Kullanılan veri tipinin, **`hashCode()` ve `equals()`** yöntemlerini doğru tanımladığından emin olun:
   - HashSet ve LinkedHashSet bu yöntemlere dayanır.
   - TreeSet, sıralama için **Comparable** veya **Comparator** kullanır.
   */

   
   //Bazı kullanım örnekleri;
   /*
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        
        //Ekleme methodu tüm Set ailesinde aynıdır. add metoduyla eklenir.
        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("Javascript");
        set1.add("Go");
        //----
        set2.add("Java");
        set2.add("C++");
        set2.add("Python");
        set2.add("Javascript");
        set2.add("Go");
        //----
        set3.add("Java");
        set3.add("C++");
        set3.add("Python");
        set3.add("Javascript");
        set3.add("Go");
*/


        //foreach ile küme içindeki değerlerin görüntülenmesi;
        /* 
        System.out.println("*******HashSet*********");
        for(String s : set1){
            System.out.println(s);
        }
        System.out.println("********LinkedHash********");
        for(String s : set2){
            System.out.println(s);
        }
        System.out.println("********TreeSet********");
        for(String s : set3){
            System.out.println(s);
        }
        */


        //Contains methodu ilgili kümenin içerisinde yazdığınız değerin olup olmadığını kontrol eder ve boolean bir değer döner.
        //System.out.println(set1.contains("Php")); //false dönecektir.
        //System.out.println(set2.contains("Java")); //true dönecektir.

        //isEmpty methodu ilgili kümenin içerisinde eleman olup olmadığını kontrol eder ve boolean bir değer döner.
        //System.out.println(set1.isEmpty()); //false dönecektir.


        //Kümeden eleman silme işlemi;
        /* 
        set1.remove("Java");
        for(String s : set1){
            System.out.println(s);
        }
        */

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("C++");
        set1.add("Java");
        set1.add("Python");

        set2.add("Java");
        set2.add("Php");
        set2.add("Go");

        /*
         * removeAll metodu kümeler arasındaki farkı bulmamızda bize yardımcı oluyor.
         * fark diye bir küme oluşturup constructor'ına farkını bulacağımız kümeyi atadık(153. satır),
         * ve fark kümemizi removeAll metoduna karşılaştıracağımız kümeyi veriyoruz.(154.satır),
         * son olarak fark kümemizi bastırarak, kümenin hangi elemanlarının farklı olduğuna bakıyoruz.(155.satır)
         */
        //Set<String> fark = new HashSet<>(set2);
        //System.out.println(fark.removeAll(set1));
        //System.out.println(fark);



        /*
         * retainAll metodu kümeler arasındaki kesişim elemanlarını bulmamızda bize yardımcı oluyor.
         * kesişim adında bir küme oluşturup constructor'ına kesişimini aradığımız kümeyi atadık.(165. satır)
         * ve kesişim kümemizi retainAll metodunda karşılaştıracağımız kümeyi veriyoruz(166. satır),
         * son olarak kesişim kümemizi bastırarak, kümenin hangi elemanlarının kesiştiğini küme içerisinde görüyoruz.(167. satır)
         */
        //Set<String> kesisim = new HashSet<>(set2);
        //System.out.println(kesisim.retainAll(set1));
        //System.out.println(kesisim);


    }
}
