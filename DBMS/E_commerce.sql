/*Assignment 3 :- */
CREATE database E_Commerce;
USE E_Commerce;

/*create table with attributes category_name, category_id, parent_category_id*/
CREATE TABLE product_categories(
    category_name VARCHAR(50),
    category_id INT,
    parent_category_id INT,
    PRIMARY KEY(category_id)
);

/*insert values in table product_categories*/
INSERT INTO product_categories VALUES('Mobiles & Tablets',1,NULL);
INSERT INTO product_categories VALUES('Computers',2,NULL);
INSERT INTO product_categories VALUES('Home Appliances',3,NULL);
INSERT INTO product_categories VALUES('Mobiles',4,1);
INSERT INTO product_categories VALUES('Tablets',5,1);
INSERT INTO product_categories VALUES('Accessories',6,1);
INSERT INTO product_categories VALUES('Cases & Covers',7,1);
INSERT INTO product_categories VALUES('Desktop',8,2);
INSERT INTO product_categories VALUES('Laptop',9,2);
INSERT INTO product_categories VALUES('Laptop Accessories',10,2);
INSERT INTO product_categories VALUES('Printers',11,2);
INSERT INTO product_categories VALUES('TVs',12,3);
INSERT INTO product_categories VALUES('Air Conditioners',13,3);
INSERT INTO product_categories VALUES('Washing Machines',14,3);
INSERT INTO product_categories VALUES('Smart Phones',15,4);
INSERT INTO product_categories VALUES('Featured Phones',16,4);
INSERT INTO product_categories VALUES('2G',17,5);
INSERT INTO product_categories VALUES('3G',18,5);
INSERT INTO product_categories VALUES('Keyboard',19,10);
INSERT INTO product_categories VALUES('Mouse',20,10);
INSERT INTO product_categories VALUES('Headphones',21,10);
INSERT INTO product_categories VALUES('Inkjet',22,11);
INSERT INTO product_categories VALUES('Laser',23,11);
INSERT INTO product_categories VALUES('LED',24,12);
INSERT INTO product_categories VALUES('LCD',25,12);
INSERT INTO product_categories VALUES('Plasma',26,12);
INSERT INTO product_categories VALUES('Full Automatic',27,14);
INSERT INTO product_categories VALUES('Semi Automatic',28,14);
INSERT INTO product_categories VALUES('Top Load',29,27);
INSERT INTO product_categories VALUES('Front Load',30,27);

/* 
display all the categories along with its Parent category.
Result is sorted according to Parent Category name.
If category is top category then it will display “Top Category” in Parent category.
*/
SELECT c1.category_name category, IFNULL(c2.category_name, "top category") Parent_category
FROM  product_categories c1
LEFT JOIN  product_categories c2
ON C1.parent_category_id = c2.category_id
ORDER BY category;

/*display only Top Categories
(categories having no parent category)*/
SELECT category_name 
FROM product_categories
WHERE parent_category_id IS NULL;






