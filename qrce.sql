-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 29, 2018 at 06:04 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `qrce`
--

-- --------------------------------------------------------

--
-- Table structure for table `artificial intelligence`
--

CREATE TABLE IF NOT EXISTS `artificial intelligence` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `artificial intelligence`
--

INSERT INTO `artificial intelligence` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.The performance of an agent can be improved by\r\n', 'A. Learning\r\n', 'B. Observing\r\n', 'C. Perceiving\r\n', 'D. None of the mentioned\r\n', 'Answer:A\r\nExplanation: An agent can improve by saving the previous states on which it was earlier, hence in future it can learn to respond in the same situation better.'),
(2, 'Q.External actions of the agent is selected by\r\n', 'A. Perceive\r\n\r\n', 'B. Performance\r\n', 'C. Learning\r\n', 'D. Actuator\r\n', 'Answer: B\r\nExplanation: Depends on how you want to improve and what the performance measures are.'),
(3, 'Q.The action of the Simple reflex agent completely depends upon\r\n', 'A. Perception history\r\n', 'B. Current perception\r\n', 'C. Learning theory\r\n', 'D. Utility functions\r\n', 'Answer: B\r\nExplanation: These agents select actions based on the current perception, ignoring the rest of the perception history.\r\n'),
(4, 'Q.Following could be the approaches to Artificial Intelligence\r\n', 'A. Strong Artificial Intelligence\r\n', 'B. Weak Artificial Intelligence\r\n\r\n', 'C. Applied Artificial Intelligence\r\n', 'D. All of the mentioned\r\n', 'Answer: D\r\nExplanation: Strong Artificial Intelligence aims to build machines that can truly reason and solve problems.\r\nWeak Artificial Intelligence deals with the creation of some form of computer-based artificial intelligence that cannot truly reason and solve problems, but can act as if it were intelligent.\r\nApplied Artificial Intelligence aims to produce commercially viable “smart” systems.\r\nIn Cognitive Artificial Intelligence approach, a computer is used to test theories about how the human mind works.'),
(5, 'Q.An Artificial Neural Network Is based on\r\n', 'A. Strong Artificial Intelligence approach\r\n', 'B. Weak Artificial Intelligence approach\r\n', 'C. Cognitive Artificial Intelligence approach\r\n', 'D. Applied Artificial Intelligence approach\r\n', 'Answer: C\r\nExplanation: In Cognitive Artificial Intelligence approach, a computer is used to test theories about how the human mind works–for example, theories about how we recognize faces and other objects, or about how we solve abstract problems.\r\n'),
(6, 'Q.The Face Recognition system is based on\r\n', 'A. Strong Artificial Intelligence approach\r\n', 'B. Weak Artificial Intelligence approach\r\n', 'C. Cognitive Artificial Intelligence approach\r\n', 'D. Applied Artificial Intelligence approach\r\n', 'Answer: D\r\nExplanation: Applied Artificial Intelligence approach aims to produce commercially viable “smart” systems such as, for example, a security system that is able to recognize the faces of people who permitted to enter a particular building. Applied Artificial Intelligence has already enjoyed considerable success.\r\n'),
(7, 'Q.A completely automated chess engine (Learn from previous games) is based on\r\n', 'A. Strong Artificial Intelligence approach\r\n', 'B. Weak Artificial Intelligence approach\r\n', 'C. Cognitive Artificial Intelligence approach\r\n', 'D. Applied Artificial Intelligence approach\r\n', 'Answer: A\r\nExplanation: Strong Artificial Intelligence aims to build machines that can truly reason and solve problems. These machines must be self-aware and their overall intellectual ability needs to be indistinguishable from that of a human being. Strong Artificial Intelligence maintains that suitably programmed machines are capable of cognitive mental states\r\n'),
(8, 'Q.A basic line following robot is based on\r\n', 'A. Strong Artificial Intelligence approach\r\n', 'B. Weak Artificial Intelligence approach\r\n', 'C. Cognitive Artificial Intelligence approach\r\n', 'D. Applied Artificial Intelligence approach\r\n', 'Answer: B\r\nExplanation: Weak Artificial Intelligence deals with the creation of some form of computer-based artificial intelligence that cannot truly reason and solve problems, but can act as if it were intelligent. Weak Artificial Intelligence holds that suitably programmed machines can simulate human cognition.\r\n'),
(9, 'Q.The following task/tasks Artificial Intelligence could not do yet\r\n', 'A. Understand natural language robustly\r\n', 'B. Web mining\r\n', 'C. Construction of plans in real time dynamic systems\r\n', 'D. All of the mentioned\r\n', 'Answer: D\r\nExplanation: These are the areas in which needs more focus for improvements.\r\n'),
(10, 'Q.What among the following is/are the example of the intelligent agent/agents?\r\n', 'A. Human\r\n', 'B. Robot\r\n', 'C. Autonomous Spacecraft\r\n', 'D. All of the mentioned\r\n', 'Answer: D\r\nExplanation: Humans can be looked upon as agents. They have eyes, ears, skin, taste buds, etc. for sensors; and hands, fingers, legs, mouth for effectors. Robots are agents. Robots may have camera, sonar, infrared, bumper, etc. for sensors. They can have grippers, wheels, lights, speakers, etc. for actuators. Autonomous Spacecraft takes decision on its own based on perceptions.\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `basic electrical engineering`
--

CREATE TABLE IF NOT EXISTS `basic electrical engineering` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `basic electrical engineering`
--

INSERT INTO `basic electrical engineering` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.The reverse current in a diode is of the order of\r\n', 'A. kA\r\n', 'B. mA\r\n', 'C. µA\r\n', 'D. A\r\n', 'Ans: C'),
(2, 'Q.The forward voltage drop across a diode is about....\r\n', 'A. 2.5V\r\n', 'B. 3V\r\n', 'C. 10V\r\n', 'D. 0.7V\r\n', 'Ans: D'),
(3, 'Q.A semiconductor diode has ....\r\n', 'A. One PN junction\r\n', 'B. Two PN junction\r\n', 'C. Three PN junction\r\n', 'D. Four PN junction\r\n', 'Ans: A'),
(4, 'Q.A semiconductor diode has ....\r\n', 'A. One PN junction\r\n', 'B. Two PN junction\r\n', 'C. Three PN junction\r\n', 'D. Four PN junction\r\n', 'Ans: A'),
(5, 'Q.If the arrow of diode symbol is positive with respect to bar, then the diode is .... biased\r\n', 'A. Forward\r\n', 'B. Reverse\r\n', 'C. Either forward or reverse\r\n', 'D. None of the above\r\n', 'Ans: A'),
(6, 'Q.The leakage current in a diode is due to\r\n', 'A. Minority Carriers\r\n', 'B. Majority Carriers\r\n', 'C. Junction Capacitance\r\n', 'D. None of the above\r\n', 'Answer: A'),
(7, 'Q.The DC resistance of a diode is ..... its AC resistance\r\n', 'A. Same as\r\n', 'B. More than\r\n', 'C. Less than\r\n', 'D. None of the above\r\n', 'Ans: C'),
(8, 'Q.An ideal diode is one which behaves as a perfect .... when forward biased\r\n', 'A. Conductor\r\n', 'B. Insulator\r\n', 'C. Resistance material\r\n', 'D. None of the above\r\n', 'Ans: A'),
(9, 'Q.If the temperature of the diode increases,then leakage current....\r\n\r\n', 'A. Remains same\r\n', 'B. Decreases\r\n', 'C. Increases\r\n', 'D. Becomes zero\r\n', 'Ans: C\r\n'),
(10, 'Q.In nodal analysis how many nodes are taken as reference nodes?\r\n', 'A. 1\r\n', 'B. 2\r\n', 'C. 3\r\n', 'D. 4\r\n', 'Answer: A\r\nExplanation: In nodal analysis only one node is taken as reference node. And the node voltage is the voltage of a given node with respect to one particular node called the reference node.');

-- --------------------------------------------------------

--
-- Table structure for table `computer graphic`
--

CREATE TABLE IF NOT EXISTS `computer graphic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16 NOT NULL,
  `OptionA` longtext CHARACTER SET utf16 NOT NULL,
  `OptionB` longtext CHARACTER SET utf16 NOT NULL,
  `OptionC` longtext CHARACTER SET utf16 NOT NULL,
  `OptionD` longtext CHARACTER SET utf16 NOT NULL,
  `Answer` longtext CHARACTER SET utf16 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `computer graphic`
--

INSERT INTO `computer graphic` (`id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Which devices provides positional information to the graphics system ?\r\n', 'A. Input devices\r\n', 'B. Output devices\r\n', 'C. Pointing devices\r\n', 'D. Both a and c\r\n', 'Answer: D\r\nExplanation: Input devices positional information to the system they often called pointing devices.'),
(2, 'Q.The number of pixels stored in the frame buffer of a graphics system is known as\r\n', 'A. Resolution\r\n', 'B. Depth\r\n', 'C. Resalution\r\n', 'D. Only A\r\n', 'Answer: D\r\nExplanation: Number of pixels determines the resolution .'),
(3, 'Q.The number of pixels stored in the frame buffer of a graphics system is known as\r\n', 'A. Resolution\r\n', 'B. Depth\r\n', 'C. Resalution\r\n', 'D. Only A\r\n', 'Answer: D\r\nExplanation: Number of pixels determines the resolution .'),
(4, 'Q.In graphical system, the array of pixels in the picture are stored in\r\n', 'A. Memory\r\n', 'B. Frame buffer\r\n', 'C. Processor\r\n', 'D. All of the mentioned\r\n', 'Answer: A\r\nExplanation: Frame buffer is mainly used to store pixels.'),
(5, 'Q.Heat supplied to the cathode by directing a current through a coil of wire is called\r\n', 'A. Electron gun\r\n', 'B. Electron beam\r\n', 'C. Filament\r\n', 'D. Anode and cathode\r\n', 'Answer: C\r\nExplanation: In CRT the filament is responsible for supply of power.'),
(6, 'Q.The maximum number of points that can be displayed without overlap on a CRT is referred as\r\n', 'A. Picture\r\n', 'B. Resolution\r\n', 'C. Persistence\r\n', 'D. Neither b nor c\r\n', 'Answer: B\r\nExplanation: none.'),
(7, 'Q.________ stores the picture information as a charge distribution behind the phosphor-coated screen.\r\n', 'A. Cathode ray tube\r\n', 'B. Direct-view storage tube\r\n', 'C. Flat panel displays\r\n', 'D. 3D viewing device\r\n', 'Answer: B\r\nExplanation: Instead of refreshing, DVST stores the picture information behind the screen.'),
(8, 'Q.The devices which converts the electrical energy into light is called\r\n', 'A. Liquid-crystal displays\r\n', 'B. Non-emitters\r\n', 'C. Plasma panels\r\n', 'D. Emitters\r\n', 'Answer: D\r\nExplanation: Emissive displays are devices that convert electrical energy into light.'),
(9, 'Q.Which display devices allows us to walk around an object and view it from different sides.\r\n', 'A. Direct view storage tubes\r\n', 'B. Three-dimensional devices\r\n', 'C. Flat panel display devices\r\n', 'D. Plasma panel display devices\r\n', 'Answer: B\r\nExplanation: 3D display devices allows user to view the object from different sides.'),
(10, 'Q.In LCD, the refresh rate of the screen is\r\n', 'A. 60 frames/sec\r\n', 'B. 80 frames/sec\r\n', 'C. 30 frames/sec\r\n', 'D. 100 frames/sec\r\n', 'Answer: A\r\nExplanation: LCD screen is refreshed at 60 frames per second.');

-- --------------------------------------------------------

--
-- Table structure for table `computer network`
--

CREATE TABLE IF NOT EXISTS `computer network` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `computer network`
--

INSERT INTO `computer network` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Which of this is not a constituent of residential telephone line?\r\n', 'A. A high-speed downstream channel\r\n', 'B. A medium-speed downstream channel\r\n', 'C. A low-speed downstream channel\r\n', 'D. None of the mentioned\r\n', 'Answer: C\r\nExplanation: The third part is ordinary two way telephone channel.'),
(2, 'Q.Which of this is not a constituent of residential telephone line?\r\n', 'A. A high-speed downstream channel\r\n', 'B. A medium-speed downstream channel\r\n', 'C. A low-speed downstream channel\r\n', 'D. None of the mentioned\r\n', 'Answer: C\r\nExplanation: The third part is ordinary two way telephone channel.'),
(3, 'Q.In DSL telco provides these services\r\n', 'A. Wired phone access\r\n', 'B. ISP\r\n', 'C. All of the mentioned\r\n', 'D. None of the mentioned\r\n', 'Answer: C\r\nExplanation: The same company which provides phone connection is also its ISP in DSL.\r\n'),
(4, 'Q.The function of DSLAM is\r\n', 'A. Convert analog signals into digital signals\r\n', 'B. Convert digital signals into analog signals\r\n', 'C. Amplify digital signals\r\n', 'D. None of the mentioned\r\n', 'Answer: A\r\nExplanation: The DSLAM located in telco’s Central Office does this function.'),
(5, 'Q.The following term is not associted with DSL\r\n', 'A. DSLAM\r\n', 'B. CO\r\n', 'C. Splitter\r\n', 'D. CMTS\r\n', 'Answer: D\r\nExplanation: Cable modem termination system is used in cable internet access.'),
(6, 'Q.HFC contains\r\n', 'A. Fibre cable\r\n', 'B. Coaxial cable\r\n', 'C. Both Fibre cable and Coaxial cable\r\n', 'D. None of the mentioned\r\n', 'Answer: C\r\nExplanation: None.'),
(7, 'Q.The physical layer concerns with\r\n', 'A. bit-by-bit delivery\r\n', 'B. process to process delivery\r\n', 'C. application to application delivery\r\n', 'D. none of the mentioned\r\n', 'Answer: A\r\nExplanation: None.'),
(8, 'Q.Which transmission media has the highest transmission speed in a network?\r\n', 'A. coaxial cable\r\n', 'B. twisted pair cable\r\n', 'C. optical fiber\r\n', 'D. electrical cable\r\n', 'Answer: C\r\nExplanation: None.'),
(9, 'Q.Bits can be send over guided and unguided media as analog signal by\r\n', 'A. digital modulation\r\n', 'B. amplitude modulation\r\n', 'C. frequency modulation\r\n', 'D. phase modulation\r\n', 'Answer: A\r\nExplanation: None.'),
(10, 'Q.The portion of physical layer that interfaces with the media access control sublayer is called\r\n', 'A. physical signalling sublayer\r\n', 'B. physical data sublayer\r\n', 'C. physical address sublayer\r\n', 'D. none of the mentioned\r\n', 'Answer: A\r\nExplanation: None.');

-- --------------------------------------------------------

--
-- Table structure for table `database management system`
--

CREATE TABLE IF NOT EXISTS `database management system` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `database management system`
--

INSERT INTO `database management system` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Which of the following is a fundamental operation in relational algebra ?\r\n', 'A. Set intersection\r\n', 'B. Natural join\r\n', 'C. Assignment\r\n', 'D. None of the mentioned\r\n', 'Answer: D\r\nExplanation: The fundamental operations are select, project, union, set difference, Cartesian product, and rename.'),
(2, 'Q.Which of the following is used to denote the selection operation in relational algebra ?\r\n', 'A. Pi (Greek)\r\n', 'B. Sigma (Greek)\r\n', 'C. Lambda (Greek)\r\n', 'D. Omega (Greek)\r\n', 'Answer: B\r\nExplanation: The select operation selects tuples that satisfy a given predicate.'),
(3, 'Q.For select operation the ________ appear in the subscript and the ___________ argument appears in the paranthesis after the sigma.\r\n', 'A. Predicates, relation\r\n', 'B. Relation, Predicates\r\n', 'C. Operation, Predicates\r\n', 'D. Relation, Operation\r\n', 'Answer: A\r\nExplanation: None.'),
(4, 'Q.Which is a unary operation:\r\n', 'A. Selection operation\r\n', 'B. Primitive operation\r\n', 'C. Projection operation\r\n', 'D. Generalized selection\r\n', 'Answer: D\r\nExplanation: Generalization Selection takes only one argument for operation.'),
(5, 'Q.Which is a join condition contains an equality operator:\r\n', 'A. Equijoins', 'B. Cartesian', 'C. Natural\r\n', 'D. Left\r\n', 'Answer: A\r\nExplanation: None.'),
(6, 'Q.In precedence of set operators the expression is evaluated from\r\n', 'A. Left to left\r\n', 'B. Left to right\r\n', 'C. Right to left\r\n', 'D. From user specification\r\n', 'Answer: B\r\nExplanation: The expression is evaluated from left to right according to the precedence.'),
(7, 'Q.Which of the following is not outer join ?\r\n', 'A. Left outer join\r\n', 'B. Right outer join\r\n', 'C. Full outer join\r\n', 'D. All of the mentioned\r\n', 'Answer: D\r\nExplanation: The FULL OUTER JOIN keyword combines the result of both LEFT and RIGHT joins.'),
(8, 'Q.The assignment operator is denoted by\r\n', 'A. ->\r\n', 'B. <-\r\n', 'C. =\r\n', 'D. ==\r\n', 'Answer: B\r\nExplanation: The result of the expression to the right of the ? is assigned to the relation variable on the left of the ?.'),
(9, 'Q.An ________ is a set of entities of the same type that share the same properties, or attributes.\r\n', 'A. Entity set\r\n', 'B. Attribute set\r\n', 'C. Relation set\r\n', 'D. Entity model\r\n', 'Answer: A\r\nExplanation: An entity is a “thing” or “object” in the real world that is distinguishable from all other objects.'),
(10, 'Q.The attribute name could be structured as a attribute consisting of first name, middle initial, and last name. This type of attribute is called\r\n', 'A. Simple attribute\r\n', 'B. Composite attribute\r\n', 'C. Multivalued attribute\r\n', 'D. Derived attribute\r\n', 'Answer: B\r\nExplanation: Composite attributes can be divided into subparts (that is, other attributes).');

-- --------------------------------------------------------

--
-- Table structure for table `data communication`
--

CREATE TABLE IF NOT EXISTS `data communication` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `data communication`
--

INSERT INTO `data communication` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Modulation is used for __________________\r\n', 'a) Reducing loss in transmission\r\n', 'b) Amplification of signal\r\n', 'c) Conversion of signal\r\n', 'd) None of the mentioned\r\n', 'Answer: a\r\nExplanation: For transmission over long range message signal is mixed with a carrier signal for reducing loss during transmission.'),
(2, 'Q.In line code transmission, signal is represented by ______________\r\n', 'a) Impulses\r\n', 'b) Train of pulses\r\n', 'c) DC signal\r\n', 'd) Continuously varying signal\r\n', 'Answer: b\r\nExplanation: In Line code transmission, signal is represented by a train of pulses known as baseband transmission.'),
(3, 'Q.Which of the following process is explained as detection?\r\n', 'a) Modulation\r\n', 'b) Demodulation\r\n', 'c) Amplification\r\n', 'd) None of the mentioned\r\n', 'Answer: b\r\nExplanation: Demodulation or retrieving data from signal is known as demodulation or detection.'),
(4, 'Q.Which of the following is represented as digital transmission?\r\n', 'a) Baseband bit stream transfer\r\n', 'b) Passband bit stream transfer\r\n', 'c) All of the mentioned\r\n', 'd) None of the mentioned\r\n', 'Answer: c\r\nExplanation: Both baseband and passband signals representing bit streams are considered to be digital transmission.'),
(5, 'Q.PCM stands for ________________\r\n', 'a) Pulse create message\r\n', 'b) Pulse carry modulation\r\n', 'c) Pulse code modulation\r\n', 'd) None of the mentioned\r\n', 'Answer: c\r\nExplanation: Pulse code modulation is the process of conversion of analog signals to bit stream.'),
(6, 'Q.Codec equipment is used for ______________\r\n', 'a) Source coding\r\n', 'b) Source decoding\r\n', 'c) All of the mentioned\r\n', 'd) None of the mentioned\r\n', 'Answer: c\r\nExplanation: Codec equipments are used for source coding and decoding processes.'),
(7, 'Q.TCP stands for ___________\r\n', 'a) Tele Call Protocol\r\n', 'b) Transmission Control Protocol\r\n', 'c) Transmission Carry Protocol\r\n', 'd) Transmission Control Parity\r\n', 'Answer: b\r\nExplanation: TCP stands for transmission control protocol.'),
(8, 'Q.Tele-transmission is the process of transfer of ______________\r\n', 'a) Analog signals\r\n', 'b) Digital signals\r\n', 'c) Analog and digital signals\r\n', 'd) None of the mentioned\r\n', 'Answer: c\r\nExplanation: Tele-transmission is the process of both analog and digital transmission.'),
(9, 'Q.Which of the following is not a digital modulation method?\r\n', 'a) FSK\r\n', 'b) PSK\r\n', 'c) ASK\r\n', 'd) None of the mentioned\r\n', 'Answer: d\r\nExplanation: Frequency shift keying, phase shift keying and amplitude shift keying are different methods of digital modulation.'),
(10, 'Q.Transmission data rate is decided by\r\n', 'a) network layer\r\n', 'b) physical layer\r\n', 'c) data link layer\r\n', 'd) transport layer\r\n', 'Answer: b\r\nExplanation: None.');

