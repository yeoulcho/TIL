## 문제 
***
    테이블명(CAR_RENTAL_COMPANY_CAR)
    CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS
    자동차 ID, 자동차 종류, 일일 대여 요금(원), 자동차 옵션 리스트


CAR_RENTAL_COMPANY_CAR 테이블에서 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성해주세요. 이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 AVERAGE_FEE 로 지정해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT ROUND(AVG(DAILY_FEE),0) as AVERAGE_FEE 
        FROM CAR_RENTAL_COMPANY_CAR 
        WHERE CAR_TYPE = 'SUV'
- 일일대여 요금 평균을 내보자 
- 조건은 SUV인 차량만! (where에 조건)
- 소수점 고려 (Round)


# <div align=center> Check Point! </div>
### 1. 평균을 내는 함수 AVG
### 2. 소수점 반올림 함수 ROUND 
    ROUND(수치, 반올림 소수자리)
    ex) ROUND(124.345, 0) -> 124
        ROUND(124.345, 1) -> 124.3
