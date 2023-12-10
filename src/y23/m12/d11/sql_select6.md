## 문제 
***
    테이블명(FIRST_HALF)
    SHIPMENT_ID, FLAVOR, TOTAL_ORDER
    출하번호, 아이스크림 맛, 총 주문량

상반기에 판매된 아이스크림의 맛을 총주문량을 기준으로 내림차순 정렬하고 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하여 조회하는 SQL 문을 작성해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT FLAVOR 
        FROM FIRST_HALF 
        ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID
- 어느 컬럼을 선택할지 고르자
- 총주문량 내림차순, 출하일 오름차순 정렬



      
