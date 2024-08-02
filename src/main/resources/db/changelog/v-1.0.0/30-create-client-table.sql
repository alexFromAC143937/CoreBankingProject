CREATE TABLE IF NOT EXISTS `client`
(
    `id`         binary(16)  NOT NULL,
    `manager_id` int         NOT NULL,
    `status`     int         NOT NULL,
    `tax_code`   varchar(20) NOT NULL,
    `first_name` varchar(50) NOT NULL,
    `last_name`  varchar(50) ,
    `email`      varchar(60) ,
    `address`    varchar(80) ,
    `phone`      varchar(20) ,
    `created_at` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;