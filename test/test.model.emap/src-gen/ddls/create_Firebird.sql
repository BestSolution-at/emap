/* ------------------------------------
 * Tables
 * ------------------------------------
 */
/*
 * Table for Address
 */
create table "ADDRESS" (
	"ID" bigint not null
	, "E_VERSION" integer not null
	, "STREET" varchar(255)
	, "FK_PERSON" bigint
, constraint pk_ADDRESS PRIMARY KEY("ID")
);

/*
 * Table for Person
 */
create table "PERSON" (
	"ID" bigint not null
	, "E_VERSION" integer not null
	, "NAME" varchar(255)
, constraint pk_PERSON PRIMARY KEY("ID")
);

/*
 * Table for Place
 */
create table "PLACE" (
	"ID" bigint not null
	, "E_VERSION" integer not null
	, "NAME" varchar(255)
, constraint pk_PLACE PRIMARY KEY("ID")
);

/*
 * Table for MAddress
 */
create table "MADDRESS" (
	"ID" varchar(255) not null
	, "E_VERSION" integer not null
	, "STREET" varchar(255)
	, "FK_PERSON" varchar(255)
, constraint pk_MADDRESS PRIMARY KEY("ID")
);

/*
 * Table for MPerson
 */
create table "MPERSON" (
	"ID" varchar(255) not null
	, "E_VERSION" integer not null
	, "NAME" varchar(255)
, constraint pk_MPERSON PRIMARY KEY("ID")
);

/*
 * Table for MPlace
 */
create table "MPLACE" (
	"ID" bigint not null
	, "E_VERSION" integer not null
	, "NAME" varchar(255)
, constraint pk_MPLACE PRIMARY KEY("ID")
);

/*
 * Table for MTag
 */
create table "MTAG" (
	"ID" varchar(255) not null
	, "E_VERSION" integer not null
	, "VAL" varchar(255)
	, "ENDLESSINT" varchar(255)
	, "FK_ADDRESS" varchar(255)
, constraint pk_MTAG PRIMARY KEY("ID")
);


/*
 * N:M Tables
 */
create table "LIKES_PERSON_PLACE" (
	"FK_PERSON" bigint not null,
	"FK_PLACE" bigint not null
);
create table "MLIKES_PERSON_PLACE" (
	"FK_PERSON" varchar(255) not null,
	"FK_PLACE" bigint not null
);


/* ------------------------------------
 * Create sequences
 * ------------------------------------
 */
/* Sequence for ADDRESS */
create sequence SEQ_ADDRESS_ID;
/* Sequence for PERSON */
create sequence SEQ_PERSON_ID;
/* Sequence for PLACE */
create sequence SEQ_PLACE_ID;
/* Sequence for MADDRESS */
create sequence SEQ_MADDRESS_ID;
/* Sequence for MPERSON */
create sequence SEQ_MPERSON_ID;
/* Sequence for MPLACE */
create sequence SEQ_MPLACE_ID;
/* Sequence for MTAG */
create sequence SEQ_MTAG_ID;

/* ------------------------------------
 * Constraints
 * ------------------------------------
 */

alter table "ADDRESS"
	add constraint fk_Address_person
	foreign key ("FK_PERSON")
	references "PERSON" ("ID");

alter table "MADDRESS"
	add constraint fk_MAddress_person
	foreign key ("FK_PERSON")
	references "MPERSON" ("ID");

alter table "MTAG"
	add constraint fk_MTag_address
	foreign key ("FK_ADDRESS")
	references "MADDRESS" ("ID");

/* N:M relation constraints */
alter table "LIKES_PERSON_PLACE"
	add constraint fk_Place_likedBy
	foreign key ("FK_PLACE")
	references "PLACE" ("ID");

alter table "LIKES_PERSON_PLACE"
	add constraint fk_Person_likes
	foreign key ("FK_PERSON")
	references "PERSON" ("ID");

alter table "MLIKES_PERSON_PLACE"
	add constraint fk_MPlace_likedBy
	foreign key ("FK_PLACE")
	references "MPLACE" ("ID");

alter table "MLIKES_PERSON_PLACE"
	add constraint fk_MPerson_likes
	foreign key ("FK_PERSON")
	references "MPERSON" ("ID");


/* FK-Constraints for multi-valued primitive attributes */

/* ------------------------------------
 * Create indices
 * ------------------------------------
 */
