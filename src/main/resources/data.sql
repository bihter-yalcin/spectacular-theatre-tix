-- Insert data into the customer table
INSERT INTO customers (customer_id, name, surname, tier, version) VALUES
('1', 'John', 'Doe', 'GOLD', 0),
('2', 'Jane', 'Smith', 'SILVER', 0),
('3', 'Alice', 'Johnson', 'BRONZE', 0),
('4', 'Bob', 'Brown', 'PLATINUM', 0);

-- Insert data into the shows table
INSERT INTO shows (show_id, name, writer, type, total_seats, available_seats) VALUES
(10000000, 'Hamlet', 'William Shakespeare', 'CLASSIC', 200, 200),
(20000000, 'Macbeth', 'William Shakespeare', 'CLASSIC', 150, 150),
(30000000, 'Othello', 'William Shakespeare', 'CLASSIC', 180, 180),
(40000000, 'Romeo and Juliet', 'William Shakespeare', 'CLASSIC', 220, 220),
(50000000, 'A Midsummer Nights Dream', 'William Shakespeare', 'CLASSIC', 170, 170);

-- Insert data into the tickets table
INSERT INTO tickets (ticket_id, show_id, book_date, customer_id, version) VALUES
('t1', 10000000, '2024-01-01 10:00:00', '1', 0),
('t2', 20000000, '2024-01-02 11:00:00', '2', 0),
('t3', 30000000, '2024-01-03 12:00:00', '3', 0),
('t4', 40000000, '2024-01-04 13:00:00', '4', 0),
('t5', 50000000, '2024-01-05 14:00:00', '1', 0);
