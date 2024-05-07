select count(*) as fish_count
from fish_info info join fish_name_info name on info.fish_type = name.fish_type
where fish_name in ('BASS', 'SNAPPER')