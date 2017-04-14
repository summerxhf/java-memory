package GC_Test;

/**
 * Created by xhf on 2017/4/14.
 * 动态对象年龄判断.
 * vm: -Xms20M
 -Xmx20M
 -Xmn10M
 -XX:+PrintGCDetails
 -XX:SurvivorRatio=8
 -XX:MaxTenuringThreshold=1
 -XX:+PrintTenuringDistribution
 *
 */
public class MinorGCDynamicAgeJudge {
    private static final  int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[_1MB /4];
        //allocation1 + allocation2 大于survivo空间一半
        allocation2 = new byte[_1MB /4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];




    }
}
