INSERT INTO CONTACT_BOOK 
	(CB_ID) 
VALUES 
	(NULL);

INSERT INTO PERSON 
	(P_LASTNAME,	P_FIRSTNAME) 
VALUES 
	('Schindl',		'Tom'), 
	('Bauer',		'Magda'), 
	('Bauer',		'Emma');

INSERT INTO COUNTRY 
	(CO_NAME) 
VALUES 
	('Austria');

INSERT INTO ADDRESS 
	(AD_STREET,					AD_CITY,		AD_ZIP,	AD_FK_COUNTRY,	AD_FK_PERSON) 
VALUES
	('Freisingstrasse 3', 		'Innsbruck', 	'6020', 1, 				1),
	('Eduard-Bodemgasse 2-5', 	'Innsbruck', 	'6020', 1, 				1),
	('Freisingstrasse 3', 		'Innsbruck', 	'6020', 1, 				2),
	('Freisingstrasse 3', 		'Innsbruck', 	'6020', 1, 				3);
