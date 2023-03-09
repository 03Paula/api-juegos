SET @OLD_TIME_ZONE=@@TIME_ZONE ;
SET TIME_ZONE='+00:00' ;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 ;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 ;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' ;
 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 ;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `equipo`;
CREATE TABLE `equipo` (
  `id` bigint NOT NULL auto_increment,
  `nombre_equipo` varchar(45) character set utf8 collate utf8_unicode_ci NOT NULL default '',
  `puntos` int NOT NULL default '0',
  `logo` varchar(45)  character set utf8 collate utf8_unicode_ci NOT NULL default '',
  `last_mod` datetime NOT NULL default '0000-00-00 00:00:00',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5915 DEFAULT CHARSET=utf8mb4;

-- Datos de prueba.

INSERT INTO `api-juego`.equipo (nombre_equipo, puntos, logo, last_mod)
VALUES ('programadores', 22, DEFAULT, '2023-01-03 21:18:27');

INSERT INTO `api-juego`.equipo (nombre_equipo, puntos, logo, last_mod)
VALUES ('ratones', 12, DEFAULT, '2021-09-13 21:19:36');