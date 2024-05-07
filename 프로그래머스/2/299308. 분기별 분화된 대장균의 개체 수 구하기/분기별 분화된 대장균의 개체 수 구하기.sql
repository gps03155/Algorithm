-- 코드를 작성해주세요
# select quarter, count(*) as ecoli_count
# from (
# select concat('Q', year(differentiation_date)) as quarter
# from ecoli_data
#     ) as t
# group by quarter

select quarter, count(*) as ecoli_count
from (select concat(quarter(differentiation_date), 'Q') as quarter
from ecoli_data
) as t
group by quarter