-- 코드를 작성해주세요
select t.fish_count, fish_name
from (
select fish_type, fish_name, count(*) as fish_count
from fish_name_info n join fish_info using(fish_type)
group by fish_type, fish_name
) t 
order by fish_count desc