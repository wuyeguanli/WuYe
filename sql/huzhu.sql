/*
 Navicat Premium Data Transfer

 Source Server         : lhy
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : wuye

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 26/06/2019 09:50:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for huzhu
-- ----------------------------
DROP TABLE IF EXISTS `huzhu`;
CREATE TABLE `huzhu`  (
  `address` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址',
  `name` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '名字',
  `tel` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '电话',
  `id` int(20) NOT NULL COMMENT '编号',
  PRIMARY KEY (`address`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of huzhu
-- ----------------------------
INSERT INTO `huzhu` VALUES ('南山小区A2-6', 'Tom', '12345678910', 1026);
INSERT INTO `huzhu` VALUES ('南山小区B3-9', 'lili', '33344444444', 2039);
INSERT INTO `huzhu` VALUES ('南山小区C1-1', 'Anna', '01987654321', 3001);

SET FOREIGN_KEY_CHECKS = 1;
