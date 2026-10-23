package org.example;

import org.example.EvictionStrategy.CacheEvictionStrategy;
import org.example.EvictionStrategy.LRUEvictionStrategy;
import org.example.Storage.CacheStorage;
import org.example.Storage.InMemoryCacheStorage;

import java.util.HashMap;

public class CacheStartDemo {
    private CacheStorage storage = new InMemoryCacheStorage(new HashMap<>(), 3);
    private CacheEvictionStrategy evictionStrategy = new LRUEvictionStrategy();
    public void start() {
        processStartingFunctionality(storage, evictionStrategy);
    }


    private void processStartingFunctionality(CacheStorage storage, CacheEvictionStrategy evictionStrategy) {
        Cache cache = new Cache(storage, evictionStrategy);

        cache.put("Rohit", "Haldwani");
        cache.put("Rahul", "Haldwani");
        cache.put("Pawan", "Nainital");
        cache.printCache();

       // System.out.println("Getting cache :"+cache.get("Rohit"));
        cache.put("Ravan", "LAnka");

        cache.printCache();
        System.out.println(" Rohit--> :"+storage.get("Rohit"));
    }
}
