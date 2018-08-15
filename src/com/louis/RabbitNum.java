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
     * 设当前第i个月，这个月的兔子总数，大致可以分为两部分，一部分是非新生的，另一部分是当月新生的。
     * 非新生的应该是第i-1个月的兔子总数，新生的取决于第i-2个月的兔子总数。
     * 即兔子[i]=兔子[i-1]+兔子[i-2]。于是，各个月的兔子数就形成了一个斐波那契数列：
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
