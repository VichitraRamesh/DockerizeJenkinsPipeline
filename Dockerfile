FROM tomcat:8

copy target/*.war /opt/tomcat/webapps/
