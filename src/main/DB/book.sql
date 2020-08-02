CREATE TABLE `spring`.`book`(
  `id` BIGINT(20) NOT NULL COMMENT '主键',
  `name` VARCHAR(20) NOT NULL COMMENT '名称',
  `price` DECIMAL(18,4) NOT NULL DEFAULT 0.0000 COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `book` (`id`, `name`, `price`) VALUES (1, '口红', 5000);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (2, '我很好不用担心', 5000);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (3, '我不想改变', 5000);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (4, '口红', 5000);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (5, '口红', 5000);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (6, '不精通', 100);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (7, '黄色', 200);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (8, '好书', 3000);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (9, '证书', 5000);
INSERT INTO `book` (`id`, `name`, `price`) VALUES (10, '整个色', 6000);
