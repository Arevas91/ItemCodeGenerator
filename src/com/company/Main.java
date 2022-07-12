package com.company;

import java.util.HashMap;
import java.util.Map;

import static com.company.Solution_1.*;
import static com.company.Solution_2.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Rozwiązania z Solution_1");
        System.out.println(getCodeContainingCustomerCodeArticleCodeSizeSolution1(getItem()));
        System.out.println(getCodeContainingCustomerCodeArticleCodeColorPatternSolution1(getItem()));
        System.out.println("-----");
        System.out.println("Rozwiązania z Solution_2");
        System.out.println(getCodeContainingCustomerCodeArticleCodeSizeSolution2(getItem()));
        System.out.println(getCodeContainingCustomerCodeArticleCodeColorPatternSolution2(getItem()));

    }

    public static Map<String, String> getItem() {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("kodKlienta", "12");
        resultMap.put("kodAsortymentu", "123456789");
        resultMap.put("kolor", "biały");
        resultMap.put("desen", "krata");
        resultMap.put("rozmiar", "xl");
        return resultMap;
    }

    public static String dataFormatter(String data, int dataLength) {
        StringBuilder builder = new StringBuilder();

        if (data.length() < dataLength) {
            builder.append("0".repeat(dataLength - data.length()));
            builder.append(data);
        } else if (data.length() > dataLength) {
            builder.append(data, 0, dataLength);
        } else {
            builder.append(data);
        }

        return builder.toString();
    }

}
