package hibenitet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zihua.thibernate.many_to_one.HunterInfo;
import com.zihua.thibernate.many_to_one.User;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zihua on 17-1-7.
 */
public class Testttt {

    @Test
    public void test1(){
        User a=new User("zihua","66666");
        Set<HunterInfo> infos=new HashSet<HunterInfo>();
        HunterInfo i1=new HunterInfo(1,"YY","6666666");
        HunterInfo i2=new HunterInfo(2,"gg","6666666");
        HunterInfo i3=new HunterInfo(3,"tt","6666666");
        HunterInfo i4=new HunterInfo(4,"uu","6666666");
        infos.add(i1);
        infos.add(i2);
        infos.add(i3);
        infos.add(i4);
        a.setHunterInfos(infos);
        Gson gson=new GsonBuilder().create();
        System.out.println(gson.toJson(a));


    }
}
