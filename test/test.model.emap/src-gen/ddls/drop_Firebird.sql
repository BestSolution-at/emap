

alter table "ADDRESS"
	drop constraint fk_Address_person;

alter table "MADDRESS"
	drop constraint fk_MAddress_person;

alter table "MTAG"
	drop constraint fk_MTag_address;

alter table "LIKES_PERSON_PLACE"
	drop constraint fk_Place_likedBy;

alter table "LIKES_PERSON_PLACE"
	drop constraint fk_Person_likes;
alter table "MLIKES_PERSON_PLACE"
	drop constraint fk_MPlace_likedBy;

alter table "MLIKES_PERSON_PLACE"
	drop constraint fk_MPerson_likes;





DROP TABLE "ADDRESS";

DROP TABLE "PERSON";

DROP TABLE "PLACE";

DROP TABLE "MADDRESS";

DROP TABLE "MPERSON";

DROP TABLE "MPLACE";

DROP TABLE "MTAG";


DROP TABLE "LIKES_PERSON_PLACE";
DROP TABLE "MLIKES_PERSON_PLACE";

/* ------------------------------------
 * Drop sequences
 * ------------------------------------
 */
DROP sequence SEQ_ADDRESS_ID;
DROP sequence SEQ_PERSON_ID;
DROP sequence SEQ_PLACE_ID;
DROP sequence SEQ_MADDRESS_ID;
DROP sequence SEQ_MPERSON_ID;
DROP sequence SEQ_MPLACE_ID;
DROP sequence SEQ_MTAG_ID;
