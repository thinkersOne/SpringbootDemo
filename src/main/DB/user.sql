CREATE TABLE `spring`.`user`(
  `id` BIGINT(20) NOT NULL COMMENT '主键',
  `version` BIGINT(20) NOT NULL COMMENT '版本',
  `username` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `age` INT(20) NOT NULL DEFAULT 0 COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (1, 1, 'Tom', 50);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 2, 'asd', 43);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 3, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 4, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 5, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 6, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 7, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 8, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 9, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 10, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 11, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 12, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 13, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 14, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 15, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 16, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 17, 'zhihao', 20);
INSERT INTO `user` (`version`, `id`, `username`, `age`) VALUES (2, 18, 'zhihao', 20);
