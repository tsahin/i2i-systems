/*
author:Tugba Sahin
date: 02.08.2018
*/

INSERT INTO countries(country_id,country_name,region_id) VALUES('TR','Turkey',1); --0.022 seconds

CREATE INDEX index_test
ON countries(country_id,country_name,region_id); -- 0,334 seconds

INSERT INTO countries(
    country_id,
    country_name,
    region_id
) VALUES ('AZ','AZERBAYCAN',1);--0,018 seconds

SELECT * FROM countries;





