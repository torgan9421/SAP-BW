/**
 * 
 */
package com.th.kingpower.bw.configuration;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author torgan.p 6 ต.ค. 2559 17:48:30
 *
 */
@Configuration
@EnableJpaRepositories("com.th.kingpower.bw")
@EnableTransactionManagement
public class JpaApplicationConfig {

	 final static Logger logger = LoggerFactory.getLogger(JpaApplicationConfig.class);
	  @Autowired
	  private Environment env;
	    

	  @Bean
	  @Primary
	  @ConfigurationProperties("spring.datasource")
	  public DataSource dataSource(){
	    return DataSourceBuilder.create().build();
	  }
	  
	    @Bean
	    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	        Properties properties = new Properties();
	        properties.setProperty("hibernate.default_schema","dbo");
	        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	        factory.setJpaVendorAdapter(vendorAdapter);
	        factory.setPackagesToScan("com.th.kingpower.bw");
	        factory.setDataSource(dataSource());
	        factory.setJpaProperties(properties);
	        return factory;
	    }

	    @Bean
	    public PlatformTransactionManager transactionManager(EntityManagerFactory emf, DataSource dataSource) {

	        JpaTransactionManager tm = new JpaTransactionManager();
	        tm.setEntityManagerFactory(emf);
	        tm.setDataSource(dataSource);

	        return tm;
	    }
	}