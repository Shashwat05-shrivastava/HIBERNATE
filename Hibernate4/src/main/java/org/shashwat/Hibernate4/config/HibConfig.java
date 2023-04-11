package org.shashwat.Hibernate4.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.shashwat.Hibernate4.entities.Emp;

public class HibConfig {
	public static SessionFactory getSessionFactory() {
		Configuration configuration= new Configuration();
		configuration.setProperties(hibernateProperties());
		configuration.addAnnotatedClass(Emp.class);
		return configuration.buildSessionFactory();
	}
	private static Properties hibernateProperties() {
		Properties properties=new Properties();
		properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/Hibernate");
		properties.put("hibernate.connection.username", "root");
		properties.put("hibernate.connection.password", "root");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", true);
		return properties;
	}
}