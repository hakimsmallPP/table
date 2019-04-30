--<ScriptOptions statementTerminator=";"/>

CREATE TABLE liste postes transfo (
	N° INT NOT NULL,
	Site VARCHAR(45) NOT NULL,
	Type VARCHAR(45) NOT NULL,
	Puissance(KVA) INT NOT NULL,
	Tension primaire(Kvolts) INT NOT NULL,
	PRIMARY KEY (N°,Site)
);

