### 1. EmaillistDao, EmaillistDaoTest 마저 만들기 

### 2. Test 케이스 만들기 

- index.jsp
	
	com.poscoict.emaillist.vo
	int i = 10;
	
	class A{
		public int tem(){
			return 10;
		}
	}
	
	10
	i
	5+5
	new A().ten();
	
	값을 표현하는 식
	express value(값을 표현)
	
	값
	1. 리터럴
	2. 변수
	3. 연산식
	4. 메소드
	
	<% %> : 자바 구문
	
	<%= %> : 숫자, 변수, 메서드 들어가도 됨
	
- add.jsp

	redirect : 브라우저가 응답을 받는다.
	
### 3. guestbook01 만들기

- 똑같이 만들기
	
	servlet-practices
	1. Maven War project 만들기
	maven project 생성: packaging => war
	project 선택(오른쪽메뉴)-> java EE Tools -> generate Deployment Descriptor Stub(web.xml)
	web.xml 에서 xmlns="http://JAVA.sun.com/xml/ns/javaee" 수정
	pom.xml 설정(helloweb 참고)
	2. applications
	model1: model + jsp(controller,view)
	
	emaillist01
	guestbook01
	model2: mvc, Model + View(jsp) + Controller(servlet)
	
	emaillist02
	guestbook02
	mysite
	
	mysite02
	
	1. 띄어쓰기 > 개행을 <br>로 만들어줘야됨 자바 replace 메시더로 <%=vo.getmessage.replace %>
	2. no 숫자 카운트 채우기
	
### 4. emaillist 2 만들기

	com.poscoict.controller
	com.poscoict.dao
	com.poscoict.vo