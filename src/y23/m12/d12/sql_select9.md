## 문제
***
    테이블명(ONLINE_SALE)
    ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE
    온라인 상품 판매 ID, 회원 ID, 상품 ID, 판매량, 판매일
<br>

    테이블명(OFFLINE_SALE)
    OFFLINE_SALE_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE
    오프라인 상품 판매 ID, 상품 ID, 판매량, 판매일


ONLINE_SALE 테이블과 OFFLINE_SALE 테이블에서 2022년 3월의 오프라인/온라인 상품 판매 데이터의 판매 날짜, 상품ID, 유저ID, 판매량을 출력하는 SQL문을 작성해주세요. OFFLINE_SALE 테이블의 판매 데이터의 USER_ID 값은 NULL 로 표시해주세요. 결과는 판매일을 기준으로 오름차순 정렬해주시고 판매일이 같다면 상품 ID를 기준으로 오름차순, 상품ID까지 같다면 유저 ID를 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') as SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT 
        FROM ONLINE_SALE  
        WHERE DATE_FORMAT(SALES_DATE, '%Y-%m-%d') = DATE_FORMAT(SALES_DATE, '2022-03-%d')
    UNION ALL
    SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') as SALES_DATE, PRODUCT_ID, NULL, SALES_AMOUNT
        FROM OFFLINE_SALE  
        WHERE DATE_FORMAT(SALES_DATE, '%Y-%m-%d') = DATE_FORMAT(SALES_DATE, '2022-03-%d')
        ORDER BY SALES_DATE, PRODUCT_ID, USER_ID
- 어느 컬럼을 선택할지 고르자
- 조건은 2022년 3월 (where에 조건)
- 두 테이블 합칠 것
- 판매일, 상품 ID, 회원 ID 오름정렬
# <div align=center> Check Point! </div>
### 1. UNION ALL & UNION
    1-1. UNION ALL
             모든 컬럼값이 같은 ROW도 결과로 보여준다. 중복제거 하지 않는다.
    1-2. UNION
             중복제거를 한다.
    
    컬럼명이 동일해야 한다. (같지 않을 경우 AS 를 이용해서 동일하게 맞춰줘야 한다.)
    컬럼별로 데이터 타입이 동일해야 한다.
    출력할 컬럼의 개수가 동일해야 한다