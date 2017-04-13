import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by xhf on 2017/4/12.
 * 本机内存直接溢出.
 * -Xmx20M -XX:MaxDirectMemorySize=10M
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }
}
