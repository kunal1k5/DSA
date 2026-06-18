# Write your MySQL query statement below
-- CREATE TABLE Products(
--     product_id int,
--     low_fats ENUM('Y','N'),
--     recyclable ENUM('Y','N')
-- );

-- SELECT * FROM Products;

SELECT product_id FROM Products WHERE low_fats = 'y' AND recyclable = 'y';
