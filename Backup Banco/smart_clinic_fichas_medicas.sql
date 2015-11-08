CREATE DATABASE  IF NOT EXISTS `smart_clinic` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `smart_clinic`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: smart_clinic
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fichas_medicas`
--

DROP TABLE IF EXISTS `fichas_medicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fichas_medicas` (
  `FICHA_MEDICA_ID` int(10) NOT NULL AUTO_INCREMENT,
  `PACIENTE_ID` int(10) NOT NULL,
  `QUEIXA_PACIENTE` varchar(400) DEFAULT NULL,
  `ANTECENDENTES_MEDICOS` varchar(400) DEFAULT NULL,
  `DIAGNOSTICO` varchar(400) DEFAULT NULL,
  `MEDICACAO` varchar(400) DEFAULT NULL,
  `EXAMES` varchar(400) DEFAULT NULL,
  `EXAMES_COMPLEMENTARES` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`FICHA_MEDICA_ID`,`PACIENTE_ID`),
  KEY `FK_FICHAS_MED_PAC` (`PACIENTE_ID`),
  CONSTRAINT `FK_FICHAS_MED_PAC` FOREIGN KEY (`PACIENTE_ID`) REFERENCES `pacientes` (`PACIENTE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fichas_medicas`
--

LOCK TABLES `fichas_medicas` WRITE;
/*!40000 ALTER TABLE `fichas_medicas` DISABLE KEYS */;
/*!40000 ALTER TABLE `fichas_medicas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-28 22:13:20
