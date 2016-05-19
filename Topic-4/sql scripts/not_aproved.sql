use highschool;

select c.course_name, round((count(*)*100)/10, 2) as not_aproved

from course c, students_has_course sc

where c.id_course = sc.course_id_course
and c.course_name = "PHP"
and sc.final_note < 4;