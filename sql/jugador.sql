SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT ;
SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS ;
SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION ;
 SET NAMES utf8 ;
SET @OLD_TIME_ZONE=@@TIME_ZONE ;
SET TIME_ZONE='+00:00' ;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 ;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 ;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' ;
 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 ;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
CREATE TABLE `jugador` (
  `id` bigint NOT NULL auto_increment,
  `nombre` varchar(45) character set utf8 collate utf8_unicode_ci NOT NULL default '',
  `avatar` varchar(45) character set utf8 collate utf8_unicode_ci NOT NULL default '',
  `id_equipo` bigint NOT NULL,
  `puntos` int(40) NOT NULL default '0',
  `last_mod` datetime NOT NULL default '0000-00-00 00:00:00',
  PRIMARY KEY  (`id`),
  CONSTRAINT fk_equipo
    FOREIGN KEY (id_equipo)
    REFERENCES equipo(id)
    ON DELETE CASCADE
) ENGINE=MyISAM AUTO_INCREMENT=5915 DEFAULT CHARSET=utf8mb4;

-- Datos de prueba.

INSERT INTO `api-juego`.jugador (nombre, avatar, id_equipo, puntos, last_mod)
VALUES ('Paco', DEFAULT, 5915, 11, '2023-03-09 18:26:39');


INSERT INTO `api-juego`.jugador (nombre, avatar, id_equipo, puntos, last_mod)
VALUES ('Paca', DEFAULT, 5915, 1, '2023-03-03 18:27:31');


INSERT INTO `api-juego`.jugador (nombre, avatar, id_equipo, puntos, last_mod)
VALUES ('Paula', DEFAULT, 5916, 3, '2023-03-04 23:28:15');


INSERT INTO `api-juego`.jugador (nombre, avatar, id_equipo, puntos, last_mod)
VALUES ('Javier', DEFAULT, 5916, 20, '2023-01-25 18:29:21');


INSERT INTO `api-juego`.jugador (nombre, avatar, id_equipo, puntos, last_mod)
VALUES ('Adrian', DEFAULT, 5917, 3, '2022-06-07 06:30:19');