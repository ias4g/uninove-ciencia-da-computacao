/*
* CRIANDO A BASE DE DADOS
*/
CREATE DATABASE db_ecoleta
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
/****************************************************************************************************************************************************/


/**
*	CRIANDO A TABELA tb_points
*	Obs: campo id tem que ser uuid()
*/
CREATE TABLE `tb_points` (
  `id` varchar(40) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `image` longblob,
  `whatsapp` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/****************************************************************************************************************************************************/


/*
*	CRIANDO A TABELA tb_address
*/
CREATE TABLE `tb_address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `zipcode` varchar(10) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `number` int DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `point_id` varchar(40) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_from_points_to_address_idx` (`point_id`),
  CONSTRAINT `fk_from_points_to_address` FOREIGN KEY (`point_id`) REFERENCES `tb_points` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/****************************************************************************************************************************************************/


/*
*	CRIANDO A TABELA tb_items
*/
CREATE TABLE `tb_items` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `slug` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/****************************************************************************************************************************************************/


/*
*	CRIANDO TABELA tb_point_items
*/
CREATE TABLE `tb_point_items` (
  `id` int NOT NULL AUTO_INCREMENT,
  `point_id` varchar(40) DEFAULT NULL,
  `item_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_from_points_to_pointitems_idx` (`point_id`),
  KEY `fk_from_items_to_pointitems_idx` (`item_id`),
  CONSTRAINT `fk_from_items_to_pointitems` FOREIGN KEY (`item_id`) REFERENCES `tb_items` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_from_points_to_pointitems` FOREIGN KEY (`point_id`) REFERENCES `tb_points` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


insert into tb_items(title, slug) values("Pilhas e Baterias", "pilhas-e-baterias");
insert into tb_items(title, slug) values("Resíduos Eletrônicos", "residuos-eletronicos");
insert into tb_items(title, slug) values("Lâmpadas", "lampadas");
insert into tb_items(title, slug) values("Resíduos Orgânicos", "residuos-organicos");
insert into tb_items(title, slug) values("Óleo de Cozinha", "oleo-de-cozinha");
insert into tb_items(title, slug) values("Papéis e Papelão", "papeis-e-papelao");




