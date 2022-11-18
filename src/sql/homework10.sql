SELECT
CT.city AS city,
CN.country AS country
FROM city AS CT
LEFT JOIN country as CN ON CT.country_id = CN.country_id;

SELECT
PY.payment_id AS paymentId,
CUS.first_name AS firstName,
CUS.last_name AS lastName
FROM customer AS CUS
RIGHT JOIN payment AS PY ON PY.customer_id = CUS.customer_id

SELECT
CUS.first_name,
CUS.last_name,
RT.rental_id
FROM customer AS CUS
FULL JOIN rental AS RT ON RT.customer_id = CUS.customer_id