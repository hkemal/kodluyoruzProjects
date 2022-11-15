SELECT
F.title,
F.length
FROM film as F
WHERE F.title LIKE '%n'
ORDER BY F.length DESC
LIMIT 5;

SELECT
F.title,
F.length
FROM film as F
WHERE title LIKE '%n'
ORDER BY length
OFFSET 5 LIMIT 5;

SELECT
C.last_name
FROM customer as C
WHERE C.store_id=1
ORDER BY C.last_name DESC
LIMIT 4;