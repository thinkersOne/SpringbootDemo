CREATE TABLE `spring`.`course`(
  `id` BIGINT(20) NOT NULL COMMENT '主键',
  `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `course` (`id`, `name`) VALUES (1, 'Java');
INSERT INTO `course` (`id`, `name`) VALUES (2, 'Oracle');
