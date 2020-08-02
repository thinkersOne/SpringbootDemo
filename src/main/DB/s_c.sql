CREATE TABLE `spring`.`s_c`(
  `cid` BIGINT(20) NOT NULL COMMENT '关联id',
  `sid` BIGINT(20) NOT NULL COMMENT '关联id'
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `s_c` (`cid`, `sid`) VALUES (1, 5);
INSERT INTO `s_c` (`cid`, `sid`) VALUES (2, 5);
INSERT INTO `s_c` (`cid`, `sid`) VALUES (1, 6);
INSERT INTO `s_c` (`cid`, `sid`) VALUES (2, 6);
