-- clients
insert into "clients"(id, email, password)
values ('6314099e-4c88-11ec-81d3-0242ac130003', 'email@gmil.com', 'password');

-- groups
insert into "groups" (id, name, description)
values ('6314099e-4c88-11ec-81d3-111111111111', 'group1', 'description');
insert into "groups" (id, name, description)
values ('6314099e-4c88-11ec-81d3-111111111112', 'group2', 'description');
insert into "groups" (id, name, description)
values ('6314099e-4c88-11ec-81d3-111111111113', 'group3', 'description');

-- products
insert into "products" (id, name, group_id, description, producer, price)
values ('6314099e-4c88-11ec-81d3-aaaaaaaaaaa1', 'product1', '6314099e-4c88-11ec-81d3-111111111111', 'description',
        'producer', 1.1);
insert into "products" (id, name, group_id, description, producer, price)
values ('6314099e-4c88-11ec-81d3-aaaaaaaaaaa2', 'product2', '6314099e-4c88-11ec-81d3-111111111111', 'description',
        'producer', 1.1);
insert into "products" (id, name, group_id, description, producer, price)
values ('6314099e-4c88-11ec-81d3-aaaaaaaaaaa3', 'product3', '6314099e-4c88-11ec-81d3-111111111111', 'description',
        'producer', 1.1);
insert into "products" (id, name, group_id, description, producer, price)
values ('6314099e-4c88-11ec-81d3-aaaaaaaaaaa4', 'product4', '6314099e-4c88-11ec-81d3-111111111112', 'description',
        'producer', 1.1);
insert into "products" (id, name, group_id, description, producer, price)
values ('6314099e-4c88-11ec-81d3-aaaaaaaaaaa5', 'product5', '6314099e-4c88-11ec-81d3-111111111113', 'description',
        'producer', 1.1);
-- -- storage
insert into "storages"(id, name, location)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb1', 'storage1', 'Kiev');
insert into "storages"(id, name, location)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb2', 'storage2', 'Kiev');

-- -- storage_has_product
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb1', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa1', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb1', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa2', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb1', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa3', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb1', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa4', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb1', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa5', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb2', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa1', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb2', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa2', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb2', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa3', 1);
insert into "storage_has_product"(storage_id, product_id, number)
values ('6314099e-4c88-11ec-81d3-bbbbbbbbbbb2', '6314099e-4c88-11ec-81d3-aaaaaaaaaaa4', 1);

