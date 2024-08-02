INSERT INTO `manager` (`id`, `first_name`, `last_name`, `status`)
VALUES (1, 'ManagerName1', 'ManagerLastName1', 0),
       (2, 'ManagerName2', 'ManagerLastName2', 1),
       (3, 'ManagerName3', null, 1),
       (4, 'ManagerName4', 'ManagerLastName4', 1),
       (5, 'ManagerName5', 'ManagerLastName5', 2),
       (6, 'ManagerName6', 'ManagerLastName6', 2);

INSERT INTO `client` (`id`, `manager_id`, `status`, `tax_code`, `first_name`, `last_name`, `email`, `address`, `phone`)
VALUES (unhex(replace('cabbcc01-bb23-4567-89ab-cdef12345678', '-', '')), 1, 1, '123456789012', 'Client First Name 1',
        'Client Last Name 1', 'clientName1Last1.l@gmail.com',
        'b. 1, str. Street1, c. City1, ind 01234', '+180121234567'),
        (unhex(replace('cabbcc02-bb23-4567-89ab-cdef12345678', '-', '')), 2, 1, '223456789012', 'Client First Name 2',
        'Client Last Name 2', 'clientName1Last2.l@gmail.com',
        'b. 2, str. Street2, c. City2, ind 01234', '+280121234567'),
        (unhex(replace('cabbcc03-bb23-4567-89ab-cdef12345678', '-', '')), 3, 1, '323456789012', 'Client First Name 3',
        'Client Last Name 3', 'cliebtName1Last3.l@gmail.com',
        'b. 3, str. Street3, c. City3, ind 01234', '+380121234567'),
        (unhex(replace('cabbcc04-bb23-4567-89ab-cdef12345678', '-', '')), 4, 1, '423456789012', 'Client First Name 4',
        'Client Last Name 4', 'clientName1Last4.l@gmail.com',
        'b. 4, str. Street4, c. City4, ind 01234', '+480121234567'),
        (unhex(replace('cabbcc05-bb23-4567-89ab-cdef12345678', '-', '')), 4, 1, '523456789012', 'Client First Name 5',
        'Client Last Name 5', 'clientName1Last5.l@gmail.com',
        'b. 5, str. Street5, c. City5, ind 01234', '+580121234567');


INSERT INTO account (`id`, `client_id`, `name`, `type`, `status`, `balance`, `currency_code`)
VALUES (unhex(replace('aabbcc01-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc01-bb23-4567-89ab-cdef12345678', '-', '')), 'Current account client 1', 1, 1, 1100.00, 1),
       (unhex(replace('aabbcc02-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc01-bb23-4567-89ab-cdef12345678', '-', '')), 'Credit account client 1', 2, 1, 2100.00, 1),
       (unhex(replace('aabbcc03-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc01-bb23-4567-89ab-cdef12345678', '-', '')), 'Interest account client 1', 2, 1, 310.00, 1),
       (unhex(replace('aabbcc04-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc02-bb23-4567-89ab-cdef12345678', '-', '')), 'Current account  client 3', 2, 1, 2200.00, 2),
       (unhex(replace('aabbcc05-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc02-bb23-4567-89ab-cdef12345678', '-', '')), 'Credit account client 2', 2, 1, 3200.00, 2),
       (unhex(replace('aabbcc06-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc02-bb23-4567-89ab-cdef12345678', '-', '')), 'Interest account client 2', 2, 1, 6200.00, 2),
       (unhex(replace('aabbcc07-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc03-bb23-4567-89ab-cdef12345678', '-', '')), 'Current account client 3', 2, 1, 4300.00, 3),
       (unhex(replace('aabbcc08-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc03-bb23-4567-89ab-cdef12345678', '-', '')), 'Credit account client 3', 2, 1, 7300.00, 3),
       (unhex(replace('aabbcc09-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('cabbcc03-bb23-4567-89ab-cdef12345678', '-', '')), 'Interest account client 3', 2, 1, 130.00, 3);

INSERT INTO `transaction` (`id`, `debit_account_id`, `credit_account_id`, `type`, `amount`, `description`)
VALUES (unhex(replace('fabbcc01-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc01-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc02-bb23-4567-89ab-cdef12345678', '-', '')), 1, 200, 'Paid debt 1 client 1 accounts D1-C2'),
       (unhex(replace('fabbcc02-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc01-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc03-bb23-4567-89ab-cdef12345678', '-', '')), 1, 100, 'Paid interest 2 client 1 accounts D1-C3'),
       (unhex(replace('fabbcc03-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc05-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc04-bb23-4567-89ab-cdef12345678', '-', '')), 1, 50, 'Take a credit 3 client 2 accounts D5-C4'),
       (unhex(replace('fabbcc04-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc05-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc04-bb23-4567-89ab-cdef12345678', '-', '')), 1, 100, 'Take a credit 4 client 2 accounts D5-C4'),
       (unhex(replace('fabbcc05-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc05-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc04-bb23-4567-89ab-cdef12345678', '-', '')), 1, 200, 'Take a credit 5 client 2 accounts D5-C4'),
       (unhex(replace('fabbcc06-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc07-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc08-bb23-4567-89ab-cdef12345678', '-', '')), 1, 200, 'Paid debt 6 client 3 accounts D7-C8'),
       (unhex(replace('fabbcc07-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc08-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc07-bb23-4567-89ab-cdef12345678', '-', '')), 1, 100, 'Take a credit 7 client 3 accounts D8-C7'),
       (unhex(replace('fabbcc08-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc08-bb23-4567-89ab-cdef12345678', '-', '')),
        unhex(replace('aabbcc07-bb23-4567-89ab-cdef12345678', '-', '')), 1, 100, 'Take a credit 8 client 3 accounts D8-C7');

INSERT INTO `product` (id, `manager_id`, `name`, `status`, `currency_code`, `interest_rate`, `limit`)
VALUES (1, 1, 'Deposit', 1, 1, 2.275, 1000000),
       (2, 2, 'Credit card', 1, 1, 4.450, 10000),
       (3, 2, 'Credit card', 1, 2, 5.000, 10000),
       (4, 3, 'Mortgage', 1, 1, 4.000, 1000000),
       (5, 3, 'Mortgage', 1, 2, 3.850, 1000000),
       (6, 1, 'Deposit', 1, 2, 2.500, 10000);

INSERT INTO agreement (account_id, product_id, interest_rate, status, sum)
VALUES (unhex(replace('aabbcc01-bb23-4567-89ab-cdef12345678', '-', '')), 1, 0, 1, 0),
           (unhex(replace('aabbcc02-bb23-4567-89ab-cdef12345678', '-', '')), 2, 4.450, 1, 10000),
       (unhex(replace('aabbcc05-bb23-4567-89ab-cdef12345678', '-', '')), 3, 5.000, 1, 10000),
       (unhex(replace('aabbcc08-bb23-4567-89ab-cdef12345678', '-', '')), 4, 4.000, 1, 1000000),
       (unhex(replace('aabbcc04-bb23-4567-89ab-cdef12345678', '-', '')), 1, 0, 1, 0),
       (unhex(replace('aabbcc07-bb23-4567-89ab-cdef12345678', '-', '')), 1, 0, 1, 0);