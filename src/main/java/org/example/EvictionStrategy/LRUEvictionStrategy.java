package org.example.EvictionStrategy;

import java.util.*;

public class LRUEvictionStrategy implements CacheEvictionStrategy{

    private Deque<String> accessedOrderList;
    private Set<String> existingKeys;

    public LRUEvictionStrategy() {
        accessedOrderList = new LinkedList<>();
        existingKeys = new HashSet<>();
    }

    @Override
    public String evictKey() {
        String keyToBeRemoved = accessedOrderList.removeFirst();
        existingKeys.remove(keyToBeRemoved);
        return keyToBeRemoved;
    }

    @Override
    public void keyAccessed(String key) {
        if(existingKeys.contains(key)) {
            //Remove the key
            accessedOrderList.remove(key);
            accessedOrderList.addLast(key);
        }
        accessedOrderList.addLast(key);
        existingKeys.add(key);
    }

    @Override
    public List<String> getKeyFromLeastUsedToRecentUsed() {
        return accessedOrderList.stream().toList();
    }
}
