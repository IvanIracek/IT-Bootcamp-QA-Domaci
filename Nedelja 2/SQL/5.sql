SELECT title
FROM film
WHERE (length>60 OR rental_rate=0.99) AND NOT (length=60 AND rental_rate=0.99 );