-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 18 oct. 2021 à 11:46
-- Version du serveur : 10.4.20-MariaDB
-- Version de PHP : 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `odk_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `apprenant`
--

CREATE TABLE `apprenant` (
  `id` bigint(20) NOT NULL,
  `apprenant_status` varchar(255) DEFAULT NULL,
  `age` datetime DEFAULT NULL,
  `date_creation` datetime DEFAULT NULL,
  `date_modification` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `apprenant`
--

INSERT INTO `apprenant` (`id`, `apprenant_status`, `age`, `date_creation`, `date_modification`, `email`, `genre`, `login`, `nom`, `password`, `prenom`, `telephone`) VALUES
(2, NULL, '2000-06-06 00:00:00', '2021-10-06 00:00:00', '2021-10-06 00:00:00', 'helloword99@gmail.com', 'homme', 'kelly.ibrahim', 'Kelly', 'motpass', 'Ibrahim', 77677787),
(5, NULL, '2000-06-06 00:00:00', '2021-10-06 00:00:00', '2021-10-06 00:00:00', 'diab@gmail.com', 'homme', 'dia.dia', 'Diabate', 'motpass', 'Bool', 78997787),
(4, NULL, '2001-12-12 00:00:00', NULL, NULL, 'sambadaou61@gmail.com', 'homme', 'daou.sam', 'Sada', 'motpasse', 'Sada', 74626291);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `apprenant`
--
ALTER TABLE `apprenant`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `apprenant`
--
ALTER TABLE `apprenant`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
