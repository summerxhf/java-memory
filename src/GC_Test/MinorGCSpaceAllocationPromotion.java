package GC_Test;

/**
 * Created by xhf on 2017/4/14.
 * 空间分配担保
 * vm参数:-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails =XX:SurvivorRatio=8 -XX:=HandPromotionFailure
 */
public class MinorGCSpaceAllocationPromotion {
    private static  int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4,allocation5,allocation6,allocation7;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        
        allocation1 = null;

        allocation4 = new byte[2 * _1MB];
        allocation5 = new byte[2 * _1MB];
        allocation6 = new byte[2 * _1MB];

        allocation4 = null;
        allocation5 = null;
        allocation6 = null;

        allocation7 = new byte[2 * _1MB];
    }
}
