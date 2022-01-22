#토요일 공부!!!!

### 1. mysite02 제대로 이해하기 (코드 하나하나)

0. 준비 :
guestbook02의 Dao와 Vo 그대로 가져오기

1. index.jsp :
dao를 호출하고 dao의 findall 메서드로 불러온 내용을 vo타입의 리스트인 list에 저장 

action에 "<%=request.getContextPath()%>/guestbook"으로 주기 (여기서 guestbook은 controller의 매핑명임

포스트이므로 값을 그대로 못 주니 name은 a(action), value는 add로 폼 태그 만들어주기

아래에 리스트가 나와야 되므로 for each문을 만들고 vo의 인덱스를 생성해서 짤리지 않는 순서 인덱스 번호와 함께 vo.get 메서드 활용하여 각각의 필요한 내용을 테이블에 불러오기 (여기서 deleteform으로 보내야되기 때문에
<%=request.getContextPath()%>/guestbook?a=deleteform&no=<%=vo.getNo()%> 이런 식으로 보내준다.)

2. GuestbookController :
post가 doget을 받고있기 때문에 바로 get으로 넘어갈수 있다.
a 파라미터를 actionName String 타입으로 받고 GuestbookActionFactory로 이동시킨다.(중간 메서드 과정 생략)

2번째 단락이 제일 중요
1번 줄 : 동적바인딩 객체 생성 > getAction을 인터페이스화 시켜뒀음
2번 줄 : get액션에서 actionName으로 value값을 받아서 그걸로 처리하게 만드는 것을 execute가 인터페이스화 되어있는 Action 클래스의 action 변수에 담아둔다.
3번 줄 : 각각을 수행하고 보내주는 메서드인 action.execute를 수행한다(완료)

3. GuestbookActionFactory :
팩토리는 선택하는 곳이기 때문에 선택에 따라 달라지게 contoller에서 동적 바인딩을 해준다.(임의로 선택하기 위해서)
ActionFactory 인터페이스의 getAction매서드를 만들어준다. 여기서 실제 액션 실행, a로 받은 deleteform, delete, add 값을 받아서 맞으면 동사Action.jsp로 이동한다.

4-1. AddAction :
Action의 인터페이스인 AddAction을 실제로 실행한다. name, pw, content를 받아서 삽입을 수행하고 sendredirect를 통해 홈으로 돌아간다.

4-2. DeleteformAction :
index에서 딜리트가 아닌 딜리트 폼으로 보내줬다. 그럼 똑같이 팩토리에서 처리 후 deleteform액션으로 간다. 
여기서는 포워드 쉽게 해주는 폼을 만들어뒀기 때문에 deleteform.jsp로 이동만해준다.

5. deleteform.jsp :
여기서도 index와 같은 방식으로 post를 사용하기 때문에 hidden으로 a와 no를 컨트롤러로 보내고 a의 밸류는 당연히 delete가 된다.

4-3. DeleteAction : 
여기서 no,와 pw만 받아서 delete를 수행하고 redirect로 돌아간다.

## 질문 1. 여기서 방명록으로 돌아갈수는 없나?, forward와 redirect 사용한 이유?
forward : 요청이나 작업이 더 남아있을때
redirect : 작업이 마무리됐을때 (이외에는 forward 사용)

forward에서 자동으로 추가될수 있는 위험성

KMI 건강검진 일때 내가 모르게 1,2,3번 과정이 수행되면 forward
순서확인하고 제대로 요청해서 한개씩 내가 하는거면 redirect!!!  

## 질문 2. get, post 방식일때 hidden 사용여부가 결정되나? post는 이 방식 뿐?
hidden은 텍스트랑 같은데 보이지만 않을뿐
값을 넘겨줘야 되는데 보여주긴 싫은데

### 2. practice 문제 풀기