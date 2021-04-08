create table Atmosphere (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `humidity` VARCHAR (255) ,
  `visibility` VARCHAR (255) ,
  `pressure` VARCHAR (255) ,
  `rising` VARCHAR (255),
  `weather_id` bigint(11),
   PRIMARY KEY  (`id`),
  KEY `weather_id` (`weather_id`),
  CONSTRAINT `weather_id_fk` FOREIGN KEY (`weather_id_fk`) REFERENCES `blc_customer` (`id`),
);

create table Weather (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `humidity` VARCHAR (255) ,
  `visibility` VARCHAR (255) ,
  `pressure` VARCHAR (255) ,
  `rising` VARCHAR (255)
);

CREATE TABLE `roma_consult_detail` (
  `CONSULT_DETAIL_ID` bigint(20) NOT NULL,
  `CONSULT_SUBMITTED_DATE` datetime NOT NULL,
  `CONSULT_STATUS` varchar(255) NOT NULL,
  `CONSULT_TEXT` varchar(255) NOT NULL,
  `CUSTOMER_ID` bigint(20) NOT NULL,
  `PRODUCT_ID` bigint(20) NOT NULL,
  `CONSULT_REPLY_TEXT` varchar(255) default NULL COMMENT '回复内容',
  `CONSULT_REPLY_AUTHOR` bigint(20) default NULL COMMENT '回复者',
  `CONSULT_REPLY_DATE` datetime default NULL COMMENT '回复时间',
  PRIMARY KEY  (`CONSULT_DETAIL_ID`),
  KEY `CUSTOMER_ID` (`CUSTOMER_ID`),
  KEY `PRODUCT_ID` (`PRODUCT_ID`),
  KEY `CONSULT_REPLY_AUTHOR` (`CONSULT_REPLY_AUTHOR`),
  CONSTRAINT `roma_consult_detail_ibfk_1` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `blc_customer` (`CUSTOMER_ID`),
  CONSTRAINT `roma_consult_detail_ibfk_2` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `blc_product` (`PRODUCT_ID`),
  CONSTRAINT `roma_consult_detail_ibfk_3` FOREIGN KEY (`CONSULT_REPLY_AUTHOR`) REFERENCES `blc_admin_user` (`ADMIN_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