-- --------------------------------------------------------

--
-- Table structure for table `data structure`
--

CREATE TABLE IF NOT EXISTS `data structure` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `data structure`
--

INSERT INTO `data structure` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Which of these best describes an array?\r\n', 'a) A data structure that shows a hierarchical behavior\r\n', 'b) Container of objects of similar types\r\n', 'c) Container of objects of mixed types\r\n', 'd) All of the mentioned\r\n', 'Answer: b\r\nExplanation: Array contains elements only of the same type.'),
(2, 'Q.How do you initialize an array in C?\r\n', 'a) int arr[3] = (1,2,3);\r\n', 'b) int arr(3) = {1,2,3};\r\n', 'c) int arr[3] = {1,2,3};\r\n', 'd) int arr(3) = (1,2,3);\r\n', 'Answer: c\r\nExplanation: This is the syntax to initialize an array in C.'),
(3, 'Q.How do you instantiate an array in Java?\r\n', 'a) int arr[] = new int(3);\r\n', 'b) int arr[];\r\n', 'c) int arr[] = new int[3];\r\n', 'd) int arr() = new int(3);\r\n', 'Answer: c\r\nExplanation: Note that option b is declaration whereas option c is to instantiate an array.'),
(4, 'Q.Which of the following is a correct way to declare a multidimensional array in Java?\r\n', 'a) int[][] arr;\r\n', 'b) int arr[][];\r\n', 'c) int []arr[];\r\n', 'd) All of the mentioned\r\n', 'Answer: d\r\nExplanation: All the options are syntactically correct.'),
(5, 'Q.When does the ArrayIndexOutOfBoundsException occur?\r\n', 'a) Compile-time\r\n', 'b) Run-time\r\n', 'c) Not an error\r\n', 'd) None of the mentioned\r\n', 'Answer: b\r\nExplanation: ArrayIndexOutOfBoundsException is a run-time exception and the compilation is error-free.'),
(6, 'Q.Which of the following concepts make extensive use of arrays?\r\n', 'a) Binary trees\r\n', 'b) Scheduling of processes\r\n', 'c) Caching\r\n', 'd) Spatial locality\r\n', 'Answer: d\r\nExplanation: Whenever a particular memory location is referred, it is likely that the locations nearby are also referred, arrays are stored as contigous blocks in memory, so if you want to access array elements, spatial locality makes it to access quickly.\r\n'),
(7, 'Q.What are the advantages of arrays?\r\n', 'a) Easier to store elements of same data type\r\n', 'b) Used to implement other data structures like stack and queue\r\n', 'c) Convenient way to represent matrices as a 2D array\r\n', 'd) All of the mentioned\r\n', 'Answer: d\r\nExplanation: Arrays are simple to implement when it comes to matrices of fixed size and type, or to implement other data structures.'),
(8, 'Q.What are the disadvantages of arrays?\r\n', 'a) We must know before hand how many elements will be there in the array\r\n', 'b) There are chances of wastage of memory space if elements inserted in an array are lesser than than the allocated size\r\n', 'c) Insertion and deletion becomes tedious\r\n', 'd) All of the mentioned\r\n', 'Answer: d\r\nExplanation: Arrays are of fixed size, hence during the compile time we should know its size and type, since arrays are stored in contigous locations, insertion and deletion becomes time consuming.\r\n'),
(9, 'Q.Assuming int is of 4bytes, what is the size of int arr[15];?\r\n', 'a) 15\r\n', 'b) 19\r\n', 'c) 11\r\n', 'd) 60\r\n', 'Answer: d\r\nExplanation: Since there are 15 int elements and each int is of 4bytes, we get 15*4 = 60bytes.'),
(10, 'Q.Why we need to a binary tree which is height balanced?\r\n', 'a) to avoid formation of skew trees\r\n', 'b) to save memory\r\n', 'c) to attain faster memory access\r\n', 'd) to simplify storing\r\n', 'Answer: a\r\nExplanation: In real world dealing with random values is often not possible, the probability that u are dealing with non random values(like sequential) leads to mostly skew trees, which leads to worst case. hence we make height balance by rotations.\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `digital signal analysis and processing`
--

CREATE TABLE IF NOT EXISTS `digital signal analysis and processing` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `digital signal analysis and processing`
--

INSERT INTO `digital signal analysis and processing` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.To reduce side lobes, in which region of the filter the frequency specifications has to be optimized?\r\n', 'A. Stop band\r\n', 'B. Pass band\r\n', 'C. Transition band\r\n', 'D. None of the mentioned\r\n', 'Answer: C\r\nExplanation: To reduce the side lobes, it is desirable to optimize the frequency specification in the transition band of the filter. This optimization can be accomplished numerically on a digital computer by means of linear programming techniques.\r\n'),
(2, 'Q.Which of the following is equal to the value of H(k+a)?\r\n', 'A. H*(M-k+a)\r\n', 'B. H*(M+k+a)\r\n', 'C. H*(M+k-a)\r\n', 'D. H*(M-k-a)\r\n', 'Answer: D\r\nExplanation: Since {h(n)} is real, we can easily show that the frequency samples {H(k+a)} satisfy the symmetry condition\r\nH(k+a)= H*(M-k-a).'),
(3, 'Q.Which of the following is introduced in the frequency sampling realization of the FIR filter?\r\n', 'A. Poles are more in number on unit circle\r\n\r\n', 'B. Zeros are more in number on the unit circle\r\n', 'C. Poles and zeros at equally spaced points on the unit circle\r\n', 'D. None of the mentioned\r\n', 'Answer: C\r\nExplanation: There is a potential problem for frequency sampling realization of the FIR linear phase filter. The frequency sampling realization of the FIR filter introduces poles and zeros at equally spaced points on the unit circle.'),
(4, 'Q.Why is it desirable to optimize frequency response in the transition band of the filter?\r\n', 'A. Increase side lobe\r\n', 'B. Reduce side lobe\r\n', 'C. Increase main lobe\r\n', 'D. None of the mentioned\r\n', 'Answer: B\r\nExplanation: To reduce side lobes, it is desirable to optimize the frequency specification in the transition band of the filter.\r\n'),
(5, 'Q.If x(n) and X(k) are an N-point DFT pair, then X(k+N)=?\r\n', 'A. X(-k)\r\n', 'B. -X(k)\r\n', 'C. X(k)\r\n', 'D. None of the mentioned\r\n', 'Answer: D\r\nExplanation: We know that\r\ndigital-signal-processing-questions-answers-properties-dft-q2\r\nTherefore, we have X(k)=X(k+N).'),
(6, 'Q.If X1(k) and X2(k) are the N-point DFTs of x1(n) and x2(n) respectively, then what is the N-point DFT of x(n)=ax1(n)+bx2(n)?\r\n', 'A. X1(ak)+X2(bk)\r\n', 'B. aX1(k)+bX2(k)\r\n', 'C. eakX1(k)+ebkX2(k)\r\n', 'D. None of the mentioned\r\n', 'Answer: B\r\nExplanation: We know that, the DFT of a signal x(n) is given by the expression\r\ndigital-signal-processing-questions-answers-properties-dft-q3\r\n=>X(k)= aX1(k)+bX2(k).'),
(7, 'Q.If x(n) is a real sequence and X(k) is its N-point DFT, then which of the following is true?\r\n', 'A. X(N-k)=X(-k)\r\n', 'B. X(N-k)=X*(k)\r\n', 'C. X(-k)=X*(k)\r\n', 'D. All of the mentioned\r\n', 'Answer: D\r\nExplanation: We know that\r\nproperties of DFT\r\nTherefore,\r\nX(N-k)=X*(k)=X(-k)'),
(8, 'Q.What is the circular convolution of the sequences x1(n)={2,1,2,1} and x2(n)={1,2,3,4}?\r\n', 'A. {14,14,16,16}\r\n', 'B. {16,16,14,14}\r\n', 'C. {2,3,6,4}\r\n', 'D. {14,16,14,16}\r\n', 'Answer: D\r\nExplanation: We know that the circular convolution of two sequences is given by the expression\r\nFor m=0,x2((-n))4={1,4,3,2}\r\nFor m=1,x2((1-n))4={2,1,4,3}\r\nFor m=2,x2((2-n))4={3,2,1,4}\r\nFor m=3,x2((3-n))4={4,3,2,1}\r\nNow we get x(m)={14,16,14,16}.'),
(9, 'Q.What is the circular convolution of the sequences x1(n)={2,1,2,1} and x2(n)={1,2,3,4}, find using the DFT and IDFT concepts?\r\n', 'A. {16,16,14,14}\r\n', 'B. {14,16,14,16}\r\n', 'C. {14,14,16,16}\r\n', 'D. None of the mentioned\r\n', 'Answer: B\r\nExplanation: Given x1(n)={2,1,2,1}=>X1(k)=[6,0,2,0] Given x2(n)={1,2,3,4}=>X2(k)=[10,-2+j2,-2,-2-j2] when we multiply both DFTs we obtain the product\r\nX(k)=X1(k).X2(k)=[60,0,-4,0] By applying the IDFT to the above sequence, we get\r\nx(n)={14,16,14,16}.\r\n'),
(10, 'Q.What is the circular convolution of the sequences x1(n)={2,1,2,1} and x2(n)={1,2,3,4}, find using the DFT and IDFT concepts?\r\n', 'a) {16,16,14,14}\r\n', 'b) {14,16,14,16}\r\n', 'c) {14,14,16,16}\r\n', 'd) None of the mentioned\r\n', 'Answer: b\r\nExplanation: Given x1(n)={2,1,2,1}=>X1(k)=[6,0,2,0] Given x2(n)={1,2,3,4}=>X2(k)=[10,-2+j2,-2,-2-j2] when we multiply both DFTs we obtain the product\r\nX(k)=X1(k).X2(k)=[60,0,-4,0] By applying the IDFT to the above sequence, we get\r\nx(n)={14,16,14,16}.');

-- --------------------------------------------------------

--
-- Table structure for table `electronic device`
--

CREATE TABLE IF NOT EXISTS `electronic device` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `electronic device`
--

INSERT INTO `electronic device` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.At room temperature the current in an intrinsic semiconductor is due to\r\n', 'A.holes\r\n', 'B.electrons\r\n', 'C.ions\r\n', 'D.holes and electrons\r\n', 'Answer: Option D\r\n\r\nExplanation:\r\n\r\nIntrinsic material has equal number of holes and electrons.'),
(2, 'The most commonly used semiconductor material is\r\n', 'A.silicon\r\n', 'B.germanium\r\n', 'C.mixture of silicon and germanium\r\n', 'D.none of the above\r\n', 'Answer: Option A\r\n\r\nExplanation:\r\n\r\nGermanium is rarely used.\r\n'),
(3, 'Q.In which of these is reverse recovery time nearly zero?\r\n', 'A.Zener diode\r\n', 'B.Tunnel diode\r\n', 'C.Schottky diode\r\n', 'D.PIN diode\r\n', 'Answer: Option C\r\n\r\nExplanation:\r\n\r\nIn schottky diode there is no charge storage and hence almost zero reverse recovery time.\r\n'),
(4, 'Q.A transistor has a current gain of 0.99 in the CB mode. Its current gain in the CC mode is\r\n', 'A.100\r\n', 'B.99\r\n', 'C.1.01\r\n', 'D.0.99\r\n', 'Answer: Option A\r\n\r\nExplanation:\r\n\r\n Current gain = 1 + ß = 100.'),
(5, 'Q.In p-n-p transistor the current IE has two components viz. IEP due to injection of holes from p-region to n-region and IE due to injection of electrons from n-region to p-region. Then\r\n', 'A.IEp and IEn are almost equal\r\n', 'B.IEp >> IEn\r\n', 'C.IEn >> IEp\r\n', 'D.either (a) or (c)\r\n', 'Answer: Option B\r\n\r\nExplanation:\r\n\r\nEmitter is p-type in p-n-p transistor.\r\n\r\nTherefore holes are majority carriers.'),
(6, 'Q.In an n channel JFET, the gate is\r\n', 'A.n type\r\n', 'B.p type\r\n', 'C.either n or p\r\n', 'D.partially n & partially p\r\n', 'Answer: Option B\r\n\r\nExplanation:\r\n\r\nSince channel is n type gate must be p type.\r\n'),
(7, 'Q.The amount of photoelectric emission current depends on\r\n', 'A.frequency of incident radiation\r\n\r\n', 'B.intensity of incident radiation\r\n', 'C.both frequency and intensity of incident radiation\r\n', 'D.none of the above\r\n', 'Answer: Option B\r\n\r\nExplanation:\r\n\r\nOnly the intensity of incident radiation governs the amount of photoelectric emission.'),
(8, 'Q.What is the thickness of ‘space charge region’ or ‘transition region’ in P-N junction diode?\r\n', 'A. 1 micron\r\n', 'B. 5 micron\r\n', 'C. 10 micron\r\n', 'D. 2.876 micron\r\n', 'Answer: A\r\nExplanation: The region of the junction is depleted by mobile charges, hence it is called space charge region or depletion region or transition region which is 10-4 cm = 10-6 m= 1 micron.\r\n'),
(9, 'Q.If what of the following is doped into a semiconductor say germanium a P-N junction is formed.\r\n', 'A. Electrons and Protons\r\n', 'B. Protons and Neutrons\r\n', 'C. Neutrons and Electrons\r\n', 'D. Gallium and Phosphorus\r\n', 'Answer: D\r\n\r\nExplanation: A P-N junction is formed only when a donor impurities and acceptor impurities are added to either side of a semiconductor like silicon and germanium.\r\n'),
(10, 'Q.The tendency of charge carriers to move from a region of heavily concentrated charges to region of less concentrated charge is known as.\r\n', 'A. Depletion current\r\n', 'B. Drain current\r\n', 'C. Diffusion current\r\n', 'D. Saturation current\r\n', 'Answer: C\r\n\r\nExplanation: In a semiconductor the charge will always have a tendency to move from higher concentrated area to less concentrated area to maintain equilibrium this movement of charges will result in diffusion current.\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `embedded system`
--

CREATE TABLE IF NOT EXISTS `embedded system` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `embedded system`
--

INSERT INTO `embedded system` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Which can prevent the terminal of data transmission?\r\n', 'a) flow control\r\n', 'b) increasing flow\r\n', 'c) increasing count\r\n', 'd) terminal count\r\n\r\n', 'Answer: a\r\nExplanation: The flow control can prevent the data transmission. It can also prevent the computer from sending more data than the other can cope with.'),
(2, 'Q.Which of the following is the first flow control method?\r\n', 'a) software handshaking\r\n', 'b) hardware handshaking\r\n', 'c) UART\r\n', 'd) SPI\r\n', 'Answer: b\r\nExplanation: The first flow control method is the hardware handshaking in which the hardware in the UART detects the potential overrun and it will assert a handshake line to tell the other UART to stop the transmission.\r\n'),
(3, 'Q.Which process defines the allocation of the mass storage to the logical file system?\r\n', 'a) mounting\r\n', 'b) de-allocation\r\n', 'c) demounting\r\n', 'd) unmounting\r\n', 'Answer: a\r\n\r\nExplanation: The allocation of the mass storage to the logical file system is known as the mounting and its reverse operation, deallocation of the mass storage is known as unmounting.\r\n'),
(4, 'Q.Which one of the following is the second method for flow controlling?\r\n', 'a) hardware\r\n', 'b) peripheral\r\n', 'c) software\r\n', 'd) memory\r\n', 'Answer: c\r\n\r\nExplanation: In the first method of flow control, there is a chance of data loss. So the second method of the flow control is adopted in which it uses a software to send characters XON and XOFF. XOFF can stop the data transfer and XON can restart the data transfer.\r\n'),
(5, 'Q.Which can restart the data transmission?\r\n', 'a) XON\r\n', 'b) XOFF\r\n', 'c) XRST\r\n', 'd) restart button\r\n', 'Answer: a\r\n\r\nExplanation: The second method of flow control is called software which is based on certain characters called XON and XOFF. XOFF can stop the data transfer and XON can restart the data transfer.\r\n'),
(6, 'Q.Which of the following is a common connector?\r\n', 'a) UART\r\n', 'b) SPI\r\n', 'c) I2C\r\n', 'd) DB-25\r\n', 'Answer: d\r\n\r\nExplanation: There are two connectors which are used very commonly. They are DB-25 and DB-9 which has 25 pins and 9 pins respectively.\r\n'),
(7, 'Q.What does pin 22 in DB-25 indicates?\r\n\r\n', 'a) transmit data\r\n', 'b) receive data\r\n', 'c) ring indicator\r\n', 'd) signal ground\r\n', 'Answer: c\r\n\r\nExplanation: The 22nd pin in DB-25 and the 9th pin in the DB-9 indicates a ring indicator which is asserted when a connected modem has detected an incoming call.'),
(8, 'Q.Which pin indicates the DSR in DB-25?\r\n', 'a) 1\r\n', 'b) 2\r\n', 'c) 4\r\n', 'd) 6\r\n', 'Answer: d\r\n\r\nExplanation: The 6th pin in DB-25 indicates DSR, that is, data set ready which indicates that each side is powered on and is ready to access data.'),
(9, 'Q.Which directory is allocated on the hard disk 1 of the physical storage in  a Linux operating system?\r\n', 'a) term\r\n', 'b) dev\r\n', 'c) etc\r\n', 'd) bin\r\n', 'Answer: d\r\n\r\nExplanation: The bin directory is on the hard disk 1 of the physical storage whereas the term, dev, etc is on the hard disk 1 of the physical logical file system.\r\n'),
(10, 'Q.Which filesystem of the Linux can be implemented on a system with two hard disks?\r\n', 'a) logical file system\r\n', 'b) physical file system\r\n', 'c) special file type system\r\n', 'd) regular file type system\r\n', 'Answer: a\r\n\r\nExplanation: The physical file system is allocated to the parts of the logical file system. The logical file system can be implemented on a system with two hard disks by the allocation of the bin directory under the hard disk 1 and the file subsystem under the hard disk 2.\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `general knowledge`
--

CREATE TABLE IF NOT EXISTS `general knowledge` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `information system`
--

CREATE TABLE IF NOT EXISTS `information system` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `information system`
--

INSERT INTO `information system` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.The information of MIS comes from the\r\n', 'A.Internal source\r\n', 'B.External source\r\n', 'C.Both internal and external source\r\n', 'D.None of the above\r\n ', 'Answer: C\r\n Explanation: None'),
(2, 'Q.The back bone of any organization is\r\n', 'A.information\r\n', 'B.employee\r\n', 'C.management\r\n', 'D.capital\r\n', ' Answer: A\r\n Explanation: None\r\n'),
(3, 'Q.AI is the short form of\r\n\r\n ', 'A.Artificial information\r\n', 'B.Artificial intelligence\r\n', 'C.Artificial integration\r\n', 'D.None of the above\r\n ', 'Answer: B\r\n Explanation: None'),
(4, 'Q.The advantage(s) of transistors are they\r\n', 'A.Are portable\r\n', 'B.Are more reliable\r\n', 'C.Consume less power\r\n', 'D.All of the above\r\n ', 'Answer: D\r\n Explanation: None'),
(5, 'Q.The flow of information through MIS is\r\n\r\n', 'A.need dependent\r\n', 'B.organization dependent\r\n', 'C.information dependent\r\n', 'D.management dependent\r\n ', 'Answer: A\r\n Explanation: None'),
(6, 'Q.The elements of control will consist of\r\n\r\n', 'A.Authority, Direction, Management\r\n', 'B.Authority, Direction, Information\r\n', 'C.Authority, Application, Management\r\n', 'D.Authority, Application, Information\r\n', 'Answer: A\r\n Explanation: None'),
(7, 'Q.Internal information for MIS may come from any one of the following department.\r\n\r\n', 'A.Customers care department\r\n', 'B.HR department\r\n', 'C.Marketing department\r\n', 'D.Production department\r\n', 'Answer: A\r\n Explanation: None\r\n '),
(8, 'Q.One byte is made of\r\n\r\n', 'A.Four bits\r\n', 'B.Eight bits\r\n', 'C.Twelve bits\r\n', 'D.Sixteen bits\r\n', 'Answer: B\r\n Explanation: None'),
(9, 'Q.MIS normally found in a manufacturing organization will not be suitable in the ______.\r\n\r\n', 'A.Service sector\r\n', 'B.Banking sector\r\n', 'C.Agriculture sector\r\n', 'D.All of the above\r\n', 'Answer: A\r\n Explanation: None'),
(10, 'Q.The basic component(s) of DSS is (are)\r\n\r\n', 'A.Database\r\n', 'B.Model base\r\n', 'C.DSS software system\r\n', 'D.All of the above\r\n', 'Answer: D\r\n Explanation: None');

-- --------------------------------------------------------

--
-- Table structure for table `java`
--

CREATE TABLE IF NOT EXISTS `java` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `java`
--

INSERT INTO `java` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.What is the default value of double variable?\r\n\r\n', 'A - 0.0d\r\n\r\n', 'B - 0.0f\r\n\r\n\r\n', 'C - 0\r\n\r\n', 'D - not defined\r\n\r\n', 'Answer : A\r\nExplanation:\r\ndouble variable has default value of 0.0d if defined as an instance/static variable.'),
(2, 'Q.Which of the following stands true about default modifier of class members?\r\n\r\n', 'A. By default, variables, methods and constructors can be accessed by subclass only.\r\n\r\n', 'B. By default, variables, methods and constructors can be accessed by any class lying in any package.\r\n\r\n', 'C. By default, variables, methods and constructors can be accessed by any class lying in the same package.\r\n\r\n', 'D. None of the above.\r\n\r\n', 'Answer : C\r\nExplanation\r\nBy default, variables, methods and constructors can be accessed by any class lying in the same package.\r\n'),
(3, 'Q.What is Abstraction?\r\n\r\n', 'A. Abstraction is a technique to define different methods of same type.\r\n\r\n', 'B. Abstraction is the ability of an object to take on many forms.\r\n\r\n', 'C. It refers to the ability to make a class abstract in OOP.\r\n\r\n', 'D. None of the above.\r\n\r\n', 'Answer : C\r\nExplanation:\r\nIt refers to the ability to make a class abstract in OOP. It helps to reduce the complexity and also improves the maintainability of the system.'),
(4, 'Q.Static binding uses which information for binding?\r\n\r\n', 'A. type.\r\n\r\n', 'B. object.\r\n\r\n', 'C. Both of the above.\r\n\r\n', 'D. None of the above.\r\n\r\n', 'Answer : A\r\nExplanation\r\nStatic binding uses type information for binding.\r\n'),
(5, 'Q.What is runtime polymorphism?\r\n\r\n', 'A. Runtime polymorphism is a process in which a call to an overridden method is resolved at runtime rather than at compile-time.\r\n\r\n', 'B. Runtime polymorphism is a process in which a call to an overloaded method is resolved at runtime rather than at compile-time.\r\n\r\n\r\n', 'C. Both of the above.\r\n\r\n', 'D. None of the above.\r\n\r\n', 'Answer : A\r\nExplanation\r\nRuntime polymorphism or dynamic method dispatch is a process in which a call to an overridden method is resolved at runtime rather than at compile-time. In this process, an overridden method is called through the reference variable of a superclass.'),
(6, 'Q.Which method must be implemented by all threads?\r\n\r\n', 'A. wait()\r\n\r\n', 'B. start()\r\n', 'C. stop()\r\n', 'D. run()\r\n\r\n', 'Answer : D\r\nExplanation\r\nAll threads must implement the run() method.'),
(7, 'Q.What is an immutable object?\r\n\r\n', 'A. An immutable object can be changed once it is created.\r\n', 'B. An immutable object can''t be changed once it is created.\r\n', 'C. An immutable object is an instance of an abstract class.\r\n', 'D. None of the above.\r\n\r\n', 'Answer : B\r\nExplanation\r\nAn immutable object can''t be changed once it is created. String objects are immutable.'),
(8, 'Q.Which of the following is a thread safe?\r\n\r\n', 'A. StringBuilder\r\n\r\n', 'B. StringBuffer\r\n', 'C. Both of the above\r\n', 'D. none of the above\r\n\r\n', 'Answer : B\r\nExplanation\r\nStringBuffer is thread safe.'),
(9, 'Q.What is a marker interface?\r\n\r\n', 'A. marker interface is an interface with no method.\r\n', 'B. marker interface is an interface with single method, mark().\r\n', 'C. marker interface is an interface with single method, marker().\r\n', 'D. none of the above.\r\n\r\n', 'Answer : A\r\nExplanation\r\nMarker interface is an interface with no method.\r\n'),
(10, 'Q.What is JIT compiler?\r\n\r\n\r\n', 'A. JIT improves the runtime performance of computer programs based on bytecode.\r\n\r\n', 'B. JIT is an application development framework.\r\n', 'C. JIT is an implementation of the Java Virtual Machine which executes Java programs.\r\n', 'D. None of the above.\r\n\r\n', 'Answer : A\r\nExplanation\r\nJIT, Just In-Time Compiler, improves the runtime performance of computer programs based on bytecode.');

-- --------------------------------------------------------

--
-- Table structure for table `logic circuit`
--

CREATE TABLE IF NOT EXISTS `logic circuit` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `logic circuit`
--

INSERT INTO `logic circuit` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.If the output of a three-input AND gate must be a logic LOW, what must the condition of the inputs be?\r\n\r\n', 'A.	All inputs must be LOW.\r\n', 'B.	All inputs must be HIGH.\r\n', 'C.	At least one input must be LOW.\r\n', 'D.	At least one input must be HIGH.\r\n', 'Answer: Option C\r\nExplanation:\r\nNo answer description available for this question.'),
(2, 'Q.Logically, the output of a NOR gate would have the same Boolean expression as a(n):\r\n\r\n', 'A.NAND gate immediately followed by an inverter\r\n', 'B.OR gate immediately followed by an inverter\r\n', 'C.AND gate immediately followed by an inverter\r\n', 'D.NOR gate immediately followed by an inverter\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(3, 'Q.A logic probe is placed on the output of a gate and the display indicator is dim. A pulsor is used on each of the input terminals, but the output indication does not change. What is wrong?\r\n\r\n', 'A.The dim indication on the logic probe indicates that the supply voltage is probably low.\r\n', 'B.The output of the gate appears to be open.\r\n', 'C.The dim indication is the result of a bad ground connection on the logic probe.\r\n', 'D.The gate is a tristate device.\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(4, 'Q.What is the Boolean expression for a three-input AND gate?\r\n\r\n', 'A.X = A + B + C\r\n', 'B.X = A · B · C\r\n', 'C.A – B – C\r\n', 'D.A $ B $ C\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(5, 'Q.Which of the following gates has the exact inverse output of the OR gate for all possible input combinations?\r\n\r\n', 'A.NOR\r\n', 'B.NOT\r\n', 'C.NAND\r\n', 'D.AND\r\n', 'Answer: Option A\r\nExplanation:\r\nNo answer description available for this question.'),
(6, 'Q.What are the pin numbers of the outputs of the gates in a 7432 IC?\r\n\r\n', 'A.3, 6, 10, and 13\r\n', 'B.1, 4, 10, and 13\r\n', 'C.3, 6, 8, and 11\r\n', 'D.1, 4, 8, and 11\r\n', 'Answer: Option C\r\nExplanation:\r\nNo answer description available for this question.'),
(7, 'Q.The output of a NOT gate is HIGH when ________.\r\n\r\n', 'A.the input is LOW\r\n', 'B.the input is HIGH\r\n', 'C.power is applied to the gate''s IC\r\n', 'D.power is removed from the gate''s IC\r\n', 'Answer: Option A\r\nExplanation:\r\nNo answer description available for this question.'),
(8, 'Q.A logic probe is used to test the pins of a 7411 IC with the following results. Is there a problem with the chip and if so, what is the problem?\r\n\r\n\r\n\r\n', 'A.Pin 6 should be ON.\r\n', 'B.Pin 6 should be pulsing.\r\n', 'C.Pin 8 should be ON.\r\n', 'D.no problem\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(9, 'Q.How many inputs of a four-input AND gate must be HIGH in order for the output of the logic gate to go HIGH?\r\n\r\n', 'A.any one of the inputs\r\n', 'B.any two of the inputs\r\n', 'C.any three of the inputs\r\n', 'D.all four inputs\r\n', 'Answer: Option D\r\nExplanation:\r\nNo answer description available for this question.'),
(10, 'Q.How many AND gates are found in a 7411 IC?\r\n\r\n', 'A.1\r\n', 'B.2\r\n', 'C.3\r\n', 'D.4\r\n', 'Answer: Option C\r\nExplanation:\r\nNo answer description available for this question.');

-- --------------------------------------------------------

--
-- Table structure for table `mathematics`
--

CREATE TABLE IF NOT EXISTS `mathematics` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `mathematics`
--

INSERT INTO `mathematics` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.A and B are two events such that P(A) = 0.4 and P(A ∩ B) = 0.2 Then P(A ∩ B) is equal to\r\n', 'a) 0.4\r\n', 'b) 0.2\r\n', 'c) 0.6\r\n', 'd) 0.8\r\n', 'Answer: a\r\nExplanation: P(A ∩ B) = P(A – (A ∩ B))\r\n= P(A) – P(A ∩ B)\r\n= 0.6 – 0.2 Using P(A) = 1 – P(A)\r\n= 0.4.'),
(2, 'Q. A problem in mathematics is given to three students A, B and C . If the probability of A solving the problem is 1⁄2 and B not solving it is 1⁄4 . The whole probability of the problem being solved is 63⁄64 then what is the probability of solving it ?\r\n', 'a) 1⁄8\r\n', 'b) 1⁄64\r\n', 'c) 7⁄8\r\n', 'd) 1⁄2\r\n', 'Answer: c\r\nExplanation:\r\nLet A be the event of A solving the problem\r\nLet B be the event of B solving the problem\r\nLet C be the event of C solving the problem\r\nGiven P(a) = 1⁄2, P(~B) = 1⁄4 and P(A ∪ B ∪ C) = 63/64\r\nWe know P(A ∪ B ∪ C) = 1 – P(A ∪ B ∪ C)\r\n\r\n= 1 – P(A ∩ B ∩ C)\r\n\r\n= 1 – P(A) P(B) P(C)\r\n\r\nLet P(C) = p\r\nie 63⁄64 = 1 – (1⁄2)(1⁄4)(p)\r\n\r\n= 1 – p⁄8\r\n⇒ P =1/8 = P(C)\r\n⇒P(C) = 1 – P = 1 – 1⁄8 = 7⁄8.'),
(3, 'Q.Let A and B be two events such that P(A) = 1⁄5 While P(A or B) = 1⁄2. Let P(B) = P. For what values of P are A and B independent?\r\n', 'a) 1⁄10 and 3⁄10\r\n', 'b) 3⁄10 and 4⁄5\r\n', 'c) 3⁄8 only\r\n', 'd) 3⁄10\r\n', 'Answer: c\r\nExplanation:\r\nFor independent events,\r\nP(A ∩ B) = P(A) P(B)\r\nP(A ∪ B) = P(A) + P(B) – P(A ∩ B)\r\n= P(A) + P(B) – P(A) P(B)\r\n= 1⁄5 + P (1⁄5)P\r\n⇒ 1⁄2 = 1⁄5 + 4⁄5P\r\n⇒ P= 3⁄8.'),
(4, 'Q.If A and B are two events such that P(a) = 0.2, P(b) = 0.6 and P(A /B) = 0.2 then the value of P(A /~B) is\r\n', 'a) 0.2\r\n', 'b) 0.5\r\n', 'c) 0.8\r\n', 'd) 1⁄3\r\n', 'Answer: a\r\nExplanation: For independent events,\r\nP(A /~B) = P(a) = 0.2.'),
(5, 'Q.Let A and B be two events such that the occurrence of A implies occurrence of B, But not vice-versa, then the correct relation between P(a) and P(b) is\r\n', 'a) P(A) < P(B)\r\n', 'b) P(B) ≥ P(A)\r\n', 'c) P(A) = P(B)\r\n', 'd) P(A) ≥ P(B)\r\n', 'Answer: b\r\nExplanation: Here, according to the given statement A ⊆ B\r\nIn this case P(B) = P(A ∪ (A ∩ B))\r\n= P(A) + P(A ∩ B)\r\nTherefore, P(B) ≥ P(A)'),
(6, 'Q.If then,\r\n', 'a) P(a) > P(b)\r\n', 'b) P(a) > P(b)\r\n', 'c) P(a) = P(b)\r\n', 'd) P(~A) less than P(~B)\r\n', 'Answer: c\r\nExplanation: A ⊂ B, B ⊂ A\r\nThat means A = B\r\nHence P(a) = P(b).'),
(7, 'Q.If A is a subset of B then,\r\n', 'a) P(a) is greater than P(b)\r\n', 'b) P(~A) is greater than or equal to P(~B)\r\n', 'c) P(b) is equal to P(a)\r\n', 'd) P(b) is equal to P(~B)\r\n', 'Answer: b\r\nExplanation: A is a subset of B which means (~B) is a subset of (~A)\r\nTherefore P(~A) is greater than or equal to P(~B).'),
(8, 'Q.If A is a perfect subset of B and P(a < Pb), then P(B – A) is equal to\r\n', 'a) P(a) / P(b)\r\n', 'b) P(a)P(b)\r\n', 'c) P(a) + P(b)\r\n.', 'd) P(b) – P(a)\r\n', 'Answer: d\r\nExplanation:\r\nFrom Basic Theorem of probability,\r\nP(B – A) = P(b) – P(a), this is true only if the condition given in the question is true'),
(9, 'Q.Maximize the function x + y – z = 1 with respect to the constraint xy=36.\r\n', 'a) 0\r\n', 'b) -8\r\n', 'c) 8\r\n\r\n', 'd) No Maxima exists\r\n', 'Answer: d\r\nExplanation: Geometrically, we can see that the level curves can go further the origin along the curve xy=36 infinitely and still not reach its maximum value. What the Lagrange multiplier predicts in this case is the minimum value.'),
(10, 'Q.Maximum value of a 3-d plane is to be found over a circular region. Which of the following happens if we increase the radius of the circular region.\r\n', 'a) Maximum value is invariant\r\n', 'b) Maximum value decreases\r\n\r\n', 'c) Maximum value increases and minimum value goes lesser\r\n', 'd) minimum value goes higher\r\n', 'Answer: c\r\nExplanation:Consider the level curves of the plane. These are the set of straight lines with equal slope and unequal intercepts. Now as the radius of the circular region is increased, we see that the Lagrange condition(i.e. the level curves to be tangent to the circular boundary) happens to occur further away form the origin. Thus the maximum value is pushed further and the minimum value is decreased further.');

