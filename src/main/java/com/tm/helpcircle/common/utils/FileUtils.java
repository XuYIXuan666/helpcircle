package com.tm.helpcircle.common.utils;


import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;


public class FileUtils {

    public static String fileUpload(MultipartFile file, String filePath,String exhibitionPath) {
        if (file.isEmpty()) {
            return "文件为空空";
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        fileName = System.currentTimeMillis() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename =exhibitionPath +fileName;
        return filename;
    }


}