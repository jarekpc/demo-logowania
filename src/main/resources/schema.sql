--drop table users;
--drop table authorities;

CREATE TABLE users(
    username varchar(75) not null primary key,
    password varchar(150) not null,
    enabled boolean not null
);
CREATE TABLE authorities (
    username varchar(75) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);