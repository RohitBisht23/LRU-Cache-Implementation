package org.example;

import org.example.EvictionStrategy.CacheEvictionStrategy;
import org.example.Storage.CacheStorage;

import java.util.List;

public class Cache {

    private final CacheStorage storage;
    private final CacheEvictionStrategy evictionStrategy;

    public Cache(CacheStorage cacheStorage, CacheEvictionStrategy evictionStrategy) {
        this.storage = cacheStorage;
        this.evictionStrategy = evictionStrategy;
    }

    public String get(String key) {
        String value = this.storage.get(key);
        evictionStrategy.keyAccessed(key);
        return value;
    }

    public void put(String key, String value) {
        if(storage.isFull() && storage.get(key) == null) {
            System.out.println("Cache full need to removed least recently used key");
            String keyToBeRemoved = evictionStrategy.evictKey(); //Get the removing key
            System.out.println("Key getting removed is :"+keyToBeRemoved);
            storage.remove(keyToBeRemoved); //Remove that key
        }
        this.storage.put(key, value);
        this.evictionStrategy.keyAccessed(key);
    }

    public void printCache() {
        List<String> keys = evictionStrategy.getKeyFromLeastUsedToRecentUsed();

        for(String key : keys) {
            System.out.print("Key is :"+key+" value :"+storage.get(key)+" ----->");
        }
        System.out.println();
    }

}


//in-memory cache --> Map<String, String> which can store the key and value pairs in every language
//LRU eviction
