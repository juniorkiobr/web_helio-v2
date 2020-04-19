package com.company.projetoheliov2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class ProjetoHelioV2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoHelioV2Application.class, args);
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan(
						"com.company.projetoheliov2.models"
		);
		sessionFactory.setHibernateProperties(hibernateProperties());

		return sessionFactory;
	}

	@Bean
	public CorsFilter corsFilter() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		// Don't do this in production, use a proper list  of allowed origins
		config.setAllowedOrigins(Collections.singletonList("*"));
		config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept"));
		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

	@Bean
	public DataSource getDataSource()
	{
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create()
			.driverClassName("com.mysql.cj.jdbc.Driver")
			.url("jdbc:mysql://localhost:3306/projeto_Helio")
			.username("root")
			.password("password");

		return dataSourceBuilder.build();
	}

	@Bean
	public PlatformTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager transactionManager
				= new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

	private Properties hibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty(
				"hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty(
				"hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");

		return hibernateProperties;
	}
}
