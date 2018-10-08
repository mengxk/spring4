package test.com.example.service.impl;

import com.example.config.CDPlayerConfig;
import com.example.service.CDPlayerService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CDPlayerServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 1, 2018</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerServiceImplTest {

    @Autowired
    private CDPlayerService cdPlayerService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: play()
     */
    @Test
    public void testPlay() throws Exception {
//TODO: Test goes here...
        //assert(cdPlayerService == null);
        cdPlayerService.play();
    }


} 
