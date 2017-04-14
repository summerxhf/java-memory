package GC_Test;

/**
 * Created by xhf on 2017/4/14.
 * test 大对象直接进入老年代
 * 参数:
 *
 */
public class MinorGCTestBigObject {
    public static final int _1MB = 1024 * 1024;

    /**
     * vm参数:-Xms20M -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * -XX:PretenureSizeThreshold=3145728 (3M大于这个设置的对象直接在老年代中分配)
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4* _1MB];//直接分配在老年代中.

    }
}
