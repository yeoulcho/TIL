## 문제 
***
    테이블명(BOOK)
    BOOK_ID, CATEGORY, AUTHOR_ID, PRICE, PUBLISHED_DATE
    도서 ID, 카테고리, 저자 ID, 판매가, 출판일


BOOK 테이블에서 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트를 찾아서 도서 ID(BOOK_ID), 출판일 (PUBLISHED_DATE)을 출력하는 SQL문을 작성해주세요.
결과는 출판일을 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE 
        FROM BOOK 
        WHERE CATEGORY = '인문' and DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') = DATE_FORMAT(PUBLISHED_DATE, '2021-%m-%d') 
        ORDER BY PUBLISHED_DATE
- 어느 컬럼을 선택할지 고르자
- 조건은 카테고리 인문, 2021년도 출간 (where에 조건)
- 날짜표시형식 (DATE_FORMAT)
- 출판일 순으로 오름정렬


# <div align=center> Check Point! </div>
### 1. DATETIME을 원하는 형식으로 바꾸기
     DATE_FORMAT(CREATE_DATE, '%y-%m-%d') AS CREATE_DATE

      
