/*
Navicat MySQL Data Transfer

Source Server         : MyDemo
Source Server Version : 50728
Source Host           : localhost:3306
Source Database       : library

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-06-09 12:05:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` char(32) DEFAULT NULL,
  `book_name` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `synopsis` varchar(255) DEFAULT NULL COMMENT '简介',
  `publisher` varchar(255) DEFAULT NULL,
  `publication_date` date DEFAULT NULL,
  `last` int(11) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '9787229042066', '三体全集', '刘慈欣', '地球往事三部曲', '重庆出版社', '2012-01-01', '2', '');
INSERT INTO `book` VALUES ('2', '9787108009821', '万历十五年', '黄仁宇', '见微知著，历史观的颠覆', '生活·读书·新知三联书店', '1997-05-01', '3', null);
INSERT INTO `book` VALUES ('3', '9787200065039', '诗经', '佚名', '思无邪', '北京出版社', '2006-07-02', '5', '');
INSERT INTO `book` VALUES ('4', '9787506365437', '活着', '余华', '生的苦难与伟大', '作家出版社', '2012-08-01', '6', null);
INSERT INTO `book` VALUES ('5', '9787544253994', '百年孤独', '加西亚·马尔克斯', '魔幻现实主义代表作', '南海出版公司', '2011-06-01', '2', null);
INSERT INTO `book` VALUES ('6', '9787020008728', '三国演义', '罗贯中', '是非成败转头空', '人民文学出版社', '1998-05-01', '3', null);
INSERT INTO `book` VALUES ('7', '9787020042494', '小王子', '圣埃克苏佩里', '献给长成大人的孩子们', '人民文学出版社', '2003-08-01', '8', null);
INSERT INTO `book` VALUES ('8', '9787537823425', '边城', '沈从文', '一切都充满了善，然而到处是不凑巧', '北岳文艺出版社', '2012-01-01', '5', '边城==编程');

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` char(32) DEFAULT NULL,
  `book_name` varchar(255) DEFAULT NULL,
  `reader_id` char(32) DEFAULT NULL,
  `reader_name` varchar(20) DEFAULT NULL,
  `card_id` char(32) DEFAULT NULL,
  `begin_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of borrow
-- ----------------------------
INSERT INTO `borrow` VALUES ('1', '9787229042066', '三体全集', '202005001', '周瑜', '0101002', '2020-05-26', '2020-07-18');
INSERT INTO `borrow` VALUES ('2', '9787544253994', '百年孤独', '202005003', '诸葛亮', '0301002', '2020-05-26', '2020-07-18');
INSERT INTO `borrow` VALUES ('3', '9787506365437', '活着', '202005004', '曹操', '0201001', '2020-06-04', '2020-07-03');
INSERT INTO `borrow` VALUES ('4', '9787020042494', '小王子', '202005002', '甄姬', '0202032', '2020-06-09', '2020-06-25');

-- ----------------------------
-- Table structure for document
-- ----------------------------
DROP TABLE IF EXISTS `document`;
CREATE TABLE `document` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `file_name` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `create_date` timestamp(2) NOT NULL DEFAULT CURRENT_TIMESTAMP(2) ON UPDATE CURRENT_TIMESTAMP(2),
  `user_id` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of document
-- ----------------------------
INSERT INTO `document` VALUES ('1', '2,2', '01.jpg', null, '2020-06-08 17:11:58.53', null);
INSERT INTO `document` VALUES ('2', '2,2', '01.jpg', null, '2020-06-08 17:11:58.53', null);
INSERT INTO `document` VALUES ('3', '4', '2.jpg', '4', '2020-06-08 17:11:58.53', null);
INSERT INTO `document` VALUES ('4', '1', '1.jpg', '1', '2020-06-08 17:11:58.53', null);
INSERT INTO `document` VALUES ('5', '2', '1.jpg', '2', '2020-06-08 17:11:58.53', null);
INSERT INTO `document` VALUES ('6', '2', '1.jpg', '2', '2020-06-08 17:11:58.53', null);
INSERT INTO `document` VALUES ('7', '3', '5.jpg', '3', '2020-06-08 17:11:58.53', null);
INSERT INTO `document` VALUES ('8', '2', '5.jpg', '2', '2020-06-08 17:11:58.53', null);

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `create_date` timestamp(2) NOT NULL DEFAULT CURRENT_TIMESTAMP(2) ON UPDATE CURRENT_TIMESTAMP(2),
  `user_id` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('1', '震惊！', '123456', '2020-06-09 08:51:29.03', null);
INSERT INTO `notice` VALUES ('2', '再一次震惊！', '12138', '2020-06-09 08:51:33.54', null);

-- ----------------------------
-- Table structure for reader
-- ----------------------------
DROP TABLE IF EXISTS `reader`;
CREATE TABLE `reader` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reader_id` char(32) DEFAULT NULL,
  `reader_name` varchar(20) DEFAULT NULL,
  `card_id` char(32) DEFAULT NULL,
  `sex` int(6) DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `party` varchar(10) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `race` varchar(10) DEFAULT NULL,
  `education` varchar(10) DEFAULT NULL,
  `create_date` timestamp(2) NOT NULL DEFAULT CURRENT_TIMESTAMP(2) ON UPDATE CURRENT_TIMESTAMP(2),
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reader
-- ----------------------------
INSERT INTO `reader` VALUES ('1', '202005001', '周瑜', '0101002', '1', '5474654746', '东吴', '36750066', '191218057@qq.com', '党员', '1980-01-01', '汉', '硕士', '2020-06-09 11:58:10.03');
INSERT INTO `reader` VALUES ('2', '202005002', '甄姬', '0202032', '0', '5486866562', '曹魏', '42424', '191218057@qq.com', null, null, '汉', '本科', '2020-06-09 11:58:17.79');
INSERT INTO `reader` VALUES ('3', '202005003', '诸葛亮', '0301002', '1', '5465123213', '蜀汉', '36750064', '191218057@qq.com', '党员', '1977-11-25', '汉', '本科', '2020-06-09 11:58:29.53');
INSERT INTO `reader` VALUES ('4', '202005004', '曹操', '0201001', '1', '9845415133', '曹魏', null, 'woshicaocao@wei.com', null, null, '汉', '硕士', '2020-06-09 11:58:37.11');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` char(20) DEFAULT NULL,
  `login_name` varchar(20) DEFAULT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_date` timestamp(2) NOT NULL DEFAULT CURRENT_TIMESTAMP(2) ON UPDATE CURRENT_TIMESTAMP(2),
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '0001', 'admin', '超级管理员', '123456', '1', '2020-06-08 18:19:39.00');
INSERT INTO `user` VALUES ('2', '0002', 'wyj', '超级管理员', '123456', '1', '2020-06-08 18:19:42.68');
INSERT INTO `user` VALUES ('3', '1003', 'test', '编辑人员', '123456', '3', '2020-06-09 07:40:47.68');
INSERT INTO `user` VALUES ('4', '12', 'test', '超级管理员', '123456', '1', '2020-06-09 07:44:41.38');
INSERT INTO `user` VALUES ('5', '1004', 'test', '超级管理员', '123', '2', '2020-06-09 07:50:42.05');
