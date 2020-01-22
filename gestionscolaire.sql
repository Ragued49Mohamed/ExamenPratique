-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3308
-- Généré le :  mer. 22 jan. 2020 à 15:12
-- Version du serveur :  8.0.18
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestionscolaire`
--

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

DROP TABLE IF EXISTS `cours`;
CREATE TABLE IF NOT EXISTS `cours` (
  `ThemeCou` varchar(15) NOT NULL,
  `NbrhCou` int(10) NOT NULL,
  `IdEtu` varchar(10) NOT NULL,
  PRIMARY KEY (`ThemeCou`),
  KEY `FK_CoursEtudiant` (`IdEtu`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `cours`
--

INSERT INTO `cours` (`ThemeCou`, `NbrhCou`, `IdEtu`) VALUES
('LesEquations', 2, 'M49');

-- --------------------------------------------------------

--
-- Structure de la table `ecoleensup`
--

DROP TABLE IF EXISTS `ecoleensup`;
CREATE TABLE IF NOT EXISTS `ecoleensup` (
  `NomEco` varchar(10) NOT NULL,
  `EmailEco` varchar(10) NOT NULL,
  `AdresseEco` varchar(15) NOT NULL,
  `TelEco` int(10) NOT NULL,
  `DirecteurEco` varchar(10) NOT NULL,
  PRIMARY KEY (`NomEco`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `ecoleensup`
--

INSERT INTO `ecoleensup` (`NomEco`, `EmailEco`, `AdresseEco`, `TelEco`, `DirecteurEco`) VALUES
('Ensup', 'Email@Ensu', '1 b avenue Mont', 698545362, 'BerDirect');

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

DROP TABLE IF EXISTS `enseignant`;
CREATE TABLE IF NOT EXISTS `enseignant` (
  `IdEns` varchar(15) NOT NULL,
  `NomEns` varchar(10) NOT NULL,
  `PrenomEns` varchar(10) NOT NULL,
  `EmailEns` varchar(10) NOT NULL,
  `AdresseEns` varchar(15) NOT NULL,
  `TelEns` int(10) NOT NULL,
  `MatiereEns` varchar(15) NOT NULL,
  PRIMARY KEY (`IdEns`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `enseignant`
--

INSERT INTO `enseignant` (`IdEns`, `NomEns`, `PrenomEns`, `EmailEns`, `AdresseEns`, `TelEns`, `MatiereEns`) VALUES
('E1', 'Kada', 'Bernard', 'Kada@berna', '1b Rue Colombo', 689845236, 'Math');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `IdEtu` varchar(15) NOT NULL,
  `NomEtu` varchar(20) NOT NULL,
  `PrenomEtu` varchar(20) NOT NULL,
  `EmailEtu` varchar(20) NOT NULL,
  `AdresseEtu` varchar(20) NOT NULL,
  `TelEtu` varchar(10) NOT NULL,
  `DateNaissEtu` date NOT NULL,
  PRIMARY KEY (`IdEtu`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`IdEtu`, `NomEtu`, `PrenomEtu`, `EmailEtu`, `AdresseEtu`, `TelEtu`, `DateNaissEtu`) VALUES
('M49', 'Ragued', 'Mohamed', 'RAgued49Mohamed', '1A Rue Danielle Casa', '687984856', '1995-04-06');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
