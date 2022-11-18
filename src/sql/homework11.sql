(SELECT AC.first_name FROM actor AS AC)
UNION
(SELECT CUS.first_name FROM customer AS CUS);


(SELECT AC.first_name FROM actor AS AC)
INTERSECT
(SELECT CUS.first_name FROM customer AS CUS);

(SELECT AC.first_name FROM actor as AC)
EXCEPT
(SELECT CUS.first_name FROM customer as CUS);


(SELECT AC.first_name FROM actor as AC)
UNION ALL
(SELECT CUS.first_name FROM customer as CUS);

(SELECT AC.first_name FROM actor as AC)
EXCEPT ALL
(SELECT CUS.first_name FROM customer as CUS);