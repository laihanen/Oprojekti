CREATE TABLE luoja (
	id INT NOT NULL AUTO_INCREMENT,
	nimi VARCHAR(100) NOT NULL,
	sposti VARCHAR(200) NOT NULL,
	salasana VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE kysely (
	id INT NOT NULL AUTO_INCREMENT,
	nimi VARCHAR(300) NOT NULL,
	luoja_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (luoja_id) REFERENCES luoja(id)
) ENGINE=InnoDB;

CREATE TABLE otsikko (
    id INT NOT NULL AUTO_INCREMENT,
    nimi VARCHAR(200),
    PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE kysymystyyppi (
    id INT NOT NULL AUTO_INCREMENT,
    nimi varchar(100),
    PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE kysymys (
    id INT NOT NULL AUTO_INCREMENT,
    kysymysteksti VARCHAR(300),
    kysely_id INT,
    otsikko_id INT,
    kysymystyyppi_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (kysely_id) REFERENCES kysely(id),
    FOREIGN KEY (otsikko_id) REFERENCES otsikko(id),
    FOREIGN KEY (kysymystyyppi_id) REFERENCES kysymystyyppi(id)
) ENGINE=InnoDB;

CREATE TABLE vaihtoehto(
    id INT NOT NULL AUTO_INCREMENT,
    nimi VARCHAR(200),
    kysymys_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (kysymys_id) REFERENCES kysymys(id)
) ENGINE=InnoDB;

CREATE TABLE vastaus(
    id INT NOT NULL AUTO_INCREMENT,
    avointekstivastaus VARCHAR(500),
    kysymys_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (kysymys_id) REFERENCES kysymys(id)
) ENGINE=InnoDB;

CREATE TABLE vaihtoehtoVastaus(
    vastaus_id INT,
    vaihtoehto_id INT,
    PRIMARY KEY (vastaus_id, vaihtoehto_id),
    FOREIGN KEY (vastaus_id) REFERENCES vastaus(id),
    FOREIGN KEY (vaihtoehto_id) REFERENCES vaihtoehto(id)
) ENGINE=InnoDB;