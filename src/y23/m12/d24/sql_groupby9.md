## 문제
***
    테이블명(BOOK)
    BOOK_ID, CATEGORY, AUTHOR_ID, PRICE, PUBLISHED_DATE
    도서 ID, 카테고리, 저자 ID, 가격, 출판일 

    테이블명(BOOK_SALES)
    BOOK_ID, SALES_DATE, SALES
    도서 ID, 판매일, 판매량
2022년 1월의 카테고리 별 도서 판매량을 합산하고, 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL문을 작성해주세요.
결과는 카테고리명을 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT A.CATEGORY, SUM(B.SALES) as TOTAL_SALES FROM BOOK A 
    JOIN
        (SELECT *
        FROM BOOK_SALES
        WHERE YEAR(SALES_DATE)='2022' and MONTH(SALES_DATE) = '01'
        ) B
    ON A.BOOK_ID = B.BOOK_ID
    GROUP BY CATEGORY
    ORDER BY 1
- B 테이블에서 판매일이 2022-01인 판매내역 모두 선택
- A 테이블과 도서 ID가 같은 것과 JOIN
- 카테고리별로 그룹화
- 카테고리별 판매량 총합 선택
- 카테고리별 오름차순
    
## 실수 1 
    SELECT A.CATEGORY, B.TOTAL_SALES FROM BOOK A 
        INNER JOIN
        (SELECT BOOK_ID, SUM(SALES) as TOTAL_SALES
        FROM BOOK_SALES
        WHERE YEAR(SALES_DATE)='2022' and MONTH(SALES_DATE) = '01'
        GROUP BY BOOK_ID) B
        ON A.BOOK_ID = B.BOOK_ID
        GROUP BY CATEGORY
        ORDER BY 1
- 카테고리별 판매량이 제대로 합산되지 않음
- 카테고리 내에 도서 ID별로 합산됨
- 문제 원인은 CATEGORY 열을 기준으로 결과를 그룹화를 해놓고 외부 쿼리에서 A.CATEGORY와 B.TOTAL_SALES를 모두 선택하고 있습니다.
- B.TOTAL_SALES를 집계함수로 합쳐야한다.

수정 후 

    SELECT A.CATEGORY, SUM(B.TOTAL_SALES) AS TOTAL_SALES
        FROM BOOK A
        INNER JOIN (
            SELECT BOOK_ID, SUM(SALES) AS TOTAL_SALES
            FROM BOOK_SALES
            WHERE YEAR(SALES_DATE) = '2022' AND MONTH(SALES_DATE) = '01'
            GROUP BY BOOK_ID
            ) B ON A.BOOK_ID = B.BOOK_ID
            GROUP BY A.CATEGORY
            ORDER BY 1;

    