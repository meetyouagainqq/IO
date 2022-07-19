package com.javasm.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 15:34
 * @description
 */
public class Demo8 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() != 10) {
            int nextInt = random.nextInt(51);
            if (!list.contains(nextInt)) {
                list.add(nextInt);
            } else {
                list.remove(list.indexOf(nextInt));
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        try (FileWriter writer = new FileWriter("src/filetest/demotest.txt")) {
            list.forEach(str->{
                try {
                    writer.write(str+" ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
