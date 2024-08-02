ALTER TABLE `account`
    ADD CONSTRAINT `account_fk0` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`);


ALTER TABLE `agreement`
    ADD CONSTRAINT `agreement_fk1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`);


ALTER TABLE `agreement`
    ADD CONSTRAINT `agreement_fk2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`);


ALTER TABLE `client`
    ADD CONSTRAINT `client_fk1` FOREIGN KEY (`manager_id`) REFERENCES `manager` (`id`);


ALTER TABLE `product`
    ADD CONSTRAINT `product_fk1` FOREIGN KEY (`manager_id`) REFERENCES `manager` (`id`);


ALTER TABLE `transaction`
    ADD CONSTRAINT `transaction_fk1` FOREIGN KEY (`debit_account_id`) REFERENCES `account` (`id`);