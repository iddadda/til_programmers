-- 코드를 입력하세요
-- 조건: 흉부외과 || 일반외과
-- 조회: 이름, 아이디, 진료과, 고용일자
-- 정렬: 고용일자 내림차순 -> 이름 오름차순
SELECT dr_name, dr_id, mcdp_cd, date_format(hire_ymd, '%Y-%m-%d')
from doctor
where mcdp_cd = 'CS' or mcdp_cd = 'GS'
order by hire_ymd desc, dr_name;