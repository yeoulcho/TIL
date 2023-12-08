## 문제 
***
    테이블명(PATIENT)
    PT_NO, PT_NAME, GEND_CD, AGE, TLNO
    환자번호, 환자이름, 성별코드, 나이, 전화번호


PATIENT 테이블에서 12세 이하인 여자환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회하는 SQL문을 작성해주세요. 이때 전화번호가 없는 경우, 'NONE'으로 출력시켜 주시고 결과는 나이를 기준으로 내림차순 정렬하고, 나이 같다면 환자이름을 기준으로 오름차순 정렬해주세요.
<br>
## 정답
***
    SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') as TLNO
        FROM PATIENT
        WHERE GEND_CD='W' and AGE<=12
        ORDER BY AGE DESC, PT_NAME

## 풀이과정
***
    SELECT PT_NO, PT_NAME, GEND_CD, AGE, TLNO FROM PATIENT WHERE AGE <= 12 ORDER BY AGE DESC
- 먼저 테이블에서 선택할 컬럼과 조건 그리고 오름차순으로 정렬
- 문제 제대로 읽지 않아서 컬럼 순서 지켜지지 않음
- NULL인 값을 대체 하기 위해 IFNULL혹은 COALESCE
- '여아환자' 조건을 빼먹음....

# <div align=center> Check Point! </div>
### 1. 문제 정확하게 읽을 것
### 2. IFNULL 혹은 COALESCE로 NULL값 대체 가능
