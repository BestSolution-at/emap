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
 * N:M Tables
 */
create table "LIKES_PERSON_PLACE" (
	"FK_PERSON" bigint not null,
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

/* ------------------------------------
 * Constraints
 * ------------------------------------
 */

alter table "ADDRESS"
	add constraint fk_Address_person
	foreign key ("FK_PERSON")
	references "PERSON" ("ID");

/* N:M relation constraints */
alter table "LIKES_PERSON_PLACE"
	add constraint fk_Place_likedBy
	foreign key ("FK_PERSON")
	references "PERSON" ("ID");

alter table "LIKES_PERSON_PLACE"
	add constraint fk_Person_likes
	foreign key ("FK_PLACE")
	references "PLACE" ("ID");


/* FK-Constraints for multi-valued primitive attributes */

/* ------------------------------------
 * Create indices
 * ------------------------------------
 */
