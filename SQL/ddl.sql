/*
    COMP 3005: Course Project V2
    Group Number: 120
    Author: Hajar Alyemni (101186632) 
    Due: April 10, 2024
*/

-- TODO: CHECK THAT ALL TABLE AND VARIABLE NAME ARE CONSISTENT THROUGHOUT DOC AND GRAPH

-- ? can we calculate duration? does it have to be mandatory
 
-- ? keeping address is necessary 
CREATE TABLE Member (
    id                  SERIAL          PRIMARY KEY,
    first_name          VARCHAR(255)    NOT NULL,
    last_name           VARCHAR(255)    NOT NULL,
    email               VARCHAR(255)    NOT NULL UNIQUE,
    phone_num           VARCHAR(255)    NOT NULL UNIQUE,
    dob                 DATE,
    street              VARCHAR(255),
    city                VARCHAR(255),   
    province            VARCHAR(255),
    postal_code         VARCHAR(255),
    join_date           DATE,
    password            VARCHAR(255)    NOT NULL
)


CREATE TABLE Trainer (
    id                  SERIAL          PRIMARY KEY,
    first_name          VARCHAR(255)    NOT NULL,
    last_name           VARCHAR(255)    NOT NULL,
    email               VARCHAR(255)    NOT NULL UNIQUE,
    phone_num           VARCHAR(255)    NOT NULL UNIQUE,
    password            VARCHAR(255)    NOT NULL,
    hourly_rate         MONEY           NOT NULL,
)


CREATE TABLE TrainsWith (
    booking_id          SERIAL          PRIMARY KEY,
    member_id           INT             NOT NULL,
    trainer_id          INT             NOT NULL,
    session_date        DATE            NOT NULL,
    duration            INTERVAL        NOT NULL,
    start_time          TIMESTAMP       NOT NULL,
    end_time            TIMESTAMP       NOT NULL, 
    FOREIGN KEY (member_id)
        REFERENCES Member (id),
    FOREIGN KEY (trainer_id)
        REFERENCES Trainer (id)
)


CREATE TABLE GroupFitnessClasses (
    booking_id          SERIAL          PRIMARY KEY,
    trainer_id          INT             NOT NULL,
    session_date        DATE            NOT NULL,
    duration            INTERVAL        NOT NULL,
    start_time          TIMESTAMP       NOT NULL,
    end_time            TIMESTAMP       NOT NULL,
    FOREIGN KEY (trainer_id)
        REFERENCES Trainer (id)
)


CREATE TABLE AdminStaff (
    id                  SERIAL          PRIMARY KEY,
    first_name          VARCHAR(255)    NOT NULL,
    last_name           VARCHAR(255)    NOT NULL,
    email               VARCHAR(255)    NOT NULL UNIQUE,
    phone_num           VARCHAR(255)    NOT NULL UNIQUE,
    password            VARCHAR(255)    NOT NULL
)


CREATE TABLE FitnessEquipment (
    serial_num              SERIAL          PRIMARY KEY,
    model                   VARCHAR(255)    NOT NULL,
    manufacturing_year      INT,
    last_maintained         DATE            NOT NULL          
)

CREATE TABLE Room (
    bld_num         INT     PRIMARY KEY,
    room_num        INT     PRIMARY KEY
)


CREATE TABLE Bill (
    bill_num                SERIAL          PRIMARY KEY,
    admin_id                INT             NOT NULL,
    member_id               INT             NOT NULL,
    member_first_name       VARCHAR(255)    NOT NULL,
    member_last_name        VARCHAR(255)    NOT NULL,
    member_email            VARCHAR(255)    NOT NULL UNIQUE,
    phone_num               VARCHAR(255)    NOT NULL UNIQUE,
    street                  VARCHAR(255)    NOT NULL,
    city                    VARCHAR(255)    NOT NULL,
    province                VARCHAR(255)    NOT NULL,
    postal_code             VARCHAR(255)    NOT NULL,
    invoice_date            DATE            NOT NULL,
    total_amt               MONEY           NOT NULL,
    card_num                INT             NOT NULL,
    card_type               VARCHAR(255)    NOT NULL,
    card_cvv                INT             NOT NULL,
    card_first_name         VARCHAR(255)    NOT NULL,
    card_last_name          VARCHAR(255)    NOT NULL,
    FOREIGN KEY (admin_id)
        REFERENCES AdminStaff (id)
    FOREIGN KEY (member_id)
        REFERENCES Member (id)
)

CREATE TABLE Attends (
    booking_id      INT     PRIMARY KEY,
    member_id       INT     PRIMARY KEY,
    FOREIGN KEY (booking_id)
        REFERENCES GroupFitnessClasses (booking_id),
    FOREIGN KEY (member_id)
        REFERENCES Member (id)
)


CREATE TABLE Books (
    booking_id      SERIAL          PRIMARY KEY,
    admin_id        INT             NOT NULL,
    bld_num         INT             NOT NULL,
    room_num        INT             NOT NULL,
    booking_date    DATE            NOT NULL,
    duration        INTERVAL,
    start_time      TIMESTAMP       NOT NULL,
    end_time        TIMESTAMP       NOT NULL,
    FOREIGN KEY (admin_id)
        REFERENCES AdminStaff (id)
    FOREIGN KEY (bld_num)
        REFERENCES Room (bld_num)
    FOREIGN KEY (room_num)
        REFERENCES Room (room_num)
)


CREATE TABLE HealthMetrics (
    record_id       SERIAL              PRIMARY KEY,
    member_id       INT                 NOT NULL,
    systolic_bp     INT                 NOT NULL,
    diastolic_bp    INT                 NOT NULL,
    ldl             INT                 NOT NULL,
    weight          DOUBLE PRECISION    NOT NULL,
    height          DOUBLE PRECISION    NOT NULL,
    bmi             DOUBLE PRECISION    NOT NULL,
    date_recorded   DATE                NOT NULL,
    FOREIGN KEY (member_id)
        REFERENCES Member (id)
)

CREATE TABLE Routine (
    routine_id      SERIAL              PRIMARY KEY,
    member_id       INT                 NOT NULL,
    exercise        TEXT                NOT NULL,
    FOREIGN KEY (member_id)
        REFERENCES Member (id)
)

CREATE TABLE Days (
    routine_id      INT                 PRIMARY KEY,
    day             VARCHAR(10)         PRIMARY KEY,
    FOREIGN KEY (routine_id)
        REFERENCES Routine (routine_id)
)

CREATE TABLE Goals (
    member_id       INT                 PRIMARY KEY,
    goal_desc       TEXT                PRIMARY KEY,
    FOREIGN KEY (member_id)
        REFERENCES Member (member_id)           
)

CREATE TABLE Achievements (
    member_id              INT                 PRIMARY KEY,
    achievement_desc       TEXT                PRIMARY KEY,
    FOREIGN KEY (member_id)
        REFERENCES Member (member_id)     
)