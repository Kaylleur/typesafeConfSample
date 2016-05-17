import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Created by TO116676 on 17/05/2016.
 */
public class Main {


    public static void main(String[] args) {
        Config conf = ConfigFactory.load("simple");
        Config conf2 = ConfigFactory.load("complex");

        System.out.println(conf.getString("simple-lib.foo"));
        System.out.println(conf2.getString("test.foo"));


    }
}
