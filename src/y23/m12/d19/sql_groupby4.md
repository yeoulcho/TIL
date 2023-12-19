## 문제
***
    테이블명(ANIMAL_INS)
    ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE
    동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부

동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성해주세요. 이때 결과는 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT NAME, COUNT(ANIMAL_ID) as COUNT 
        FROM ANIMAL_INS 
        WHERE NAME IS NOT NULL 
        GROUP BY NAME 
        HAVING COUNT(ANIMAL_ID) > 1 
        ORDER BY NAME
    

- 테이블에서 이름, COUNT 컬럼으로 횟수 선택
- WHERE로 이름이 없는 동물은 집계에서 제외
- 이름으로 GROUP BY
- HAVING으로 COUNT 2회 이상 값 추리기
- 이름순으로 정렬 

# <div align=center> Check Point! </div>
### 1. IS NOT NULL
    Null 이외의 값만 불러올 때
### 2. IS NULL
    Null 값만 불러오는 방법
