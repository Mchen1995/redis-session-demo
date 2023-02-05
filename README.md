# redis-session-demo
* 打镜像： 在项目根目录下（和 pom.xml 同路径）执行：
```aidl
./mvnw spring-boot:build-image 
```

* 推送镜像： 执行：
```aidl
docker tag docker.io/library/redis-session-demo:0.0.1-SNAPSHOT dockerchenmin/redis-session:1.0
docker push dockerchenmin/redis-session:1.0 
```

* 本地打开 redis 客户端（redis 服务端使用容器部署，用 nodePort svc 暴露服务）：
```aidl
redis-cli -h 172.16.124.10 -p 30120
```
