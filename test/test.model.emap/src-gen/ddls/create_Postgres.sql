/* ------------------------------------
 * Tables
 * ------------------------------------
 */
/*
 * Table for Address
 */
create table "address" (
	"id" bigserial  not null PRIMARY KEY
	, "e_version" integer not null
	, "street" varchar(255)
	, "fk_person" bigint
);

/*
 * Table for Person
 */
create table "person" (
	"id" bigserial  not null PRIMARY KEY
	, "e_version" integer not null
	, "name" varchar(255)
);

/*
 * Table for Place
 */
create table "place" (
	"id" bigserial  not null PRIMARY KEY
	, "e_version" integer not null
	, "name" varchar(255)
);

/*
 * Table for MAddress
 */
create table "maddress" (
	"id" numeric not null PRIMARY KEY
	, "e_version" integer not null
	, "street" varchar(255)
	, "fk_person" varchar(255)
);

/*
 * Table for MPerson
 */
create table "mperson" (
	"id" varchar(255) not null PRIMARY KEY
	, "e_version" integer not null
	, "name" varchar(255)
);

/*
 * Table for MPlace
 */
create table "mplace" (
	"id" bigint not null PRIMARY KEY
	, "e_version" integer not null
	, "name" varchar(255)
);

/*
 * Table for MTag
 */
create table "mtag" (
	"id" numeric not null PRIMARY KEY
	, "e_version" integer not null
	, "value" varchar(255)
	, "endlessint" numeric
	, "fk_address" numeric
);


/*
 * N:M Tables
 */
create table "likes_person_place" (
	"fk_person" bigint not null,
	"fk_place" bigint not null
);
create table "mlikes_person_place" (
	"fk_person" varchar(255) not null,
	"fk_place" bigint not null
);


/* ------------------------------------
 * Create sequences
 * ------------------------------------
 */
/* Sequence for maddress */
create sequence addr;
/* Sequence for mperson */
create sequence HelloString;
/* Sequence for mplace */
create sequence SOMEPLACE;
/* Sequence for mtag */
create sequence nextMTagId;

/* ------------------------------------
 * Constraints
 * ------------------------------------
 */

alter table "address"
	add constraint fk_Address_person
	foreign key ("fk_person")
	references "person" ("id");

alter table "maddress"
	add constraint fk_MAddress_person
	foreign key ("fk_person")
	references "mperson" ("id");
ALTER TABLE maddress ALTER COLUMN id SET DEFAULT nextval('addr'::regclass);
ALTER TABLE mperson ALTER COLUMN id SET DEFAULT nextval('HelloString'::regclass);
ALTER TABLE mplace ALTER COLUMN id SET DEFAULT nextval('SOMEPLACE'::regclass);

alter table "mtag"
	add constraint fk_MTag_address
	foreign key ("fk_address")
	references "maddress" ("id");
ALTER TABLE mtag ALTER COLUMN id SET DEFAULT nextval('nextMTagId'::regclass);

/* N:M relation constraints */
alter table "likes_person_place"
	add constraint fk_Place_likedBy
	foreign key ("fk_place")
	references "place" ("id");

alter table "likes_person_place"
	add constraint fk_Person_likes
	foreign key ("fk_person")
	references "person" ("id");

alter table "mlikes_person_place"
	add constraint fk_MPlace_likedBy
	foreign key ("fk_place")
	references "mplace" ("id");

alter table "mlikes_person_place"
	add constraint fk_MPerson_likes
	foreign key ("fk_person")
	references "mperson" ("id");


/* FK-Constraints for multi-valued primitive attributes */

/* ------------------------------------
 * Create indices
 * ------------------------------------
 */
