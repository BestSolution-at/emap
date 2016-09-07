

alter table "ADDRESS"
	drop constraint fk_Address_person;

alter table "LIKES_PERSON_PLACE"
	drop constraint fk_Place_likedBy;

alter table "LIKES_PERSON_PLACE"
	drop constraint fk_Person_likes;





DROP TABLE "ADDRESS";

DROP TABLE "PERSON";

DROP TABLE "PLACE";


DROP TABLE "LIKES_PERSON_PLACE";

/* ------------------------------------
 * Drop sequences
 * ------------------------------------
 */
DROP sequence SEQ_ADDRESS_ID;
DROP sequence SEQ_PERSON_ID;
DROP sequence SEQ_PLACE_ID;
