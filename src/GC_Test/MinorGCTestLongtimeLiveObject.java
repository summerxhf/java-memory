package GC_Test;

/**
 * Created by xhf on 2017/4/14.
 * minor Gc test for 长期存活的对象进入老年代.
 * vm参数:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:survivorRatio=8 -XX:MaxTenuringThreshold=1
 * 打印:-XX:+PrintTenuringDistribution
 * MaxTenuringThreshold设置年龄.
 */
public class MinorGCTestLongtimeLiveObject {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB / 4];
        //什么时候进入老年代取决于MaxTenuringThreshold设置.
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];


    }
}

