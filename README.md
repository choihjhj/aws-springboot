# 📖 스프링 부트와 AWS로 혼자 구현하는 웹 서비스
이 프로젝트는 **Springboot**와 **AWS**, **간단한 소셜 로그인 api(구글, 네이버)** 연동을 활용해 보고자 만든 **커뮤니티 게시판 사이트**입니다.          
사용자는 소셜 로그인(구글, 네이버)이 가능하고, 게시글 작성 및 수정/삭제가 가능하도록 구현하였습니다.   

<!--
왜 h2디비썼는지나 RDS 마리아DB썼는지 배포는 왜 ec2며 이런거 내용 공부해서 쓰기
-->
<br>
       
## 💻 개발 환경
     
![image](https://github.com/choihjhj/aws-springboot/assets/148078504/fbb43120-6b7c-41e1-a9ba-b94c82b7dc21)
    
- **Java** : JDK 11
- **Editor** : Intellij IDEA
- **Database** : h2, MariaDB
- **Gradle 8.3**<br>
<br>
     
**Backend**
- **Spring Boot 2.7.17**
- **Spring Data JPA**
- **Spring Security**
- **oauth2-client 2.7.17**<br>
<br>
    
**Frontend**
- **Bootstrap 4.3.1**
- **Thymeleaf 2.7.17**<br>
<br>
   
**배포**
- **EC2**
  <br>
  <br>
## 🧩 H2 DB 실습 url
jdbc:h2:mem:testdb
<br>
<br>
<br>
   
## 🌱 웹 서비스 메인 화면
![image](https://github.com/choihjhj/aws-springboot/assets/148078504/2d78e1a1-a8f1-4ffe-8288-5bad09919f8f)
### 🌱 게시글 등록 및 결과 화면
![image](https://github.com/choihjhj/aws-springboot/assets/148078504/491bd0f2-e4bb-4dc7-9b28-1e2c70b0a1ee)
![image](https://github.com/choihjhj/aws-springboot/assets/148078504/7e0d4e57-76e6-4ed6-bf2f-00931456e3d2)
### 🌱 게시글 수정 및 삭제 화면
![image](https://github.com/choihjhj/aws-springboot/assets/148078504/40c39bad-35d4-44b3-8464-e4d202acbb40)





