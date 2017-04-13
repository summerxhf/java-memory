/**
 * Created by xhf on 2017/4/12.
 * 虚拟机栈和本地方法栈OOM test (Out Of Memory Error) 单个线程
 * VM args:-Xss 128K
 */
public class JavaVMStackSOF {
    private  int stackLength = 1;
    public  void stackLeak(){
        stackLength++;
        stackLeak();//递归调用
    }

    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:" + oom.stackLength);
            throw  e;
        }
    }
}
