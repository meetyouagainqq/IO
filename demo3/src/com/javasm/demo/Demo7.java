package com.javasm.demo;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 14:53
 * @description
 */
public class Demo7 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/filetest/stringcount.txt");
        if (!file.exists()) {
            System.out.println("文件不存在");
        }
        FileInputStream inputStream = new FileInputStream(file);
        Map<Character, Integer> map = new HashMap<>();
        byte[] bytes = new byte[1024 * 5];
        inputStream.read(bytes);
        String str = new String(bytes);
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char c = str.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                continue;
            } else if (map.containsValue(c)) {
                map.put(c, ++count);
            } else {
                map.put(c, count);
            }
        }
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });

    }
}
