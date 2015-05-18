-- --------------------------------------------------------
-- Hôte:                         127.0.0.1
-- Version du serveur:           5.6.12-log - MySQL Community Server (GPL)
-- Serveur OS:                   Win64
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la base pour dahouëtfinal2
CREATE DATABASE IF NOT EXISTS `dahouëtfinal2` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dahouëtfinal2`;


-- Export de la structure de table dahouëtfinal2. challenge
CREATE TABLE IF NOT EXISTS `challenge` (
  `Num_challenge` int(11) NOT NULL,
  `Annee_challenge` int(11) NOT NULL,
  `Saison_challenge` varchar(25) NOT NULL,
  `Debut_Chall` date DEFAULT NULL,
  `Fin_Chall` date DEFAULT NULL,
  PRIMARY KEY (`Num_challenge`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.challenge: ~3 rows (environ)
/*!40000 ALTER TABLE `challenge` DISABLE KEYS */;
INSERT INTO `challenge` (`Num_challenge`, `Annee_challenge`, `Saison_challenge`, `Debut_Chall`, `Fin_Chall`) VALUES
	(1, 2014, 'Hiver', '2014-09-21', '2015-03-30'),
	(2, 2015, 'Eté', '2015-03-31', '2015-09-29'),
	(3, 2015, 'Hiver', '2015-09-30', '2016-03-30');
/*!40000 ALTER TABLE `challenge` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. classe
CREATE TABLE IF NOT EXISTS `classe` (
  `Nom_classe` varchar(25) NOT NULL,
  `Num_serie` int(11) NOT NULL,
  `Coefficient` float(7,4) NOT NULL,
  PRIMARY KEY (`Nom_classe`),
  KEY `Num_serie` (`Num_serie`),
  CONSTRAINT `FK_classe_serie` FOREIGN KEY (`Num_serie`) REFERENCES `serie` (`Num_serie`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.classe: ~12 rows (environ)
/*!40000 ALTER TABLE `classe` DISABLE KEYS */;
INSERT INTO `classe` (`Nom_classe`, `Num_serie`, `Coefficient`) VALUES
	('Aile', 2, 0.5402),
	('Corsaire', 1, 1.2000),
	('Dragon', 2, 0.1234),
	('Grand surprise', 1, 0.8900),
	('J80', 1, 1.2400),
	('LongTZE', 1, 0.7500),
	('Mini', 2, 2.4540),
	('Muscadet', 1, 0.8800),
	('Open 5,70', 1, 1.2340),
	('Soling', 2, 1.3000),
	('Star', 2, 0.0864),
	('Vent d\'\'ouest', 2, 1.2100);
/*!40000 ALTER TABLE `classe` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. club
CREATE TABLE IF NOT EXISTS `club` (
  `Num_club` int(11) NOT NULL,
  `nom_club` varchar(50) NOT NULL,
  PRIMARY KEY (`Num_club`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.club: ~4 rows (environ)
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` (`Num_club`, `nom_club`) VALUES
	(1, 'CLUB MICKEY'),
	(2, 'CLUB FRANCE LOISIR'),
	(3, 'CLUB SANDWHICH'),
	(4, 'CLUB ECHANGISTE');
/*!40000 ALTER TABLE `club` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. commissaire
CREATE TABLE IF NOT EXISTS `commissaire` (
  `Num_commissaire` int(11) NOT NULL,
  `Nom_commissaire` varchar(25) NOT NULL,
  `Coordonnees` varchar(50) NOT NULL,
  `Comite` varchar(25) NOT NULL,
  PRIMARY KEY (`Num_commissaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.commissaire: ~3 rows (environ)
/*!40000 ALTER TABLE `commissaire` DISABLE KEYS */;
INSERT INTO `commissaire` (`Num_commissaire`, `Nom_commissaire`, `Coordonnees`, `Comite`) VALUES
	(1, 'Maigret', '30 rue de la galere, 29000 Brest', 'BRETAGNE'),
	(2, 'Moulin', '22 avenue Legrand, 33000 Bordeaux', 'AQUITAINE'),
	(3, 'Léfaisse', '17 rue Mordor, 17 LA ROCHELLE', 'CHARENTE');
