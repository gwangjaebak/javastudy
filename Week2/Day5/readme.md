# Spring

## helloweb03

helloweb3 > board controller 참고

url은 같지만 post, get 방식 차이에 따라 다르다.

오버로딩을 이용해서 같은 컨트롤러에서 두가지 경로를 처리할 수 있다.

GET		R
POST	C
PUT		U
DELETE	D

GET/user/update?name=박광재

헤더

===========================

바디

name=박광재

/board/view?no=10
/board/view?10

/guestbook/delete?no=10
/guestbook/delete/10

---- 레이어 관련
@Controller
@Service
@Repository

---- 레이어 관련 X
@Component
class Mailer {
}

## emaillist03

com.poscoict.emaillist.controller
com.poscoict.emaillist.repository
com.poscoict.emaillist.vo

Listener

## guestbook03
dao, vo 만들기