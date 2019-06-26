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

 Date: 26/06/2019 09:50:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fangchan
-- ----------------------------
DROP TABLE IF EXISTS `fangchan`;
CREATE TABLE `fangchan`  (
  `address` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址',
  `size` char(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '面积',
  `state` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '状态',
  `specifications` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '设备',
  PRIMARY KEY (`address`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of fangchan
-- ----------------------------
INSERT INTO `fangchan` VALUES ('南上小区A2-6', '12', '出租', '三室一厅');
INSERT INTO `fangchan` VALUES ('南上小区B3-9', '96.5', '空闲', '两室一厅');
INSERT INTO `fangchan` VALUES ('南上小区C1-1', '165.7', '出租', '三室两厅');

SET FOREIGN_KEY_CHECKS = 1;
