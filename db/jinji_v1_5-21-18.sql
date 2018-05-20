-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2018 at 07:29 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jinji`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_hr_account`
--

CREATE TABLE `user_hr_account` (
  `hr_id` varchar(15) NOT NULL,
  `hr_username` varchar(20) NOT NULL,
  `hr_password` varchar(20) NOT NULL,
  `hr_fname` varchar(30) NOT NULL,
  `hr_mname` varchar(30) NOT NULL,
  `hr_lname` varchar(30) NOT NULL,
  `hr_mobile_number_primary` varchar(11) NOT NULL,
  `hr_mobile_number_secondary` varchar(11) DEFAULT NULL,
  `hr_email_primary` varchar(30) NOT NULL,
  `hr_email_secondary` varchar(30) DEFAULT NULL,
  `hr_account_status` enum('PENDING','APPROVED','DEACTIVATED','') NOT NULL DEFAULT 'PENDING',
  `hr_approved_account_date` timestamp NULL DEFAULT NULL,
  `hr_approved_by_id` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_hr_account`
--

INSERT INTO `user_hr_account` (`hr_id`, `hr_username`, `hr_password`, `hr_fname`, `hr_mname`, `hr_lname`, `hr_mobile_number_primary`, `hr_mobile_number_secondary`, `hr_email_primary`, `hr_email_secondary`, `hr_account_status`, `hr_approved_account_date`, `hr_approved_by_id`) VALUES
('000000000', 'admin', 'password', 'root', 'admin', 'admin', '000000', '000000', '000000', '000000', 'APPROVED', '2018-05-18 16:00:00', '000000000'),
('00999090', 'user_1', '987', 'John', 'Lin', 'Do', '897', NULL, 'yy@y.com', NULL, 'PENDING', NULL, NULL),
('8979', 'User2', '78', 'Rob', 'Tubi', 'Tubung', '78', NULL, 'yy@y.com', NULL, 'PENDING', NULL, NULL),
('98098', 'user3', 'sdf', 'Jam', 'Jim', 'Boy', '09098', NULL, 'yy@y.com', NULL, 'PENDING', NULL, NULL),
('98098900000', 'user4', 'dsgdfg', 'Jes', 'se', 'Ramos', '09098', NULL, 'yy@y.com', NULL, 'PENDING', NULL, NULL),
('987', 'user5', '8979', 'Nig', 'ggy', 'Rino', '89', NULL, 'yy@y.com', NULL, 'PENDING', NULL, NULL),
('9878789', 'user7', 'huhu', 'Nelly', 'Neil', 'Fam', '987', NULL, 'yy@y.com', NULL, 'APPROVED', NULL, NULL),
('987897', 'user6', 'sup', 'Kirbz', 'Boy', 'Jeje', '987', NULL, 'yy@y.com', NULL, 'PENDING', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_hr_account`
--
ALTER TABLE `user_hr_account`
  ADD PRIMARY KEY (`hr_id`),
  ADD KEY `hr_approved_by_id` (`hr_approved_by_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user_hr_account`
--
ALTER TABLE `user_hr_account`
  ADD CONSTRAINT `user_hr_account_ibfk_1` FOREIGN KEY (`hr_approved_by_id`) REFERENCES `user_hr_account` (`hr_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
