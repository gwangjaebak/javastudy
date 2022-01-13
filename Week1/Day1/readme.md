- 작업전 파일들
    
    [bbs.zip](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5169b3ed-4b8f-404a-ad76-1f218fc0de69/bbs.zip)
    
    [edu.zip](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dfc17e75-5150-4423-b421-8e95cece376a/edu.zip)
    
    [mvc.zip](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cac231d1-c947-4caa-b48f-de0147b95956/mvc.zip)
    
    [Servers.zip](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/637ba730-3417-4b13-897e-343387010dd1/Servers.zip)
    

- 09:00~10:00
    
    J2EE(JavaEE) : Enterprise Edition
    
    Java SE → JVM (java.exe, java) , Java API (util, network, io, ...) → JDK / JRE
    
    [JVM 메모리 구조](https://steady-coding.tistory.com/305), [JVM 메모리 구조 및 할당과정](https://inspirit941.tistory.com/294)
    
    기술발전의 맥락 → history
    
- 10:00~11:00
    
    [Internet vs Web](https://www.geeksforgeeks.org/whats-difference-internet-web/)
    
    실리콘 그래픽스 : openGL
    
    Servlet/JSP → 객체지향 조건에 맞게 구현 필요
    
    WAS(Web Application Server) → Servlet Container (tomcat ... )
    
    서버란? 1. 서버 컴퓨터 2. 서버 어플리케이션(데몬) 
    
    Java application 이란? (안대혁강사님) 무조건 클래스로만 되어있다. 서버건 웹이건 모바일이건 아무튼!!!!
    
    근데 객체지향 → 구조가 중요. 객체들이 가지는 역할들이 중요하다.
    
    유지보수, 확장(extension)... 객체지향 설계 원칙 및 이유 
    
    [SOLID원칙](https://devlog-wjdrbs96.tistory.com/380)
    
    MVC → 구조를 잡는 것... 사실은 서블릿에 다 들어가도 되는데 역할들을 나누어 놓는다. 
    
    Java Web Programming = Servlet Programming
    
    RDBMS → java application으로 잘 지원해야한다... → JDBC(Java Database Connectivity)
    
    Interface 설계...
    
    분산환경 (대용량 서비스를 위한 처리)
    
    객체들을 이동시켜주는 Distribute? [RMI](https://3dmpengines.tistory.com/283) , [EJB??](https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=leon1983&logNo=140064002437), [EJB장단점](https://twer.tistory.com/entry/EJB-%EC%97%94%ED%84%B0%ED%94%84%EB%9D%BC%EC%9D%B4%EC%A6%88-%EC%9E%90%EB%B0%94%EB%B9%88%EC%A6%88)
    
    [Weblogic](https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=ailov&logNo=60151010900), [Websphere](https://blog.naver.com/cutesboy3/40144501600) // [Weblogic vs WebSphere](https://ko.strephonsays.com/weblogic-and-vs-websphere-2221)
    
    아키텍쳐 : DAO , Controller, VO, jsp 등을 나누어주는 MVC 구조나 Layer를 쌓아 체계를 잡는 것들을 아키텍쳐라고 명명함.
    
    JSP MVC 패턴 ...
    
    하나의 책임을 가지는 클래스를 만드는 순간 객체지향에 대해 이해도가 높다고 말할 수 있다. → SOLID 원칙 준수 , 최종목적이 아키텍쳐가 되는 개발자가 될 수 있도록 노력하자!!! 
    
    이미 만들어진 아키텍쳐에 대해서도 제대로 이해하고 쓸 수 있도록 많이 하기...
    
    성장을 위한 방법과 요구사항 분석(기술)에 대한 능력을 더욱 키워야한다.
    
- 11:00~12:00
    
    
    객체에 대한 제어 : Inversion of Control project (IoC)
    
    Spring → 객체를 관리하는 컨테이너일뿐... Servlet도 마찬가지
    
    개발자가 객체관리를 편하게 쓰기 위해 컨테이너를 쓴다.
    
    왜 관계가 생겼을까? → 객체벼롤 클래스를 나누었으니까
    
    정규화??? 관계가 생긴다는 의미는 서로 분리를 했다는 의미이다.
    
    CRUD Servlet를 DAO로 빼냄. 그러면 각자 의존성이 생김. 
    
    객체지향의 설계 원칙이 서로 분리함으로써 역할을 부여하기 때문이다. 따라서 각자의 역할에 맡는 의존관계가 생긴다. 
    
    객체 세팅방법 : new, setter를 써서 쓴다??
    
    이런 객체의존관계가 계속 늘어나게 되면? → 인간이 제어할 수 있는 범위를 넘어선다.
    
    따라서 개발자는  DAO에 비지니스 로직을 잘 제어해야한다. 나머지는 컨테이너에게 맡긴다.
    
    모든 의존관계에 new, setter를 하게된다면 엄청나게 복잡해짐.
    
    기업들의 비지니스를 관리하는 자바 객체(Bean, ... Maybe Object?) 집단을 관리해줄 컨테이너가 필요.  응용개발자는 컨테이너들의 관계를 정의해 용도에 맞게 쓸 뿐...
    
    Servlet Container - EJB Container (비지니스 로직이 포함된 컨테이너)
    
    WAS → servlet 뿐만아니라 EJB까지 처리해주는 container가 weblogic, webshphere ... 다. tomcat은 servlet만 처리. 근데 요즘엔 EJB를 안써서 tomcat을 다시 쓰기 시작.
    
    그러면 왜 EJB는 안쓰게 된걸까? 정확히는 EJB 컨테이너가 안쓰이게 된 이유??
    
    우선 객체지향의 상속/인터페이스 관계에 대해 알아보자. 
    
    음식(추상명사) → 짜장면, 제육, whatever...
    
    ~가 가지고 있는 공통적 특징을 정리한 것 : 추상화
    
    자바 IO에 대해 학습할 필요성이 있음. → IO input : read / output : write 그래서 추후에 용도에 맞게 오버라이딩으로 재정의
    
    상속은 재사용성때문에 하는것도 있지만 확장이 필요해서 쓰는 것도 있다. 따라서 이 특성이 곧 컨테이너에 쓰인다고 볼 수 있다. 
    
    EJB → 쉽게 쓰려고 쓰던 건데 각자 지원하는 서버간에서 규모가 커지다보니까 쉽게 쓰려고 하던 도구에 불과한 EJB가 호환성 - 복잡성 문제에 의해 쓰지않게 됨. 따라서 WAS가 어떤 WAS냐에 따라 돌아가는 서비스, 안돌아가는 서비스가 생기면서 문제가 더욱 커지게 됐다.
    
    그 와중에 EJB를 쓰지만 EJB컨테이너가 주던 강제성에서 벗어난 POJO가 생기게 된다.
    
    따라서 여기서 생긴게 Spring Container라 부른다.
    
    따라서 WAS는 Servlet만 하고 Spring Container에서 다른 부분들을 지원해주도록 함.
    
    그러면 tomcat에 Spring Container를 쓴다? 오히려 좋아(더좋음 ㄹㅇ)
    
    기반은 Spring Container → 자바 어플리케이션을 만들때 객체를 관리해주는 라이브러리임.
    
    - 백엔드 개발 프레임워크 top4(2021.02기준)
        
        [https://devsnote.com/writings/2122](https://devsnote.com/writings/2122)
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a215a237-8fdd-4d2f-ba93-af88cfa8f0ee/Untitled.png)
        
    
    개발 설정을 자동으로 해주면 어떨까... Spring Boot 
    
    그 전에 어떻게 자동화가 되어가는지 알아야한다. ㅠ
    
    Spring MVC에서 어떻게 쓰는지에 대한 구조를 먼저 이해하는게 중요하다.
    
    데이터를 결국 렌더링하기 위함 → HTML로 보여줘야하니까!!!!!
    
    [SSR, CSR 이란?](https://proglish.tistory.com/216)
    
    지금은 데이터만 던지고 HTML 렌더링이 될 수 있도록 함.
    
    → 동기 / 비동기의 상황인거? → 그건 아님 CSR은 client 단에게 json으로 보내서 렌더링 시키는거임
    
- 12:00~13:00
    
    DAO가 나중엔 Spring Container에 들어간다고 생각하면 된다.
    
    SSR (Server Side Rendering) → HTML + Data
    
    Browser(Client) : DOM이 제일 중요
    
    통신프로그램... → JavaScript
    
    JVM마냥 Browser에는 JavaScript Engine이 필요하다...! [자바스크립트엔진](https://edu.goorm.io/learn/lecture/557/%ED%95%9C-%EB%88%88%EC%97%90-%EB%81%9D%EB%82%B4%EB%8A%94-node-js/lesson/174354/%EC%9E%90%EB%B0%94%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8-%EC%97%94%EC%A7%84%EC%9D%B4%EB%9E%80)
    
    data가 원래는 Servlet에 있어서 Java가 Rendering 했었는데 결국 돌아가는 곳은?
    
    Client단...?
    
    JavaScript가 통신뿐만아니라 DOM manipulation이 된다는 것~
    
    DOM API를 잘 알아야 조작을 잘할 수 있다.
    
    JQuery를 잘알아야? 요즘엔... 
    
    DOM programming 
    
    클라이언트 단에서 C/C++/C#, .NET이 필요한 이유?
    
    JavaScript가 아니라... OS kernel  → client browser단에서는 javascript만 쓰는게 맞음
    
    NetScape → Browser의 근본
    
    [ECMA란](https://ko.wikipedia.org/wiki/ECMA%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8) → ECMA Script
    
    업계표준이 된다는것... → 대표적인 예 : CD(음원저장 표준매체), JavaScript(브라우징 표준)
    
    문법체계(C/C++/... ??) + 엔진을 심은 브라우저를 개발해야하게 됨...
    
    1.0, 2.0, 3.0 , ~~4.0~~   ajax → 5.0 → ES6(ECMA Script 6) → 7,8 혹은 년도가 붙음
    
    싸우지말고 협력하자...? → ES Harmony
    
    프로그래밍 언어가 되려면 모듈화해서 동작할 수 있어야한다. 
    
    js는 지원이 안됐었음
    
    프론트엔드 단 → DOM API, JQUERY → CSR
    
    JS Engine 
    
    tcp/ip module → OS안에 들어있음
    
    OS 내에서 JS App이 실행되어야함.
    
    JS Engine + API(lib...) = Node라고 부름, platform이자 framework?
    
    좁은 의미의 풀스택 : 프론트엔드, 백엔드를 다 같이한다 → javaScript로...
    
    넓은 의미의 풀스택 : 어떤언어로 가능한 수준의 백엔드 + 프론트엔드
    
    React → DOM 직접 조작 (Virtual DOM 조작) - React, Vue js, Angular ⇒ SPA(Single page application)
    
    [SPA란?](https://linked2ev.github.io/devlog/2018/08/01/WEB-What-is-SPA/)
    
    [JSX란?](https://goddaehee.tistory.com/296)
    
    [트랜스파일과 컴파일](https://ideveloper2.tistory.com/166)
    
    [Blazor - MS](https://podo1017.tistory.com/279)
    
    리눅스 2강 자료? → 자료 올려주신다고 약속하심
    
- 14:00~15:00
    - 이클립스 설정 및 다운로드
        
        [https://www.eclipse.org/downloads/packages/](https://www.eclipse.org/downloads/packages/) 
        
        packages에 들어가서 압축만 풀어도 그대로 쓸 수있기 가능
        
        1. perspective(조망) 개발 (java se,java ee) view 배치
        
        project / package explorer
        
        1. 설정
        
        (1) windows → preferences → encoding →  workspace → UTF-8로 세팅해야함, 모든 개발언어 세팅, content type, css files, html files, jsp files 들도...
        
        - 과정
            
            Java Properties File 빼고 나머지는 다 utf-8로 세팅해준다고 생각하면 편함
            
            ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02000c78-c2c4-44d7-b162-e23ca816de02/Untitled.png)
            
        
        (2) spelling disable → 오류는 체크하지마라! 내 메서드, 클래스, 변수 이름은 괜찮다
        
        - myproject
            
            -/.settings
            
            -.classpath
            
            -.projects
            
            -src (soruce임)
            
            -pom.xml (maven)
            
            이런 파일이 있어야 이클립스 프로젝트라고한다.
            
        
        common 한 프로젝트를 만들기 위함? → Maven, Gradle ⇒ IDE와 무관하게 쓸 수 있음
        
        - maven ⇒ src, pom.xml 두개만 있으면 됨.
        - intelliJ ⇒ /.idea 를 씀
        
        Servlet-practices
        
        |—-helloweb
        
        |—-guestbook
        
        |—-mysite
        
        인텔리제이는 프로젝트 하나 당 워크스페이스임
        
        그러나 이클립스는 멀티 프로젝트가 안된다.
        
        그렇지만 maven 같은걸 쓰면 괜찮음
        
        Maven 같은 프로젝트를 안올렸다? → 그냥 거르면 됨.
        
        사실 Maven은 프로젝트 빌딩 툴.
        
        다음시간에 할거...
        
        Servlet-practices
        
        |—- edu
        
        |—- mvc
        
        |—- helloweb
        
    
- 15:00~16:00
    
    javastudy
    
    |-practice01
    
    |-practice02
    
    console application → jar , web application → war
    
    프로젝트는 가능하면 소문자로
    
    project 
    
    > - src (-.java / package)
    > 
    
    > | -com
    > 
    > 
    >            |  -poscoict
    > 
    >                  |-helloword
    > 
    >                     |- hello
    > 
    >                       | Helloworld.java
    > 
    
    > - bin도 동일하게 src랑 같은 구조로 있음...
    > 
    
    > 
    > 
    
    > 
    > 
    
    한 어플리케이션 내에 역할을 갖는 클래스를 만들어 구성한다. 그래서 같은 역할군을 가진 클래스를 패키지로 나누어 관리한다. 
    
    ex) com.poscoict.helloworld.db / com.poscoict.helloworld.vo
    
    com.naver.blog.db → UserDAO
    
    같은 이름을 가진 것들이 굉장히 많을 거지만 패키지를 나누어서 관리하기에 괜찮음
    
    그리고 패키지에서 구조를 잘 나누어 관리하기에 충돌이나지 않도록 관리하는것이 중요하다.
    
    큰 곳에서부터 작은 곳으로 정리...
    
    ```jsx
    bin파일 내에서...
    
    java -cp . com.poscoict.helloworld.hello.HelloWorld
    ```
    
    ```jsx
    
    ```
    
    maven → simple Project 
    
    - 생성
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a104ec8f-cfce-4d6e-9103-50a9eef94c5c/Untitled.png)
        
    
    jar → 단독 / web project → war
    
    parents 존재 → pom
    
    따라서 깃허브에 올릴때는 빨간박스 2개만 올리면 된다.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/674a7807-12d1-4783-9f0f-b0de85c4ca95/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/84ebc673-e777-4e47-9e96-1c0c5aab91e9/Untitled.png)
    
    java 밑에 소스코드가 저장됨
    
    그리고 main 밑의 resources에는 config → [db.properties](http://db.properties) 같은게 저장된다.
    
    그러면 target 밑에는 컴파일 된 경로를 그대로 복사해서 경로를 구성한다. (java 밑, resources 밑)
    
    그리고 target밑에있는 경로를 모두 가져와 jar파일로 만든다.
    
    [https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.17](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.17)
    
    → dependency 설명
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/73263d2a-c2e1-4e04-95ed-8709d5d71ffc/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4db3dd40-626e-4660-9e68-83101f4d345e/Untitled.png)
    
    가끔 로딩 안될때는 이렇게 하기
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aa1b8bbf-d086-4c44-b492-5296f98facc8/Untitled.png)
    
- 16:00~17:00
    
    아까 complier하면서 JRE하던거 뭐였는지??
    
    - 기본설정
        
        ```jsx
        <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
          <modelVersion>4.0.0</modelVersion>
          <groupId>com.poscoict</groupId>
          <artifactId>helloworld</artifactId>
          <version>0.0.1-SNAPSHOT</version>
          <packaging>jar</packaging>
          
          <properties>
          	<project.bulid.sourceEncoding>utf-8</project.bulid.sourceEncoding>
          	<project.reporting.outputEncoding>utf-8</project.reporting.outputEncoding>
          </properties>
          
          <dependencies>
          </dependencies>
          
          <build>
          	<sourceDirectory>src/main/java</sourceDirectory>
          	<plugins>
          		<plugin>
          			<groupId>org.apache.maven.plugins</groupId>
          			<artifactId>maven-compiler-plugin</artifactId>
          			<version>3.8.0</version>
          			<configuration>
          				<source>11</source>
          				<target>11</target>
          			</configuration>
          		</plugin>
          	</plugins>
          </build>
          
        </project>
        ```
        
    - 이클립스 내 실행
        - 이클립스
            
            Run as → 1번실행
            
        - maven 실행법
            
            Run as 3번 빌드 후
            
            ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2fd8895e-17c1-4e1f-adbb-e850249812c1/Untitled.png)
            
            ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/82b09a65-5116-4258-a7a1-9bbfae30d8e0/Untitled.png)
            
            ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/065be87c-8ffd-4e4c-8276-4718aa803d6d/Untitled.png)
            
            finalName 쓰면 그거로만 나온다.
            
            ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b0984154-8aff-4949-b7f5-9bcedc23af8b/Untitled.png)
            
            그리고 이후에 2번 눌르면 그냥 됨
            
    
    회사 내 git Server 에서 테스트 수행
    
    이후 검증된 소스코드를 가지고 서버내에서 jar파일을 실행한다.(execution)
    
    Maven을 서버에 다운받아서 써야한다.(이클립스는 자체 플러그인이 있는것)
    
    서버 내에서 git clone을 한다.
    
    ```jsx
    #mvn clean package
    ```
    
    수행을 함으로써 target directory에 jar파일이 생성됨. 그리고 그 파일을 실행시킨다.
    
    Jenkins / gitlab 을 사용하여 빌드와 error관리를 모두 할 수 있다.
    
    아니면 다른 곳에 젠킨스 깔고 빌드를 시켜놓는다. jar파일 생성후 실행파일이 필요한 곳에 pipeline으로 배포를 하는 경우도 있다. → Automation(build & deployment)
    
    Continuous Integration (CI) : 지속적으로 통합을 한다. (ex. 매일매일 통합을 해나가는 상황)
    
    예전의 개발 : 자기가 할 것만 개발하고 통합의 과정이 없음 → 문제시 error잡기 힘듬
    
    지금의 개발 : integration이 계속 수행되면서 문제가 없는 것을 꾸준히 확인할 수 있다. 또한, 고객사에게 피드백을 빠르게 받을 수 있다.
    
    setting → development setting → personal?? 으로 가서 모든 항목 체크 후 토큰 받기
    
    이때 토큰은 새로고침하면 못받으니 복사해서 관리해야한다.
    
    ```jsx
    **/.classpath
    **/.project
    **/.settings
    **/target
    **/build
    
    ```
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02d644f3-2d13-4285-be70-cadc75ef0841/Untitled.png)
    
- 17:00~18:00

- maven project 생성
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1f5a5675-88bd-46bf-9d62-d2345d188eb9/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/61dd1f21-a17d-4a5f-bce6-acea9a0b2dec/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8e0ad962-445c-4c08-b595-aff7d80818a0/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5ccc2456-0f65-4382-b6a5-0aa52713d3f7/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e8f4b894-0776-4dfc-b26a-e40f5f9fce68/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a8a4c485-8bfa-48a2-8630-576cb8651668/Untitled.png)
    
    Maven update를 지정해서 제대로 업데이트를 확인하고 마무리한다.
    
- 이클립스로 github commit하기
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/641ea484-5d80-40ec-a8e9-c23c4fe40c26/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/604281f6-3b6a-40a6-9ddf-820ab75e08b9/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/23f7039c-1fda-4fa7-b9ae-afc097155a0d/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03de6f21-baa4-43bb-a253-c59c2805572a/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4c57ba7f-1c82-4d7d-87aa-196a2fafa0cf/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/12fa191e-c4ce-4534-8c1a-4b05c0ad59cc/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/56bd10db-97a8-4750-8bed-7a567983395b/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/17392158-e546-45ec-b197-fa9e5d896ba2/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/42a816b5-8a0c-4642-9886-a3624f303e1a/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ca5e3056-edbf-4a6f-a44a-1b80a2ab5340/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dfe2b6b1-4229-4463-96b3-0279d260c5e8/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aa8aff14-997b-4805-be07-6a27c295471b/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d7042a86-d5c9-4a5b-b47f-95570f0b304a/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/010b3468-12d4-4a35-999a-14e20d0e41d9/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5d71bde6-5a9e-46ea-812c-026ba16b6a89/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/56dcd354-7647-4289-a0e6-4d11987b15cf/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7099d894-50fd-42eb-b1d1-118162fe72d6/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c8b2d50a-5c3b-4c79-b079-1cf42cf7a233/Untitled.png)