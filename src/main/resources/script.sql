-- Schema creation script
CREATE SCHEMA `schedulerApplication` ;
-- Roll creation script
INSERT INTO `schedulerApplication`.`roles` (`name`) VALUES ('ROLE_USER');
INSERT INTO `schedulerApplication`.`roles` (`name`) VALUES ('ROLE_ADMIN');