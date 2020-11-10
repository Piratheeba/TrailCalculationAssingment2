-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 05, 2020 at 02:02 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tcalculation`
--

-- --------------------------------------------------------

--
-- Table structure for table `trialcalculation`
--

CREATE TABLE `trialcalculation` (
  `Loan_id` int(5) NOT NULL,
  `NICNO` varchar(12) DEFAULT NULL,
  `Date` date NOT NULL,
  `Loan_amount` double DEFAULT NULL,
  `Interest_rate` double DEFAULT NULL,
  `Repayment_period` double DEFAULT NULL,
  `Rental_value` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trialcalculation`
--

INSERT INTO `trialcalculation` (`Loan_id`, `NICNO`, `Date`, `Loan_amount`, `Interest_rate`, `Repayment_period`, `Rental_value`) VALUES
(1, '547894155v', '2020-11-05', 100000, 12, 12, 8884.88),
(2, '54789123v', '2020-11-05', 200000, 15, 12, 18051.66);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `NICNO` varchar(12) NOT NULL,
  `Full_Name` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`NICNO`, `Full_Name`) VALUES
('54789123v', 'William'),
('547894155v', 'Harry');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `trialcalculation`
--
ALTER TABLE `trialcalculation`
  ADD PRIMARY KEY (`Loan_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`NICNO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `trialcalculation`
--
ALTER TABLE `trialcalculation`
  MODIFY `Loan_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `trialcalculation`
--
ALTER TABLE `trialcalculation`
  ADD CONSTRAINT `trialcalculation_ibfk_1` FOREIGN KEY (`NICNO`) REFERENCES `user` (`NICNO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
