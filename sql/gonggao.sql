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

 Date: 26/06/2019 09:50:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gonggao
-- ----------------------------
DROP TABLE IF EXISTS `gonggao`;
CREATE TABLE `gonggao`  (
  `id` int(10) NOT NULL COMMENT 'id',
  `Title` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '标题',
  `Notice` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '内容',
  `Time` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '时间',
  `Publisher` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '发布者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of gonggao
-- ----------------------------
INSERT INTO `gonggao` VALUES (2, '公共设施', '新增公共设施', '2019-06-08', 'laishengwen');

SET FOREIGN_KEY_CHECKS = 1;
