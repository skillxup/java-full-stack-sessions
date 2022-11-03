import java.util.*;
class SortTreeMapByValue {
    public static <K, V extends Comparable<V>> Map<K, V>
        sortByValues(final Map<K, V> map) {
            Comparator<K> valueComparator = 
                new Comparator<K>() {
                    public int compare(K k1, K k2) {
                        int compare = 
                            map.get(k1).compareTo(map.get(k2));

                        if(compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };

            Map<K, V> sortedByValues = 
                new TreeMap<K, V>(valueComparator);

            sortedByValues.putAll(map);
            return sortedByValues;
        }

        public static void main(String args[]) {
            TreeMap<String, String> treemap = new TreeMap<String, String>();
            treemap.put("key1", "Jack");
            treemap.put("key2", "Rick");
            treemap.put("key3", "Kate");
            treemap.put("key4", "Tom");
            treemap.put("key5", "Steve");

            Map sortedMap = sortByValues(treemap);
            Set set = sortedMap.entrySet();
            
            Iterator i = set.iterator();

            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                System.out.println(me.getKey() + ": " + me.getValue());
            }
        }
}
