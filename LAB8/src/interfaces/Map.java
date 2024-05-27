package interfaces;
import java.util.Collection;

public interface Map<K, V> {
    void clear();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    boolean equals(Object obj);

    V get(Object key);

    boolean isEmpty();

    V put(Object key, V value);

    V remove(Object key);
    
    int size();

    Collection<V> values();
}