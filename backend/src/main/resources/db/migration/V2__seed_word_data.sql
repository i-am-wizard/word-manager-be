INSERT INTO word (id, word)
SELECT 1, 'World'
WHERE NOT EXISTS (
  SELECT 1 FROM word WHERE id = 1
);
