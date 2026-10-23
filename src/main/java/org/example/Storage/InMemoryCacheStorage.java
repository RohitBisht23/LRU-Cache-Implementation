package org.example.Storage;

import java.util.Map;

public class InMemoryCacheStorage implements CacheStorage{
    private final Map<String, String> map;
    private  int CAPACITY;

    public InMemoryCacheStorage(Map<String, String> map, int capacity) {
        this.map = map;
        CAPACITY = capacity;
    }

    @Override
    public String get(String key) {
        return map.get(key);
    }

    @Override
    public void put(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void remove(String key) {
        map.remove(key);
    }

    @Override
    public boolean isFull() {
        return map.size() == CAPACITY;
    }
}
