## 문제
***
    테이블명(FOOD_PRODUCT)
    PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
    식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격

REST_INFO와 REST_REVIEW 테이블에서 서울에 위치한 식당들의 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회하는 SQL문을 작성해주세요. 이때 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 결과는 평균점수를 기준으로 내림차순 정렬해주시고, 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
1. 풀이 방법
   - 컬럼 선택
   - 가격으로 정렬하고 1개의 컬럼만 보여주기
<br>
   

       SELECT * 
           FROM FOOD_PRODUCT 
           ORDER BY PRICE DESC LIMIT 1
   <br>

2. 풀이방법
    - 컬럼 선택
   - where문의 select 제일 비싼 가격


       SELECT *
           FROM FOOD_PRODUCT
           WHERE PRICE = (
           SELECT MAX(PRICE)
           FROM FOOD_PRODUCT)



# <div align=center> Check Point! </div>
### 1. 이게 왜 안될까?
    SELECT PRODUCTID, PRODUCTNAME, PRODUCTCD, CATEGORY, MAX(PRICE) AS PRICE
        FROM FOODPRODUCT

FOOD_PRODUCT 테이블의 첫번째 행의 데이터 + 테이블에서 비싼 가격만 나오고 있기 때문이다.





