SELECT title
FROM film
WHERE rental_rate<=1.00 AND (title LIKE 'D%' OR title LIKE '%r');