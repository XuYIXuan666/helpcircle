package com.xm.helpcircle.common.utils;

import com.xm.helpcircle.DemoApplication;
import org.apache.http.client.utils.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.util.unit.DataUnit;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Code 生成器
 */
public class CodeGenerator {


    /**
     * 单号生成
     * 13位时间戳 + 三位随机数
     * @param no
     */
    public static String getOrderNo(String no) {
        long timeMillis = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmsszzz");
        String prefix = no +"_"+ sdf.format(timeMillis);
        return prefix + getRandom(32 - prefix.length());
    }

    /**
     * 生成固定长度随机码
     *
     * @param n 长度
     */
    public static long getRandom(long n) {
        long min = 1, max = 9;
        for (int i = 1; i < n; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min;
        return rangeLong;

    }

    /**
     * useNO
     * @return
     */
    public static String getOrderNo() {
        long timeMillis = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmsszzz");
        String prefix = sdf.format(timeMillis);
        return prefix + getRandom(32 - prefix.length());
    }

    public static void main(String[] args) {
        System.out.println(getOrderNo());
    }
}
