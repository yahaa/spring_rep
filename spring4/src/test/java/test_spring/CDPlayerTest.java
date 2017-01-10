package test_spring;

import com.google.gson.Gson;
import com.zihua.spring_test.javadi.CDPlayerConfig;
import com.zihua.spring_test.autodi.CompactDisc;
import com.zihua.spring_test.autodi.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by zihua on 17-1-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Autowired
    private Gson gson;

    @Test
    public void cdshouldBeNotNull(){
        assertNotNull(cd);
        cd.play();
    }

    @Test
    public void play(){
        player.play();
        System.out.println(gson.toJson(player));
    }
}
