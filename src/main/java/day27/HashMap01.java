package day27;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {
        Map<String, Integer> hMap = new HashMap<>();

        hMap.put("A", 12);
        hMap.put("B",35);
        hMap.put("r", 6);

        hMap.put(null, 13);

        hMap.get("r");

    }
}
