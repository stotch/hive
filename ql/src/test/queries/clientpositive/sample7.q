CREATE TABLE dest1(key INT, value STRING);

-- both input pruning and sample filter
INSERT OVERWRITE TABLE dest1 SELECT s.* 
FROM srcbucket TABLESAMPLE (BUCKET 1 OUT OF 4 on key) s
WHERE s.key > 100;

SELECT dest1.* FROM dest1;
