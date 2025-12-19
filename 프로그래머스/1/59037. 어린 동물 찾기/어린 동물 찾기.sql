-- 코드를 입력하세요
-- 조회: 동물 아이디, 이름
-- 정렬: 아이디순
-- 조건: 젊은 동물(Neutered)
SELECT animal_id, name
from animal_ins
where intake_condition not like 'Aged'
order by animal_id;