-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-17 17:17:51.16

-- tables
-- Table: category
CREATE TABLE category (
    id serial  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT category_pk PRIMARY KEY (id)
);

-- Table: part
CREATE TABLE part (
    id serial  NOT NULL,
    title varchar(100)  NOT NULL,
    description varchar(500)  NULL,
    category varchar(255)  NULL,
    cost decimal(4,4)  NULL,
    quantity int  NULL,
    minimum_quantity int  NULL,
    barcode varchar(100)  NULL,
    area decimal(4,4)  NULL,
    additional_details varchar(500)  NULL,
    image varchar(255)  NULL,
    CONSTRAINT part_pk PRIMARY KEY (id)
);

-- Table: purchase_order
CREATE TABLE purchase_order (
    id serial  NOT NULL,
    title varchar(255)  NOT NULL,
    due_date date  NULL,
    additional_details varchar(500)  NULL,
    vendor_id int  NOT NULL,
    category_id int  NOT NULL,
    part_id int  NOT NULL,
    requester_company_name varchar(255)  NULL,
    requester_address varchar(255)  NULL,
    requester_phone_number varchar(100)  NULL,
    ship_to_name varchar(255)  NULL,
    shipping_address varchar(255)  NULL,
    ship_to_company_name varchar(100)  NULL,
    ship_to_phone_number varchar(100)  NULL,
    purchase_order_date date  NULL,
    shipping_method varchar(100)  NULL,
    requisitioner varchar(255)  NULL,
    terms varchar(500)  NULL,
    notes varchar(500)  NULL,
    CONSTRAINT purchase_order_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
    id serial  NOT NULL,
    name varchar(100)  NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

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
    rate decimal(4,4)  NULL,
    CONSTRAINT vendor_pk PRIMARY KEY (id)
);

-- Table: worker
CREATE TABLE worker (
    id serial  NOT NULL,
    name varchar(100)  NOT NULL,
    email varchar(200)  NULL,
    phone_number varchar(255)  NULL,
    job_title varchar(100)  NULL,
    company_name  varchar(255)  NULL,
    hourly_rate decimal(4,4)  NULL,
    CONSTRAINT worker_pk PRIMARY KEY (id)
);

-- Table: worker_part
CREATE TABLE worker_part (
    part_id int  NOT NULL,
    worker_id int  NOT NULL
);

-- Table: worker_role
CREATE TABLE worker_role (
    role_id int  NOT NULL,
    worker_id int  NOT NULL
);

-- foreign keys
-- Reference: purchase_order_category (table: purchase_order)
ALTER TABLE purchase_order ADD CONSTRAINT purchase_order_category
    FOREIGN KEY (category_id)
    REFERENCES category (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: purchase_order_part (table: purchase_order)
ALTER TABLE purchase_order ADD CONSTRAINT purchase_order_part
    FOREIGN KEY (part_id)
    REFERENCES part (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: purchase_order_vendor (table: purchase_order)
ALTER TABLE purchase_order ADD CONSTRAINT purchase_order_vendor
    FOREIGN KEY (vendor_id)
    REFERENCES vendor (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: worker_part_part (table: worker_part)
ALTER TABLE worker_part ADD CONSTRAINT worker_part_part
    FOREIGN KEY (part_id)
    REFERENCES part (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: worker_part_worker (table: worker_part)
ALTER TABLE worker_part ADD CONSTRAINT worker_part_worker
    FOREIGN KEY (worker_id)
    REFERENCES worker (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: worker_role_role (table: worker_role)
ALTER TABLE worker_role ADD CONSTRAINT worker_role_role
    FOREIGN KEY (role_id)
    REFERENCES role (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: worker_role_worker (table: worker_role)
ALTER TABLE worker_role ADD CONSTRAINT worker_role_worker
    FOREIGN KEY (worker_id)
    REFERENCES worker (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

