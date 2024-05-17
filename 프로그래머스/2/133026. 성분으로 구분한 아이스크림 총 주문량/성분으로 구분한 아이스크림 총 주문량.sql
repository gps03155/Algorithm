-- 코드를 입력하세요
SELECT i.ingredient_type, sum(f.total_order) as total_order
from icecream_info i join first_half f on f.flavor = i.flavor
group by i.ingredient_type
order by total_order