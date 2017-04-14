package GC_Test;

/**
 * Created by xhf on 2017/4/14.
 * minor gc test
 * vm参数:-verbose:gc -Xms20M -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * 不同的收集器,有不同的使用.
 */
public class MinorGCTest {
    private static  final int _1MB = 1024 * 1024;

    /**
     * vm
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation1 ,allocation2 ,allocation3,allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];//出现一次minor gc
        System.out.print("");

    }
}
