package com.app.happygraph.model;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class DataStore {

    public static List<HappyIndex> getDataStore() {
        List<HappyIndex> happyIndices = new ArrayList<>();
        String[] users = {"TS", "MT", "VT", "ST"};
        Random rand = new Random();
        Arrays.stream(users).forEach(user -> {
                    for (int i = 0; i < 5; i++) {
                        happyIndices.add(new HappyIndexBuilder().setId(UUID.randomUUID().toString())
                                .setUserName(user)
                                .setIndexValue(rand.nextInt(9) + 1)
                                .setIndexDate(Date.from(Instant.now().minus(Duration.ofDays(i))))
                                .setDescription(user + " added index value on " + new Date())
                                .setCreatedDate(new Date())
                                .setUpdateDate(new Date()).build());
                    }
                }
        );
        happyIndices.sort(Comparator.comparing(HappyIndex::getUserName).thenComparing(HappyIndex::getIndexDate));
        return happyIndices;
    }
}