## 문제 
***
    테이블명(FIRST_HALF)
    SHIPMENT_ID, FLAVOR, TOTAL_ORDER 
    출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량
<br>
    
    테이블명(ICECREAM_INFO)
    FLAVOR, INGREDITENT_TYPE
    아이스크림 맛, 아이스크림의 성분 타입


상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT A.FLAVOR 
        FROM FIRST_HALF A
        JOIN ICECREAM_INFO B
        on A.FLAVOR = B.FLAVOR
        WHERE B.INGREDIENT_TYPE='fruit_based' and TOTAL_ORDER >3000
        ORDER BY TOTAL_ORDER DESC
- 어느 컬럼을 선택할지 고르자
- 조건은 과일 성분, 총 주문량 3000보다 클것 (where에 조건)
- 총 주문량 순으로 내림정렬

 
