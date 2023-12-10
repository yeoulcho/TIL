## 문제 
***
    테이블명(MEMBER_PROFILE)
    MEMBER_ID, MEMBER_NAME, TLNO, GENDER, DATE_OF_BIRTH
    회원 ID, 회원 이름, 회원 연락처, 성별, 생년월일


MEMBER_PROFILE 테이블에서 생일이 3월인 여성 회원의 ID, 이름, 성별, 생년월일을 조회하는 SQL문을 작성해주세요. 이때 전화번호가 NULL인 경우는 출력대상에서 제외시켜 주시고, 결과는 회원ID를 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH 
        FROM MEMBER_PROFILE 
        WHERE GENDER = 'W' and TLNO IS NOT NULL 
            and DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') = DATE_FORMAT(DATE_OF_BIRTH, '%Y-03-%d')
        ORDER BY MEMBER_ID
- 어느 컬럼을 선택할지 고르자
- 조건은 여성, 전화번호 NULL제외, 3월 (where에 조건)
- 정렬


# <div align=center> Check Point! </div>
### 1. 3월을 조건을 하려면?? DATE_FORMAT 비교
     DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') = DATE_FORMAT(DATE_OF_BIRTH, '%Y-03-%d')

### 2. IS NOT NULL
    NULL이 아니면 true 
      
