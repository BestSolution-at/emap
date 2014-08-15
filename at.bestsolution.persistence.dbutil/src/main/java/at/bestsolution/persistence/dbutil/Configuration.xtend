package at.bestsolution.persistence.dbutil

import de.itemis.jsonized.Jsonized
import java.io.File
import com.google.common.io.Files
import com.google.common.base.Charsets
import com.google.gson.JsonParser
import com.google.gson.JsonObject

@Jsonized('{
	"baseDir": "C:/bizerba/workspaces/emap/",
	"database" : [
		{
			"name" : "Oracle",
			"jdbcDriver" : "oracle.jdbc.OracleDriver",
			"jdbcUrl" : "jdbc:oracle:thin:@172.17.254.79:1521:xe",
			"username" : "tom",
			"password" : "roonong"
		}
	],
	"mappingProjects" : [
		{ "name" : "basic.emaps" },
		{ "name" : "extended.emaps" }
	],
	"initScripts" : [
		{ "name" : "Oracle" }
	]
}')
class Configuration {
	new (String path) {
		val file = new File(path)
		val reader = Files.newReader(file, Charsets.UTF_8)
		try {
			val rootElement = new JsonParser().parse(reader)
			delegate = rootElement as JsonObject
		} finally {
			reader?.close
		}
	}
}