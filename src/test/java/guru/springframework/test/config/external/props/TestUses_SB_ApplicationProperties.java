package guru.springframework.test.config.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = guru.test.config.external.props.ExternalPropsPropertySourceTestConfig.class)
@TestPropertySource("/application.properties")
public class TestUses_SB_ApplicationProperties {
    @Autowired
    Environment env;

    @Test
    public void testPropsSet() throws Exception {
        assertEquals("johan-var-1", env.getProperty( "johan.var1"));
        assertEquals(true, env.getProperty("spring.activemq.in-memory",Boolean.class));
        assertEquals(false, env.getProperty("spring.activemq.pooled",Boolean.class));
    }
}