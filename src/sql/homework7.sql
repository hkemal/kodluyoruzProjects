SELECT
F.rating,
COUNT(F.film_id)
FROM film as F
GROUP BY F.rating;

SELECT F.replacement_cost,
COUNT(F.film_id)
FROM film as F
GROUP BY F.replacement_cost
HAVING COUNT(F.film_id)>50;

SELECT
C.store_id,
COUNT(C.customer_id)
FROM customer as C
GROUP BY C.store_id;

SELECT
C.country_id,
COUNT(C.city_id)
FROM city as C
GROUP BY C.country_id
ORDER BY COUNT(C.city_id) DESC
LIMIT 1;