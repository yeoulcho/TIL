## 문제
***
    테이블명(FIRST_HALF)
    SHIPMENT_ID, FLAVOR, TOTAL_ORDER
    출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량

    테이블명(ICECREAM_INFO)
    FLAVOR, INGREDITENT_TYPE
    아이스크림 맛, 아이스크림의 성분 타입

상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요. 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT A.INGREDIENT_TYPE, SUM(B.TOTAL_ORDER) as TOTAL_ORDER 
        FROM ICECREAM_INFO A 
        JOIN FIRST_HALF B 
        ON A.FLAVOR = B.FLAVOR 
        GROUP BY A.INGREDIENT_TYPE 
        ORDER BY TOTAL_ORDER
- ICECREAM_INFO와 FIRST_HALF 두테이블을 조인
- FLAVOR이 같은 기준으로 조인
- 재료타입하고 총 주문합 합치기
- 재료타입으로 그룹화
- 총 주문합순으로 오름차순

<br> 다른 풀이


    SELECT B.INGREDIENT_TYPE, SUM(A.TOTAL_ORDER) AS TOTAL_ORDER
        FROM FIRST_HALF AS A , ICECREAM_INFO AS B
        WHERE A.FLAVOR = B.FLAVOR
        GROUP BY B.INGREDIENT_TYPE
        ORDER BY TOTAL_ORDER ASC;

- FIRST_HALF와 ICECREAM_INFO 테이블을 조인합니다.
- 두 테이블 간에 같은 맛(FLAVOR)을 가진 행들을 찾습니다.
- 재료 종류(INGREDIENT_TYPE)별로 주문 총량(TOTAL_ORDER)을 계산합니다.
- 재료 종류별로 그룹화합니다(GROUP BY B.INGREDIENT_TYPE).
- 주문 총량이 낮은 순으로 결과를 정렬합니다.
