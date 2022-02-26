package org.bluebird.quiz.applicationContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ApplicationContextTest {

    @Inject
    @Named("firstQuery")
    String query;

    @Inject
    @Named("createTable")
    String table;

    @Inject
    @Named("dataSource")
    DataSource ds;

    @Test
    public void firstDependencyInjection(){
        //given
        //when
        //then
        Assert.assertNotNull(query);
    }

    @Test
    public void createTableTest() throws SQLException {
        //give
        Connection connection = ds.getConnection();
        PreparedStatement pr = connection.prepareStatement(table);
        pr.execute();
        //when
        //then
        Assert.assertNotNull(table);
        Assert.assertNotNull(ds);
    }


}
