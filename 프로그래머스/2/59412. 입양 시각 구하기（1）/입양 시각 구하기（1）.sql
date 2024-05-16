-- 코드를 입력하세요
SELECT hour(datetime), count(*) as count
from animal_outs
where hour(datetime) between 9 and 19
      and minute(datetime) between 00 and 59
group by hour(datetime)
order by hour(datetime)
