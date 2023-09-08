/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50739
 Source Host           : localhost:3306
 Source Schema         : ssm_db

 Target Server Type    : MySQL
 Target Server Version : 50739
 File Encoding         : 65001

 Date: 08/09/2023 10:04:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_book
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '等吃的',
  `name2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '带饭的',
  `description` int(255) NOT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`, `description`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_book
-- ----------------------------
INSERT INTO `tbl_book` VALUES (1, '张伟华', '周晨阳', 13, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (2, '王泽宇', '周晨阳', 16, '2023-07-21 16:17:23');
INSERT INTO `tbl_book` VALUES (3, '李昊天', '周晨阳', 11, '2023-07-21 16:26:31');
INSERT INTO `tbl_book` VALUES (4, '刘鹏飞', '孙磊岳', 21, '2023-07-21 16:25:52');
INSERT INTO `tbl_book` VALUES (5, '陈博文', '孙磊岳', 13, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (6, '周晨阳', '刘鹏飞', 15, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (7, '陈博文', '刘鹏飞', 10, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (8, '刘鹏飞', '陈博文', 8, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (9, '孙磊岳', '王泽宇', 25, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (10, '李昊天', '王泽宇', 11, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (11, '刘鹏飞', '陈博文', 12, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (12, '周晨阳', '陈博文', 11, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (13, '陈博文', '周晨阳', 13, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (20, '张三', '李四', 12, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (21, '张三', '李四', 16, '2023-07-21 15:13:29');
INSERT INTO `tbl_book` VALUES (22, '张三', '李四', 13, '2023-07-21 15:14:33');
INSERT INTO `tbl_book` VALUES (23, '李四', '王五', 13, '2023-07-21 16:47:09');
INSERT INTO `tbl_book` VALUES (24, '李四', '王五', 16, '2023-07-21 23:05:54');
INSERT INTO `tbl_book` VALUES (25, '周晨阳', '张伟华', 11, '2023-07-22 13:51:05');
INSERT INTO `tbl_book` VALUES (26, '李四', '张三', 13, '2023-07-22 15:01:17');

SET FOREIGN_KEY_CHECKS = 1;
