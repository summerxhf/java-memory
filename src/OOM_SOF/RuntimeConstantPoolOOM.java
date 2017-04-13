package OOM_SOF;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xhf on 2017/4/12.
 * 方法区和运行时常量溢出.
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //使用list保持常量池的引用,避免full GC回收常量池行为.
        List<String> list = new ArrayList<String>();
        //10MB的PermSize在integer范围内足够产生OOM.
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
