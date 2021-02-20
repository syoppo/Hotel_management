-- phpMyAdmin SQL Dump
-- version 3.2.3
-- http://www.phpmyadmin.net
--
-- 호스트: localhost
-- 처리한 시간: 19-12-04 11:59 
-- 서버 버전: 5.1.41
-- PHP 버전: 5.2.12

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 데이터베이스: `hotel`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `administer`
--

CREATE TABLE IF NOT EXISTS `administer` (
  `managerid` varchar(20) NOT NULL,
  `rnum` int(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 테이블의 덤프 데이터 `administer`
--

INSERT INTO `administer` (`managerid`, `rnum`) VALUES
('bocksoon1', 101),
('bocksoon2', 102);

-- --------------------------------------------------------

--
-- 테이블 구조 `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `cnum` int(5) NOT NULL,
  `cname` varchar(10) CHARACTER SET utf8 NOT NULL,
  `ctel` int(11) NOT NULL,
  `cardnum` varchar(20) NOT NULL,
  `cardCo` varchar(6) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`cnum`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 테이블의 덤프 데이터 `customer`
--

INSERT INTO `customer` (`cnum`, `cname`, `ctel`, `cardnum`, `cardCo`) VALUES
(11111, '복순이', 1000000000, '1234567891234567', '복순카드'),
(22222, '고오객', 1011111111, '1478523698521478', '비씨카드'),
(33333, '엘사', 1022222222, '1478523698525464', '겨울카드'),
(44444, '올라프', 1033333333, '0000523698525464', '겨울카드');

-- --------------------------------------------------------

--
-- 테이블 구조 `manager`
--

CREATE TABLE IF NOT EXISTS `manager` (
  `managerid` varchar(20) NOT NULL,
  `managerpwd` varchar(20) NOT NULL,
  PRIMARY KEY (`managerid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 테이블의 덤프 데이터 `manager`
--

INSERT INTO `manager` (`managerid`, `managerpwd`) VALUES
('bocksoon1', 'bocksoon1'),
('bocksoon2', 'bocksoon2');

-- --------------------------------------------------------

--
-- 테이블 구조 `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `renum` int(6) NOT NULL,
  `rnum` int(3) NOT NULL,
  `cname` varchar(5) NOT NULL,
  `indate` date NOT NULL,
  `outdate` date NOT NULL,
  `ap` int(1) NOT NULL COMMENT 'Accommodation personnel',
  PRIMARY KEY (`renum`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `reservation`
--

INSERT INTO `reservation` (`renum`, `rnum`, `cname`, `indate`, `outdate`, `ap`) VALUES
(1, 101, '복순이', '2019-11-19', '2019-11-20', 1),
(2, 102, '고구마', '2019-11-23', '2019-11-24', 1),
(3, 103, '짱구', '2019-11-27', '2019-11-28', 2),
(4, 104, '도라에몽', '2019-11-27', '2019-11-28', 1),
(5, 103, '안나', '2019-12-24', '2019-12-25', 2);

-- --------------------------------------------------------

--
-- 테이블 구조 `room`
--

CREATE TABLE IF NOT EXISTS `room` (
  `rnum` int(3) NOT NULL,
  `room_type` varchar(30) CHARACTER SET utf8 NOT NULL,
  `basic_ap` int(1) NOT NULL COMMENT '기본투숙인원',
  `max_ap` int(1) NOT NULL COMMENT '최대투숙인원',
  `charge` int(6) NOT NULL,
  PRIMARY KEY (`rnum`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 테이블의 덤프 데이터 `room`
--

INSERT INTO `room` (`rnum`, `room_type`, `basic_ap`, `max_ap`, `charge`) VALUES
(101, '스탠다드룸', 1, 4, 120000),
(102, '디럭스룸', 1, 4, 130000),
(103, '테라스룸', 1, 4, 140000);
