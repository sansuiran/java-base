package com.rank.base.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * map test
 */
public class MapRank {

    public static void main(String[] args) {

    }

    //HashMap Vs. synchronizedMap Vs. ConcurrentHashMap
    public void createMap() {
        //Hashtable
        Map<String, String> normalMap = new Hashtable<String, String>();

        //synchronizedMap
        Map<String, String> synchronMap = Collections.synchronizedMap(new HashMap<String, String>());

        //ConcurrentHashMap
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
    }
}
