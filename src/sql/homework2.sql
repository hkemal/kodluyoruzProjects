SELECT * FROM film as F WHERE F.replacement_cost BETWEEN 12.99 AND 16.99;

SELECT A.first_name, A.last_name FROM actor as A WHERE A.first_name IN('Nick','Ed','Penelope');

SELECT * FROM film as F WHERE F.rental_rate IN(0.99,2.99,4.99) AND F.replacement_cost IN(12.99,15.99,28.99);