/*!40000 ALTER TABLE `commissaire` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. equipage
CREATE TABLE IF NOT EXISTS `equipage` (
  `Num_participation` int(11) NOT NULL,
  `Num_membre_equipage` int(11) NOT NULL,
  PRIMARY KEY (`Num_participation`,`Num_membre_equipage`),
  KEY `FK_equipage_membre equipage` (`Num_membre_equipage`),
  KEY `FK_equipage_participation` (`Num_participation`),
  CONSTRAINT `FK_equipage_membre equipage` FOREIGN KEY (`Num_membre_equipage`) REFERENCES `membre_equipage` (`Num_membre`),
  CONSTRAINT `FK_equipage_participation` FOREIGN KEY (`Num_participation`) REFERENCES `participation` (`Num_participation`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.equipage: ~36 rows (environ)
/*!40000 ALTER TABLE `equipage` DISABLE KEYS */;
INSERT INTO `equipage` (`Num_participation`, `Num_membre_equipage`) VALUES
	(1, 1),
	(7, 1),
	(10, 1),
	(16, 1),
	(1, 2),
	(7, 2),
	(10, 2),
	(16, 2),
	(2, 3),
	(4, 3),
	(11, 3),
	(13, 3),
	(2, 4),
	(4, 4),
	(13, 4),
	(17, 4),
	(5, 5),
	(8, 5),
	(14, 5),
	(17, 5),
	(5, 6),
	(8, 6),
	(11, 6),
	(14, 6),
	(6, 7),
	(9, 7),
	(12, 7),
	(15, 7),
	(3, 8),
	(6, 8),
	(15, 8),
	(18, 8),
	(3, 9),
	(9, 9),
	(12, 9),
	(18, 9);
/*!40000 ALTER TABLE `equipage` ENABLE KEYS */;


-- Export de la structure de procedure dahouëtfinal2. interventions
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `interventions`(IN `Chall` INT, IN `date1` DATE, IN `date2` DATE)
BEGIN
select commissaire.Nom_commissaire,commissaire.Num_commissaire,commissaire.Comite,regate.Date_regate,regate.Num_regate from regate

inner join commissaire on regate.Num_commissaire=commissaire.Num_commissaire
inner join challenge on regate.Num_challenge = challenge.Num_challenge
inner join participation on regate.Num_regate = participation.Num_regate

where participation.Pavillon != " " 

or participation.Marque_touchee != " " 
or participation.Reparee_par_un_tour != " " 
or participation.Decision_CC != " "

and
regate.Date_regate>=date1 and regate.Date_regate<=date2 and regate.Num_challenge=Chall

group by regate.Date_regate
;
END//
DELIMITER ;


-- Export de la structure de procedure dahouëtfinal2. Liste equipage
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `Liste equipage`(IN `numéro_voilier` INT, IN `régate` INT)
    COMMENT 'Obtenir liste d''équipage d''un voilier pour une régate'
BEGIN
Select participation.Num_participation, participation.Num_voile, voilier.Nom_voilier,  equipage.Num_membre_equipage,membre_equipage.Nom_membre,participation.Num_regate,
(select membre_equipage.Nom_membre from membre_equipage where participation.Num_skipper=membre_equipage.Num_membre) as skipper
 
 

from participation  
inner join equipage on participation.Num_participation = equipage.Num_participation 
inner join membre_equipage on equipage.Num_membre_equipage=membre_equipage.Num_membre
inner join voilier on participation.Num_voile=voilier.Num_voile
inner join regate on participation.Num_regate=regate.Num_regate



where (régate=participation.Num_regate and numéro_voilier=participation.Num_voile); 
END//
DELIMITER ;


