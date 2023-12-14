## 문제
***
    테이블명(FOOD_FACTORY)
    FACTORY_ID, FACTORY_NAME, ADDRESS, TLNO
    공장 ID, 공장 이름, 주소, 전화번호


FOOD_FACTORY 테이블에서 강원도에 위치한 식품공장의 공장 ID, 공장 이름, 주소를 조회하는 SQL문을 작성해주세요. 이때 결과는 공장 ID를 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT FACTORY_ID, FACTORY_NAME, ADDRESS 
        FROM FOOD_FACTORY 
        WHERE ADDRESS LIKE'%강원도%'
        ORDER BY FACTORY_ID

- 어느 컬럼을 선택할지 고르자
- LIKE써서 주소지 강원도인 곳 조건 설정
- 공장ID 오름정렬 

# <div align=center> Check Point! </div>
### 1. LIKE 문자열 패턴 검색 ( %, _ )
    WHERE 컬럼 LIKE '문자'
    % => 글자 상관없음
    _ => 한글자

    ex) 
    WHERE 컬럼 LIKE '%라면%'
    앞뒤에 무슨 글자가 오던지 '라면'이라는 문자가 있는 ROW를 출력합니다

    SELECT * FROM TABLE WHERE LIKE '_라면%'
    뒤에는 아무 글자 오던 상관없이 맨 앞에 한 글자 뒤에 '라면' 글자가 있는 ROW를 출력합니다