-- --------------------------------------------------------

--
-- Table structure for table `microprocessor`
--

CREATE TABLE IF NOT EXISTS `microprocessor` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `microprocessor`
--

INSERT INTO `microprocessor` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.The devices that provide the means for a computer to communicate with the user or other computers are referred to as:\r\n\r\n', 'A.CPU\r\n', 'B.ALU\r\n', 'C.I/O\r\n', 'D.none of the above\r\n', 'Answer: Option C\r\nExplanation:\r\nNo answer description available for this question.'),
(2, 'Q.The software used to drive microprocessor-based systems is called:\r\n\r\n', 'A.assembly language\r\n', 'B.firmware\r\n', 'C.machine language code\r\n', 'D.BASIC interpreter instructions\r\n', 'Answer: Option A\r\nExplanation:\r\nNo answer description available for this question.'),
(3, 'Q.The circuits in the 8085A that provide the arithmetic and logic functions are called the:\r\n\r\n', 'A.CPU\r\n', 'B.ALU\r\n', 'C.I/O\r\n', 'D.none of the above\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(4, 'Q.How many buses are connected as part of the 8085A microprocessor?\r\n\r\n', 'A.2\r\n', 'B.3\r\n', 'C.5\r\n ', 'D.8\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(5, 'Q.The ________ ensures that only one IC is active at a time to avoid a bus conflict caused by two ICs writing different data to the same bus.\r\n\r\n', 'A.control bus\r\n', 'B.control instructions\r\n', 'C.address decoder\r\n', 'D.CPU\r\n', 'Answer: Option C\r\nExplanation:\r\nNo answer description available for this question.'),
(6, 'Q.When was the first 8-bit microprocessor introduced?\r\n\r\n', 'A.1969\r\n', 'B.1974\r\n', 'C.1979\r\n', 'D.1985\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(7, 'Q.What type of circuit is used at the interface point of an output port?\r\n\r\n', 'A.decoder\r\n', 'B.latch\r\n', 'C.tristate buffer\r\n', 'D.none of the above\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.'),
(8, 'Q.I/O mapped systems identify their input/output devices by giving them a(n) ________.\r\n\r\n', 'A.8-bit port number\r\n', 'B.16-bit port number\r\n', 'C.8-bit buffer number\r\n', 'D.8-bit instruction\r\n', 'Answer: Option A\r\nExplanation:\r\nNo answer description available for this question.'),
(9, 'Q.What type of circuit is used at the interface point of an input port?\r\n\r\n', 'A.decoder\r\n', 'B.latch\r\n', 'C.tristate buffer\r\n', 'D.none of the above\r\n', 'Answer: Option C\r\nExplanation:\r\nNo answer description available for this question.'),
(10, 'Q.The register in the 8085A that is used to keep track of the memory address of the next op-code to be run in the program is the:\r\n\r\n', 'A.stack pointer\r\n', 'B.program counter\r\n', 'C.instruction pointer\r\n', 'D.accumulator\r\n', 'Answer: Option B\r\nExplanation:\r\nNo answer description available for this question.');

-- --------------------------------------------------------

--
-- Table structure for table `net`
--

CREATE TABLE IF NOT EXISTS `net` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='asp.net' AUTO_INCREMENT=11 ;

--
-- Dumping data for table `net`
--

INSERT INTO `net` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.The capability of an object in Csharp to take number of different forms and hence display behaviour as according is known as:\r\n', 'a) Encapsulation\r\n', 'b) Polymorphism\r\n', 'c) Abstraction\r\n', 'd) None of the mentioned\r\n', 'Answer: b\r\nExplanation: None.'),
(2, 'Q.Which of the following keyword is used to change data and behavior of a base class by replacing a member of the base class with a new derived member?\r\n', 'a) Overloads\r\n', 'b) Overrides\r\n', 'c) new\r\n', 'd) base\r\n', 'Answer: c\r\nExplanation: None.'),
(3, 'Q.Correct way to overload +operator?\r\n', 'a) public sample operator + ( sample a, sample b)\r\n', 'b) public abstract operator + (sample a,sample b)\r\n', 'c) public static sample operator + (sample a, sample b)\r\n', 'd) All of the mentioned\r\n', 'Answer: d\r\nExplanation: None.'),
(4, 'Q.Correct statement about C# code is?\r\n\r\n public class maths\r\n {\r\n     public int x;\r\n     public virtual void a()\r\n     {\r\n \r\n     }\r\n \r\n }\r\n public class subject : maths\r\n {\r\n     new public void a()\r\n     {\r\n \r\n     }\r\n \r\n }\r\n', 'a) The subject class version of a() method gets called using sample class reference which holds subject class object\r\n', 'b) subject class hides a() method of base class\r\n', 'c) The code replaces the subject class version of a() with its math class version\r\n', 'd) None of the mentioned\r\n', 'Answer: d\r\nExplanation: None.'),
(5, 'Q.Which of the following statements is correct?\r\n', 'a) Each derived class does not have its own version of a virtual method\r\n', 'b) If a derived class does not have its own version of virtual method then one in base class is used\r\n', 'c) By default methods are virtual\r\n', 'd) All of the mentioned\r\n', 'Answer: c\r\nExplanation: None.'),
(6, 'Q.Correct code to be added for overloaded operator – for C# .net code given below is?\r\n\r\n class csharp\r\n {\r\n     int x, y, z;\r\n     public csharp()\r\n     {\r\n \r\n     }\r\n     public csharp(int a ,int b ,int c)\r\n     {\r\n         x = a;\r\n         y = b;\r\n         z = c;\r\n     }\r\n     Add correct set of code here\r\n    public void display()\r\n    {\r\n        console.writeline(x + "  " + y + "  " + z);\r\n    }\r\n    class program\r\n    {\r\n        static void Main(String[] args)\r\n        {\r\n            csharp s1 = new csharp(5 ,6 ,8);\r\n            csharp s3 = new csharp();\r\n            s3 = - s1;\r\n            s3.display();\r\n        }\r\n    }\r\n}\r\n', 'a) public static csharp operator -(csharp s1)\r\n    {\r\n        csharp t = new csharp();\r\n        t.x = s1.x;\r\n        t.y = s1.y;\r\n        t.z = -s1.z;\r\n        return t;\r\n    }\r\n', 'b)\r\n\r\n public static csharp operator -(csharp s1)\r\n    {\r\n        csharp t = new csharp();\r\n        t.x = s1.x;\r\n        t.y = s1.y;\r\n        t.z = s1.z;\r\n        return t;\r\n    }\r\n', 'c)\r\n\r\npublic static csharp operator -(csharp s1)\r\n    {\r\n        csharp t = new csharp();\r\n        t.x = -s1.x;\r\n        t.y = -s1.y;\r\n        t.z = -s1.z;\r\n        return t;\r\n    }\r\n', 'd) None of the mentioned\r\n', 'Answer: c\r\nExplanation: None.'),
(7, 'Q.Selecting appropriate method out of number of overloaded methods by matching arguments in terms of number ,type and order and binding that selected method to object at compile time is called?\r\n', 'a) Static binding\r\n', 'b) Static Linking\r\n', 'c) Compile time polymorphism\r\n', 'd) All of the mentioned\r\n', 'Answer: d\r\nExplanation: None.'),
(8, 'Q.Wrong statement about run time polymorphism is?\r\n', 'a) The overridden base method should be virtual,abstract or override\r\n', 'b) An abstract method is implicitly a virtual method\r\n', 'c) An abstract inherited property cannot be overridden in a derived class\r\n', 'd) Both override method and virtual method must have same access level modifier\r\n', 'Answer: c\r\nExplanation: None.'),
(9, 'Q.What is Recursion in CSharp defined as?\r\n\r\n', 'a) Recursion is another form of class\r\n', 'b) Recursion is another process of defining a method that calls other methods repeatedly\r\n', 'c) Recursion is a process of defining a method that calls itself repeatedly\r\n', 'd) Recursion is a process of defining a method that calls other methods which in turn calls this method\r\n', 'Answer: c\r\nExplanation: Recursion is the process of defining something in terms of itself. It allows us to define method that calls itself repeatedly until it meets some base case condition.'),
(10, 'Q.Correct statement about constructor overloading in C# is?\r\n', 'a) Overloaded constructors have the same name as the class\r\n', 'b) Overloaded constructors cannot use optional arguments\r\n', 'c) Overloaded constructors can have different type of number of arguments as well as differ in number of arguments\r\n', 'd) All of the mentioned\r\n', 'Answer: c\r\nExplanation: By definition of overloaded constructors.');

