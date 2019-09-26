-- 数据库；
CREATE DATABASE `db_springboot` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

-- 英雄人物的表；
CREATE TABLE `tb_heroic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `remarks` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 测试数据；
INSERT INTO `db_springboot`.`tb_heroic` (`name`, `remarks`) VALUES ( '令狐冲', '独孤九剑传人之一，华山派岳不群之徒。后被逐出师门。任盈盈之夫，结尾与妻子封剑退隐。');
INSERT INTO `db_springboot`.`tb_heroic` (`name`, `remarks`) VALUES ( '任盈盈', '日月神教教主任我行之女，日月神教圣姑。令狐冲之妻，结尾与丈夫同退隐江湖。');
