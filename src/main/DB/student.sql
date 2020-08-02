CREATE TABLE `spring`.`student`(
  `id` BIGINT(20) NOT NULL COMMENT '主键id',
  `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `student` (`id`, `name`) VALUES (5, '张三');
INSERT INTO `student` (`id`, `name`) VALUES (6, '李四');
