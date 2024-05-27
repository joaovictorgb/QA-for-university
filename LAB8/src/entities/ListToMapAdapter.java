package entities;
import java.util.*;

public class ListToMapAdapter<V> implements Map<Integer, V> {

    private List<V> list;

    public ListToMapAdapter() {
        this.list = new ArrayList<>();
    }

    @Override
    public void clear() {
        this.list.clear();
    }

    @Override
    public boolean containsValue(Object value) {
        return this.list.contains(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListToMapAdapter<?> other = (ListToMapAdapter<?>) obj;
        return this.list.equals(other.list);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public V put(Integer key, V value) {
        if (key < 0) {
            throw new IndexOutOfBoundsException("Chave deve ser positiva");
        }
        while (list.size() <= key) {
            list.add(null);
        }
        return list.set(key, value);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public Collection<V> values() {
        return new ArrayList<>(this.list);
    }

    @Override
    public V get(Object key) {
      return this.list.get((int) key);
   }

    @Override
    public V remove(Object key) {
        return this.list.remove((int) key);
    }





    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends V> m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Integer> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Entry<Integer, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

}
