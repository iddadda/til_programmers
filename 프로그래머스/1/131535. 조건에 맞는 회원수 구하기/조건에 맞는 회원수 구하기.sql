-- 코드를 입력하세요
-- 조회: 회원 수
-- 조건: 2021년 가입 회원 중 나이가 20세 이상 29세 이하
SELECT count(user_id) as users
from USER_INFO
where JOINED >= '2021-01-31' and joined <= '2021-12-31' and age >= 20 and age <= 29;
