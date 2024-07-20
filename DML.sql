create table if not exists tbl_proveedor(
	id_proveedor int not null auto_increment,
    primary key (id_proveedor),
    unique (id_proveedor),
    nombre varchar(30)
);

create table if not exists tbl_cliente(
	id_cliente int not null auto_increment,
    primary key (id_cliente),
    unique (id_cliente),
    nombre varchar(35),
    apellido varchar(45),
    direccion varchar(50),
    email varchar(30),
    telefono varchar(10),
    nit varchar(15),
    usuario varchar(20),
    contraseña varchar(20),
    rol boolean,
    estado_activo boolean   
);

create table if not exists tbl_producto(
	id_producto int not null auto_increment,
    primary key(id_producto),
    unique (id_producto),
    nombre varchar(30),
    precio varchar(10),
    id_proveedor int not null,
    foreign key(id_proveedor) references tbl_proveedor(id_proveedor),
    estado_activo boolean
);
create table if not exists tbl_compra(
	id_compra int not null auto_increment,
    primary key(id_compra),
    unique (id_compra),
    fecha datetime,
    id_producto int not null,
    id_cliente int not null,
    foreign key(id_producto) references tbl_producto(id_producto),
    foreign key(id_cliente) references tbl_cliente(id_cliente),
    estado_activo boolean
);

create table if not exists tbl_detalle_compra(
	id_detalle_compra int not null auto_increment,
    primary key(id_detalle_compra),
    unique (id_detalle_compra),
    id_compra int not null,
    foreign key(id_compra) references tbl_compra(id_compra),
    cantidad_compra varchar(5)
);
alter table tbl_proveedor add column estado_activo boolean;