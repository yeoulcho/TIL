## 문제
***
    테이블명(USED_GOODS_BOARD)
    BOARD_ID, WRITER_ID, TITLE, CONTENTS, PRICE, CREATED_DATE, STATUS, VIEWS
    게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수

    테이블명(USED_GOODS_USER)
    USER_ID, NICKNAME, CITY, STREET_ADDRESS1, STREET_ADDRESS2, TLNO
    회원 ID, 닉네임, 시, 도로명 주소, 상세 주소, 전화번호
USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요. 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.
<br>
## 정답 & 풀이과정
***
    SELECT B.USER_ID, B.NICKNAME, A.TOTAL_SALES 
        FROM (SELECT 
                WRITER_ID, SUM(PRICE) as TOTAL_SALES 
                FROM USED_GOODS_BOARD 
                WHERE STATUS='DONE' 
                GROUP BY WRITER_ID) A 
        JOIN USED_GOODS_USER B 
        ON A.WRITER_ID = B.USER_ID and TOTAL_SALES >= 700000 
        GROUP BY B.USER_ID 
        ORDER BY 3
- 총 거래 금액을 계산하고 그에 해당하는 회원의 ID랑 닉네임 가져오기 위해 JOIN
- A 테이블에서 작성자 ID, 거래 총금액 조건은 거래완료, 총합을 구하기 위해 그룹화, B 테이블에서 회원 ID, 닉네임 선택
- A와 B의 일치 조건 설정(작성자 ID = 회원 ID, 70만원 이상)
- 거래 총금액으로 오름차순

## 실수 1 
    TOTAL_SALES >= 700000 
- 70만원이상 조건 잊었음!!

    