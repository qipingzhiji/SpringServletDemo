/**
 * Created by zhang_htao on 2019/8/15.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket,"甲");
        Thread thread2 = new Thread(ticket,"乙");
        Thread thread3 = new Thread(ticket,"丙");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Ticket implements Runnable{
    private int tickets = 10;
    private boolean flag = true;
    @Override
    public void run() {
        while (flag){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buyTicket();
        }
    }
    public synchronized void buyTicket(){
        if(tickets<=0){
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread().getName() + "抢到了" + tickets--);
    }
}