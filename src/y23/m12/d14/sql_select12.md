## 문제
***
    테이블명(USER_INFO)
    USER_ID, GENDER, AGE, JOINED
    회원 ID, 성별, 나이, 가입일


USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT COUNT(USER_ID) as USERS 
        FROM USER_INFO 
        WHERE DATE_FORMAT(JOINED, '%Y-%m-%d')=DATE_FORMAT(JOINED, '2021-%m-%d') 
            and (AGE >=20 and AGE <=29)
<br>

    SELECT count(*) 
        FROM USER_INFO 
        WHERE JOINED BETWEEN '2021-01-01' AND '2021-12-31' 
            and AGE BETWEEN 20 and 29

- 어느 컬럼을 선택할지 고르자
- 몇명인지 카운트
- 2021년 가입, 나이 조건 설정

# <div align=center> Check Point! </div>
### 1. COUNT 집계함수
    *를 인수로 할 수 있는 집계함수는 COUNT 뿐
    집계함수에서는 NULL값이 있을 경우 이를 제외하고 처리한다.

### 2. BETWEEN A and B (A와 B 사이)    


