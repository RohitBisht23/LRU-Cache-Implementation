package org.example.EvictionStrategy;

import java.util.List;

public interface CacheEvictionStrategy {

    public String evictKey();
    public void keyAccessed(String key);// recently accessed key
    public List<String> getKeyFromLeastUsedToRecentUsed();
}
