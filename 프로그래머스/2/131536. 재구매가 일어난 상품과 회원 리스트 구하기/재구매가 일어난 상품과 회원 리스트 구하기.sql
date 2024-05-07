-- 코드를 입력하세요
# select user_id, product_id, count(*)
# from online_sale
# group by user_id, product_id
# order by user_id, product_id desc


select user_id, product_id
from (select user_id, product_id, count(*) as count
    from online_sale
    group by user_id, product_id
    # having count(*) > 1
) as t 
 where count > 1
order by user_id, product_id desc