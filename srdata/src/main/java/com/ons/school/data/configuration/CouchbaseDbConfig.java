package com.ons.school.data.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "couchbaseEntityManagerFactory",
        transactionManagerRef = "couchbaseTransactionManager",
        basePackages = "com.ons.school.data.couchbase"
)
public class CouchbaseDbConfig {


    @Bean
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource mysqlDatasource(){
        return DataSourceBuilder.create().build();

    }

    @Primary
    @Bean(name = "couchbaseEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    mysqlEntityManagerFactory(EntityManagerFactoryBuilder builder){

        return builder.dataSource(mysqlDatasource())
                .packages("com.ons.school.data.couchbase.entity")
                .persistenceUnit("couchbaseDB").build();

    }


    @Primary
    @Bean(name = "couchbaseTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("couchbaseEntityManagerFactory") EntityManagerFactory
                    entityManagerFactory
    ) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
