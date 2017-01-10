package hibenitet;

<<<<<<< HEAD
import com.google.gson.Gson;
import com.google.gson.internal.LazilyParsedNumber;
=======
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
>>>>>>> 69b8a043109f2c786b72e10619931d1232beb5d7
import com.zihua.thibernate.bases.Boss;
import com.zihua.thibernate.bases.Employee;
import com.zihua.thibernate.many_to_many_o.Stud;
import com.zihua.thibernate.many_to_many_o.Teacher;
import com.zihua.thibernate.many_to_one.ClassRoom;
import com.zihua.thibernate.many_to_one.HunterInfo;
import com.zihua.thibernate.many_to_one.Student;
import com.zihua.thibernate.many_to_one.User;
import com.zihua.thibernate.one_to_many.Department;
import com.zihua.thibernate.one_to_many.Staff;
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

<<<<<<< HEAD
import javax.jws.soap.SOAPBinding;
import javax.persistence.Table;
=======

import java.util.Collection;
>>>>>>> 69b8a043109f2c786b72e10619931d1232beb5d7
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


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


        IDCard idcard = new IDCard("子华", "555556666677777");
        Address address = new Address("上海大学", "校内五号楼");
        Students s = new Students(1, new Date(), "18777859598",
                "男", "cs", 10, address, idcard);
        session.save(idcard);
        session.save(s);

    }

    @Test
    public void test6() {
        ClassRoom a = new ClassRoom("上海班", 1005);
        ClassRoom b = new ClassRoom("北大班", 1006);
        Student s1 = new Student(1001, "子华", a);
        Student s2 = new Student(1002, "小强", a);
        Student s3 = new Student(1003, "小哥", b);
        Student s4 = new Student(1004, "小狗", a);
        s1.setRoom(a);
        s2.setRoom(b);
        s3.setRoom(a);
        s4.setRoom(a);
        session.save(a);
        session.save(b);
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);

    }

    @Test
    public void test7() {
        Department dp1 = new Department("黑科技部门", 1000);
        Department dp2 = new Department("垃圾部门", 121212);


        Set<Staff> set1 = new HashSet<Staff>();
        Set<Staff> set2 = new HashSet<Staff>();

        Staff a = new Staff("小明", "111110");
        Staff b = new Staff("小张", "111111");
        Staff c = new Staff("小加", "111112");
        Staff d = new Staff("小分", "111113");
        Staff e = new Staff("小明", "111114");

        set1.add(a);
        set1.add(b);
        set2.add(c);
        set2.add(d);
        set2.add(e);

        dp1.setStaffs(set1);

        dp2.setStaffs(set2);

        session.save(a);
        session.save(b);
        session.save(c);
        session.save(d);
        session.save(e);

        session.save(dp1);
        session.save(dp2);

    }

    @Test
    public void test8() {

        Set<Teacher> set1 = new HashSet<Teacher>();
        Set<Teacher> set2 = new HashSet<Teacher>();

        Teacher a = new Teacher(11111, "老赵");
        Teacher b = new Teacher(11112, "老西");
        Teacher c = new Teacher(11113, "老罗");
        Teacher d = new Teacher(111114, "老跑");
        Teacher e = new Teacher(111115, "哈哈");

        set1.add(a);
        set1.add(b);
        set1.add(c);
        set2.add(e);
        set2.add(a);

        Stud s1 = new Stud(2221, "小强");
        Stud s2 = new Stud(2222, "华哥");
        s1.setTeachers(set1);
        s2.setTeachers(set2);

        session.save(s1);
        session.save(s2);
        session.save(a);
        session.save(b);
        session.save(c);
        session.save(d);
        session.save(e);


    }

    @Test
    public void test9() {
<<<<<<< HEAD
        User a = new User("子da", "666");
        session.save(a);

    }

    @Test
    public void test10() {
        User a = (User) session.createQuery("from User where userName = ?").setParameter(0, "子华").uniqueResult();
        HunterInfo list = new HunterInfo(1, "我是好人", "ttt");
        HunterInfo list2 = new HunterInfo(2, "卧槽奥圣诞节佛阿数据的反馈链接撒旦啊时间的康复拉数据反馈的垃圾收到", "jjj");
        list2.setAuthor(a);
        list.setAuthor(a);
        session.save(list);
        session.save(list2);
    }

    @Test
    public void test11() {
        User a = (User) session.createQuery("from User where userName = ?").setParameter(0, "子华").uniqueResult();
        Gson gson = new Gson();
        System.out.println(gson.toJson(a));
=======
        User a = new User("子华", "444444");
        session.save(a);

>>>>>>> 69b8a043109f2c786b72e10619931d1232beb5d7

    }

    @Test
    public void test10() {
        User a = (User) session.createQuery("from User where userName = ?")
                .setParameter(0, "子华").uniqueResult();
        GsonBuilder gson = new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                if (fieldAttributes.getName() == "author") return true;
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> aClass) {
                return false;
            }
        });
        gson.setPrettyPrinting();
        System.out.println(gson.create().toJson(a));


    }

    @Test
    public void test11() {
        User a = (User) session.createQuery("from User where userName = ?")
                .setParameter(0, "子华").uniqueResult();
        HunterInfo info = new HunterInfo(1, "老师", "中国好人通知同志你好");
        info.setAuthor(a);
        session.save(info);
    }

}



