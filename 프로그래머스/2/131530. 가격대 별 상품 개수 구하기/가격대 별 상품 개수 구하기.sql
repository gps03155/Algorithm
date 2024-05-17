-- 코드를 입력하세요
SELECT rpad(price div 10000, 5, 0) as price_group, 
        count(price div 10000) as products
from product
group by price div 10000
order by price_group