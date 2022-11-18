SELECT
AVG(F.rental_rate)
FROM film as F

SELECT
COUNT(F.film_id)
FROM film as F
WHERE F.title LIKE 'C%';

SELECT
MAX(F.length)
FROM film as F
WHERE F.rental_rate = 0.99;

SELECT
COUNT(DISTINCT F.replacement_cost)
FROM film as F
WHERE F.length > 150;