/**
 * Created by zhang_htao on 2019/8/15.
 */
public class ThreadJoinTest {

    public static void main(String[] args) throws Exception{
        JoinTestThread joinTestThread = new JoinTestThread();
        joinTestThread.start();
        for (int i = 0; i < 500; i++) {
            if(i == 50){
                joinTestThread.join();
            }
            System.out.println(Thread.currentThread().getName() + "执行： " + i );
        }
    }
}


class JoinTestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(currentThread().getName() + "执行: "+ i);
        }
    }
}
