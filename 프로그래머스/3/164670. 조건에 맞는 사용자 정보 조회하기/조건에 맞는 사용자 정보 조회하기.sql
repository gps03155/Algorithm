-- 코드를 입력하세요
SELECT user_id,
       nickname,
       concat(city, ' ', street_address1, ' ', street_address2) as '전체주소', 
       concat(substring(tlno, 1, 3), '-', substring(tlno, 4, 4), '-', substring(tlno, 8, 4)) as '전화번호'
from (       
    select u.user_id, u.nickname, u.city, u.street_address1, u.street_address2, u.tlno       
    from used_goods_board b join used_goods_user u on b.writer_id = u.user_id
    group by b.writer_id
    having count(*) >= 3
) t
order by user_id desc
