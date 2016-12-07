package org.throwable.st.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.throwable.st.Application;

import static org.junit.Assert.*;

/**
 * @author zhangjinci
 * @version 2016/12/7 21:03
 * @function
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void fetchById() throws Exception {
        System.out.println(userDAO.fetchById(1));
    }

}