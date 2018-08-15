package com.louis;

/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的总兔子对数为多少？
 */
public class RabbitNum {

    public static void main(String[] args) {
        RabbitNum rabbitNum = new RabbitNum();
        System.out.println(rabbitNum.getRabbitNum(8));
    }

    /**
     *
     * @param month 第几个月
     * @return 本月兔子对数
     */
    public int getRabbitNum(int month) {
        int rabbitNumb = 1;
        if (month > 0 && month < 3) {
            return rabbitNumb;
        } else {
            return getRabbitNum(month - 1) + getRabbitNum(month - 2);
        }
    }
}
