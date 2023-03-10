SET @OLD_TIME_ZONE=@@TIME_ZONE ;
SET TIME_ZONE='+00:00' ;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 ;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 ;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' ;
 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 ;

--
-- Table structure for table `partida`
--

DROP TABLE IF EXISTS `partida`;
CREATE TABLE `partida` (
        `id` bigint NOT NULL AUTO_INCREMENT,
        `id_juego` bigint NOT NULL,
        `id_jugador` bigint NOT NULL,
        `intentos` int DEFAULT 0,
        `puntos` int NOT NULL,
        `dificultad` ENUM('facil', 'intermedio', 'dificil') DEFAULT  'facil',
        `palabra` varchar(45) COLLATE utf8mb4_spanish_ci NOT NULL,
        `fecha_hora` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (`id`,`id_juego`,`id_jugador`),
        KEY `fk_juego_jugador` (`id_jugador`),
        KEY `fk_juego_juego` (`id_juego`),
        CONSTRAINT `fk_juego_juego` FOREIGN KEY (`id_juego`) REFERENCES `juego` (`id`) ON DELETE CASCADE,
        CONSTRAINT `fk_juego_jugador` FOREIGN KEY (`id_jugador`) REFERENCES `jugador` (`id`) ON DELETE CASCADE
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- Datos de prueba.

INSERT INTO `api-juego`.partida (id_juego, id_jugador, intentos, puntos, dificultad, palabra, fecha_hora)
VALUES (1, 5919, 10, 2, 'facil', 'arbol', '2021-02-12');

INSERT INTO `api-juego`.partida (id_juego, id_jugador, intentos, puntos, dificultad, palabra, fecha_hora)
VALUES (2, 5916, 2, 10, 'dificil', 'protagonista', '2022-07-31');