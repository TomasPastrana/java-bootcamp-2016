use highschool;

select concat(t.last_name, ", ", t.first_name) as teacher, s.schedule_day, s.schedule_hour, c.course_name
from teachers t, course c, schedule s, course_has_schedule cs, teachers_has_course tc

where c.id_course = cs.course_id_course = tc.course_id_course
and s.id_schedule = cs.schedule_id_schedule
and t.id_teacher = tc.teachers_id_teacher
and t.first_name = "Ana"
order by s.id_schedule;