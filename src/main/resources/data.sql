-- executed if there is a data.sql
DROP TABLE IF EXISTS virtualPet CASCADE;
CREATE TABLE pets(id LONG, pet_name VARCHAR(255), pet_species VARCHAR(255),  pet_hunger INT);

-- -- executed only if seeding is enabled in application.properties 
-- INSERT INTO customer VALUES(1, 'firstName1', 'lastName1', '12 August 2023');
-- INSERT INTO customer VALUES(2, 'firstName2', 'lastName2', '12 August 2023');
INSERT INTO pets VALUES(1, 'petName', 'petSpecies', 5);
INSERT INTO pets VALUES(2, 'petName', 'petSpecies', 5);
INSERT INTO pets VALUES(3, 'petName', 'petSpecies', 5);