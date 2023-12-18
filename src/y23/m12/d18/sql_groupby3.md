## 문제
***
    테이블명(APPOINTMENT)
    APNT_YMD, APNT_NO, PT_NO, MCDP_CD, MDDR_ID, APNT_CNCL_YN, APNT_CNCL_YMD
    진료예약일시, 진료예약번호, 환자번호, 진료과코드, 의사ID, 예약취소여부, 예약취소날짜


APPOINTMENT 테이블에서 2022년 5월에 예약한 환자 수를 진료과코드 별로 조회하는 SQL문을 작성해주세요. 이때, 컬럼명은 '진료과 코드', '5월예약건수'로 지정해주시고 결과는 진료과별 예약한 환자 수를 기준으로 오름차순 정렬하고, 예약한 환자 수가 같다면 진료과 코드를 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT MCDP_CD as 진료과코드, COUNT(*) as 5월예약건수 
        FROM APPOINTMENT 
        WHERE YEAR(APNT_YMD)='2022' and MONTH(APNT_YMD) ='05'
        GROUP BY MCDP_CD 
        ORDER BY 2,1

- 우선 어떤 테이블이 1개니까 JOIN없음
- WHERE에 LIKE로 "2022-05-%" 로도 조건 설정 가능
- GROUP BY로 진료과 코드
- SELECT에 MCDP_CD와 무엇을 카운트 할 것인지 정하면 된다. * or APNT_NO 등등
- 예약건수, 진료과코드 오름정렬 

# <div align=center> Check Point! </div>
### 1. DATE_FORMAT 말고 LIKE or YEAR, MONTH 등 다양한 방법
    DATE_FORMAT(APNT_YMD, '%Y-%m') = '2022-05'
    LIKE "2022-05-%"
    YEAR(APNT_YMD)='2022' and MONTH(APNT_YMD) ='05'
    APNT_NO BETWEEN '2022-05-01' and '2022-05-31'
    



