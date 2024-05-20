create table PERSONS (
                         name varchar(50),
                         surname varchar(50),
                         age int,
                         phone_number int not null,
                         city_of_living varchar(50) not null,
                         PRIMARY KEY (name, surname, age)
);

insert into PERSONS(name, surname, age, phone_number, city_of_living)
values ('Alexey', 'Alexeev', 32, 5689, 'Archangelsk');

insert into PERSONS(name, surname, age, phone_number, city_of_living)
values ('Alexandr', 'Alexandrov', 31, 5680, 'Vologda');

insert into PERSONS(name, surname, age, phone_number, city_of_living)
values ('Artem', 'Artemov', 30, 5681, 'Archangelsk');

insert into PERSONS(name, surname, age, phone_number, city_of_living)
values ('Andrey', 'Andreev', 33, 5682, 'Velsk');

insert into PERSONS(name, surname, age, phone_number, city_of_living)
values ('Anton', 'Antonov', 34, 5683, 'Severodvinsk');

insert into PERSONS(name, surname, age, phone_number, city_of_living)
values ('Artur', 'Arturov', 35, 5684, 'Moscow');