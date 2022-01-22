### 1. mysite 만들기

- 프로젝트의 pom은 껍데기

- 부모의 src는 bin이 생기기때문에 지워준다 껍데기니까

- readme.md 만들어주기

# mysite

###	versions 
1. mysite02(01은 안함) : mvc, model2, servlet 기반
2. mysite03 : spring mvc fw 기반, xml configuration
3. mysite04 : spring mvc fw 기반, "java" configuration 1
4. mysite05 : spring mvc fw 기반, "java" configuration 2(web.xml 사용x)
5. mysite06 : spring boot 기반, "java" configuration

sping까지 가는 프로젝트


### 과정
1. mysite 프로젝트 만들기
2. mysite02 모듈 만들기
3. 드라이브에서 mysite 기본 틀 옮기기

#게시판을 만들줄 알아야함
### board > 평가과제, guestbook

#서블릿보다 리액트,스프링,js,객체지향을 더 공부하자

# 다시 mysite

### 1. 기본세팅

	com.poscoict.web.mvc
			|--- ActionFactory
			|--- Action
			
	com.poscoict.web.util
			|--- MvcUtil
			
	com.poscoict.mysite.controller
			|--- MainController
			|--- UserController
	
	com.poscoict.mysite.mvc.main
			|--- MainActionFactory
			|--- MainAction
			
	com.poscoict.mysite.mvc.user		
			|--- UserActionFactory
			|--- JoinFormAction
			|--- JoinAction
	
	com.poscoict.mysite.mvc.guestbook
					
	com.poscoict.mysite.dao
	com.poscoict.mysite.vo

로그인 로그아웃 처리를 위해서는 쿠키, 세션을 알아야한다.
쿠키, 세션은 자주 사용하는 기능이다.

### 2. 객체지향

SOLID
 > Open 확장
 > Close 수정
 
### 3. 
1 <- Integer.parseInt("1")
Byte
Long