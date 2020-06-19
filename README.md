# Spring Boot Oauth2


### 개발환경
* Java 8
* SpringBoot 2.2.1
* Gradle 
* JPA
* H2
#


### H2를 설치/구동이 필요합니다.
* https://www.h2database.com
* 다운로드 및 설치
* ../h2/bin/h2.sh 실행
* 데이터베이스 파일 생성 방법
  * jdbc:h2:~/coupon (최소 한번)
  * ~/coupon.mv.db 파일 생성 확인
  * 이후 부터는 jdbc:h2:tcp://localhost/~/coupon 로 접속하면 됩니다. 
#


###### Java KeyStore (JKS) 명령어 
* keytool -genkeypair -alias oauth2jwt -keyalg RSA -keypass oauth2jwtpass -keystore oauth2jwt.jks -storepass oauth2jwtpass
* keytool -list -rfc --keystore oauth2jwt.jks | openssl x509 -inform pem -pubkey
#


### References 
https://daddyprogrammer.org/post/1287/spring-oauth2-authorizationserver-database/



