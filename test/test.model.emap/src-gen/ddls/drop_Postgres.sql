

alter table "address"
	drop constraint fk_Address_person;

alter table "maddress"
	drop constraint fk_MAddress_person;

alter table "mtag"
	drop constraint fk_MTag_address;

alter table "likes_person_place"
	drop constraint fk_Place_likedBy;

alter table "likes_person_place"
	drop constraint fk_Person_likes;
alter table "mlikes_person_place"
	drop constraint fk_MPlace_likedBy;

alter table "mlikes_person_place"
	drop constraint fk_MPerson_likes;





DROP TABLE "address";

DROP TABLE "person";

DROP TABLE "place";

DROP TABLE "maddress";

DROP TABLE "mperson";

DROP TABLE "mplace";

DROP TABLE "mtag";


DROP TABLE "likes_person_place";
DROP TABLE "mlikes_person_place";

/* ------------------------------------
 * Drop sequences
 * ------------------------------------
 */
DROP sequence addr;
DROP sequence HelloString;
DROP sequence SOMEPLACE;
DROP sequence nextMTagId;
