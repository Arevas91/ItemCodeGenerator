package com.company;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.company.Main.dataFormatter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Tests {

    @Test
    public void shouldDataFormatter() {
        String data1 = "test";

        int dataLength1 = 2;
        int dataLength2 = 5;
        int dataLength3 = 4;

        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        StringBuilder result3 = new StringBuilder();

        if (data1.length() < dataLength2) {
            result1.append("0".repeat(dataLength2 - data1.length()));
            result1.append(data1);
        } else if (data1.length() > dataLength2) {
            result2.append(data1, 0, dataLength2);
        } else {
            result3.append(data1);
        }

        assertEquals("0test", result1.toString());
        assertNotEquals("test", result2.toString());
        assertNotEquals("test", result3.toString());
    }

    @Test
    public void shouldGetCodeContainingCustomerCodeArticleCodeSizeSolution1() {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("kodKlienta", "12");
        resultMap.put("kodAsortymentu", "123456789");
        resultMap.put("kolor", "biały");
        resultMap.put("desen", "krata");
        resultMap.put("rozmiar", "xl");

        StringBuilder builder = new StringBuilder();
        builder
                .append("K")
                .append(dataFormatter(resultMap.get("kodKlienta"), 5))
                .append("A")
                .append(dataFormatter(resultMap.get("kodAsortymentu"), 7))
                .append(dataFormatter(resultMap.get("rozmiar"), 3));

        assertEquals("K00012A12345670xl", builder.toString());
        assertNotEquals("K00012A1234567890xl", builder.toString());
        assertNotEquals("K12A12345670xl", builder.toString());
        assertNotEquals("K00012A1234567xl", builder.toString());
    }

    @Test
    public void shouldGetCodeContainingCustomerCodeArticleCodeColorPatternSolution1() {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("kodKlienta", "12");
        resultMap.put("kodAsortymentu", "123456789");
        resultMap.put("kolor", "biały");
        resultMap.put("desen", "krata");
        resultMap.put("rozmiar", "xl");

        StringBuilder builder = new StringBuilder();
        builder
                .append("K")
                .append(dataFormatter(resultMap.get("kodKlienta"), 3))
                .append("A")
                .append(dataFormatter(resultMap.get("kodAsortymentu"), 10))
                .append(dataFormatter(resultMap.get("kolor"), 3))
                .append(dataFormatter(resultMap.get("desen"), 2));

        assertEquals("K012A0123456789biakr", builder.toString());
        assertNotEquals("K12A0123456789biakr", builder.toString());
        assertNotEquals("K012A123456789biakr", builder.toString());
        assertNotEquals("K012A0123456789białykr", builder.toString());
        assertNotEquals("K012A0123456789biakrata", builder.toString());
    }

    @Test
    public void shouldGetCodeContainingCustomerCodeArticleCodeSizeSolution2() {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("kodKlienta", "12");
        resultMap.put("kodAsortymentu", "123456789");
        resultMap.put("kolor", "biały");
        resultMap.put("desen", "krata");
        resultMap.put("rozmiar", "xl");

        String consumerCode = dataFormatter(resultMap.get("kodKlienta"), 5);
        String articleCode = dataFormatter(resultMap.get("kodAsortymentu"), 7);
        String size = dataFormatter(resultMap.get("rozmiar"), 3);

        String result = String.format("K%sA%s%s", consumerCode, articleCode, size);

        assertEquals("K00012A12345670xl", result);
        assertNotEquals("K12A12345670xl", result);
        assertNotEquals("K00012A1234567890xl", result);
        assertNotEquals("K00012A1234567xl", result);
    }

    @Test
    public void shouldGetCodeContainingCustomerCodeArticleCodeColorPatternSolution2() {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("kodKlienta", "12");
        resultMap.put("kodAsortymentu", "123456789");
        resultMap.put("kolor", "biały");
        resultMap.put("desen", "krata");
        resultMap.put("rozmiar", "xl");

        String consumerCode = dataFormatter(resultMap.get("kodKlienta"), 3);
        String articleCode = dataFormatter(resultMap.get("kodAsortymentu"), 10);
        String color = dataFormatter(resultMap.get("kolor"), 3);
        String pattern = dataFormatter(resultMap.get("desen"), 2);

        String result = String.format("K%sA%s%s%s", consumerCode, articleCode, color, pattern);

        assertEquals("K012A0123456789biakr", result);
        assertNotEquals("K12A0123456789biakr", result);
        assertNotEquals("K012A123456789biakr", result);
        assertNotEquals("K012A0123456789białykr", result);
        assertNotEquals("K012A0123456789biakrata", result);
    }
}
