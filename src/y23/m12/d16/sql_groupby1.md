## 문제
***
    테이블명(CAR_RENTAL_COMPANY_CAR)
    CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS
    자동차 ID, 자동차 종류, 일일 대여 요금(원), 자동차 옵션 리스트

CAR_RENTAL_COMPANY_CAR 테이블에서 '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차가 자동차 종류 별로 몇 대인지 출력하는 SQL문을 작성해주세요. 이때 자동차 수에 대한 컬럼명은 CARS로 지정하고, 결과는 자동차 종류를 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT CAR_TYPE, COUNT(*) as CARS 
        FROM CAR_RENTAL_COMPANY_CAR 
        WHERE OPTIONS LIKE '%시트%' 
        GROUP BY CAR_TYPE 
        ORDER BY CAR_TYPE ASC

- GROUP BY의 이해도가 아직 떨어지는 것 같다.
- 우선 어떤 테이블이 1개니까 JOIN없음
- WHERE에 LIKE 옵션 조건 설정 (or보단 공통 '시트'로 간편하게 표기 가능)
- GROUP BY로 자동차 종류별로 그룹화를 진행
- SELECT에 CAR_TYPE와 무엇을 카운트 할 것인지 정하면 된다. * or CAR_ID 등등
- 자동차 종류 오름정렬 

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


