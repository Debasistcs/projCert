# Run container using below command
docker run -p 8082:80 php:v1

# IP & port need to change here in App.java
driver.get("http://3.83.128.111:8082");
