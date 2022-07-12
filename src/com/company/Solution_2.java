package com.company;

import java.util.Map;

import static com.company.Main.dataFormatter;

public class Solution_2 {

    public static String getCodeContainingCustomerCodeArticleCodeSizeSolution2(Map<String, String> itemMap) {
        String consumerCode = dataFormatter(itemMap.get("kodKlienta"), 5);
        String articleCode = dataFormatter(itemMap.get("kodAsortymentu"), 7);
        String size = dataFormatter(itemMap.get("rozmiar"), 3);

        return String.format("K%sA%s%s", consumerCode, articleCode, size);
    }

    public static String getCodeContainingCustomerCodeArticleCodeColorPatternSolution2(Map<String, String> itemMap) {
        String consumerCode = dataFormatter(itemMap.get("kodKlienta"), 3);
        String articleCode = dataFormatter(itemMap.get("kodAsortymentu"), 10);
        String color = dataFormatter(itemMap.get("kolor"), 3);
        String pattern = dataFormatter(itemMap.get("desen"), 2);

        return String.format("K%sA%s%s%s", consumerCode, articleCode, color, pattern);
    }
}
