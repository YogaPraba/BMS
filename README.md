# BMS
Bank Management System


Postgres query:

US 1 - Login/cus REGN -
	- 
US 2 - Loan

US -3 update Customer details


CREATE TABLE bankserver.customer 
(
accountno serial primary key,
username text,
password text,
address text,
state text,
country text,
email text,
pan text,
contactno text,
dob text,
accounttype text
)

CREATE TABLE bankserver.loan(

            loanid     serial PRIMARY KEY,
            principal        serial     ,
            rateofinterest      serial    ,
            duarion          serial     ,
            accountno      serial     REFERENCES      bankserver.customer(accountno)
                    );

