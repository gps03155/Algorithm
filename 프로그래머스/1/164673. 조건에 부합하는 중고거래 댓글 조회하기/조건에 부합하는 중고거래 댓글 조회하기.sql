-- 코드를 입력하세요
SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents, date_format(r.created_date, '%Y-%m-%d') as created_date
from used_goods_reply r join used_goods_board b on (r.board_id = b.board_id)
where b.created_date between '2022-10-01' and '2022-10-31'
order by r.created_date, b.title;