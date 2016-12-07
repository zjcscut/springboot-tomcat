package org.throwable.st.dao;

import org.nutz.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.throwable.st.entity.User;

/**
 * @author zhangjinci
 * @version 2016/12/7 21:01
 * @function
 */
@Repository
public class UserDAO {

    @Autowired
    private Dao dao;

    public User fetchById(Integer id) {
        return dao.fetch(User.class, id);
    }
}
