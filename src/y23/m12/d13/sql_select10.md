## 문제
***
    테이블명(ANIMAL_INS)
    ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE
    동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부


동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.
<br>
## 정답 & 풀이과정
***
    1) SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME LIMIT 1

    2) SELECT NAME FROM ANIMAL_INS WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS)
- 어느 컬럼을 선택할지 고르자
- 보호시작일을 오름차순으로 정렬
- 보여주고 싶은 자료 갯수 (LIMIT or MIN) 

# <div align=center> Check Point! </div>
### 1. limit
    LIMIT 숫자 => 숫자의 갯수만큼 데이터 보여줌
    LIMIT 시작위치, 반환갯수 => ex) limit 2,3 => 3번째 부터 3개를 보여줌
                            *시작위치는 0부터 센다!!*
### 2. MIN & MAX
    2-1. SELECT MAX(column_name) FROM table_name;
         MAX() 은 선택된 칼럼의 가장 큰 값을 가져옵니다.
    
    2-2. SELECT MIN(column_name) FROM table_name;
         MIN() 은 선택된 칼럼의 가장 작은 값을 가져옵니다.

