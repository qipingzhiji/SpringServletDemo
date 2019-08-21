/**
 * Created by zhang_htao on 2019/8/15.
 */
public class Sington {
    private static Sington instance = null;
    private Sington(){}

    public Sington getInstance(){

        if(instance == null) {
            synchronized (Sington.class) {
                if (instance == null) {
                    instance = new Sington();
                }
            }
        }
        return instance;
    }
}
