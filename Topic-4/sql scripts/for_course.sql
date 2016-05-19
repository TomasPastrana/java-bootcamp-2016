use highschool;

select c.course_name, concat(t.last_name, ", ", t.first_name) as teacher, concat(s.last_name, ", ", s.first_name) as student
from course c, teachers t, students s, teachers_has_course tc, students_has_course sc

where c.id_course = tc.course_id_course
and t.id_teacher = tc.teachers_id_teacher
and s.id_student = sc.students_id_student
and c.id_course = sc.course_id_course
and c.course_name = "PHP"
order by student;