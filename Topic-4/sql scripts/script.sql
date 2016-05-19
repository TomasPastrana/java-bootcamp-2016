-- MySQL Script generated by MySQL Workbench
-- 05/18/16 11:55:57
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema highSchool
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema highSchool
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `highSchool` DEFAULT CHARACTER SET utf8 ;
USE `highSchool` ;

-- -----------------------------------------------------
-- Table `highSchool`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highSchool`.`course` (
  `id_course` INT NOT NULL AUTO_INCREMENT,
  `course_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id_course`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `highSchool`.`teachers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highSchool`.`teachers` (
  `id_teacher` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `date_of_birth` DATETIME NULL,
  PRIMARY KEY (`id_teacher`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `highSchool`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highSchool`.`students` (
  `id_student` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `date_of_birth` DATETIME NULL,
  PRIMARY KEY (`id_student`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `highSchool`.`teachers_has_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highSchool`.`teachers_has_course` (
  `teachers_id_teacher` INT NOT NULL,
  `course_id_course` INT NOT NULL,
  PRIMARY KEY (`teachers_id_teacher`, `course_id_course`),
  INDEX `fk_teachers_has_course_course1_idx` (`course_id_course` ASC),
  INDEX `fk_teachers_has_course_teachers_idx` (`teachers_id_teacher` ASC),
  CONSTRAINT `fk_teachers_has_course_teachers`
    FOREIGN KEY (`teachers_id_teacher`)
    REFERENCES `highSchool`.`teachers` (`id_teacher`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_teachers_has_course_course1`
    FOREIGN KEY (`course_id_course`)
    REFERENCES `highSchool`.`course` (`id_course`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `highSchool`.`students_has_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highSchool`.`students_has_course` (
  `students_id_student` INT NOT NULL AUTO_INCREMENT,
  `course_id_course` INT NOT NULL,
  `first_note` INT NULL,
  `second_note` INT NULL,
  `final_note` INT NULL,
  PRIMARY KEY (`students_id_student`, `course_id_course`),
  INDEX `fk_students_has_course_course1_idx` (`course_id_course` ASC),
  INDEX `fk_students_has_course_students1_idx` (`students_id_student` ASC),
  CONSTRAINT `fk_students_has_course_students1`
    FOREIGN KEY (`students_id_student`)
    REFERENCES `highSchool`.`students` (`id_student`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_students_has_course_course1`
    FOREIGN KEY (`course_id_course`)
    REFERENCES `highSchool`.`course` (`id_course`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `highSchool`.`schedule`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highSchool`.`schedule` (
  `id_schedule` INT NOT NULL AUTO_INCREMENT,
  `schedule_day` VARCHAR(45) NULL,
  `schedule_hour` TIME(0) NULL,
  PRIMARY KEY (`id_schedule`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `highSchool`.`course_has_schedule`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `highSchool`.`course_has_schedule` (
  `course_id_course` INT NOT NULL,
  `schedule_id_schedule` INT NOT NULL,
  PRIMARY KEY (`course_id_course`, `schedule_id_schedule`),
  INDEX `fk_course_has_schedule_schedule1_idx` (`schedule_id_schedule` ASC),
  INDEX `fk_course_has_schedule_course1_idx` (`course_id_course` ASC),
  CONSTRAINT `fk_course_has_schedule_course1`
    FOREIGN KEY (`course_id_course`)
    REFERENCES `highSchool`.`course` (`id_course`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_course_has_schedule_schedule1`
    FOREIGN KEY (`schedule_id_schedule`)
    REFERENCES `highSchool`.`schedule` (`id_schedule`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `highSchool`.`course`
-- -----------------------------------------------------
START TRANSACTION;
USE `highSchool`;
INSERT INTO `highSchool`.`course` (`id_course`, `course_name`) VALUES (1, 'PHP');
INSERT INTO `highSchool`.`course` (`id_course`, `course_name`) VALUES (2, 'mySQL');
INSERT INTO `highSchool`.`course` (`id_course`, `course_name`) VALUES (3, 'JavaScript');

COMMIT;


-- -----------------------------------------------------
-- Data for table `highSchool`.`teachers`
-- -----------------------------------------------------
START TRANSACTION;
USE `highSchool`;
INSERT INTO `highSchool`.`teachers` (`id_teacher`, `first_name`, `last_name`, `date_of_birth`) VALUES (3, 'Federico', 'Daza', '1975-04-23');
INSERT INTO `highSchool`.`teachers` (`id_teacher`, `first_name`, `last_name`, `date_of_birth`) VALUES (1, 'Ana', 'Trenzo', '1969-08-02');
INSERT INTO `highSchool`.`teachers` (`id_teacher`, `first_name`, `last_name`, `date_of_birth`) VALUES (2, 'Rosa', 'Perez', '1980-09-05');

COMMIT;


-- -----------------------------------------------------
-- Data for table `highSchool`.`students`
-- -----------------------------------------------------
START TRANSACTION;
USE `highSchool`;
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (14, 'Jhon', 'Smith', '1975-01-01');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (1, 'Tomás', 'Pastrana', '1994-06-22');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (2, 'Pablo', 'Hernandez', '1995-03-14');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (3, 'Teresa', 'Lomas', '1989-06-19');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (4, 'Marta', 'García', '1992-11-23');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (5, 'Sergio', 'Perez', '1991-12-04');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (6, 'Gino', 'Long', '1995-03-30');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (7, 'Pepo', 'Aguiar', '1993-04-29');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (8, 'Juan', 'Romano', '1992-02-28');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (9, 'Nico', 'Reynoso', '1995-01-15');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (10, 'Agus', 'Cabral', '1995-08-15');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (11, 'Lautaro', 'Olmos', '1993-01-01');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (12, 'Armando', 'EstebanQuito', '1993-01-02');
INSERT INTO `highSchool`.`students` (`id_student`, `first_name`, `last_name`, `date_of_birth`) VALUES (13, 'Susana', 'Horia', '1993-01-03');

COMMIT;


-- -----------------------------------------------------
-- Data for table `highSchool`.`teachers_has_course`
-- -----------------------------------------------------
START TRANSACTION;
USE `highSchool`;
INSERT INTO `highSchool`.`teachers_has_course` (`teachers_id_teacher`, `course_id_course`) VALUES (3, 2);
INSERT INTO `highSchool`.`teachers_has_course` (`teachers_id_teacher`, `course_id_course`) VALUES (1, 1);
INSERT INTO `highSchool`.`teachers_has_course` (`teachers_id_teacher`, `course_id_course`) VALUES (2, 3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `highSchool`.`students_has_course`
-- -----------------------------------------------------
START TRANSACTION;
USE `highSchool`;
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (14, 3, 5, 5, 5);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (14, 1, 4, 4, 4);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (14, 2, 6, 6, 6);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (1, 3, 8, 7, 8);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (1, 1, 4, 9, 7);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (2, 3, 3, 8, 7);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (3, 3, 5, 4, 6);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (3, 1, 8, 2, 4);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (3, 2, 7, 3, 4);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (4, 3, 6, 4, 2);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (4, 2, 3, 2, 1);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (5, 1, 7, 3, 3);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (6, 3, 4, 3, 1);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (6, 1, 2, 4, 5);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (6, 2, 7, 9, 10);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (7, 1, 9, 2, 3);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (7, 2, 6, 5, 6);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (8, 3, 3, 3, 4);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (9, 3, 5, 7, 8);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (9, 1, 7, 3, 4);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (9, 2, 3, 3, 2);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (10, 3, 2, 10, 10);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (10, 1, 7, 7, 8);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (11, 2, 5, 7, 7);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (12, 3, 9, 6, 7);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (12, 1, 5, 3, 3);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (12, 2, 7, 1, 2);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (13, 3, 6, 4, 4);
INSERT INTO `highSchool`.`students_has_course` (`students_id_student`, `course_id_course`, `first_note`, `second_note`, `final_note`) VALUES (13, 1, 3, 3, 3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `highSchool`.`schedule`
-- -----------------------------------------------------
START TRANSACTION;
USE `highSchool`;
INSERT INTO `highSchool`.`schedule` (`id_schedule`, `schedule_day`, `schedule_hour`) VALUES (1, 'monday', '08:00:00');
INSERT INTO `highSchool`.`schedule` (`id_schedule`, `schedule_day`, `schedule_hour`) VALUES (2, 'tuesday', '09:00:00');
INSERT INTO `highSchool`.`schedule` (`id_schedule`, `schedule_day`, `schedule_hour`) VALUES (3, 'wednesday', '10:00:00');
INSERT INTO `highSchool`.`schedule` (`id_schedule`, `schedule_day`, `schedule_hour`) VALUES (4, 'thursday', '11:00:00');
INSERT INTO `highSchool`.`schedule` (`id_schedule`, `schedule_day`, `schedule_hour`) VALUES (5, 'friday', '12:00:00');

COMMIT;


-- -----------------------------------------------------
-- Data for table `highSchool`.`course_has_schedule`
-- -----------------------------------------------------
START TRANSACTION;
USE `highSchool`;
INSERT INTO `highSchool`.`course_has_schedule` (`course_id_course`, `schedule_id_schedule`) VALUES (1, 1);
INSERT INTO `highSchool`.`course_has_schedule` (`course_id_course`, `schedule_id_schedule`) VALUES (2, 2);
INSERT INTO `highSchool`.`course_has_schedule` (`course_id_course`, `schedule_id_schedule`) VALUES (3, 3);
INSERT INTO `highSchool`.`course_has_schedule` (`course_id_course`, `schedule_id_schedule`) VALUES (2, 4);
INSERT INTO `highSchool`.`course_has_schedule` (`course_id_course`, `schedule_id_schedule`) VALUES (3, 5);

COMMIT;
