INSERT INTO `patient`(
	`patient_id`)
	VALUES (100);

INSERT INTO `disease`(
	`problem_id`, `admission_id`, `disease_details`, `disease_name`, `seek_person_id`, `status`, `patient_id`)
	VALUES (100, 0, '', 'Flu', 1, 0, 100);

INSERT INTO `receipt`(
	`receipt_id`, `barcode`, `delivery_date`, `details`, `disease_id`, `drug_details`, `patient_id`, `status`, `usage`, `problem_id`)
	VALUES (100, '', '2021-10-21', 'Receipt 1', 1, '', 1, 0, '', 100);