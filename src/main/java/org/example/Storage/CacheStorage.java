package org.example.Storage;

public interface CacheStorage {

    public String get(String key);
    public void put(String key, String value);
    public void remove(String key); // remove key
    public boolean isFull(); //is cache full or not

}
