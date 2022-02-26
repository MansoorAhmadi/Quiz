package org.bluebird.quiz.applicationContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ApplicationContextTest {

    @Inject
    @Named("firstQuery")
    String query;

    @Test
    public void firstDependencyInjection(){
        //given
        //when
        //then
        Assert.assertNotNull(query);
    }


}
