DELETE FROM Member;
DELETE FROM Trainer;
DELETE FROM AdminStaff;
DELETE FROM FitnessEquipment;
DELETE FROM Room;
DELETE FROM Routine;
DELETE FROM Days;
DELETE FROM Goals;
DELETE FROM Achievements;
DELETE FROM TrainsWith;
DELETE FROM GroupFitnessClass;
DELETE FROM Attends;
DELETE FROM Books;
DELETE FROM Bill;
DELETE FROM HealthMetric;


INSERT INTO Member (first_name, last_name, email, phone_num, dob, street, city, province, postal_code, join_date, password)
VALUES
('John', 'Doe', 'john.doe@example.com', '0000000000', '1999-1-1', '123 Imaginary Lane', 'NonExistent', 'NE', 'A1B2C3', '2024-01-01', 'johndoe'), 
('Jane', 'Smith', 'jane.smith@example.com', '1111111111', '1990-1-1', '456 Unknown Road', 'Fictional', 'NE', 'D4E5F6', '2023-09-13', 'janesmith'),
('Charlie', 'Chaplin', 'charlie.chaplin@example.com', '2222222222', '2019-07-15', '673 Example Street', 'Fiction', 'FL', 'G7H8I9', '2024-03-30', 'charliechaplin');  


INSERT INTO Trainer (first_name, last_name, email, phone_num, password, hourly_rate)
VALUES
('Matt', 'Wii', 'matt.wii@H&FClubTrainer.ca', '0123456789', 'mattwii', 28.50),
('Lucia', 'Mii', 'lucia.mii@H&FClubTrainer.ca', '9876543210', 'luciamii', 40.00);


INSERT INTO AdminStaff (first_name, last_name, email, phone_num, password)
VALUES
('Mia', 'Williams', 'mia.williams@H&FClubAdmin.ca', '0001112222', 'miawilliams'),
('Grace', 'Adams', 'grace.adams@H&FClubAdmin.ca', '3334445555', 'graceadams');


INSERT INTO FitnessEquipment (serial_num, model, manufacturing_year, last_maintained)
VALUES
('XM7826', 'NordicTrack 780', '2010', '2023-10-17'),
('RT3895', 'Sunny Health & Fitness SF-T7603', '2017', '2023-11-03'),
('OV4720', 'Pro-Form Carbon TLX', '2022', '2024-02-20');


INSERT INTO Room (bld_num, room_num)
VALUES
(1, 101),
(2, 101),
(2, 102);


INSERT INTO Routine (member_id, exercise)
VALUES
(1, 'Run 5km'),
(1, 'Do 20 pushups'),
(1, 'Do 15 pullups'),
(2, 'Run 2km on an incline'),
(2, 'Do 15 pushups'),
(3, 'Run for 30 minutes');


INSERT INTO Days (routine_id, day)
VALUES
(1, 'Monday'),
(1, 'Wednesday'),
(2, 'Tuesday'),
(2, 'Thursday'),
(3, 'Friday'),
(4, 'Monday'),
(4, 'Thursday'),
(5, 'Tuesday'),
(5, 'Friday'),
(6, 'Saturday'),
(6, 'Sunday');


INSERT INTO Goals (member_id, goal_desc)
VALUES
(1, 'Run 50km total in a month'),
(1, 'Do 30 pushups in one go'),
(2, 'Jog 2km daily for a month'),
(3, 'Break personal record of 20 pullups in one go');


INSERT INTO Achievements (member_id, achievement_desc)
VALUES
(1, 'Ran a 50km marathon'),
(2, 'Attended group classes everyday for 2 weeks'),
(2, 'Lost 5kg in a month'),
(3, 'Gained 2kg of muscle');


INSERT INTO TrainsWith (member_id, trainer_id, session_date, start_time, end_time)
VALUES
(1, 1, '2024-04-08', '2024-04-08 12:00:00', '2024-04-08 13:00:00'),
(1, 2, '2024-04-08', '2024-04-08 14:00:00', '2024-04-08 15:00:00'),
(2, 1, '2024-04-10', '2024-04-10 16:00:00', '2024-04-10 18:00:00'),
(3, 2, '2024-04-12', '2024-04-12 18:00:00', '2024-04-12 20:00:00');


INSERT INTO GroupFitnessClass (trainer_id, session_date, start_time, end_time)
VALUES
(1, '2024-04-03', '2024-04-03 12:00:00', '2024-04-03 13:00:00'),
(1, '2024-04-04', '2024-04-04 14:00:00', '2024-04-04 15:00:00'),
(2, '2024-04-04', '2024-04-04 14:00:00', '2024-04-04 15:00:00'),
(2, '2024-04-04', '2024-04-04 18:00:00', '2024-04-04 20:00:00');


INSERT INTO Attends (booking_id, member_id)
VALUES
(1, 1),
(1, 3),
(2, 1),
(2, 2),
(3, 1),
(3, 3),
(4, 1),
(4, 2),
(4, 3);


INSERT INTO Books (admin_id, bld_num, room_num, booking_date, start_time, end_time)
VALUES
(1, 1, 101, '2024-04-03', '2024-04-03 12:00:00', '2024-04-03 13:00:00'),
(2, 2, 101, '2024-04-04', '2024-04-04 14:00:00', '2024-04-04 15:00:00'),
(1, 2, 102, '2024-04-04', '2024-04-04 14:00:00', '2024-04-04 15:00:00'),
(2, 2, 101, '2024-04-04', '2024-04-04 18:00:00', '2024-04-04 20:00:00');


INSERT INTO Bill (admin_id, member_id, member_first_name, member_last_name, member_email, phone_num, street, city, province, postal_code, invoice_date, 
                  total_amt, card_num, card_type, card_cvv, card_first_name, card_last_name)
VALUES
(1, 1, 'John', 'Doe', 'john.doe@example.com', '0000000000', '123 Imaginary Lane', 'NonExistent', 'NE', 'A1B2C3', '2024-04-13', 68.50, '3723492829482948', 'Mastercard', '352', 'John', 'Doe'),
(2, 2, 'Jane', 'Smith', 'jane.smith@example.com', '1111111111', '456 Unknown Road', 'Fictional', 'NE', 'D4E5F6', '2024-04-13', 28.50, '4759372950605839', 'Visa', '279', 'Jane', 'Smith'),
(1, 3, 'Charlie', 'Chaplin', 'charlie.chaplin@example.com', '2222222222', '673 Example Street', 'Fiction', 'FL', 'G7H8I9', '2024-04-13', 40.0, '9896838264982342', 'Mastercard', '734', 'Charlie', 'Chaplin');  


INSERT INTO HealthMetric (member_id, systolic_bp, diastolic_bp, ldl, weight, height, bmi, date_recorded)
VALUES
(1, 122, 78, 110, 76.5, 170, 26.5, '2024-04-01'),
(1, 118, 72, 95, 71.0, 170, 24.6, '2024-04-08'),
(2, 112, 70, 80, 50.3, 159, 19.9, '2024-04-08'),
(3, 120, 68, 75, 65.7, 168, 23.3, '2024-04-08');

INSERT INTO WorkShift (trainer_id, date, start_time, end_time)
VALUES
(1, '2024-04-11', '2024-04-11 12:00:00', '2024-04-11 13:00:00'),
(1, '2024-04-12', '2024-04-12 12:00:00', '2024-04-12 13:00:00'),
(2, '2024-04-12', '2024-04-12 14:00:00', '2024-04-12 15:00:00');