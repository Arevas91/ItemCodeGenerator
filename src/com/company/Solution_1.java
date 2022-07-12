package com.company;

import java.util.Map;

import static com.company.Main.dataFormatter;

public class Solution_1 {

    public static String getCodeContainingCustomerCodeArticleCodeSizeSolution1(Map<String, String> itemMap) {
        StringBuilder builder = new StringBuilder();
        builder
                .append("K")
                .append(dataFormatter(itemMap.get("kodKlienta"), 5))
                .append("A")
                .append(dataFormatter(itemMap.get("kodAsortymentu"), 7))
                .append(dataFormatter(itemMap.get("rozmiar"), 3));

        return builder.toString();
    }

    public static String getCodeContainingCustomerCodeArticleCodeColorPatternSolution1(Map<String, String> itemMap) {
        StringBuilder builder = new StringBuilder();
        builder
                .append("K")
                .append(dataFormatter(itemMap.get("kodKlienta"), 3))
                .append("A")
                .append(dataFormatter(itemMap.get("kodAsortymentu"), 10))
                .append(dataFormatter(itemMap.get("kolor"), 3))
                .append(dataFormatter(itemMap.get("desen"), 2));

        return builder.toString();
    }
}
