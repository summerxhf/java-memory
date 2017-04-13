package OOM_SOF;

/**
 * Created by xhf on 2017/4/12.
 * 创建多个线程的时候导致内存溢出异常.
 * VM Args:-Xss2M (栈的内存容量,比单线程的时候设置大些)
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            dontStop();
                        }
                    });
            thread.start();

        }

    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
