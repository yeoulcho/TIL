## 문제
***
    테이블명(PRODUCT)
    PRODUCT_ID, PRODUCT_CODE, PRICE
    상품 ID, 상품코드, 판매가

PRODUCT 테이블에서 만원 단위의 가격대 별로 상품 개수를 출력하는 SQL 문을 작성해주세요. 이때 컬럼명은 각각 컬럼명은 PRICE_GROUP, PRODUCTS로 지정해주시고 가격대 정보는 각 구간의 최소금액(10,000원 이상 ~ 20,000 미만인 구간인 경우 10,000)으로 표시해주세요. 결과는 가격대를 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT PRICE - (PRICE % 10000) as PRICE_GROUP, COUNT(PRODUCT_ID) as PRODUCTS 
        FROM PRODUCT 
        GROUP BY PRICE_GROUP 
        ORDER BY PRICE_GROUP
    

- 10000원 간의 금액대별 구간을 어떻게 표현할까?
- CASE WHEN으로 일일이 표현하는건 부적절해 보임
- 테이블에서 가격대 구간, COUNT 컬럼으로 상품 개수 선택
- 가격대 구간으로 GROUP BY
- 이름순으로 정렬

# <div align=center> Check Point! </div>
### 1. PRICE - (PRICE % 10000) 
    가격을 10000으로 나눈 나머지를 뺀 값을 계산
    PRICE가 25000라면 PRICE % 10000는 5000이 되고, 따라서 PRICE - (PRICE % 10000)은 20000이 됩니다.
### 2. FLOOR(PRICE/10000)*10000
    'FLOOR()' 함수를 이용해서 소수점을 제거 및 10000을 곱하여 값 계산
### 3. 노가다
    CASE WHEN (0 < PRICE) AND (PRICE < 10000) then 0
         WHEN (10000 <= PRICE) and (PRICE < 20000) then 10000
         WHEN (20000 <= PRICE) and (PRICE < 30000) then 20000
         WHEN (30000 <= PRICE) and (PRICE < 40000) then 30000
         WHEN (40000 <= PRICE) and (PRICE < 50000) then 40000
         WHEN (50000 <= PRICE) and (PRICE < 60000) then 50000
         WHEN (60000 <= PRICE) and (PRICE < 70000) then 60000
         WHEN (70000 <= PRICE) and (PRICE < 80000) then 70000
         WHEN (80000 <= PRICE) and (PRICE < 90000) then 80000
         END 