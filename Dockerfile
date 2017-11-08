# Using the Payara Micro 5 snapshot build.
FROM payara/micro:5-SNAPSHOT
 
# Adds an application to be loaded
COPY target/webapp-test-1.0-SNAPSHOT.war $PAYARA_PATH
 
ENTRYPOINT ["java", "-jar", "/opt/payara/payara-micro.jar", "--deploy", "/opt/payara/webapp-test-1.0-SNAPSHOT.war"]

