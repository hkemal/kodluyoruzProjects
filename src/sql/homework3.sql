SELECT * FROM country as C WHERE C.country LIKE 'A%a';

SELECT * FROM country as C WHERE C.country LIKE '_____%n';

SELECT F.title FROM film as F WHERE F.title ILIKE '%t%t%t%t%';

SELECT * FROM film as F WHERE F.title LIKE 'C%' AND F.length>90 AND F.rental_rate=2.99;