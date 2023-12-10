## 문제 
***
    테이블명(DOCTOR)
    DR_NAME, DR_ID, LCNS_NO, HIRE_YMD, MCDP_CD, TLNO
    의사이름, 의사ID, 면허번호, 고용일자, 진료과코드, 전화번호


DOCTOR 테이블에서 진료과가 흉부외과(CS)이거나 일반외과(GS)인 의사의 이름, 의사ID, 진료과, 고용일자를 조회하는 SQL문을 작성해주세요. 이때 결과는 고용일자를 기준으로 내림차순 정렬하고, 고용일자가 같다면 이름을 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD 
        FROM DOCTOR WHERE MCDP_CD = 'CS'or MCDP_CD='GS' 
        ORDER BY HIRE_YMD DESC, DR_NAME
- 어느 컬럼을 선택할지 고르자
- 조건은 진료과가 CS? GS? (where에 조건)
- 날짜표시형식 (DATE_FORMAT)


# <div align=center> Check Point! </div>
### 1. DATETIME을 원하는 형식으로 바꾸기
     DATE_FORMAT(CREATE_DATE, '%y-%m-%d') AS CREATE_DATE
| FORMAT | 설명                             | FORMAT | 설명                             |
|--------|--------------------------------|:-------|--------------------------------|
| %M     | Month 월(Janeary, Feburary)     | %Y     | Year 연도(1999, 2000)            |
| %m     | Month 월(01, 02, 03)            | %y     | Year 연도(99, 00)                |
| %W     | Day of Week 요일(Sunday, Monday) | %X     | Year 연도(1999, 2000), %V와 같이 쓰임 |
| %D     | Month 월(1st1 2nd, 3rd)         | %x     | Year 연도(1999, 2000), %v와 같이 쓰임 |
| %a     | Day of Week 요일(Sun, Mon)       | %c     | Month(1, 2)                    |
| %d     | Day 일(00, 01)                  | %b     | Month(Jen, Feb)                |
| %e     | Day 일(0, 1)                    | %j     | n번째 일(100, 365)                |
| %H     | Hour 시(00, 01, 24) 24시간 형태     | %i     | Minute 분(00, 01, 59)           |                                |
| %h     | Hour 시(00, 02, 12) 12시간 형태     | %r     | hh:mm:ss AP                    |
| %I     | Hour 시(00, 01, 12) 12시간 형태     | %T     | hh:mm:ss                       |
| %l     | Hour 시(1, 2, 12) 12시간 형태       | %S, %s | Second 초                       |                                |        |                                |
| %p     | AP, PM                         | %w     | Day Of Week(0, 1, 2) 0부터 일요일   |
| %U     | Week 주(시작: 일요일)                | %u     | Week 주(시작: 월요일)                |
| %V     | Week 주(시작: 일요일)                | %v     | Week 주(시작: 월요일)                |



### 2. 조건문 OR 
    OR을 사용해서 원하는 조건을 걸 수 있다. 
    ex) MCDP_CD = 'CS'or MCDP_CD='GS' 
      
