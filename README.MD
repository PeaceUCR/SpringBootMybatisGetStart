# SpringBoot MyBatis Get Start

Ref: http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/ 
https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start 
https://github.com/mybatis/spring-boot-starter/tree/master/mybatis-spring-boot-samples

Please we can assign a sql at /resources folder to automatically run,
The Mapper will be here without @Autowire

we can use xml/annotation to config, this is use annotation
  
/domain, the model 

/mapper

  
/init, autowire/inject mapper to execute   


# POM
To use the MyBatis-Spring-Boot-Starter module, you just need to include the mybatis-spring-boot-autoconfigure.jar file and its dependencies(mybatis.jar, mybatis-spring.jar and etc ...) in the classpath.  

As you may already know, to use MyBatis with Spring you need at least an SqlSessionFactory and at least one mapper interface.

MyBatis-Spring-Boot-Starter will:

Autodetect an existing DataSource.
Will create and register an instance of a SqlSessionFactory passing that DataSource as an input using the SqlSessionFactoryBean.
Will create and register an instance of a SqlSessionTemplate got out of the SqlSessionFactory.
Autoscan your mappers, link them to the SqlSessionTemplate and register them to Spring context so they can be injected into your beans.

More details can be find at http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/