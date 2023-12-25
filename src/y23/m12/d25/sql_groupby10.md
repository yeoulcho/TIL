## 문제
***
    테이블명(CAR_RENTAL_COMPANY_RENTAL_HISTORY)
    HISTORY_ID, CAR_ID, START_DATE, END_DATE
    자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일
CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고, 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼(컬럼명: AVAILABILITY)을 추가하여 자동차 ID와 AVAILABILITY 리스트를 출력하는 SQL문을 작성해주세요. 이때 반납 날짜가 2022년 10월 16일인 경우에도 '대여중'으로 표시해주시고 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.
<br>

## 정답 & 풀이과정
***
    SELECT CAR_ID, 
        MAX(CASE WHEN '2022-10-16' BETWEEN DATE_FORMAT(START_DATE,'%Y-%m-%d') AND DATE_FORMAT(END_DATE,'%Y-%m-%d') 
            THEN '대여중' 
            ELSE '대여 가능' 
            END) AS AVAILABILITY 
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
        GROUP BY CAR_ID 
        ORDER BY CAR_ID DESC
- 대여 가능 여부는 대여 시작일과 종료일 사이에 2022-10-16이 포함되면 대여중, 아니면 대여 가능
- 자동차 ID 그룹화
- 자동차 ID 내림차순

## 다른 풀이 1
    select distinct A.car_id, 
        case when B.car_id is not null then '대여중' else '대여 가능' end as availability
        from car_rental_company_rental_history A
        left outer join
            (
            select distinct car_id
            from car_rental_company_rental_history
            where start_date <= '2022-10-16'
            and end_date >= '2022-10-16'
            ) B
        on A.car_id = B.car_id
        order by car_id desc
- B 테이블은 대여시작일이 2022-10-16이하이고 대여종료일이 2022-10-16 이상인 자동차_id 중복없이 선택 = 대여중인 자동차ID
- A 테이블과 left outer join
- 공통된 자동차 ID가 있으면 대여중, null이라면 대여 가능

## 다른 풀이 2
    WITH IS_RENTED AS (SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                   WHERE START_DATE <= '2022-10-16' AND END_DATE >= '2022-10-16')

    SELECT DISTINCT CAR_ID,
        CASE WHEN CAR_ID IN (SELECT * FROM IS_RENTED) THEN '대여중'
        ELSE '대여 가능'
        END AS AVAILABILITY
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        ORDER BY CAR_ID DESC

## 실수 1 
    SELECT CAR_ID, 
        CASE WHEN '2022-10-16' BETWEEN DATE_FORMAT(START_DATE,'%Y-%m-%d') AND DATE_FORMAT(END_DATE,'%Y-%m-%d') 
            THEN '대여중' 
            ELSE '대여 가능' 
            END AS AVAILABILITY 
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
        GROUP BY CAR_ID 
        ORDER BY CAR_ID DESC
- 차에 대여 횟수가 여러번일 수 있음 그걸 고려하지 않았다. -> MAX를 활용

수정 후 

    SELECT CAR_ID, 
        MAX(
            CASE WHEN '2022-10-16' BETWEEN DATE_FORMAT(START_DATE,'%Y-%m-%d') AND DATE_FORMAT(END_DATE,'%Y-%m-%d') 
                THEN '대여중' 
                ELSE '대여 가능' 
            END) 
            AS AVAILABILITY 
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
        GROUP BY CAR_ID 
        ORDER BY CAR_ID DESC

    