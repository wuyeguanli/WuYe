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

 Date: 26/06/2019 09:50:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for feiyong
-- ----------------------------
DROP TABLE IF EXISTS `feiyong`;
CREATE TABLE `feiyong`  (
  `address` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址',
  `property` float(10, 1) NOT NULL COMMENT '物业管理费用',
  `parking` float(10, 1) NOT NULL COMMENT '停车费',
  `repair` float(10, 1) NOT NULL COMMENT '维修费',
  `water` float(10, 1) NOT NULL COMMENT '水费',
  `electric` float(10, 1) NOT NULL COMMENT '电费',
  `gas` float(10, 1) NOT NULL COMMENT '煤气',
  PRIMARY KEY (`address`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of feiyong
-- ----------------------------
INSERT INTO `feiyong` VALUES ('南山小区A2-6', 100.0, 150.0, 500.0, 46.5, 198.6, 135.8);
INSERT INTO `feiyong` VALUES ('南山小区B3-9', 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
INSERT INTO `feiyong` VALUES ('南山小区C1-1', 100.0, 150.0, 200.0, 58.6, 284.2, 159.3);

SET FOREIGN_KEY_CHECKS = 1;
