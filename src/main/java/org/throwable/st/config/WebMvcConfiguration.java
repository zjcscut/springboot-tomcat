package org.throwable.st.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.nutz.dao.impl.NutDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @author zhangjinci
 * @version 2016/12/5 18:36
 * @function
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {


    @Bean(name = "dao")
    public NutDao nutDao(DruidDataSource dataSource) {
        NutDao dao = new NutDao();
        dao.setDataSource(dataSource);
        return dao;
    }

    @Bean(name = "dataSource")
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis_demo");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidDataSource;
    }
}
