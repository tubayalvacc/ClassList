public class Main {
    public static void main(String[] args) {
        ArrayListClass<Integer> liste = new ArrayListClass<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.getSize());
        System.out.println("Dizinin Kapasitesi : " + liste.getInitialCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.getSize());
        System.out.println("Dizinin Kapasitesi : " + liste.getInitialCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.getSize());
        System.out.println("Dizinin Kapasitesi : " + liste.getInitialCapacity());

        System.out.println("-------------------------------------------------------------------------------------");

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.print("2. indisteki değer : " ); liste.getIndex(2);
        System.out.println("Mevcut Kapasite : " + liste.getSize());
        liste.remove(30);
        System.out.println("Silinme İşlemi Sonrası Kapasite : " + liste.getSize());
        liste.add(40);
        liste.setValue(0, 100);
        System.out.print("2. indisteki değer : ");   liste.getIndex(2);
        System.out.println(liste.toString());

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        ArrayListClass<Integer> altListem = liste.sublist(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.includes(20));
        System.out.println("Listemde 120 değeri : " + liste.includes(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());


        System.out.println("-------------------------------------------------------------------------------------");






    }
}