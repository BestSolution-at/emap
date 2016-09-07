

alter table "address"
	drop constraint fk_Address_person;

alter table "likes_person_place"
	drop constraint fk_Place_likedBy;

alter table "likes_person_place"
	drop constraint fk_Person_likes;





DROP TABLE "address";

DROP TABLE "person";

DROP TABLE "place";


DROP TABLE "likes_person_place";

/* ------------------------------------
 * Drop sequences
 * ------------------------------------
 */