-- --------------------------------------------------------

--
-- Table structure for table `numerical methods`
--

CREATE TABLE IF NOT EXISTS `numerical methods` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `numerical methods`
--

INSERT INTO `numerical methods` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.In which of the following method, we approximate the curve of solution by the tangent in each interval?\r\n', 'a.\r\nPicard’s method\r\n', 'b.\r\nEuler’s method\r\n', 'c.\r\nNewton’s method\r\n', 'd.\r\nRunge Kutta method\r\n', 'Answer: b\r\nExplanation: None\r\n'),
(2, 'Q.Jacobi"s method is also #nown as\r\n', 'a.\r\nDisplacement method\r\n', 'b.\r\nSimultaneous displacement method\r\n', 'c.\r\nSimultaneous method\r\n', 'd.\r\nDiagonal method\r\n', 'Answer: b\r\n Explanation: None\r\n'),
(3, 'Q.The number of significant digits in the number 204.020050 is\r\n', 'a.5\r\n', 'b.6\r\n', 'c.8\r\n', 'd.9\r\n', 'Answer: d\r\nExplanation: None\r\n'),
(4, 'In general the ratio of truncation error to that of roundoff error is\r\n\r\n', 'a.2:1\r\n', 'b.1:1\r\n', 'c.1:2\r\n', 'd.1:3\r\n', 'Answer: a\r\nExplanation: None'),
(5, 'Q.The convergence of which of the following method is sensitive to starting value:\r\n', 'a.False position\r\n', 'b.Gauss-seidal method\r\n', 'c.Newton-Raphson method\r\n', 'd.All of these\r\n', 'Answer: c\r\nExplanation: None\r\n'),
(6, 'Q.To perform a Chi-square test\r\n', 'a.Data conform to a normal distribution\r\n', 'b.Data be measured on a nominal scale\r\n', 'c.Each cell has equal number of frequencies\r\n', 'd.All of these\r\n', 'Answer: d\r\nExplanation: None\r\n'),
(7, 'Q.In the Gauss elimination method for solving a system of linear algebraic equations, triangularization leads to\r\n', 'a.Diagonal matrix\r\n', 'b.Lower triangular matrix\r\n', 'c.Upper triangular matrix\r\n', 'd.Singular matrix\r\n', 'Answer: c\r\nExplanation: None\r\n'),
(8, 'Q.Match the following:\r\n\r\nA. Newton-Raphson      1. Integration\r\n\r\nB. Runge-kutta            2. Root finding\r\n\r\nC. Gauss-seidel           3. Ordinary Differential Equations\r\n\r\nD. Simpson’s Rule       4. Solution of system of Linear Equations\r\n\r\nThe correct sequence is\r\n\r\n\r\n', 'a.A2-B3-C4-D1\r\n', 'b.A3-B2-C1-D4\r\n', 'c.A1-B4-C2-D3\r\n', 'd.A4-B1-C2-D3\r\n', 'Answer: a\r\nExplanation: None\r\n'),
(9, 'Q.Order of convergence of Regula-Falsi method is\r\n\r\n', 'a.1.321\r\n', 'b.1.618\r\n', 'c.2.231\r\n', 'd.2.312\r\n', 'Answer: b \r\nExplanation: None\r\n'),
(10, 'Q.The expected value of the random variable\r\n\r\n', 'a.Will also be the most likely value of the random variable\r\n', 'b.Is another term for the mean value\r\n', 'c.Is also called the variance\r\n', 'd.Cannot be greater than 1\r\n', 'Answer: b\r\nExplanation: None\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `object oriented programming in c++`
--

CREATE TABLE IF NOT EXISTS `object oriented programming in c++` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `object oriented programming in c++`
--

INSERT INTO `object oriented programming in c++` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.In C++ a name that is assigned by a user for a program elements such as variable, type, class, function or namespaces is called\r\n\r\n', 'A.Operators\r\n', 'B.Identifiers\r\n', 'C.Literals\r\n', 'D.All of them', 'Option B.\r\nNo explanation available.'),
(2, 'Q.Unsigned integers in C++ are\r\n\r\n', 'A.Negative numbers\r\n', 'B.Non-negative numbers\r\n', 'C.Float numbers\r\n', 'D.None of them', 'Option B.'),
(3, 'Q.Which among the following best describes the Inheritance?\r\n', 'A. Copying the code already written\r\n', 'B. Using the code already written once\r\n', 'C. Using already defined functions in programming language\r\n', 'D. Using the data and functions into derived segment', 'Option D.\r\nExplanation:\r\nIt can only be indicated by using the data and functions that we use in derived class, being provided by parent class. Copying code is nowhere similar to this concept, also using the code already written is same as copying. Using already defined functions is not inheritance as we are not adding any of our own features.'),
(4, 'Q. How many basic types of inheritance are provided as OOP feature?\r\n', 'A. 4\r\n', 'B. 3\r\n', 'C. 2\r\n', 'D. 1', 'Option A.\r\nExplanation: \r\nThere are basically 4 types of inheritance provided in OOP, namely, single level,multilevel, multiple and hierarchical inheritance. We can add one more type as Hybrid inheritance but that is actually the combination any types of inheritance from the 4 basic ones.'),
(5, 'Q.Which type of inheritance leads to diamond problem?\r\n', 'A. Single level\r\n', 'B. Multi-level\r\n', 'C. Multiple\r\n', 'D. Hierarchical', 'Option C.\r\nExplanation: \r\nWhen 2 or more classes inherit the same class using multiple inheritance and then one more class inherits those two base classes, we get a diamond like structure. Here, ambiguity arises when same function gets derived into 2 base classes and finally to 3rd level class, because same name functions are being inherited.'),
(6, 'Q.Which among the following best describes encapsulation?\r\n', 'A. It is a way of combining various data members into a single unit\r\n', 'B. It is a way of combining various member functions into a single unit\r\n', 'C. It is a way of combining various data members and member functions into a single unit which can operate on any data\r\n', 'D. It is a way of combining various data members and member functions that operate on those data members into a single unit\r\n\r\n', 'Option D.\r\nExplanation: It is a way of combining both data members and member functions, which operate on those data members, into a single unit. We call it a class in OOP generally. This feature have helped us modify the structures used in C language to be upgraded into class in C++ and other languages.'),
(7, 'Q. Which feature can be implemented using encapsulation?\r\n', 'A. Inheritance\r\n', 'B. Abstraction\r\n', 'C. Polymorphism\r\n', 'D. Overloading\r\n', 'Option B\r\nExplanation: Data abstraction can be achieved by using encapsulation. We can hide the operation and structure of actual program from the user and can show only required information by the user.'),
(8, 'Q.Find which of the following uses encapsulation?\r\n', 'A. void main(){ int a; void fun( int a=10; cout<<a); fun(); }\r\n', 'B. class student{ int a; public: int b;};\r\n', 'C. class student{int a; public: void disp(){ cout<<a;} };\r\n', 'D. struct topper{ char name[10]; public : int marks; }\r\n', 'Option C\r\nExplanation: It is the class which uses both the data members and member functions being declared inside a single unit. Only data members can be there in structures also. And the encapsulation can only be illustrated if some data/operations are associated within class.'),
(9, 'Q.Which among the following should be encapsulated?\r\n', 'A. The data which is prone to change is near future\r\n', 'B. The data prone to change in long terms\r\n', 'C. The data which is intended to be changed\r\n', 'D. The data which belongs to some other class\r\n\r\n', 'Option A\r\nExplanation: The data prone to change in near future is usually encapsulated so that it doesn’t get changed accidentally. We encapsulate the data to hide the critical working of program from outside world.'),
(10, 'Q.How can Encapsulation be achieved?\r\n\r\n', 'A. Using Access Specifiers\r\n', 'B. Using only private members\r\n', 'C. Using inheritance\r\n', 'D. Using Abstraction\r\n\r\n\r\n', 'Option A.\r\nExplanation: Using access specifiers we can achieve encapsulation. Using this we can in turn implement data abstraction. It’s not necessary that we only use private access.'),
(11, 'Q.Which among the following violates the principle of encapsulation almost always?', 'A. Local variables\r\n', 'B. Global variables\r\n', 'C. Public variables\r\n', 'D. Array variables\r\n', 'Option B.\r\nExplanation: Global variables almost always violates the principles of encapsulation. Encapsulation says the data should be accessed only by required set of elements. But global variable is accessible everywhere, also it is most prone to changes. It doesn’t hide the internal working of program.'),
(12, 'Q.Which among the following best describes polymorphism?\r\n', 'A. It is the ability for a message/data to be processed in more than one form\r\n', 'B. It is the ability for a message/data to be processed in only 1 form\r\n', 'C. It is the ability for many messages/data to be processed in one way\r\n', 'D. It is the ability for undefined message/data to be processed in at least one way\r\n', 'Option A\r\nExplanation: It is actually the ability for a message / data to be processed in more than one form. The word polymorphism indicates many-forms. So if a single entity takes more than one form, it is known as polymorphism.\r\n'),
(13, 'Q. Which type of function among the following shows polymorphism?\r\n', 'A. Inline function\r\n', 'B. Virtual function\r\n', 'C. Undefined functions\r\n', 'D. Class member functions\r\n', 'Option B\r\nExplanation: Only virtual functions among these can show polymorphism. Class member functions can show polymorphism too but we should be sure that the same function is being overloaded or is a function of abstract class or something like this, since we are not sure about all these, we can’t say whether it can show polymorphism or not.\r\n'),
(14, 'Q.In case of using abstract class or function overloading, which function is supposed to be called first?\r\n', 'A. Local function\r\n\r\n', 'B. Function with highest priority in compiler\r\n', 'C. Global function\r\n', 'D. Function with lowest priority because it might have been halted since long time, because of low priority\r\n', 'Option B.\r\nExplanation: Function with highest priority is called. Here, it’s not about the thread scheduling in CPU, but it focuses on whether the function in local scope is present or not, or if scope resolution is used in some way, or if the function matches the argument signature. So all these things define which function has the highest priority to be called in runtime. Local function could be one of the answer but we can’t say if someone have used pointer to another function or same function name.');

-- --------------------------------------------------------

--
-- Table structure for table `object oriented software engineering`
--

CREATE TABLE IF NOT EXISTS `object oriented software engineering` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `object oriented software engineering`
--

INSERT INTO `object oriented software engineering` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Choose the incorrect statement in terms of Objects.\r\n', 'a) Objects are abstractions of real-world\r\n', 'b) Objects can’t manage themselves\r\n', 'c) Objects encapsulate state and representation information\r\n', 'd) All of the mentioned\r\n', 'Answer: b\r\nExplanation: Objects are independent.'),
(2, 'Q.Which of the following is a mechanism that allows several objects in an class hierarchy to have different methods with the same name?\r\n', 'a) Aggregation\r\n', 'b) Polymorphism\r\n', 'c) Inheritance\r\n', 'd) All of the mentioned\r\n', 'Answer: b\r\nExplanation: In polymorphism instances of each subclass will be free to respond to messages by calling their own version of the method.\r\n'),
(3, 'Q.Which of the following points related to Object-oriented development (OOD) is true?\r\n', 'a) OOA is concerned with developing an object model of the application domain\r\n', 'b) OOD is concerned with developing an object-oriented system model to implement requirements\r\n', 'c) All of the mentioned\r\n', 'd) None of the mentioned\r\n', 'Answer: c\r\nExplanation: The answer is in support with the OOD.'),
(4, 'Q.How is generalization implemented in Object Oriented programming languages?\r\n', 'a) Inheritance\r\n', 'b) Polymorphism\r\n', 'c) Encapsulation\r\n', 'd) Abstract Classes\r\n', 'Answer: a\r\nExplanation: None.'),
(5, 'Q.Which of the following is a disadvantage of OOD ?\r\n', 'a) Easier maintenance\r\n', 'b) Objects may be understood as stand-alone entities\r\n', 'c) Objects are potentially reusable components\r\n', 'd) None of the mentioned\r\n', 'Answer: d\r\nExplanation: All the options define the characteristics of OOD.'),
(6, 'Q.Object that collects data on request rather than autonomously is known as\r\n', 'a) Active Object\r\n', 'b) Passive Object\r\n', 'c) Multiple instance\r\n', 'd) None of the mentioned\r\n', 'Answer: b\r\nExplanation: A passive object holds data, but does not initiate control.'),
(7, 'Q.Objects are executed\r\n', 'a) sequentially\r\n', 'b) in Parallel\r\n', 'c) sequentially & Parallel\r\n', 'd) none of the mentioned\r\n', 'Answer: c\r\nExplanation: Objects may be distributed and may execute sequentially or in parallel.\r\n'),
(8, 'Q.Risk management is one of the most important jobs for a\r\n', 'a) Client\r\n', 'b) Investor\r\n', 'c) Production team\r\n', 'd) Project manager\r\n', 'Answer: d\r\nExplanation: Risk management involves anticipating risks that might affect the project schedule or the quality of the software being developed, and then taking action to avoid these risks.\r\n'),
(9, 'Q.Which of the following risk is the failure of a purchased component to perform as expected?\r\n', 'a) Product risk\r\n', 'b) Project risk\r\n', 'c) Business risk\r\n', 'd) Programming risk\r\n', 'Answer: a\r\nExplanation: Risks that affect the quality or performance of the software being developed.'),
(10, 'Q.Which of the following term is best defined by the statement: “The underlying technology on which the system is built is superseded by new technology.”?\r\n', 'a) Technology change\r\n', 'b) Product competition\r\n', 'c) Requirements change\r\n', 'd) None of the mentioned\r\n', 'Answer: a\r\nExplanation: Technology changes are common in the competitive environment of software engineering.');

