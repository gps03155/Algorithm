-- 코드를 입력하세요
SELECT animal_id, name, 
    case 
        when instr(sex_upon_intake, 'Neutered') > 0 or instr(sex_upon_intake, 'Spayed') > 0 then 'O'
        else 'X'
    end as '중성화'
from animal_ins
order by animal_id