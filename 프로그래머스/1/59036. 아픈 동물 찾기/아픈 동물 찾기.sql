-- 코드를 입력하세요
-- 1. 조회: 아픈 동물 ID, 이름
-- 2. 정렬: 아이디 순
SELECT animal_id, name
from animal_ins
where intake_condition = 'Sick';