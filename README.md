## Feladat 0001

prodec/

	Maven
	SQLite

central.sonatype.com
	sqlite-jdbc
	xerial

Az adatbázis-kapcsolathoz használjon interfészt
	Database.java
		interface Database{}
		connect()
	Sqlite.java
		class Sqlite implements Database ()

	FruitService.java
		getFruits()
		readFruits()
		indexFruits()
		findAll()

Statement
PreparedStatement (valamilyen külső információ is van akkor használjuk)

Megjelenítés

FriutView.java
	printFruits(List<Fruit> fruitList)

FruitController.java
