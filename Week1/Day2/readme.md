[MySQL 연동하는 법.docx](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ecd24a89-ae24-4fb5-885a-7d0f2814f04e/MySQL_연동하는_법.docx)

[MySQL 연동하는 법.pdf](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e1f02fb6-4fd7-4a53-907e-7b66d2dba9f0/MySQL_연동하는_법.pdf)

- 과제
    
    기본 연습문제 5문제 풀기 → 프로젝트 5개 만들기
    

- 09:00~10:00
    - build tool
        - ant
        - maven → jar , war (build가 되는 과정...)
            - pom.xml : manifest[ 1.dependency (라이브러리 의존성), 2. build(build, packaging-jar, war-, deployment) description
        - gradle
        
    
    자바 어플리케이션 → main이 무조건 있어야한다. main이 실행이 끝나면 JVM에서 내려간다.
    
    ** tomcat
    
    - webapps
        - admin program(/admin)
        - mysite.war
        - /mysite
    
    - HelloWorld 실행이 되는 순서
        - JVM
            
            [JVM 메모리 구조란? (JAVA) (tistory.com)](https://steady-coding.tistory.com/305)
            
            1. class loader
                - JVM 내로 클래스 파일을 로드하고, 링크를 통해 배치하는 작업을 수행하는 모듈입니다. 런타임 시에 동적으로 클래스를 로드합니다.
            
            1. runtime data area
                1. Method Area
                    - 모든 쓰레드가 공유하는 메모리 영역입니다. 메소드 영역은 클래스, 인터페이스, 메소드, 필드, Static 변수 등의 바이트 코드를 보관
                    - 관련된 정보가 생기는 것일뿐 실제로 생기는 것이 아니다!!
                    - int : primitive type
                    - System.out의 out : out은 객체인데... outputStream
                    - out
                        
                        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cfa66159-d851-487a-912b-dce1a01cda2e/Untitled.png)
                        
                        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/41fe7efa-3c18-4e80-9541-b1f3bb772605/Untitled.png)
                        
                    - 자바는 블록 레벨, 생명주기가 있다..., 블록을 벗어나면 변수는 사라짐.
                
                b. Stack
                
                - 메서드 호출 시마다 각각의 스택 프레임(그 메서드만을 위한 공간)이 생성합니다. 그리고 메서드 안에서 사용되는 값들을 저장하고, 호출된 메서드의 매개변수, 지역변수, 리턴 값 및 연산 시 일어나는 값들을 임시로 저장합니다. 마지막으로, 메서드 수행이 끝나면 프레임별로 삭제합니다.
                
                c. heap
                
                - 객체가 만들어지는 영역
                - 객체를 참조하는 부분이 사라지면 없애버림 → GC의 역할
                
                Stack, Heap이 만나면 memory full이 생김. 
                
                std out / in / err
                
            
        
        bin(class path → 경로가 굉장히 많으므로 일정한 기준을 가지고 찾기위함) 
        
        > — HelloWorld.class
        > 
        
        객체  : 사용자 데이터 타입, 사용자 정의
        
        Hello.js : int  a = 10 (source code 내에서 어디서든 선언가능)
        
        [Hello.java](http://Hello.java) :  class 밖에서 int a = 10을 쓰면 Err
        
        ```jsx
        Public ClassA{
        	public static int a = 10;
        }
        ```
        
        자바 : 무수히 많은 메서드 호출이 연결되어 진행된다. 메서드 안에서 메서드를 호출하건 코드라인이 넘어가면서 메서드가 호출되건...
        
        프로그래밍을 객체지향 스타일로 함(자바) or 스크립트언어들은 굳이 그렇게 안하지만 내부적으로 언어 매커니즘이 객체로 구성됨.
        
        - javastudy
            - chapter01
            - chapter02
            - chapter03
            - network
            - practice01
            - practice02
            - practice03
            - practice04
            - practice05
    
    [빌드란?](https://freezboi.tistory.com/39)
    
- 10:00~11:00
    
    
    pom.xml
    
    - javastudy [parent project]
        - pom.xml
        - practice01 [module]
            - pom.xml
            - src/main/java
            - src/main/resources
            
            빌드까지, finalName
            
        - practice02
        - practice03
        - practice04
        - practice05
    
    groupID : 프로젝트의 그룹을 의미, 일치시키는것도 괜찮은 방법이다.
    
    메이븐 프로젝트 , 모듈 만들기 (pom.xml 파일 정리하는 법)
    
    깃허브에서 가져온거 링크 복붙해서 레포지토리 → import하기
    
    remote까지 하는거 잊지말것
    
- 11:00~12:00
    
    
    ** tomcat
    
    - bin
    - lib
    - webapps
        - mysite.war
        - /mysite
            - WEB-INF
                - web.xml
                
        - edu
            - WEB-INF
                - web.xml
    
    tomcat → 요청이 들어왔네 
    
    http:// IP 주소!! 
    
    [localhost](http://localhost) : loopback 주소 (127.0.0.1) 자기한테 접근하는 주소 - 기본 test 가능
    
    ⇒ [http://localhost](http://localhost):8080/URI
    
    ip를 찾아서 host를 알게되고 port를 통해 어플리케이션을 인식할 수 있게된다.
    
    Context Path(application 정보를 담아놓은 경로)
    
    웹어플리케이션 경로(서블릿들을 실행), 문맥교환(OS의 프로세스 실행)
    
    서블릿 컨테이너까지는 잘 들어왔지만 어떤 서블릿으로 가기위한 건지 mapping을 할 필요가있다.
    
    /user ⇒ userServlet
    
    url class, user 
    
    doGet, doPost : GET /mysite/user || POST /mysite/user 
    
    [RESTFUL API란?](https://khj93.tistory.com/entry/%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-REST-API%EB%9E%80-REST-RESTful%EC%9D%B4%EB%9E%80)
    
    Project Facet ⇒ 4.0을 3.1로 바꿔서 프로젝트가 인식할 수 있도록 수정해야한다.
    
    프로젝트에서 자바 프로퍼티 → 자바 타겟런타임
    
    자바 빌드패스 → Lib
    
    window → show 에서 perspectives 조정가능
    
    window → Server → Runtime Environment → Add로 서버추가
    
- 12:00~13:00
    
    Maven War Project 만들기
    
    1. maven project 생성 : packaging ⇒ war 
    2. project 선택(오른쪽) → java EE tools → generate delpoyment discriptor stub(web.xml)
    3. web.xml 에서 xmlns="[http://JAVA.sun.com/xml/ns/javaee](http://java.sun.com/xml/ns/javaee)" 수정
    4. pom.xml 설정 (helloweb 참고)
    
    톰캣라이브러리가 없으면 jsp를 생성했을때 에러뜸, 자스퍼 세팅하라는 뜻임
    
    target runtime 해주면 세팅됨
    
    도메인 / 포트 / 어플리케이션 이름 / URI
    
- 14:00~15:00
    
    
    *** tomcat
    
    - filter
    - listener
    - servlet
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cfdf5b83-38cf-4ddb-9042-52b143bef6de/Untitled.png)
    
    멀티 매핑 가능
    
    client — server : request and response
    
    브라우저에게 인코딩해서 알려줘야함. → 한글...
    
    abcdefg
    
    바디가 시작하기전에 어떻게 읽어야하는지 미리 알려줘야한다.
    
    200 OK\n
    
    \n
    
    <h1>~~~</h1>
    
    <h1>~~~</h1>
    
    요청이 오면 컨트롤러가 받음
    
    컨트롤러에 대한 요청이 왔을때, 요청처리 알고리즘 → EJB 
    
    비지니스(CRUD)하는 객체이자 모델
    
    데이터를 뷰에 넘겨서 렌더링을 한다.
    
    view ⇒ JSP
    
    한글
    
    jsp - 모델이 있어야함
    
    JSP & Servlet → 모델이 있어야함
    
    Jsp 하나로만 하는 방식 model (+) 1, 컨트롤러와 뷰 하나
    
    MVC : Model (+) 2, 컨트롤러와 집 분리
    
    분리를 안하면 유지보수가 힘들다.
    
    mvc framework : strut / spring mvc  하나의 어플리케이션을 가지고 모델1, 2, sping  등으로 짜봐야한다. 그래서 추후 잘하는 기술을 적용하면 된다.
    
    jstl tag library
    
- 15:00~16:00
    
    
    - 과제
        
        emaillist01 [model1, model+jsp(controller, view)]
        
        guestbook01 [model1, model+jsp(controller, view)]
        
        emaillist02 [mvc, model2, model+jsp(view) , servlet(controller)]
        
        guestbook02 [mvc, model2, model+jsp(view) , servlet(controller)]
        
        mysite02 [mvc, model2, model + jsp(view)] + servlet(controller)]
        
        ===========================================
        
        html, css, javascript
        
        ===========================================
        
        mysite03 [spring mvc, xml config]
        
        mysite04 [spring mvc, java config1]
        
        mysite05 [spring mvc, java config2]
        
        mysite06 [spring boot]
        
        jblog03
        
        jblog04
        
        jblog05
        
        jblog06
        
        db : webdb
        
        user : webdb
        
        password : webdb
        
        DCL : Data Control Language 
        
        DML : Data Manipulate Language
        
        DDL : Data Definition Language
        
    
    DB에 CRUD만 전문적으로 하는 역할 : DAO
    
    DAO(Data Access Object , repository)
    
    JSP가 요청을 받고 응답하는 역할 (DAO를 사용해서) 요청제어를 하는 역할 → Controller
    
    Controller, View → JSP
    
- 16:00~17:00
    
    
    보안 = 인증 (authorization) + 권한
    
    ```jsx
    show databases;
    
    -- db 생성
    create database webdb;
    
    -- user 생성
    create user 'webdb'@'localhost' identified by 'webdb';
    
    -- 권한 부여
    grant all privileges on webdb.* to 'webdb'@'localhost';
    
    ```
    
    sql은 snakes name
    
    ```jsx
    show tables;
    desc emaillist;
    
    -- create
    insert into emaillist values(null, '둘', '리', 'dooly@gmail.com');
    insert into emaillist values(null, '루', '피', 'luffy@gmail.com');
    
    -- read
    -- select * from emaillist 이렇게 쓰면 메모리 낭비 심함 -> 욕먹음
    select no, first_name, last_name, email from emaillist order by no desc;
    
    --
    ```
    
    어플리케이션 플로우를 그리고 능숙해질때까지 반복할 것, 그림으로 그리면서 하나씩 만들자.
    
    1. req&resp 01
    
    request1 → /index.jsp로 요청이 들어감 → index.jsp(list)가 받음 → 리스트를 보여달라는 요청 → 여기서 직접 DB에 접근을 하는 것이 아니라 DAO를 사용해서 접근해야한다. 
    
    → method findall()을 만든다. 이름을 CRUD이름에 맞게 만들것. select query 때림
    
    → 각각의 row를 자바 VO객체에 담는다. 리스트로 jsp에게 넘겨준다. 그러면 for문으로 돌면서 렌더링을 한다.
    
    그리고 그 결과를 응답한다. 
    
    따라서 이 응답은 resp1이라 할 수 있다. (HTML)
    
    그 상태에서 메일을 등록하고 싶었을때 들어오는 요청???→ 버튼을 누른다. form 의 submit을 눌렀을때 실행되도록...
    
    1. req&resp 02
    
    ...
    
    요청개수대로 jsp의 개수가 늘어난다. → 하나의 상황에 하나의 jsp가 생기면 규모가 너무 커짐.
    
    요청 = URL이므로 URL을 갖다가 잘 정의하게 되면 어플리케이션의 기능을 추측할 수 있다. 
    
- 17:00~18:00
    
    com.poscoict.emaillist.dao
    
    com.poscoict.emaillist.dao.test
    
    com.poscoict.emaillist.vo