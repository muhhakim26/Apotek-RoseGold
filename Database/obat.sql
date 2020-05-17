-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2020 at 10:58 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotek_rosegold`
--

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kode_obat` varchar(30) NOT NULL,
  `supplier_id` varchar(15) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `produsen` varchar(30) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kode_obat`, `supplier_id`, `nama_obat`, `produsen`, `stok`, `harga`) VALUES
('D0001', 'SP03', 'ALBI GURAH', 'LALframa', 10, 26450),
('D0002', 'SP01', 'ALBOTHYL 5ML', 'INAframa', 23, 19888),
('D0002', 'SP03', 'ALBI GURAH', 'LALframa', 11, 26450),
('OA004', 'SP01', 'AMURATEN', 'INAframa', 20, 2990),
('D0001', 'SP03', 'ALBI GURAH', 'LALframa', 10, 26450),
('D0002', 'SP01', 'ALBOTHYL 5ML', 'INAframa', 23, 19888),
('C0002', 'SP02', 'ANATON 60 ML', 'RMRframa', 11, 4950),
('C0002', 'SP04', 'ALPHARA 60ML', 'ALArama', 12, 11963),
('C0002', 'SP04', 'Cefadroxil 500mg', 'ALArama', 14, 15000),
('C0002', 'SP05', 'AFITRACIN 10 ML', 'UWUframa', 15, 1560),
('C0002', 'SP03', 'ACTIFED H 60ML', 'LALframa', 15, 29040),
('C0002', 'SP03', 'ACNOL 10ML', 'LALframa', 21, 9517),
('C0002', 'SP02', 'ABSOLUTE', 'RMRframa', 14, 14400);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
