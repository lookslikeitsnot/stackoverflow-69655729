INSERT INTO `patient`(`patient_id`)
VALUES (100);
INSERT INTO `disease`(
    `problem_id`,
    `admission_id`,
    `disease_name`,
    `status`,
    `patient_id`
  )
VALUES (100, 0, 'Flu', 0, 100);
INSERT INTO `receipt`(
    `receipt_id`,
    `delivery_date`,
    `details`,
    `status`,
    `problem_id`
  )
VALUES (
    100,
    '2021-10-21',
    'Receipt 1',
    0,
    100
  );