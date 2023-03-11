-- Отобразить всю таблицу
SELECT *
FROM Jaegers;

-- Отобразить только не уничтоженных роботов
SELECT *
FROM Jaegers
WHERE status = 'saved';

-- Отобразить роботов нескольких серий: Mark-1, Mark-4
SELECT *
FROM Jaegers
WHERE mark IN ('Mark-1', 'Mark-4');

-- Отобразить всех роботов, кроме Mark-1, Mark-4
SELECT *
FROM Jaegers
WHERE mark NOT IN ('Mark-1', 'Mark-4');

--Отсортировать таблцу по убыванию по столбцу Mark
SELECT *
FROM Jaegers
ORDER BY Mark DESC;

-- Отобразить информацию о самом старом роботе
SELECT *
FROM Jaegers
WHERE launch = (
        SELECT MIN(launch)
        FROM Jaegers
    );

-- Отобразить роботов, которые уничтожили больше всего kaiju
SELECT *
FROM Jaegers
WHERE kaijuKill = (
        SELECT MAX(kaijuKill)
        FROM Jaegers
    );

-- Отобразить средний вес роботов
SELECT AVG(weight)
FROM Jaegers;

-- Увеличить на единицу количество уничтоженных kaiju у не разрушенных роботов
UPDATE Jaegers
SET kaijuKill = kaijuKill + 1
WHERE status = 'saved';

-- Удалить разрушенных роботов 
DELETE FROM Jaegers
WHERE status = 'destroyed';