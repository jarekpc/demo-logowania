insert into users(username, password, enabled)
    values('admin', '$2a$04$lcVPCpEk5DOCCAxOMleFcOJvIiYURH01P9rx1Y/pl.wJpkNTfWO6u', true);
insert into authorities(username, authority)
    values('admin','ROLE_ADMIN');
insert into users(username, password, enabled)
    values('user', '$2a$04$nbz5hF5uzq3qsjzY8ZLpnueDAvwj4x0U9SVtLPDROk4vpmuHdvG3a', true);
insert into authorities(username,authority)
    values('user','ROLE_USER');
insert into users(username, password, enabled)
    values('jarek', '$2a$04$7WWYBO9sUgx1P8BlOzo5E.NQ/68vXyNuEzjsEG/o9hzWFwTiO8MCa', true);
insert into authorities(username,authority)
        values('jarek','ROLE_USER');

