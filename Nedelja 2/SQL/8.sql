SELECT SUM(length)
FROM film
WHERE rental_duration NOT IN (6,7);