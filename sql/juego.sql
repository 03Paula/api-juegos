SET @OLD_TIME_ZONE=@@TIME_ZONE ;
SET TIME_ZONE='+00:00' ;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 ;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 ;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' ;
 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 ;

--
-- Table structure for table `juego`
--

DROP TABLE IF EXISTS `juego`;
CREATE TABLE `juego` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `dificultad` ENUM('facil', 'intermedio', 'dificil') DEFAULT 'facil',
    `instrucciones` varchar(255) COLLATE utf8mb4_spanish_ci NOT NULL,
    `nombre` varchar(45) COLLATE utf8mb4_spanish_ci DEFAULT '',
    `intentos_max` int NOT NULL DEFAULT 10,
    PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 ;


-- Datos de prueba.

INSERT INTO `api-juego`.juego (dificultad, instrucciones, nombre, intentos_max)
VALUES ('facil', 'Adivina la palabra', 'wordle', 10);