package com.stackroute.genericcollection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class GenericMapOperations<K, V> extends LinkedHashMap<K, V> {

    private static final long serialVersionUID = 1L;

    private final int mapCapacity;


    public GenericMapOperations(int mapCapacity) {

        /*Call constructor of LinkedHashMap with capacity increased by one (since the element will be added first
         * and the least used element will be removed from the map after the addition )
         * accessOrder set to true
         */
        super(mapCapacity + 1, 1.0f, true);
        this.mapCapacity = mapCapacity;
    }


    @Override
    protected boolean removeEldestEntry(Entry<K, V> eldest) {
        /* Remove the eldest element whenever size of map exceeds the capacity*/
        return (size() > this.mapCapacity);
    }


    /**
     * Returns the value corresponding to input key from the Map.
     *
     * @param key Key for the element whose value needs to be returned
     * @return Value of the element with input key or null if no such element
     * exists
     */
    public V find(K key) {
        return super.get(key);
    }

    /**
     * Set the element with input key and value in the map. If the element
     * already exits, it updates its value.
     *
     * @param key   Key of the element
     * @param value Value of the element
     */
    public void set(K key, V value) {
        if (key != null && value != null) {
            if (!(key.toString().isEmpty()) && !(value.toString().isEmpty())) {

                super.put(key, value);
            } else throw new NullPointerException();
        } else throw new NullPointerException();

    }

}
