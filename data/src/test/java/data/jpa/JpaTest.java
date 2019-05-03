package data.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName JpaTest
 * @Description JPA 配置测试
 * @Author liux
 * @Date 19-5-3 下午3:47
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring_data_jpa.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JpaTest {

    @Autowired
    private LocalContainerEntityManagerFactoryBean entityManagerFactory;

    @Test
    public void testEntityManagerFactory() {
        assert entityManagerFactory != null;

        /*Map<String, Object> map = entityManagerFactory.getJpaPropertyMap();
        map.keySet().forEach(key -> {
            System.out.println(key + " : " + map.get(key));
        });*/

        /*JpaVendorAdapter jpaVendorAdapter = entityManagerFactory.getJpaVendorAdapter();
        System.out.println(jpaVendorAdapter.getJpaDialect());*/

        DriverManagerDataSource dataSource = (DriverManagerDataSource) entityManagerFactory.getDataSource();
        assert dataSource != null;
        System.out.println(dataSource.getUrl());
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
    }

    @Test
    public void test() {
        System.out.println();
    }
}
