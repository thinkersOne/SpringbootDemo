CREATE TABLE `spring`.`orders`(
  `id` BIGINT(20) NOT NULL COMMENT '主键',
  `address` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '地址',
  `price` DECIMAL(18,4) NOT NULL DEFAULT 0.0000 COMMENT '价格',
  `cid` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '关联id',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `orders` (`id`, `address`, `price`, `cid`) VALUES (1, '广东', 5000, NULL);
INSERT INTO `orders` (`id`, `address`, `price`, `cid`) VALUES (2, '上海', 1000, NULL);
INSERT INTO `orders` (`id`, `address`, `price`, `cid`) VALUES (6, '上海', 1000, 8);
INSERT INTO `orders` (`id`, `address`, `price`, `cid`) VALUES (7, '广东', 5000, 9);
INSERT INTO `orders` (`id`, `address`, `price`, `cid`) VALUES (8, '上海', 1000, 9);
INSERT INTO `orders` (`id`, `address`, `price`, `cid`) VALUES (9, '广东', 5000, 10);
INSERT INTO `orders` (`id`, `address`, `price`, `cid`) VALUES (10, '上海', 1000, 10);
