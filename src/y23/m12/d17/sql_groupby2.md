## 문제
***
    테이블명(ANIMAL_OUTS)
    ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME
    동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부

보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.
<br>
## 정답 & 풀이과정
***
    SELECT 
        HOUR(DATETIME),
        COUNT(ANIMAL_ID)
    FROM ANIMAL_OUTS
    WHERE HOUR(DATETIME) BETWEEN '9' AND '19'
    GROUP BY 1
    ORDER BY 1

<br>

    SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
        FROM ANIMAL_OUTS
        GROUP BY HOUR 
        HAVING HOUR BETWEEN 9 AND 19
        ORDER BY HOUR;
    

- GROUP BY의 이해도 아직 미흡
- CASE WHEN THEN END 활용해보려 했으나 패스


- DATETIME에 HOUR 시간만 따로 떼오고 HOUR로 재명명
- GROUP BY HOUR
- WHERE 혹은 HAVING에 조건 BETWEEN으로 활용 9시에서 19시 사이 설정
- 시간으로 오름정렬 

# <div align=center> Check Point! </div>
### 1. GROUP BY 1
    숫자는 필드를 말함
    ex) 1 => 첫번째 필드
        2 => 두번째 필드
   
