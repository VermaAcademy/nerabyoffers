DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER (
        CUSTOMER_ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 100, INCREMENT BY 1) PRIMARY KEY,
        CARD_ID varchar(255),
        CARD_IMAGE varchar(255),
        CARD_TYPE varchar(255),
        CUSTOMER_CARD_NUMBER varchar(255),
        CUSTOMER_MOBILE_NUMBER bigint,
        CUSTOMER_NAME varchar(255)
    );
INSERT INTO CUSTOMER (CARD_ID,CARD_IMAGE,CARD_TYPE,CUSTOMER_CARD_NUMBER,CUSTOMER_MOBILE_NUMBER,CUSTOMER_NAME) values('C100','nbs','Credit Card','XXXX XXXX XXXX 1230',9754734804,'Rajkumar');
INSERT INTO CUSTOMER (CARD_ID,CARD_IMAGE,CARD_TYPE,CUSTOMER_CARD_NUMBER,CUSTOMER_MOBILE_NUMBER,CUSTOMER_NAME) values('C101','sbi','Credit Card','XXXX XXXX XXXX 1231',9754734805,'Wisharant');
INSERT INTO CUSTOMER (CARD_ID,CARD_IMAGE,CARD_TYPE,CUSTOMER_CARD_NUMBER,CUSTOMER_MOBILE_NUMBER,CUSTOMER_NAME) values('C102','hsbc','Credit Card','XXXX XXXX XXXX 1232',9754734806,'Neha');
INSERT INTO CUSTOMER (CARD_ID,CARD_IMAGE,CARD_TYPE,CUSTOMER_CARD_NUMBER,CUSTOMER_MOBILE_NUMBER,CUSTOMER_NAME) values('C103','city_bank','Credit Card','XXXX XXXX XXXX 1233',9754734807,'Shivam');
INSERT INTO CUSTOMER (CARD_ID,CARD_IMAGE,CARD_TYPE,CUSTOMER_CARD_NUMBER,CUSTOMER_MOBILE_NUMBER,CUSTOMER_NAME) values('C104','sbi','Credit Card','XXXX XXXX XXXX 1234',9754734808,'Chetna');
INSERT INTO CUSTOMER (CARD_ID,CARD_IMAGE,CARD_TYPE,CUSTOMER_CARD_NUMBER,CUSTOMER_MOBILE_NUMBER,CUSTOMER_NAME) values('C105','nbs','Credit Card','XXXX XXXX XXXX 1235',9754734809,'Shalinee');

DROP TABLE MERCHANT  CASCADE;
CREATE TABLE MERCHANT (
        MERCHANT_ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1000, INCREMENT BY 1) PRIMARY KEY,
        CARD_OFFERS varchar(255),
        CARD_TYPE varchar(255),
        CUSTOMER_ID varchar(255),
        CUSTOMER_MOBILE_NUMBER bigint,
        MERCHANT_LOGO varchar(255),
        MERCHANT_NAME varchar(255),
        ACTIVE_FLAG varchar(25)
    );

INSERT INTO MERCHANT (CARD_OFFERS, CARD_TYPE, CUSTOMER_ID, CUSTOMER_MOBILE_NUMBER, MERCHANT_LOGO, MERCHANT_NAME, MERCHANT_ID, ACTIVE_FLAG) VALUES ('10 % off on SBI','Credit Card', 100, 9754734804, 'dominasLogo', 'Dominos', 1000, 'false');
INSERT INTO MERCHANT (CARD_OFFERS, CARD_TYPE, CUSTOMER_ID, CUSTOMER_MOBILE_NUMBER, MERCHANT_LOGO, MERCHANT_NAME, MERCHANT_ID, ACTIVE_FLAG) VALUES ('15 % off for NBS', 'Credit Card', 101, 9754734804, 'mcdonalds', 'McDonalds', 1001, 'false');
INSERT INTO MERCHANT (CARD_OFFERS, CARD_TYPE, CUSTOMER_ID, CUSTOMER_MOBILE_NUMBER, MERCHANT_LOGO, MERCHANT_NAME, MERCHANT_ID, ACTIVE_FLAG) VALUES ('10 % off for HSBC', 'Credit Card', 102, 9754734804, 'burgerking', 'Burger King', 1002, 'false');
INSERT INTO MERCHANT (CARD_OFFERS, CARD_TYPE, CUSTOMER_ID, CUSTOMER_MOBILE_NUMBER, MERCHANT_LOGO, MERCHANT_NAME, MERCHANT_ID, ACTIVE_FLAG) VALUES ('20 % off for Citi Bank', 'Credit Card', 103, 9754734804, 'mcdonalds', 'McDonalds', 1003, 'true');
INSERT INTO MERCHANT (CARD_OFFERS, CARD_TYPE, CUSTOMER_ID, CUSTOMER_MOBILE_NUMBER, MERCHANT_LOGO, MERCHANT_NAME, MERCHANT_ID, ACTIVE_FLAG) VALUES ('5 % off for SBI', 'Credit Card', 104, 9754734804, 'dominasLogo', 'Dominos', 1004, 'true');
        
DROP TABLE IF EXISTS ADDRESS;
CREATE TABLE ADDRESS (
        ID INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 10000, INCREMENT BY 1) PRIMARY KEY,
        CITY varchar(255),
        COUNTRY varchar(255),
        LATITUDE varchar(255),
        LONGITUDE varchar(255),
        STATE varchar(255),
        STREET varchar(255),
        ZIP_CODE varchar(255),
        MERCHANT_ID INTEGER constraint ADDRESS_MERCHANT_FK references MERCHANT(MERCHANT_ID) 
    );
 
INSERT INTO ADDRESS (CITY, COUNTRY, LATITUDE, LONGITUDE, MERCHANT_ID, STATE, STREET, ZIP_CODE, ID) VALUES ('Gurgaon', 'India', '28.5143629', '77.0730087', 1000, 'Haryana', 'Sector 21', '122016', 10000)
INSERT INTO ADDRESS (CITY, COUNTRY, LATITUDE, LONGITUDE, MERCHANT_ID, STATE, STREET, ZIP_CODE, ID) VALUES ('Delhi', 'India', '28.5143629', '77.0730087', 1001, 'Haryana', 'Sector 21', '122016', 10001)
INSERT INTO ADDRESS (CITY, COUNTRY, LATITUDE, LONGITUDE, MERCHANT_ID, STATE, STREET, ZIP_CODE, ID) VALUES ('Gurgaon', 'India', '28.5143629', '77.0730087', 1002, 'Haryana', 'Sector 21', '122016', 10002)
INSERT INTO ADDRESS (CITY, COUNTRY, LATITUDE, LONGITUDE, MERCHANT_ID, STATE, STREET, ZIP_CODE, ID) VALUES ('Gurgaon', 'India', '28.5143629', '77.0730087', 1003, 'Haryana', 'Sector 21', '122016', 10003)
INSERT INTO ADDRESS (CITY, COUNTRY, LATITUDE, LONGITUDE, MERCHANT_ID, STATE, STREET, ZIP_CODE, ID) VALUES ('Gurgaon', 'India', '28.5143629', '77.0730087', 1004, 'Haryana', 'Sector 21', '122016', 10004)