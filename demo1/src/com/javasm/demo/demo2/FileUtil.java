package com.javasm.demo.demo2;

import java.awt.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月08日 21:20
 * @description
 */
public class FileUtil {
    private static final String PARENT_DIRECTORY_PATH = "upload/user/";

    private FileUtil() {

    }

    public static String getServePath(String imagePath) throws FileNotFoundException {
        Objects.requireNonNull(imagePath);
        String dateStr = LocalDate.now().toString();
        File file = new File(PARENT_DIRECTORY_PATH, dateStr);
        if (!file.exists()) {
            file.mkdirs();
        }
        //获得文件名唯一标志
        String photoId = UUID.randomUUID().toString().replaceAll("-", "");
        //获取文件后缀
        String extension = imagePath.substring(imagePath.lastIndexOf("."));
        //最终生成的文件后缀
        String targetImagePath = PARENT_DIRECTORY_PATH + dateStr + "/" + photoId + extension;
        FileInputStream fileInputStream = new FileInputStream(imagePath);
        FileOutputStream fileOutputStream = new FileOutputStream(targetImagePath);
        try (fileInputStream) {
            byte[] bytes = new byte[1024 * 5];
            int text;
            while ((text=fileInputStream.read())!=-1) {
                  fileOutputStream.write(bytes,0,text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return targetImagePath;

    }
}
