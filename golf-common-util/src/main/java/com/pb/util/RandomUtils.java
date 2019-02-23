package com.pb.util;

import java.util.Random;

public class RandomUtils {

    /*
     * @Author: sunmingjun
     * @Description:产生一个11位的会员卡号
     * @param :
     * @Date: 16:17 2019/2/23
     */
    public static  Long RandomCreate() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            stringBuffer.append(random.nextInt(10));
        }
        Long cardNumber =Long.parseLong(stringBuffer.toString());
        return cardNumber;
    }

    public static void main(String[] args) {
        System.out.println(RandomCreate());
    }
}
