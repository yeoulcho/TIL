## 문제
***
    테이블명(REST_INFO)
    REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS, TEL
    식당 ID, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호

REST_INFO 테이블에서 음식종류별로 즐겨찾기수가 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요. 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT A.FOOD_TYPE, A.REST_ID, A.REST_NAME, B.FAVORITES 
        FROM REST_INFO A
        JOIN (SELECT FOOD_TYPE, MAX(FAVORITES) as FAVORITES 
        FROM REST_INFO
        GROUP BY FOOD_TYPE ) as B
        ON A.FOOD_TYPE = B.FOOD_TYPE and A.FAVORITES = B.FAVORITES
        ORDER BY FOOD_TYPE DESC
- 즐겨찾기 수 많은 숫자를 찾고 그에 해당하는 식당들 정보를 매칭하기 위해 JOIN
- A 테이블에서 식당 정보 선택, B 테이블에서 음식종류와 즐겨찾기수 선택
- A와 B의 일치 조건 설정(음식종류 & 즐겨찾기 수)
- 음식종류로 내림차순

## 실수 1 
    SELECT FOOD_TYPE, REST_ID, REST_NAME, MAX(FAVORITES) as FAVORITES 
        FROM REST_INFO 
        GROUP BY FOOD_TYPE
        ORDER BY FOOD_TYPE DESC
- 너무 단순하게 생각함
- 원하는거 행 선택하고 그룹화하면 될줄 알았음
- FAVORITES는 그룹별 max값이 잘 나오지만 REST_ID, REST_NAME는 그룹 조건에 없기 때문에 랜덤값이 나와 오류가 발생하게 됨
- FOOD_TYPE, REST_ID, REST_NAME은 아마 첫번째 행이 나올 것으로 예상

## 실수 2
    ON A.FOOD_TYPE = B.FOOD_TYPE AND A.MAX(FAVORITES) = B.FAVORITES
- 오류의 원인은 A.MAX(FAVORITES)
- SQL에서는 테이블 별칭을 사용하여 컬럼을 참조하므로 A.MAX(FAVORITES)는 올바른 문법이 아닙니다. 
- A.MAX(FAVORITES)를 사용하지 않아야함
    