-- 코드를 입력하세요
SELECT factory_id, factory_name, address
from food_factory
# where address like '강원도%'
where instr(address, '강원도') > 0
order by factory_id