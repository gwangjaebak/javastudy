## 평가 과제 하루정도 시간준다.(깃에다가만 올려두면 됨)

## 업데이트 폼 액션은 언제 씀?

## 1. 톰캣

### 톰캣에는 세션 매니저와 세션 필터가 있다.

### 어플리케이션에는 서블릿, 리스터, 필터가 있다.

### 필터 > 서블릿 > JSP > 서블릿 > 필터 이런식이다

### 셋인코딩처럼 기본빵 처리할때 필터가 유용하다. (AOP란 멋진 기술도 사용 가능)

### jsp도 서블릿으로 변환되는 것임

### init > service(doget, dopost) > destroy

### 프로젝트는 무조건 url과 서블릿 class로만 찾는다.

### 사진이 옮겨지는 과정 : 사진은 url이 없다. 이 때 톰캣에는 디폴트 서블릿이란 게 있는데 url과 클래스가 없으면 디폴트 서블릿으로 보내고 여기서 사진을 보내준다.

### 모두다 서블릿이다. 모두 스레드를 탄다.


## 2. 필터, 리스너
com.poscoict.web.filter

ContextLoadListener

## 3. Servlet Context

### Context의 의미
(톰캣에서는) = application
		  = Servlet Context
		  
## 4. Cookie

### 클라이언트가 요청하면 서버가 언제든지 구울수 있다.
이 과정을 베이킹이라고 함 실제로

### 방법 :
1. 클라이언트 쪽에다가 set-cookie를 해서 저장해준다. (name=value값으로)
2. 메모리와 디스크에 저장되고 다음 요청때 실어서 보내준다.

### 기준 :
1. domain - 쿠키를 구운 도메인이랑 같아야함(당연)
2. path
3. expireation(만료일)

### 연습 :
visitcount를 만들어서 서버에서 1을 추가시키게 한다. 몇번 전달이 다녀갔는지 알 수 있다.

### 과제 :
답글 + 페이징은 꼭 했으면
예외 발생 건당 5점
		
#게시판 만들기

## 게시판 :
/board?a=search&kwd=바&p=1
카운트할때 Math.ceil(count/3) 이런식으로

## 계층형 게시판 :
댓글과 답글의 차이점
답글 : reply > 글 (리스트에 나타나야한다.)
댓글 : comment

## 보드
no, title, g_no, o_no, depth 와 같은 col이 있다.

select * from board order by g_no desc, o_n asc limit _, 5
												(page-1) * 5
					(where title like %밥%) 
					(where title like %안%)
			
## 1. 글쓰기(새글)

list.jsp > view.jsp > writeform.jsp > a = write 새글(그룹no가 없음)
		   list.jsp > write.jsp > 답글(그룹no가 있음)
		   
write.jsp에는 g_no와 o_no를 가지고 있어야한다.

insert int board values(null,_,_, [select max(g_no)+1 from board]),1 ,1)
-> ? if null(0, 1)일때 1로 세팅해주는 : 구글링

## 2. 답글

update board set o_on where o_no > order_no and group_no = group_no
insert into board values(null, _, group_no, order_no+1, depth+1)

no, title, g_no, o_no, depth
1	저녁먹자	1		1	1
2	안녕		2		1	1
3	모먹지	1		2	2
4	짜장면	1		5	3 (o_no 3>4로 update)
5	돈가스	1		3	3
6	놉!		1		4	4

depth는 밀려고 있는 것

## 3. 향후계획
수목 오전 스프링 오후 게시판
금 게시판

