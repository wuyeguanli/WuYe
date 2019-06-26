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

 Date: 26/06/2019 09:50:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for shebei
-- ----------------------------
DROP TABLE IF EXISTS `shebei`;
CREATE TABLE `shebei`  (
  `id` int(10) NOT NULL COMMENT 'id',
  `name` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '设备名称',
  `num` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '设备数量',
  `state` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '设备状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shebei
-- ----------------------------
INSERT INTO `shebei` VALUES (1, '花圃', '10', '正常');
INSERT INTO `shebei` VALUES (2, '公告栏', '4', '损坏');

SET FOREIGN_KEY_CHECKS = 1;
