# webservice[![Build Status](https://travis-ci.org/tingna32/webservice.svg?branch=master)](https://travis-ci.org/tingna32/webservice)

1. 수동배포

   (1) Git에 commit

   (2) Clone을 진행 할 git 폴더 생성

   (3) EC2에서 commit된 설정파일 clone

   ```
    application.yml 수정
   ```

   (4) Commit 후 Git pull 

   ```
   ./gradlew test
   ```

   (5) Test가 완료되면 'BUILD SUCCESSFUL' 확인

   ​	#자신이 만든 폴더 확인 필수

   (6) 빌드를 자동화 할 수 있는 deploy.sh 생성

   ```
   nohup java -jar /home/ec2-user/app/build/webservice/webservice-0.0.1.jar &
   ```

   ```
   tail -f /home/ec2-user/app/build/webservice/nohup.out
   ```

   ```
   chomod 755 ./deploy.sh
   ```

   ```
   ps -ef|grep webservice
   ```

   (7) jar 생성 확인

   (8) EC2 8080 포트 열기

   (9) EC2 DNS로 접속

   ![](C:%5CUsers%5CLG%5CDesktop%5Cec2%EC%A0%91%EC%86%8D.JPG)