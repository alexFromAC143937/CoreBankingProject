CREATE TABLE IF NOT EXISTS `agreement`
(
    `id`            int            NOT NULL AUTO_INCREMENT,
    `account_id`    binary(16)     NOT NULL,
    `product_id`    int            NOT NULL,
    `interest_rate` decimal(6, 4)  NOT NULL,
    `status`        int            NOT NULL,
    `sum`           decimal(15, 2) NOT NULL,
    `created_at`    timestamp      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at`    timestamp      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;