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
 * N:M Tables
 */
create table "likes_person_place" (
	"fk_person" bigint not null,
	"fk_place" bigint not null
);

/* ------------------------------------
 * Create sequences
 * ------------------------------------
 */

/* ------------------------------------
 * Constraints
 * ------------------------------------
 */

alter table "address"
	add constraint fk_Address_person
	foreign key ("fk_person")
	references "person" ("id");

/* N:M relation constraints */
alter table "likes_person_place"
	add constraint fk_Place_likedBy
	foreign key ("fk_person")
	references "person" ("id");

alter table "likes_person_place"
	add constraint fk_Person_likes
	foreign key ("fk_place")
	references "place" ("id");


/* FK-Constraints for multi-valued primitive attributes */

/* ------------------------------------
 * Create indices
 * ------------------------------------
 */
