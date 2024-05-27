package entities;

import interfaces.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class MapToListAdapter<E> implements List<E> {
    private Map<Integer, E> map;

    public MapToListAdapter() {
        this.map = new HashMap<>();
    }

    @Override
    public void add(E element) {
        int index = map.size(); 
        map.put(index, element);
    }


    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object obj) {
        return map.containsValue(obj);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MapToListAdapter<?> other = (MapToListAdapter<?>) obj;
        return map.equals(other.map);
    }

    @Override
    public E get(int index) {
        return map.get(index);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return map.values().iterator();
    }

    @Override
    public E remove(int index) {
        return map.remove(index);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Object[] toArray() {
        return map.values().toArray();
    }

}
