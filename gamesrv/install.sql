SET foreign_key_checks = 0;
drop table if exists player;
drop table if exists item;
drop table if exists monster;
drop table if exists player_item;
SET foreign_key_checks = 1;



create table player(id int primary key not null auto_increment,
login char(12) not null unique,
pass char(255) not null,
hp int not null,
max_hp int not null,
strength int not null,
max_strength int not null,
dexterity int not null,
max_dexterity int not null,
mana int not null,
max_mana int not null,
created_at timestamp default NOW(),
pos_x float,
pos_y float,
pos_z float,
angle_x float,
angle_y float,
angle_z float)ENGINE=INNODB;

create table item(id int primary key not null auto_increment,
name char(255) not null unique,
owner_id int default null,
value int default 0,
pos_x float not null,
pos_y float not null,
pos_z float not null,
description text default null)ENGINE=INNODB;

create table monster(id int primary key not null auto_increment,
name char(12) not null unique,
pos_x float,
pos_y float,
pos_z float,
hp int not null,
max_hp int not null,
respawn int)ENGINE=INNODB;

create table player_item(id int primary key not null auto_increment,
player_id int not null,
item_id int not null)ENGINE=INNODB;


insert into player(login, pass, hp, max_hp, strength, max_strength, dexterity, max_dexterity, mana, max_mana, pos_x, pos_y, pos_z, angle_x, angle_y, angle_z) VALUES
('Pitek', 'trudnehaslo', 10, 10, 300, 300, 5, 5, 1, 1, 1003.23, 1233.34, 1532.23, 23.32, 21.12, 41.12);

