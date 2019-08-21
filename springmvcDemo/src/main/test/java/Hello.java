import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.concurrent.Callable;

/**
 * Created by zhang_htao on 2019/8/15.
 */
@Data
@AllArgsConstructor
public class Hello {
    private String name;

    public static void main(String[] args) throws Exception {
        /*ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Hello> submit = executorService.submit(new Race());
        Hello hello = submit.get();
        System.out.println(hello);*/
        shuzi shuzi = new shuzi();
        zimu zimu = new zimu();
        zimu.start();
        shuzi.start();


    }
}

class shuzi extends Thread{
    public static boolean running = false;
    private static void running(){
        running = true;
    }

    @Override
    public void run() {
        running();
        for (int i = 0; i < 26; i++) {
            synchronized ("jo"){
                System.out.println(i);
                "jo".notify();
                if(i<26){
                    try {
                        "jo".wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class zimu extends Thread{
    @Override
    public void run() {
        if(!shuzi.running){
            synchronized("jo"){
                "jo".notify();
                try {
                    "jo".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for(char i='a';i<'z';i++){
            synchronized ("jo"){
                System.out.println(i);
                "jo".notify();
                if(i<'z'){
                    try {
                        "jo".wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Race implements Callable<Hello> {
    @Override
    public Hello call() throws Exception {
        return new Hello("admin");
    }
}

@AllArgsConstructor
class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }

    @Setter
    private int name;

    @Override
    public void run() {
        System.out.println(name);
    }
}
