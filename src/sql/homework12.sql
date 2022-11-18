SELECT
COUNT(F.length) AS maxLengthFilmCount
FROM film AS F
WHERE F.length > (SELECT AVG(F.length) FROM film AS F);

SELECT
COUNT(F.rental_rate) AS maxRentalRateCount
FROM film AS F
WHERE F.rental_rate = (SELECT MAX(F.rental_rate) FROM film AS F);

SELECT
F.title AS title,
F.rental_rate AS rentalRate,
F.replacement_cost AS replacementCost,
(SELECT MIN(F.rental_rate) FROM film AS F) AS minRentalRate,
(SELECT MIN(F.replacement_cost) FROM film AS F) AS minReplacementCost
FROM film AS F
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) AND replacement_cost = (SELECT MIN(replacement_cost)FROM Film);

SELECT
CUS.first_name AS firstName,
CUS.last_name AS lastName,
PY.customer_id AS customerId,
COUNT(PY.customer_id) AS salesCount
FROM payment AS PY
LEFT JOIN customer AS CUS ON CUS.customer_id = PY.customer_id
GROUP BY CUS.first_name, CUS.last_name, PY.customer_id
ORDER BY COUNT(PY.customer_id) DESC;