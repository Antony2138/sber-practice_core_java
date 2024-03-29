package ru.sber.Generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class HashMap<K, V>  implements Map<K, V> {
    private final LinkedList<KeyValue<K, V>>[] buckets;

    private int size;


    private LinkedList<KeyValue<K, V>> getBucket(int index) {
        if (this.buckets[index] == null) {
            return (this.buckets[index] = new LinkedList<>());
        }

        return this.buckets[index];
    }

    private KeyValue<K, V> getByKey(Object key) {
        LinkedList<KeyValue<K, V>> bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (KeyValue<K, V> kvp : bucket) {
            if (Objects.equals(kvp.key, key)) {
                return kvp;
            }
        }
        return null;
    }

    private KeyValue<K, V> getByValue(V value) {
        for (LinkedList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (KeyValue<K, V> kvp : bucket) {
                if (Objects.equals(kvp.value, value)) {
                    return kvp;
                }
            }
        }

        return null;
    }

    public HashMap() {

        this.buckets = new LinkedList[16];
    }

    public int size() {

        return this.size;
    }

    public boolean isEmpty() {

        return this.size == 0;
    }

    public boolean containsKey(K key) {
        if (key == null) {
            return false;
        }

        return getByKey(key) != null;
    }

    public boolean containsValue(V value) {
        return getByValue(value) != null;
    }

    public V get(K key) {
        KeyValue<K, V> kvp = getByKey(key);

        if (kvp == null) {
            return null;
        }

        return kvp.value;
    }

    public V put(K key, V value) {
        LinkedList<KeyValue<K, V>> bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (int i = 0; i < bucket.size(); i++) {
            KeyValue<K, V> kvp = bucket.get(i);

            if (Objects.equals(kvp.key, key)) {
                V objectToReturn = kvp.value;
                bucket.set(i, new KeyValue<>(key, value));
                return objectToReturn;
            }
        }

        bucket.addLast(new KeyValue<>(key, value));
        this.size++;
        return null;
    }

    public V remove(K key) {
        LinkedList<KeyValue<K, V>> bucket = getBucket(Objects.hashCode(key) % buckets.length);
        Iterator<KeyValue<K, V>> it = bucket.iterator();
        int index = 0;

        while (it.hasNext()) {
            KeyValue<K, V> kvp = it.next();

            if (Objects.equals(kvp.key, key)) {
                KeyValue<K, V> previousKvp = bucket.removeAt(index);
                this.size--;
                return previousKvp.value;
            }

            index++;
        }

        return null;
    }

    public void clear() {
        Arrays.fill(this.buckets, null);
        this.size = 0;
    }

    public Collection<V> values() {
        ArrayList<V> newCollection = new ArrayList<>();

        for (LinkedList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (KeyValue<K, V> kvp : bucket) {
                newCollection.add(kvp.value);
            }
        }

        return newCollection;
    }

    public Collection<K> keySet() {
        ArrayList<K> newCollection = new ArrayList<K>();

        for (LinkedList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (KeyValue<K, V> kvp : bucket) {
                newCollection.add(kvp.key);
            }
        }

        return newCollection;
    }

    public Collection<KeyValue<K, V>> entrySet() {
        ArrayList<KeyValue<K, V>> newCollection = new ArrayList<>();

        for (LinkedList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (KeyValue<K, V> kvp : bucket) {
                newCollection.add(kvp);
            }
        }

        return newCollection;
    }
}
