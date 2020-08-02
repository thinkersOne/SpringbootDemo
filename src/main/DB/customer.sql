CREATE TABLE `spring`.`customer`(
  `id` BIGINT(20) NOT NULL COMMENT '主键',
  `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '名称',
  `age` INT(20) NOT NULL DEFAULT 0 COMMENT '年龄',
  `sex` CHAR(1) NOT NULL DEFAULT 'M'  COMMENT '性别',
  `city` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '城市',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `customer` (`id`, `name`, `age`, `sex`, `city`) VALUES (1, '好帅', 5, 'F', '上海');
INSERT INTO `customer` (`id`, `name`, `age`, `sex`, `city`) VALUES (8, '好帅', 15, 'M', '北京');
INSERT INTO `customer` (`id`, `name`, `age`, `sex`, `city`) VALUES (9, '好帅', 32, 'F', '广东');
INSERT INTO `customer` (`id`, `name`, `age`, `sex`, `city`) VALUES (10, '好帅', 24, 'M', '上海');
