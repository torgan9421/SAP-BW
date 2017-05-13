package com.th.kingpower.bw.connection.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author torgan.p 12 พ.ค. 2560 11:05:04
 *
 */

@Configuration
@EnableTransactionManagement
public class JdbcTemplateBw {
    
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(bwDataSource());
    }
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(emf);
        tm.setDataSource(bwDataSource());
        return tm;
    }
     @Bean
     @ConfigurationProperties(prefix = "spring.bw.datasource")
     public DataSource bwDataSource() {
      return DataSourceBuilder.create().build();
     }

    

}
