insert into tbl_proveedor (id_proveedor, nombre, estado_activo) values (1,'Amazon',true), (2,'Ebay',true), (3,'Facebook',true), (4,'Guatecompras',true),
(5,'Decatlón X',true), (6,'Sportline',true), (7,'Sportcity',true), (8,'Siman',true), (9,'Sport Mania',true), (10,'Mundi Deportes',true);


insert into tbl_cliente (id_cliente, nombre, apellido, direccion, email, telefono, nit, usuario, contraseña, rol, estado_activo) values 
(1,' Admin','Admin','Guatemala','1','1','1','admin','1234', true ,true),
(2,'Dorian Jose','Garcia Lopez','Mixco, Guatemala','dgarcia@gmail.com','45456412','8797603','dgarcia1','5678', false, true),
(3,'Higinia Andrea','Gomez Gutierres','Escuintla, Guatemala','hgomez@outlook.com','23457574','4777670','hgomez2','7894',false,true),
(4,'Nancy Alejandra','Mendoza Ruiz','Izabal, Guatemala','nmendoza@hotmail.com','35623218','1292303','nmendoza3','9876',false,true),
(5,'Mario Saul','Cardona Jimenez','Amatitlán, Guatemala','mcardona@yahoo.com','24585327','8757603','mcardona4','3456',false,true);

select * from tbl_cliente;

insert into tbl_producto (id_producto, nombre, precio, id_proveedor, estado_activo) values (1,'Aro Para Baloncesto','300','1',true),
(2,'Pelota Para Basquet','250','2',true),
(3,'Guantes De Boxeo','410','3',true),
(4,'Saco De Boxeo','550','4',true),
(5,'Mesa De Ping Pong','2420','5',true);

select * from tbl_producto;

insert into tbl_compra (id_compra, fecha, id_producto, id_cliente, estado_activo) values (1,'2022-08-10 12:45:50','1','2',true),
(2,'2022-08-20 10:30:36','2','3',true),
(3,'2022-08-25 20:10:05','3','4',true),
(4,'2022-09-11 13:22:42','4','5',true);

select * from tbl_compra;


insert into tbl_detalle_compra (id_detalle_compra, id_compra, cantidad_compra) values (1,1,'2'),(2,2,'4'),(3,3,'3'),(4,4,'1');

select * from tbl_detalle_compra;