-- --------------------------------------------------------

--
-- Table structure for table `operating_system`
--

CREATE TABLE IF NOT EXISTS `operating_system` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `operating_system`
--

INSERT INTO `operating_system` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.In internal fragmentation, memory is internal to a partition and :\r\n', 'a) is being used\r\n', 'b) is not being used\r\n', 'c) is always used\r\n', 'd) none of the mentioned\r\n', 'Answer: b\r\nExplanation: None.'),
(2, 'Q.A solution to the problem of external fragmentation is :\r\n', 'a) compaction\r\n', 'b) larger memory space\r\n', 'c) smaller memory space\r\n', 'd) none of the mentioned\r\n', 'Answer: a\r\nExplanation: None.'),
(3, 'Q.Another solution to the problem of external fragmentation problem is to :\r\n', 'a) permit the logical address space of a process to be noncontiguous\r\n', 'b) permit smaller processes to be allocated memory at last\r\n', 'c) permit larger processes to be allocated memory at last\r\n', 'd) all of the mentioned\r\n', 'Answer: a\r\nExplanation: None.'),
(4, 'Q.If relocation is static and is done at assembly or load time, compaction _________\r\n', 'a) cannot be done\r\n', 'b) must be done\r\n', 'c) must not be done\r\n', 'd) can be done\r\n', 'Answer: a\r\nExplanation: None.'),
(5, 'Q.he disadvantage of moving all process to one end of memory and all holes to the other direction, producing one large hole of available memory is :\r\n', 'a) the cost incurred\r\n', 'b) the memory used\r\n', 'c) the CPU used\r\n', 'd) all of the mentioned\r\n', 'Answer: a\r\nExplanation: None.'),
(6, 'Q.CPU fetches the instruction from memory according to the value of\r\n', 'a) program counter\r\n', 'b) status register\r\n', 'c) instruction register\r\n', 'd) program status word\r\n', 'Answer: a\r\nExplanation: None.'),
(7, 'Q.A memory buffer used to accommodate a speed differential is called\r\n', 'a) stack pointer\r\n', 'b) cache\r\n', 'c) accumulator\r\n', 'd) disk buffer\r\n', 'Answer: b\r\nExplanation: None.'),
(8, 'Q.Which one of the following is the address generated by CPU?\r\n', 'a) physical address\r\n', 'b) absolute address\r\n', 'c) logical address\r\n', 'd) none of the mentioned\r\n', 'Answer: c\r\nExplanation: None.'),
(9, 'Q.Run time mapping from virtual to physical address is done by\r\n', 'a) Memory management unit\r\n', 'b) CPU\r\n', 'c) PCI\r\n', 'd) None of the mentioned\r\n', 'Answer: a\r\nExplanation: None.'),
(10, 'Q.For real time operating systems, interrupt latency should be\r\n', 'a) minimal\r\n', 'b) maximum\r\n', 'c) zero\r\n', 'd) dependent on the scheduling\r\n', 'Answer: a\r\nExplanation: Interrupt latency is the time duration between the generation of interrupt and execution of its service.');

-- --------------------------------------------------------

--
-- Table structure for table `programming in c`
--

CREATE TABLE IF NOT EXISTS `programming in c` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16 NOT NULL,
  `OptionA` longtext CHARACTER SET utf16 NOT NULL,
  `OptionB` longtext CHARACTER SET utf16 NOT NULL,
  `OptionC` longtext CHARACTER SET utf16 NOT NULL,
  `OptionD` longtext CHARACTER SET utf16 NOT NULL,
  `Answer` longtext CHARACTER SET utf16 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `programming in c`
--

INSERT INTO `programming in c` (`id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q. Which of the following statements should be used to obtain a remainder after dividing 3.14 by 2.1 ?', 'A. rem = 3.14 % 2.1;', 'B. rem = modf(3.14, 2.1);\r\n', 'C.rem = fmod(3.14, 2.1);\r\n', 'D. Remainder cannot be obtain in floating point division.', 'Option C.\r\nExplanation:\r\nfmod(x,y) - Calculates x modulo y, the remainder of x/y. \r\nThis function is the same as the modulus operator. But fmod() performs floating point divisions.'),
(2, 'Q. What are the types of linkages?\r\n\r\n', 'A.Internal and External\r\n', 'B.External, Internal and None\r\n', 'C.External and None\r\n', 'D.Internal', 'Option B.\r\nExplanation:\r\nExternal Linkage-> means global, non-static variables and functions.\r\nInternal Linkage-> means static variables and functions with file scope.\r\nNone Linkage-> means Local variables.'),
(3, 'Q. The correct order of mathematical operators in mathematics and computer programming,', 'A. Addition, Subtraction, Multiplication, Division\r\n\r\n', 'B - Division, Multiplication, Addition, Subtraction\r\n\r\n', 'C - Multiplication, Addition, Division, Subtraction\r\n\r\n', 'D - Mathematical operators can be done in any order', 'Option B.\r\nExplanation:\r\nIt is BODMAS.'),
(4, 'Q. The keyword used to transfer control from a function back to the calling function is\r\n\r\n', 'A.switch\r\n', 'B.goto\r\n', 'C.go back\r\n', 'Dreturn', 'Option D.\r\nExplanation: \r\nThe keyword return is used to transfer control from a function back to the calling function.'),
(5, 'Q. What is (void*)0?\r\n\r\n', 'A.Representation of NULL pointer\r\n', 'B.Representation of void pointer\r\n', 'C.Error\r\n', 'D.None of above', 'Option A\r\nNo explanation available'),
(6, 'Q. The ‘C’ language is\r\n', 'a.Context free language\r\n', 'B.Context sensitive language\r\n', 'C.Regular language\r\n', 'D.None of the above', 'Option A.'),
(7, 'Q. Enumeration is a process of\r\n', 'A.Declaring a set of numbers\r\n', 'B. Sorting a list of strings\r\n', 'C. Assigning a legal values possible for a variable\r\n', 'D. Sequencing a list of operators', 'Option C.'),
(8, 'Q.When a programming Language has the capacity to produce new datatype, it is called as,\r\n', 'A.Overloaded Language\r\n', 'B.Extensible Language\r\n', 'C.Encapsulated Language\r\n', 'D.Abstraction Language', 'Option B.'),
(9, 'Q.The Default Parameter Passing Mechanism is called as\r\n', 'A.Call by Value\r\n', 'B.Call by Reference\r\n', 'C.Call by Address\r\n', 'D.Call by Name', 'Option A.'),
(10, 'Q.Functions defined with class name are called as\r\n', 'A.Inline function\r\n', 'B.Friend function\r\n', 'C.Constructor\r\n', 'D.Static function', 'Option C.'),
(11, 'Q.Which of the following has, compilation error in C ?\r\n', 'A.int n = 32 ;\r\n', 'B.char ch = 65 ;\r\n', 'C.float f= (float) 3.2 ;\r\n', 'D.none of the above', 'Option D.'),
(12, 'Q.What will be the output of the following ''C'' code?\r\nmain ( )\r\n{        int x = 128;\r\n          printf("\\n%d”, 1 + x ++);\r\n}\r\n', 'A.128\r\n', 'B.129', 'C.130', 'D.131', 'Option B.'),
(13, 'Q.The goal of operator overloading is\r\n', 'A.to help the user of a class\r\n', 'B.to help the developer of a class\r\n', 'C.to help define friend function\r\n', 'D.None of the above', 'Option A.'),
(14, 'Q.The data type created by the data abstraction process is called:	\r\n', 'A.class\r\n', 'B.structure\r\n', 'C.abstract data type\r\n', 'D.user defined data type', 'Option C.'),
(15, 'Q.The friend functions are used in situations where:\r\n', 'A.We want to have access to unrelated classes\r\n', 'B.Dynamic binding is required\r\n', 'C.Exchange of data between classes to take place\r\n', 'D.None of the above', 'Option C.');

-- --------------------------------------------------------

--
-- Table structure for table `simulation and modeling`
--

CREATE TABLE IF NOT EXISTS `simulation and modeling` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16 NOT NULL,
  `OptionA` longtext CHARACTER SET utf16 NOT NULL,
  `OptionB` longtext CHARACTER SET utf16 NOT NULL,
  `OptionC` longtext CHARACTER SET utf16 NOT NULL,
  `OptionD` longtext CHARACTER SET utf16 NOT NULL,
  `Answer` longtext CHARACTER SET utf16 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `simulation and modeling`
--

INSERT INTO `simulation and modeling` (`id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Simulator converts circuit information to\r\n', 'a) design plan\r\n', 'b) does verification\r\n', 'c) set of equations\r\n', 'd) floor plan\r\n', 'Answer: c\r\nExplanation: The circuit description contains information about circuit components and interconnections. This is transformed using simulator to a set of equations from which predictions of behaviour are made.\r\n'),
(2, 'Q.The electrical behaviour of a circuit is given using\r\n', 'a) design rules\r\n', 'b) floor plan\r\n', 'c) structures and layouts\r\n', 'd) mathematical modelling\r\n', 'Answer: d\r\nExplanation: The electrical behaviour is defined by mathematical modelling and its accuracy is measured using accuracy of simulation and computing power and time for simulation.\r\n'),
(3, 'Q.Which gives the main electrical behaviour of various parts of circuit?\r\n', 'a) circuit simulator\r\n', 'b) timing simulator\r\n', 'c) logic level simulator\r\n', 'd) functional simulator\r\n', 'Answer: a\r\nExplanation: Circuit simulators are concerned with the electrical behaviour of the various parts of the circuit to be implemented in silicon.'),
(4, 'Q.Which takes lots of simulating time?\r\n', 'a) circuit simulator\r\n', 'b) timing simulator\r\n', 'c) logic level simulator\r\n', 'd) functional simulator\r\n', 'Answer: a\r\nExplanation: Circuit simulators takes lot of computing time to simulate even small section of system and are completely impractical for circuits of any real magnitude.'),
(5, 'Q.Timing simulator concentrates on\r\n', 'a) quiescent nodes\r\n', 'b) active nodes\r\n', 'c) passive nodes\r\n', 'd) electrical nodes\r\n', 'Answer: b\r\nExplanation: Timing simulator concentrates on active nodes and ignores the quiescent nodes in simulation and improves the design accordingly.'),
(6, 'Q.The accuracy of simulation depends on accuracy of\r\n', 'a) fabrication house parameters\r\n', 'b) electrical parameters\r\n', 'c) active parameters\r\n', 'd) functional parameters\r\n', 'Answer: a\r\nExplanation: The accuracy of simulation depends on accuracy of fabrication house parameters which must be fed into the simulator which is in the range of 20% or better.'),
(7, 'Q.Which is important during the design phase?\r\n', 'a) circuit simulator\r\n', 'b) timing simulator\r\n', 'c) logic level simulator\r\n', 'd) functional simulator\r\n', 'Answer: b\r\nExplanation: Timing simulators are increasingly important during the design phase because of their speed and consequent interactive qualities.'),
(8, 'Q.Improvement of transistor modelling includes\r\n', 'a) body effect\r\n', 'b) channel length modulation\r\n', 'c) carrier velocity saturation\r\n', 'd) all of the mentioned\r\n', 'Answer: d\r\nExplanation: To improve the transistor modelling it is possible to include body effect, channel length modulation and carrier velocity saturation.\r\n'),
(9, 'Q.Channel length modulation is for voltages\r\n', 'a) exceeding threshold\r\n', 'b) exceeding onset of saturation\r\n\r\n', 'c) exceeding power supply\r\n', 'd) exceeding onset of non saturation\r\n', 'Answer: b\r\nExplanation: Channel length modulation is for voltages exceeding the onset of saturation there is an effective decrease in channel lengthof a short channel transistor.'),
(10, 'Q.Less current is available from\r\n', 'a) short channel transistor\r\n', 'b) large channel transistor\r\n', 'c) very large channel transistor\r\n', 'd) does not depend on channel transistor\r\n', 'Answer: a\r\nExplanation: Less current is available from a short channel transistor than from a long channel transistor with similar width to length ratio and processing.');

-- --------------------------------------------------------

--
-- Table structure for table `social and professional issues in it`
--

CREATE TABLE IF NOT EXISTS `social and professional issues in it` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `social and professional issues in it`
--

INSERT INTO `social and professional issues in it` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.Which of these is the external sounds present in the channels of communication?\r\n', 'a) Noise\r\n', 'b) Semantic problems\r\n', 'c) Cultural barriers\r\n', 'd) Over communication\r\n', 'Answer: a\r\nExplanation: Noise is the external sounds present in the channels of communication, which results in the reduction of the audibility or omission of some words from the message.\r\n'),
(2, 'Q.Which of these should not be avoided for effective communication?\r\n\r\n', 'a) Noise\r\n', 'b) Planning\r\n', 'c) Semantic problems\r\n', 'd) Wrong assumptions\r\n', 'Answer: b\r\nExplanation: Lack of planning must be avoided for effects communication. There are innumerable examples of people who would give an ill planned, long winding lecture while a short presentation with tables or graphs would be sufficient.'),
(3, 'Q.In which of these problems, the actual message is lost in the jungle of information?\r\n', 'a) Selecting perception\r\n', 'b) Over communication\r\n', 'c) Under communication\r\n', 'd) Filtering\r\n', 'Answer: b\r\nExplanation: In the case of over communication, the actual message is lost in the jungle of information whereas in under communication the sender is blamed for sharing less information.\r\n'),
(4, 'Q. _______ means to impart understanding of the message.\r\n', 'a) Encoding\r\n', 'b) Receiver\r\n', 'c) Decoding\r\n', 'd) Feedback\r\n', 'Answer: c\r\nExplanation: The correct statement is: Decoding means to impart understanding of the message. Receiver has to identify the person, words symbols, etc..'),
(5, 'Q.When is the communication process complete?\r\n', 'a) When the sender transmits the message\r\n', 'b) When the message enters the channel\r\n', 'c) When the message leaves the channel\r\n', 'd) When the receiver understands the message.\r\n', 'Answer: d\r\nExplanation: Communication is complete only when the receiver understands the message. Many communication problems arise because of misunderstandings.'),
(6, 'Q.Which of these must be avoided for effective communication?\r\n', 'a) Sharing of activity\r\n', 'b) Listening\r\n', 'c) Ambiguity\r\n', 'd) Politeness\r\n', 'Answer: c\r\nExplanation: The sender of the message should be careful to see that the receiver does not have to go beyond the text of the message. Ambiguities must be avoided.'),
(7, 'Q.Which of these is not a commandment of effective communication?\r\n', 'a) Clarity in language\r\n', 'b) Listen poorly\r\n', 'c) Home communication skills\r\n', 'd) Adequate medium\r\n', 'Answer: b\r\nExplanation: In order to ensure an effective communication one must take care of ten commandments: Clarity in language, home communication skills, listen attentively, etc..\r\n'),
(8, 'Q.What is internet?\r\n', 'a) a single network\r\n', 'b) a vast collection of different networks\r\n', 'c) interconnection of local area networks\r\n', 'd) none of the mentioned\r\n', 'Answer: b\r\nExplanation: None.'),
(9, 'Q.Internet access by transmitting digital data over the wires of a local telephone network is provided by\r\n', 'a) leased line\r\n', 'b) digital subscriber line\r\n', 'c) digital signal line\r\n', 'd) none of the mentioned\r\n', 'Answer: b\r\nExplanation: None.'),
(10, 'Q.ISP exchanges internet traffic between their networks by\r\n', 'a) internet exchange point\r\n', 'b) subscriber end point\r\n', 'c) isp end point\r\n', 'd) none of the mentioned\r\n', 'Answer: a\r\nExplanation: None.');

-- --------------------------------------------------------

--
-- Table structure for table `theory of computation`
--

CREATE TABLE IF NOT EXISTS `theory of computation` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Question` longtext CHARACTER SET utf16,
  `OptionA` longtext CHARACTER SET utf16,
  `OptionB` longtext CHARACTER SET utf16,
  `OptionC` longtext CHARACTER SET utf16,
  `OptionD` longtext CHARACTER SET utf16,
  `Answer` longtext CHARACTER SET utf16,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `theory of computation`
--

INSERT INTO `theory of computation` (`Id`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Q.How many strings of length less than 4 contains the language described by the regular expression (x+y)*y(a+ab)*?\r\n', 'a) 7\r\n', 'b) 10\r\n', 'c) 12\r\n', 'd) 11\r\n', 'Answer : d\r\nExplanation : string of length 0 = 1\r\nstring of length 1 = 4\r\nstring of length 2 = 3\r\nstring of length 3 = 3'),
(2, 'Q.Which of the following is true?\r\n', 'a) (01)*0 = 0(10)*\r\n', 'b) (0+1)*0(0+1)*1(0+1) = (0+1)*01(0+1)*\r\n', 'c) (0+1)*01(0+1)*+1*0* = (0+1)*\r\n', 'd) All of the mentioned\r\n', 'Answer : d\r\nExplanation : None.'),
(3, 'Q.A language is regular if and only if\r\n', 'a) accepted by DFA\r\n', 'b) accepted by PDA\r\n', 'c) accepted by LBA\r\n', 'd) accepted by Turing machine\r\n', 'Answer : a\r\nExplanation : All of above machine can accept regular language but all string accepted by machine is regular only for DFA.'),
(4, 'Q.Regular grammar is\r\n', 'a) context free grammar\r\n', 'b) non context free grammar\r\n', 'c) english grammar\r\n', 'd) none of the mentioned\r\n', 'Answer : a\r\nExplanation : Regular grammar is subset of context free grammar.'),
(5, 'Q.Let the class of language accepted by finite state machine be L1 and the class of languages represented by regular expressions be L2 then\r\n', 'a) L1<L2\r\n', 'b) L1>=L2\r\n', 'c) L1 U L2 = .*\r\n', 'd) L1=L2\r\n', 'Answer : d\r\nExplanation : Finite state machine and regular expression have same power to express a language.'),
(6, 'Q.Which of the following is not a regular expression?\r\n', 'a) [(a+b)*-(aa+bb)]*\r\n', 'b) [(0+1)-(0b+a1)*(a+b)]*\r\n', 'c) (01+11+10)*\r\n', 'd) (1+2+0)*(1+2)*\r\n', 'Answer : b\r\nExplanation : Except b all are regular expression*.'),
(7, 'Q.Regular expression are\r\n', 'a) Type 0 language\r\n', 'b) Type 1 language\r\n', 'c) Type 2 language\r\n', 'd) Type 3 language\r\n', 'Answer : a\r\nExplanation : According to Chomsky hierarchy .'),
(8, 'Q.L and ~L are recursive enumerable then L is\r\n', 'a) Regular\r\n', 'b) Context free\r\n', 'c) Context sensitive\r\n', 'd) Recursive\r\n', 'Answer : d\r\nExplanation :If L is recursive enumerable and its complement too if and only if L is recursive.'),
(9, 'Q.Regular expressions are closed under\r\n', 'a) Union\r\n', 'b) Intersection\r\n', 'c) Kleen star\r\n', 'd) All of the mentioned\r\n', 'nswer : d\r\nExplanation : According to definition of regular expression.'),
(10, 'Q.A PDA machine configuration (p, w, y) can be correctly represented as:\r\n', 'a) (current state, unprocessed input, stack content)\r\n', 'b) (unprocessed input, stack content, current state)\r\n', 'c) (current state, stack content, unprocessed input)\r\n', 'd) none of the mentioned\r\n', 'Answer: a\r\nExplanation: A machine configuration is an element of K×S*×G*.\r\n(p,w,?) = (current state, unprocessed input, stack content).');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
