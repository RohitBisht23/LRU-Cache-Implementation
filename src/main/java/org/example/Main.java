package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Design and implements an in-memory cache that stores key-value  pairs and supports
        lest Recently used (LRU) eviction policy when the cache reaches it maximum capacity


        -- Requirements :-
         1-> get(key)
         2-> put(key, value)
         3-> should be in-memory
         4-> Have a fixed capacity
         5-> Use LRU eviction strategy
         6-> Generic key and value [Optional]
         7-> Thread safe [optional]




         2-> How LRU works

         capacity = 3
         put("1","apple")
         put("2", "ball")
         put("3", "Mango"), Cache full here

         put("4", "Papaya")  -> Max size reached, remove some key -> Removed Least recently used
         remove("1"),

         put("4", "payaya")

         final cache ->
         2-> ball,3-> mango, 4-> papaya

         get("2")

         put("5","Neem"), cache limit exceed,  remove LRU
         remove(3), because key 2 was used before

         final cache->
         3-> mango, 4-> papaya, 5-> Neem
         */

        CacheStartDemo cacheStartDemo = new CacheStartDemo();
        cacheStartDemo.start();

    }
}