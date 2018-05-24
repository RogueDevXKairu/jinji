-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2018 at 07:11 PM
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
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employee_id` bigint(20) NOT NULL,
  `employee_address_city` varchar(255) NOT NULL,
  `employee_address_country` varchar(255) NOT NULL,
  `employee_address_house` varchar(255) DEFAULT NULL,
  `employee_address_province` varchar(255) NOT NULL,
  `employee_address_zip_code` varchar(255) NOT NULL,
  `employee_civil_status` varchar(255) NOT NULL,
  `employee_email_primary` varchar(255) NOT NULL,
  `employee_email_work` varchar(255) DEFAULT NULL,
  `employee_fname` varchar(255) NOT NULL,
  `employee_hire_date` date DEFAULT NULL,
  `employee_landline_number` varchar(255) DEFAULT NULL,
  `employee_lname` varchar(255) NOT NULL,
  `employee_mname` varchar(255) DEFAULT NULL,
  `employee_mobile_number_primary` varchar(255) NOT NULL,
  `employee_mobile_number_secondary` varchar(255) DEFAULT NULL,
  `employee_position` varchar(255) NOT NULL,
  `employee_register_date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `hr`
--

CREATE TABLE `hr` (
  `hr_employee_id` varchar(255) NOT NULL,
  `hr_account_status` varchar(32) NOT NULL DEFAULT 'PENDING',
  `hr_account_type` varchar(32) NOT NULL DEFAULT 'USER',
  `hr_approved_account_date` datetime DEFAULT NULL,
  `hr_created_account_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `hr_email_primary` varchar(255) NOT NULL,
  `hr_email_secondary` varchar(255) DEFAULT NULL,
  `hr_fname` varchar(255) NOT NULL,
  `hr_lname` varchar(255) NOT NULL,
  `hr_mname` varchar(255) DEFAULT NULL,
  `hr_mobile_number_primary` varchar(255) NOT NULL,
  `hr_mobile_number_secondary` varchar(255) DEFAULT NULL,
  `hr_password` varchar(255) NOT NULL,
  `hr_approved_by_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hr_employee_assoc`
--

CREATE TABLE `hr_employee_assoc` (
  `detail_updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `employee_id` bigint(20) DEFAULT NULL,
  `hr_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hr_employee_requirement_assoc`
--

CREATE TABLE `hr_employee_requirement_assoc` (
  `hr_employee_requirement_assoc_id` bigint(20) NOT NULL,
  `requirement_date_updated` datetime NOT NULL,
  `requirement_detail` varchar(255) DEFAULT NULL,
  `requirement_status` bit(1) NOT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `hr_id` varchar(255) DEFAULT NULL,
  `requirement_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `requirement`
--

CREATE TABLE `requirement` (
  `requirement_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `hr`
--
ALTER TABLE `hr`
  ADD PRIMARY KEY (`hr_employee_id`),
  ADD KEY `FK1xfxm3fvvasdli8oyigfl2o4v` (`hr_approved_by_id`);

--
-- Indexes for table `hr_employee_assoc`
--
ALTER TABLE `hr_employee_assoc`
  ADD PRIMARY KEY (`detail_updated_date`),
  ADD KEY `FKgsawm4by11f6go65sd9dg4qrv` (`employee_id`),
  ADD KEY `FKkv96gya7jnoll5o9k6lh7xys9` (`hr_id`);

--
-- Indexes for table `hr_employee_requirement_assoc`
--
ALTER TABLE `hr_employee_requirement_assoc`
  ADD PRIMARY KEY (`hr_employee_requirement_assoc_id`),
  ADD KEY `FKqcq2p745rooxt01frx1q4jbj8` (`employee_id`),
  ADD KEY `FKh3xak9ssm91jw6sxor5tyy47q` (`hr_id`),
  ADD KEY `FKb99ro07vplu6wctxvgiuvtb6j` (`requirement_id`);

--
-- Indexes for table `requirement`
--
ALTER TABLE `requirement`
  ADD PRIMARY KEY (`requirement_name`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hr`
--
ALTER TABLE `hr`
  ADD CONSTRAINT `FK1xfxm3fvvasdli8oyigfl2o4v` FOREIGN KEY (`hr_approved_by_id`) REFERENCES `hr` (`hr_employee_id`);

--
-- Constraints for table `hr_employee_assoc`
--
ALTER TABLE `hr_employee_assoc`
  ADD CONSTRAINT `FKgsawm4by11f6go65sd9dg4qrv` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`),
  ADD CONSTRAINT `FKkv96gya7jnoll5o9k6lh7xys9` FOREIGN KEY (`hr_id`) REFERENCES `hr` (`hr_employee_id`);

--
-- Constraints for table `hr_employee_requirement_assoc`
--
ALTER TABLE `hr_employee_requirement_assoc`
  ADD CONSTRAINT `FKb99ro07vplu6wctxvgiuvtb6j` FOREIGN KEY (`requirement_id`) REFERENCES `requirement` (`requirement_name`),
  ADD CONSTRAINT `FKh3xak9ssm91jw6sxor5tyy47q` FOREIGN KEY (`hr_id`) REFERENCES `hr` (`hr_employee_id`),
  ADD CONSTRAINT `FKqcq2p745rooxt01frx1q4jbj8` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
