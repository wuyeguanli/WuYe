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

 Date: 26/06/2019 09:50:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chewei
-- ----------------------------
DROP TABLE IF EXISTS `chewei`;
CREATE TABLE `chewei`  (
  `id` int(20) NOT NULL COMMENT '编号',
  `address` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址',
  `state` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of chewei
-- ----------------------------
INSERT INTO `chewei` VALUES (1001, 'B区', '占用');
INSERT INTO `chewei` VALUES (2001, 'B区', '未占用');
INSERT INTO `chewei` VALUES (3001, 'A区', '未占用');

SET FOREIGN_KEY_CHECKS = 1;
