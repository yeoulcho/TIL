## 문제 
***
    테이블명(ONLINE_SALE)
    ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE 
    온라인 상품 판매 ID, 회원 ID, 상품 ID, 판매량, 판매일

ONLINE_SALE 테이블에서 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여, 재구매한 회원 ID와 재구매한 상품 ID를 출력하는 SQL문을 작성해주세요. 결과는 회원 ID를 기준으로 오름차순 정렬해주시고 회원 ID가 같다면 상품 ID를 기준으로 내림차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT USER_ID, PRODUCT_ID 
        FROM ONLINE_SALE 
        GROUP BY USER_ID, PRODUCT_ID 
        HAVING count(*)>=2 
        ORDER BY USER_ID, PRODUCT_ID DESC
- 재구매 회원 ID랑 상품 ID 선택 
- 재구매 회원 ID랑 상품 ID를 그룹화
- 그룹화한 행의 갯수가 2개 이상 = 재구매 라는 조건 생각 (Having)
- 정렬은 회원ID는 ASC, 상품ID는 DESC


# <div align=center> Check Point! </div>
### 1. 조건 제한 HAVING
    where은 모든 절에 대해서 조건을 만족하는지 검사하지만, 
    having은 그룹 내에서 조건을 만족하는지 검사한다.
### 1-1. IN
    WHERE절에서 쓰이며 OR대신 쓰인다.    
    ex) SELECT * FROM student WHERE grade IN (3,4);
        -> SELECT * FROM student WHERE grade=3 OR grage=4 와 동일
### 2. 조건 설정시 집계함수 COUNT 활용
    ex) COUNT(case when '컬럼명'=1 then 1 end) as '별칭' 
        -> '컬럼명' = 1' 조건이 맞다면 1 아니면 NULL
        COUNT(*) -> 그룹화한 전체 행의 갯수
        COUNT(인수) -> 인수에 컬럼명 넣어 사용 가능