-- Export de la structure de table dahouëtfinal2. membre_equipage
CREATE TABLE IF NOT EXISTS `membre_equipage` (
  `Num_membre` int(11) NOT NULL,
  `Nom_membre` varchar(25) NOT NULL,
  `Coordonnees` varchar(50) NOT NULL,
  `Affiliation_FFV` enum('O','N') NOT NULL,
  `Licence` enum('O','N') NOT NULL,
  `Date_Naissance` date NOT NULL,
  PRIMARY KEY (`Num_membre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.membre_equipage: ~9 rows (environ)
/*!40000 ALTER TABLE `membre_equipage` DISABLE KEYS */;
INSERT INTO `membre_equipage` (`Num_membre`, `Nom_membre`, `Coordonnees`, `Affiliation_FFV`, `Licence`, `Date_Naissance`) VALUES
	(1, 'Isaac', '45, rue des madi?res, 22000 Langueux', 'O', 'O', '1980-10-23'),
	(2, 'Stubin', '33 Avenue Merlin, 50 Manche', 'O', 'O', '1989-12-02'),
	(3, 'Davy Jones', '74 rue mont rouge, 75000 Paris', 'O', 'O', '1970-06-30'),
	(4, 'Jack Sparow', 'New-York City, planet Earth', 'O', 'O', '1975-03-22'),
	(5, 'Barbe Noire', '4, place de la republique, 72000 le Mans', 'O', 'O', '1980-11-25'),
	(6, 'Luffy', '57, avenue du pont, 50000 Gerville', 'O', 'O', '1969-06-06'),
	(7, 'Naty la Borgne', 'MI5, london bridge, 451 London', 'O', 'O', '1970-06-14'),
	(8, 'Yoann Le Boiteux', '48 rue de la BDD, 48570 bourg-la-reine', 'O', 'O', '1978-04-14'),
	(9, 'Fanch Le Rouge', '2 place de la révolution, 75000 Paname', 'O', 'O', '1988-04-10');
/*!40000 ALTER TABLE `membre_equipage` ENABLE KEYS */;


-- Export de la structure de procedure dahouëtfinal2. moyenne distances
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `moyenne distances`(IN `challenge` INT)
    READS SQL DATA
    COMMENT 'Calcule de la moyenne des distances des régates pour un challenge donné (hiver/été)'
BEGIN

select (sum( participation.Distance_parcourue) / count(participation.Num_regate)) as moyenne from participation 



inner join regate on participation.Num_regate=regate.Num_regate
where participation.Statut != 'A' and regate.Num_challenge=challenge
group by participation.Num_regate;



END//
DELIMITER ;


-- Export de la structure de table dahouëtfinal2. participation
CREATE TABLE IF NOT EXISTS `participation` (
  `Num_participation` int(11) NOT NULL,
  `Num_voile` int(11) NOT NULL,
  `Num_skipper` int(11) NOT NULL,
  `Num_regate` int(11) NOT NULL,
  `Statut` enum('P','A','R') NOT NULL,
  `Heure_depart` time NOT NULL,
  `Heure_arrivee` time NOT NULL,
  `Distance_parcourue` decimal(7,2) NOT NULL,
  `Pavillon` char(2) NOT NULL,
  `Marque_touchee` char(1) NOT NULL,
  `Reparee_par_un_tour` char(1) NOT NULL,
  `Decision_CC` char(1) NOT NULL,
  `Place_Regate` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`Num_participation`),
  KEY `FK_participation_voilier` (`Num_voile`),
  KEY `FK_participation_membre equipage` (`Num_skipper`),
  KEY `FK_participation_regate` (`Num_regate`),
  CONSTRAINT `FK_participation_membre equipage` FOREIGN KEY (`Num_skipper`) REFERENCES `membre_equipage` (`Num_membre`),
  CONSTRAINT `FK_participation_regate` FOREIGN KEY (`Num_regate`) REFERENCES `regate` (`Num_regate`),
  CONSTRAINT `FK_participation_voilier` FOREIGN KEY (`Num_voile`) REFERENCES `voilier` (`Num_voile`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.participation: ~18 rows (environ)
/*!40000 ALTER TABLE `participation` DISABLE KEYS */;
INSERT INTO `participation` (`Num_participation`, `Num_voile`, `Num_skipper`, `Num_regate`, `Statut`, `Heure_depart`, `Heure_arrivee`, `Distance_parcourue`, `Pavillon`, `Marque_touchee`, `Reparee_par_un_tour`, `Decision_CC`, `Place_Regate`) VALUES
	(1, 2, 5, 1, 'P', '15:10:00', '18:33:00', 20.00, '', 'O', 'O', '', 2),
	(2, 7, 6, 1, 'P', '15:10:00', '18:00:00', 22.00, '', '', '', '', 1),
	(3, 8, 7, 1, 'P', '15:10:00', '18:50:00', 21.00, '', '', '', '', 3),
	(4, 6, 2, 2, 'R', '14:15:00', '18:02:00', 33.00, 'J', '', '', '', 2),
	(5, 2, 1, 2, 'R', '14:20:00', '18:36:00', 33.00, '', 'O', '', 'D', 3),
	(6, 1, 9, 2, 'P', '14:10:00', '18:00:00', 32.00, 'J', '', '', '', 1),
	(7, 6, 8, 3, 'A', '00:00:00', '00:00:00', 0.00, '', '', '', 'D', 3),
	(8, 7, 3, 3, 'P', '13:00:00', '16:05:00', 40.00, 'R', '', '', 'D', 1),
	(9, 3, 4, 3, 'P', '13:00:00', '16:24:00', 41.00, '', 'O', 'O', '', 2),
	(10, 2, 5, 4, 'P', '14:10:00', '19:33:00', 26.00, '', 'O', 'O', '', 3),
	(11, 7, 8, 4, 'P', '14:10:00', '19:00:00', 27.00, '', '', '', '', 1),
	(12, 8, 4, 4, 'P', '14:10:00', '19:10:00', 25.00, '', '', '', '', 2),
	(13, 6, 2, 5, 'R', '14:15:00', '18:50:00', 34.00, 'J', '', '', '', 3),
	(14, 2, 1, 5, 'R', '14:20:00', '18:36:00', 32.00, '', 'O', '', 'D', 1),
	(15, 1, 9, 5, 'P', '14:10:00', '18:43:00', 33.00, 'J', '', '', '', 2),
	(16, 6, 6, 6, 'P', '13:00:00', '16:15:00', 24.00, '', '', '', 'D', 2),
	(17, 7, 3, 6, 'P', '13:00:00', '16:05:00', 25.00, 'R', '', '', 'D', 1),
	(18, 3, 7, 6, 'P', '13:00:00', '16:24:00', 26.00, '', '', '', '', 3);
/*!40000 ALTER TABLE `participation` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. proprietaire
CREATE TABLE IF NOT EXISTS `proprietaire` (
  `Num_proprietaire` int(11) NOT NULL,
  `Num_club` int(11) NOT NULL,
  `Nom_proprietaire` varchar(50) NOT NULL,
  `Coordonnees_proprietaire` varchar(50) NOT NULL,
  `Compte_participant` char(1) NOT NULL,
  PRIMARY KEY (`Num_proprietaire`),
  KEY `FK_proprietaire_club` (`Num_club`),
  CONSTRAINT `FK_proprietaire_club` FOREIGN KEY (`Num_club`) REFERENCES `club` (`Num_club`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.proprietaire: ~12 rows (environ)
/*!40000 ALTER TABLE `proprietaire` DISABLE KEYS */;
INSERT INTO `proprietaire` (`Num_proprietaire`, `Num_club`, `Nom_proprietaire`, `Coordonnees_proprietaire`, `Compte_participant`) VALUES
	(1, 1, 'Rotshild', 'Marseille', 'O'),
	(2, 2, 'Francois', 'Dijon', 'O'),
	(3, 3, 'Fensworth', 'Rennes', 'O'),
	(4, 4, 'Nathy', 'Nostan', 'O'),
	(5, 2, 'Francis Lalane', 'Vannes', 'O'),
	(6, 3, 'Dechavanne', 'Nostan', 'N'),
	(7, 1, 'Debanne', 'Singapour', 'O'),
	(8, 4, 'Dorothée', 'Londres', 'O'),
	(9, 1, 'Die Antwoord', 'Barcelonne', 'O'),
	(10, 4, 'F. Hollande', 'Paris', 'N'),
	(11, 3, 'Lionnel MeuhMeuh', 'Langueux', 'O'),
	(12, 2, 'Bond', 'NY', 'O');
/*!40000 ALTER TABLE `proprietaire` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. regate
CREATE TABLE IF NOT EXISTS `regate` (
  `Num_regate` int(11) NOT NULL,
  `Num_challenge` int(11) NOT NULL,
  `Num_commissaire` int(11) NOT NULL,
  `Date_regate` date NOT NULL,
  `Direction_Vent_Depart` char(3) NOT NULL,
  `Intensite_Vent` int(11) NOT NULL,
  `Direction_courant` char(3) NOT NULL,
  `Vitesse_courant` int(11) NOT NULL,
  `Etat_de_la_mer` varchar(25) NOT NULL,
  `Cap_depart` char(3) NOT NULL,
  `Longueur_1er_bord` float(10,0) NOT NULL,
  PRIMARY KEY (`Num_regate`),
  KEY `FK_regate_challenge` (`Num_challenge`),
  KEY `FK_regate_commissaire` (`Num_commissaire`),
  CONSTRAINT `FK_regate_challenge` FOREIGN KEY (`Num_challenge`) REFERENCES `challenge` (`Num_challenge`),
  CONSTRAINT `FK_regate_commissaire` FOREIGN KEY (`Num_commissaire`) REFERENCES `commissaire` (`Num_commissaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.regate: ~24 rows (environ)
/*!40000 ALTER TABLE `regate` DISABLE KEYS */;
INSERT INTO `regate` (`Num_regate`, `Num_challenge`, `Num_commissaire`, `Date_regate`, `Direction_Vent_Depart`, `Intensite_Vent`, `Direction_courant`, `Vitesse_courant`, `Etat_de_la_mer`, `Cap_depart`, `Longueur_1er_bord`) VALUES
	(1, 1, 2, '2014-11-01', 'NNO', 5, 'NON', 2, 'agitée', 'NNO', 10),
	(2, 1, 2, '2014-11-15', 'SSO', 3, 'NON', 2, 'calme', 'SSO', 12),
	(3, 1, 1, '2014-11-29', 'NNE', 2, 'SOS', 2, 'calme', 'NNE', 25),
	(4, 1, 3, '2014-12-13', 'SSO', 2, 'SSO', 3, 'agitée', 'SSO', 20),
	(5, 1, 3, '2014-12-27', 'ENE', 3, 'EEN', 2, 'agitée', 'EEN', 20),
	(6, 1, 2, '2015-01-03', 'SSO', 3, 'SSO', 2, 'temp?te', 'SSO', 12),
	(7, 1, 1, '2015-01-17', 'NNE', 2, 'NNE', 2, 'calme', 'NNE', 25),
	(8, 1, 3, '2015-01-31', 'SSO', 2, 'SSO', 3, 'agitée', 'SSO', 20),
	(9, 1, 3, '2015-02-14', 'ENE', 3, 'EEN', 2, 'agitée', 'EEN', 20),
	(10, 1, 2, '2015-02-28', 'SSO', 3, 'SSO', 2, 'temp?te', 'SSO', 12),
	(11, 1, 1, '2015-03-14', 'NNE', 2, 'NNE', 2, 'calme', 'NNE', 25),
	(12, 1, 3, '2015-03-28', 'SSO', 2, 'SSO', 3, 'agitée', 'SSO', 20),
	(13, 2, 2, '2014-05-02', 'NNO', 5, 'NNO', 2, 'agitée', 'NNO', 10),
	(14, 2, 2, '2014-05-16', 'SSO', 3, 'SSO', 2, 'calme', 'SSO', 12),
	(15, 2, 1, '2014-05-30', 'NNE', 2, 'NNE', 2, 'calme', 'NNE', 25),
	(16, 2, 3, '2014-06-13', 'SSO', 2, 'SSO', 3, 'agitée', 'SSO', 20),
	(17, 2, 3, '2014-06-27', 'ENE', 3, 'EEN', 2, 'agitée', 'EEN', 20),
	(18, 2, 2, '2015-07-11', 'SSO', 3, 'SSO', 2, 'temp?te', 'SSO', 12),
	(19, 2, 1, '2015-07-25', 'NNE', 2, 'NNE', 2, 'calme', 'NNE', 25),
	(20, 2, 3, '2015-08-08', 'SSO', 2, 'SSO', 3, 'agitée', 'SSO', 20),
	(21, 2, 3, '2015-08-22', 'ENE', 3, 'EEN', 2, 'agitée', 'EEN', 20),
	(22, 2, 2, '2015-09-05', 'SSO', 3, 'SSO', 2, 'temp?te', 'SSO', 12),
	(23, 2, 1, '2015-09-19', 'NNE', 2, 'NNE', 2, 'calme', 'NNE', 25),
	(24, 2, 3, '2015-10-03', 'SSO', 2, 'SSO', 3, 'agitée', 'SSO', 20);
/*!40000 ALTER TABLE `regate` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. serie
CREATE TABLE IF NOT EXISTS `serie` (
  `Num_serie` int(11) NOT NULL,
  `Nom_serie` varchar(25) NOT NULL,
  PRIMARY KEY (`Num_serie`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.serie: ~2 rows (environ)
/*!40000 ALTER TABLE `serie` DISABLE KEYS */;
INSERT INTO `serie` (`Num_serie`, `Nom_serie`) VALUES
	(1, 'Habitables'),
	(2, 'Quillards de sport');
/*!40000 ALTER TABLE `serie` ENABLE KEYS */;


-- Export de la structure de table dahouëtfinal2. voilier
CREATE TABLE IF NOT EXISTS `voilier` (
  `Num_voile` int(11) NOT NULL,
  `Num_proprietaire` int(11) NOT NULL,
  `Nom_classe` varchar(25) NOT NULL,
  `Nom_voilier` varchar(30) NOT NULL,
  PRIMARY KEY (`Num_voile`),
  KEY `FK_voilier_proprietaire` (`Num_proprietaire`),
  KEY `FK_voilier_classe` (`Nom_classe`),
  CONSTRAINT `FK_voilier_classe` FOREIGN KEY (`Nom_classe`) REFERENCES `classe` (`Nom_classe`),
  CONSTRAINT `FK_voilier_proprietaire` FOREIGN KEY (`Num_proprietaire`) REFERENCES `proprietaire` (`Num_proprietaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table dahouëtfinal2.voilier: ~12 rows (environ)
/*!40000 ALTER TABLE `voilier` DISABLE KEYS */;
INSERT INTO `voilier` (`Num_voile`, `Num_proprietaire`, `Nom_classe`, `Nom_voilier`) VALUES
	(1, 2, 'Corsaire', 'Vogue la Gal?re'),
	(2, 1, 'Dragon', 'Moby Dick'),
	(3, 3, 'Open 5,70', 'Les 40?mes rugissants'),
	(4, 5, 'LongTZE', 'Captain Igloo world cup'),
	(5, 4, 'Soling', 'Un fameux trois m?ts'),
	(6, 5, 'Star', 'La briochine monster cup'),
	(7, 6, 'Vent d\'\'ouest', 'Hermnium'),
	(8, 8, 'LongTZE', 'Le Hollandais Volant'),
	(9, 7, 'J80', 'Le Black pearl'),
	(10, 6, 'Soling', 'Le Minouche'),
	(11, 9, 'J80', 'Le Tatinic'),
	(12, 11, 'Star', 'La Barque ? trous');
/*!40000 ALTER TABLE `voilier` ENABLE KEYS */;


-- Export de la structure de déclancheur dahouëtfinal2. participation_before_update
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `participation_before_update` BEFORE UPDATE ON `participation` FOR EACH ROW BEGIN
declare nb_participant int; 
declare error condition for sqlstate '45001';

select count(old.Num_regate) from participation where new.Num_regate = Num_regate group by Num_regate into nb_participant;


if (new.Place_regate>nb_participant) then
SIGNAL error
 set message_text ='Pas Glop', mysql_errno=9002;
 
end if; 


END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;


-- Export de la structure de déclancheur dahouëtfinal2. regate_before_delete
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `regate_before_delete` BEFORE DELETE ON `regate` FOR EACH ROW BEGIN
declare over date;
declare error condition for sqlstate '45001';
select challenge.Fin_Chall from challenge where old.Num_challenge=challenge.Num_challenge into over;
if (curdate()<=over) then 
signal error
set message_text='Le challenge est pas terminé Ducon!',mysql_errno=9002;
end if;

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;


-- Export de la structure de déclancheur dahouëtfinal2. testDateBeforeUp
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `testDateBeforeUp` BEFORE UPDATE ON `regate` FOR EACH ROW BEGIN
declare datedeb date;
declare datefin date;
declare error condition for sqlstate '45001';

select challenge.Date_debut into datedeb from challenge where new.Num_challenge=challenge.Num_challenge ;
select challenge.Date_fin into datefin from challenge where new.Num_challenge=challenge.Num_challenge;

if (new.Date_regate not between datedeb and datefin) 
then SIGNAL error
 set message_text =' Error Loose !!! ', mysql_errno=9002;
end if;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
