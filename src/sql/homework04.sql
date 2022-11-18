ELECT DISTINCT F.replacement_cost FROM film as F;

SELECT COUNT (DISTINCT replacement_cost) FROM film;

SELECT F.title FROM film as F WHERE F.title LIKE 'T%' AND F.rating='G';
SELECT COUNT (F.title) FROM film as F WHERE F.title LIKE 'T%' AND F.rating='G';

SELECT C.country FROM country as C WHERE C.country LIKE '_____';
SELECT COUNT (C.country) FROM country as C WHERE C.country LIKE '_____';

SELECT C.city FROM city as C WHERE C.city ILIKE '%r';
SELECT COUNT(C.city) FROM city as C WHERE C.city ILIKE '%r';