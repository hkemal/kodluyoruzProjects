SELECT
CN.country AS country,
CT.city AS city
FROM country AS CN
INNER JOIN city AS CT ON CT.country_id = CN.country_id

SELECT
PY.customer_id as customerId,
CUS.first_name as firstName,
CUS.last_name as lastName,
sum(PY.amount) as totalAmount
FROM customer as CUS
INNER JOIN payment AS PY ON PY.customer_id = CUS.customer_id
GROUP BY PY.customer_id, CUS.first_name , CUS.last_name
ORDER BY CUS.first_name, CUS.last_name

SELECT
CUS.first_name as firstName,
CUS.last_name as lastName,
RT.rental_id as rentalId
FROM customer as CUS
INNER JOIN rental as RT ON RT.customer_id = CUS.customer_id
ORDER BY CUS.first_name, CUS.last_name