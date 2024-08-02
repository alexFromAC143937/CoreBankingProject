CREATE TABLE IF NOT EXISTS `product`
(
    `id`            int           NOT NULL,
    `manager_id`    int           NOT NULL,
    `name`          varchar(70)   NOT NULL,
    `status`        int           NOT NULL,
    `currency_code` int           NOT NULL,
    `interest_rate` decimal(6, 4) NOT NULL,
    `limit`         int           NOT NULL,
    `created_at`    timestamp     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at`    timestamp     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;