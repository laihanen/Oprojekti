INSERT INTO luoja (nimi, sposti, salasana)
VALUES
('Jorma Testaaja', 'jormatestaaja@joku.fi', 'salasana1234');

INSERT INTO kysely (nimi, luoja_id)
VALUES
('Kyselyn lähtökohtana on tutkia Haaga-Helia ammattikorkeakoulun opiskelijoiden kouluviihtyvyyttä ja sen kehittämistä', 1);

INSERT INTO otsikko (nimi)
VALUES
('Perustiedot');

INSERT INTO kysymystyyppi (nimi)
VALUES
('Yksi valinta')
('Monta valintaa')
('Tekstivastaus');

INSERT INTO kysymys (kysymysteksti, kysely_id, otsikko_id, kysymystyyppi_id)
VALUES
('Sukupuoli', 1, 1, 1);

INSERT INTO vaihtoehto(nimi, kysymys_id)
VALUES
('N', 1),
('M', 1),
('Muu', 1);

INSERT INTO vastaus(avointekstivastaus, kysymys_id)
VALUES
(NULL, 1);

INSERT INTO vaihtoehtoVastaus(vastaus_id, vaihtoehto_id)
VALUES
(1,2);