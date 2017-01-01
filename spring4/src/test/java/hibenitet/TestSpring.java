package hibenitet;

import com.zihua.spring_test.atimport.Bossmer;
import com.zihua.spring_test.atimport.AllConfig;
import com.zihua.spring_test.atimport.Customer;
import com.zihua.spring_test.di.Man;
import com.zihua.spring_test.outputImplement.Outputer;
import com.zihua.spring_test.sayImp.Say;
import com.zihua.spring_test.sayImp.Sayconfig;
import com.zihua.thibernate.bases.Boss;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zihua on 16-12-26.
 */
public class TestSpring {
    @Test
    public void test() {
        Boss hong = new Boss("hong", 3);
        ApplicationContext context = new ClassPathXmlApplicationContext("/springconfig/beans.xml");
        Outputer a = (Outputer) context.getBean("outer");
        a.output(hong);

        Man jack= (Man) context.getBean("jack");
        jack.fly();

    }

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Sayconfig.class);
        Say say = (Say) context.getBean("sayMany");
        say.say("hahahhaha");
    }

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
        Bossmer zihua = (Bossmer) context.getBean("zihua");
        Customer jeek = (Customer) context.getBean("jeek");
        zihua.printMsg("haha");
        jeek.printMsg("jjjjj");

    }
}
