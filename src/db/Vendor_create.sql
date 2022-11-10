-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-10 15:36:58.055

-- tables
-- Table: vendor
CREATE TABLE vendor (
    id serial  NOT NULL,
    company_name varchar(100)  NOT NULL,
    address varchar(255)  NULL,
    phone varchar(255)  NULL,
    website varchar(255)  NULL,
    name varchar(100)  NULL,
    email varchar(255)  NULL,
    vendor_type varchar(255)  NULL,
    description varchar(500)  NULL,
    rate decimal(12,2)  NULL,
    CONSTRAINT vendor_pk PRIMARY KEY (id)
);

-- End of file.

