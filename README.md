Maven From aliyun  
`http://maven.aliyun.com/nexus/content/groups/public/`

Build by Spring Boot  
`java -jar crm-saas.jar`  
Add debug  
`java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n -jar *.jar`  
Set the vm args  
`export MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=128M`  
Run by maven  
`mvn spring-boot:run`  
Enable debug  
`mvn spring-boot:run --debug`  

when use the webapp,the import.sql must add classpath:



