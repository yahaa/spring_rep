package hibenitet;

import com.zihua.thibernate.bases.Boss;
import com.zihua.thibernate.bases.Employee;
import com.zihua.thibernate.one_to_one.Address;
import com.zihua.thibernate.one_to_one.IDCard;
import com.zihua.thibernate.one_to_one.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;


/**
 * Created by zihua on 16-12-23.
 */
public class Testhi {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {

        Configuration config = new Configuration().configure("/hibernate/hibernate.cfg.xml");
        sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

    }

    @After
    public void destroy() {
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void test() {
        //添加和查询工人，老板
        Boss zhang = session.get(Boss.class, 1);
        Employee t = new Employee("RT", 7);
        Employee r = new Employee("JG", 8);

        zhang.addEmpl(t);
        zhang.addEmpl(r);
        session.save(t);
        session.save(r);

    }

    @Test
    public void test2() {
        //查询老板，老板所管的学生
        Boss hua = session.get(Boss.class, 1);
        for (Employee a : hua.getEmps()) {
            System.out.println(a);
        }

    }

    @Test
    public void test3() {
        //修改员工的信息
        Boss hong = new Boss("hong", 3);
        Employee a = session.get(Employee.class, 2);
        hong.addEmpl(a);
        session.save(hong);
    }

    @Test
    public void test4() {
        Employee a = session.get(Employee.class, 2);
        session.delete(a);
    }

    @Test
    public void test5() {


        //SimpleDateFormat a=new SimpleDateFormat("yyyy-mm-dd");
        IDCard idcard = new IDCard("子华", "555556666677777");
        Address address = new Address("上海大学", "校内五号楼");
        Students s = new Students(1, new Date(), "18777859598",
                "男", "cs", 10, address, idcard);
        session.save(idcard);
        session.save(s);

    }

    @Test
    public void test6() {

    }

}



