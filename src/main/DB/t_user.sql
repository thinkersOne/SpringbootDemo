CREATE TABLE `spring`.`t_user`(
  `userid` BIGINT(20) NOT NULL COMMENT '主键id',
  `username` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '密码',
  PRIMARY KEY (`userid`)
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_esperanto_ci;


INSERT INTO `t_user` (`userid`, `username`, `password`) VALUES (1, 'jack', '123456');
INSERT INTO `t_user` (`userid`, `username`, `password`) VALUES (2, 'tom', '321654');
INSERT INTO `t_user` (`userid`, `username`, `password`) VALUES (3, 'mark', '526341');
INSERT INTO `t_user` (`userid`, `username`, `password`) VALUES (4, 'burry', '415236');
