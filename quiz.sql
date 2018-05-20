/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.0.37-community-nt : Database - quiz
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`quiz` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `quiz`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `USERNAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) default NULL,
  PRIMARY KEY  (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`USERNAME`,`PASSWORD`) values ('admin','admin'),('Shubham','jain');

/*Table structure for table `exam_questions` */

DROP TABLE IF EXISTS `exam_questions`;

CREATE TABLE `exam_questions` (
  `Question_ID` int(30) NOT NULL,
  `Subject_Name` varchar(30) default NULL,
  `Questions` varchar(200) NOT NULL default 'null',
  `OptionA` varchar(50) NOT NULL default 'null',
  `OptionB` varchar(50) NOT NULL default 'null',
  `OptionC` varchar(50) NOT NULL default 'null',
  `OptionD` varchar(50) NOT NULL default 'null',
  `Ans` varchar(30) NOT NULL default 'null'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `exam_questions` */

insert  into `exam_questions`(`Question_ID`,`Subject_Name`,`Questions`,`OptionA`,`OptionB`,`OptionC`,`OptionD`,`Ans`) values (1,'THEORY OF COMPUTATION','WHAT IS THE FULL FORM OF DFA?','DETERMINISTIC FINITE MACHINE','DECLARATIVE FINITE MACHINE','DIFFERENTIAL FINITE MACHINE','NONE OF THESE','1'),(2,'COMPUTER NETWORK','WHAT IS THE FULL FORM OF TCP?','TRANSPORT CONTROL PROTOCOL','TRANSMISSION CONTROL PROCESS','TRANSMISSION CONTROL PROTOCOL','ALL OF THESE','3'),(4,'python','PYTHON IS AN OOP LANG ??','YES','NO','YES AND NO','NONE OF THESE','1'),(5,'python','PYTHON IS USED IN ??','AI','ML','A & B','NEITHER A NOR B','4'),(6,'python','PYTHON IS ','EASY','MEDIUM','DIFFICULT','NONE OF THESE','6'),(7,'python code','CODE TO ADD 2 NO IN PYTHON?','PRINT 2+3','PUTS 2+3','PRINTF  2+3','NONE OF THESE','6'),(8,'python code','IN PYTHON P STANDS FOR','A','C','B','NONE OF THESE','6'),(9,'java','WHAT IS CORRECT SYNTAX FOR MAIN METHOD OF A JAVA CLASS?','PUBLIC STATIC INT MAIN','PUBLIC INT MAIN','P.S.V.M(STRING ARGS)','NONE OF THESE','1'),(10,'java','JAVA IS','EASY','MODERATE','TOUGH','EXTREAMLY TOUGH','2'),(12,'DIGITAL COMMUNICATION','FHGFJHFTY','YT','GUY','CCB ','NONE OF THESE','6'),(13,'DIGITAL COMMUNICATION','FFFF','F','G','H','D','1'),(15,'CA','FULL FORM OF CA?','COMPUTER ARCHITECTURE','CHARTED ARCHITECTURE','COMPUTER ACOOUNTANT','NONE OF THESE','1'),(16,'DIGITAL COMMUNICATION','IN QPSK Q IS?		 ','QUADRATIC','QUADRATURE','QUESTION','NONE OF THESE','2'),(17,'MS','FULL FORM OF MS?','MASTER OF SCIENCE','MATERIAL SCIENCE','MOOLEY SYSTEM','MEERE SYSTEM','2'),(18,'COMPUTER ARCHITECTURE','HOW MANY BASIC REGISTERS ARE THERE?','1','2','4','5','3'),(19,'PPL','WHICH IS NOT A PARADIGM?','FUNCTIONAL','IMPERATIVE','ITERATIVE','OBJECT ORIENTED','3'),(20,'COMPUTER NETWORK','HOW MANY LAYERS A TCP/IP MODEL HAVE? ','4','3','7','5','4'),(21,'python','PYTHON FOLLOWS','OOP','POP','LOGICAL','NONE OF THESE','1'),(22,'python','\"P\" IN PYTHON STANDS FOR','PROCEDURAL','PROGRESS','PROVISIONAL','NONE OF THESE','6'),(23,'python','PYTHON IS BASED ON ','JAVA','C++','C','NONE OF THESE','4'),(24,'python','PYTHN IS A ','PROGRAMING LANGUAGE','FRAMEWORK','APPLICATION','NONE OF THESE','1'),(25,'python','WHAT IS PYTHON','INTERPRETED LANGUAGE','DYNAMICALLY TYPED','OBJECT ORIENTED','ALL OF THESE','4'),(26,'python',' WHICH OF THE FOLLOWING DATA TYPES IS NOT SUPPORTED IN PYTHON?','NUMBERS','STRING','LISTS','SLICE','1'),(27,'python','WHAT IS THE OUTPUT OF PRINT TINYLIST * 2 IF TINYLIST = 123, JOHN','123, JOHN, 123, JOHN','123, JOHN  2','ERROR','NONE OF THESE','1'),(28,'python','WHICH OF THE FOLLOWING FUNCTION CONVERT AN OBJECT TO A STRING IN PYTHON?','INT(X [,BASE])','LONG(X [,BASE] )','FLOAT(X)','STR(X)','1'),(29,'python','WHICH OF THE FOLLOWING FUNCTION CONVERT AN INTEGER TO AN UNICODE CHARACTER IN PYTHON?','UNICHR(X)','ORD(X)','HEX(X)','OCT(X)','1'),(30,'python','WHICH OF THE FOLLOWING STATEMENT TERMINATES THE LOOP STATEMENT AND TRANSFERS EXECUTION TO THE STATEMENT IMMEDIATELY FOLLOWING THE LOOP?','BREAK','CONTINUE','PASS','NONE OF THESE','1'),(31,'python','WHICH OF THE FOLLOWING FUNCTION CHECKS IN A STRING THAT ALL CHARACTERS ARE WHITESPACES?','ISLOWER()','ISNUMERIC()','ISTITLE()','ISTITLE()','1'),(32,'PPL','DO YOU KNOW SOCKET PROGRAMMING?		','NO','YES','NO ONE TAUGHT US','NONE','3'),(33,'java','GJH','AA','SS','DD','EE','3');

/*Table structure for table `exam_setup` */

DROP TABLE IF EXISTS `exam_setup`;

CREATE TABLE `exam_setup` (
  `Exam_ID` int(10) NOT NULL,
  `Exam_Name` varchar(30) NOT NULL,
  `No_Ques` int(10) NOT NULL,
  `Marks` int(10) NOT NULL,
  `Negative` int(5) NOT NULL,
  `Time` int(50) NOT NULL,
  PRIMARY KEY  (`Exam_ID`,`Exam_Name`,`Time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `exam_setup` */

insert  into `exam_setup`(`Exam_ID`,`Exam_Name`,`No_Ques`,`Marks`,`Negative`,`Time`) values (1,'THEORY OF COMPUTATION',11,10,5,5),(2,'python',10,5,2,15),(3,'COMPUTER NETWORK',1,4,2,5),(4,'MS',4,2,0,5),(5,'CA',30,2,1,30),(6,'DIGITAL COMMUNICATION',10,2,1,20),(7,'java',10,2,3,25);

/*Table structure for table `newuser` */

DROP TABLE IF EXISTS `newuser`;

CREATE TABLE `newuser` (
  `Name` varchar(30) NOT NULL,
  `Gender` varchar(11) NOT NULL,
  `Enrollment_No` varchar(20) NOT NULL default '',
  `Phone_no` varchar(13) NOT NULL,
  `E_mail_Address` varchar(30) default '',
  `Password` varchar(30) default '',
  PRIMARY KEY  (`Enrollment_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `newuser` */

insert  into `newuser`(`Name`,`Gender`,`Enrollment_No`,`Phone_no`,`E_mail_Address`,`Password`) values ('shubham jain','Male','0812IT151054','8871574375','shubhamjain2908@gmail.com','12345'),('dany','Female','08272199810','89172146738','motherofdragons@got','jonsnow'),('Wonder Woman','Female','0987654321','9876543210','WW@dc.com','galgadot'),('shubham','Male','1','8872628192','sjain12@gmail.com','1234'),('Jon','male','123','73287329923','sjdks@jsak.com','1234'),('s','male','1234','63726','sjain@gmail.com','sjain'),('shubham','male','12345','8871574','jain@oulook.com','jainsabh'),('ABC','Male','1234567','12345678','Gmail@pankaj.acom','12345'),('monil','Male','5555','7897897897','monilsahu10@gmail.com','monil');

/*Table structure for table `result` */

DROP TABLE IF EXISTS `result`;

CREATE TABLE `result` (
  `Enrollment_No` varchar(20) default NULL,
  `Exam_Name` varchar(30) default NULL,
  `Time` int(30) default NULL,
  `Total_Questions` int(10) default NULL,
  `Question_Attempted` int(10) default NULL,
  `Correct_Attempts` int(10) default NULL,
  `Wrong_Attempts` int(10) default NULL,
  `Max_marks` int(10) default NULL,
  `Marks_Achieved` int(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `result` */

insert  into `result`(`Enrollment_No`,`Exam_Name`,`Time`,`Total_Questions`,`Question_Attempted`,`Correct_Attempts`,`Wrong_Attempts`,`Max_marks`,`Marks_Achieved`) values ('1','N',12,NULL,24,20,4,24,16),('2','f',10,NULL,20,15,5,20,15),('123','python',15,15,3,2,1,50,10),('1234','python',15,15,4,3,1,50,15),('5555','python',15,10,3,2,1,50,10),('5555','python',15,10,10,0,10,50,-18),('5555','python',15,10,9,5,4,50,17),('1234','python',15,10,16,0,16,50,-30);

/*Table structure for table `subject_reg` */

DROP TABLE IF EXISTS `subject_reg`;

CREATE TABLE `subject_reg` (
  `Subject_CODE` varchar(7) NOT NULL default '',
  `Subject_Name` varchar(30) NOT NULL default '',
  PRIMARY KEY  (`Subject_CODE`,`Subject_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `subject_reg` */

insert  into `subject_reg`(`Subject_CODE`,`Subject_Name`) values ('113','python'),('123','java'),('220','CA'),('334','python code'),('ES-220','MS'),('IT-224','COMPUTER ARCHITECTURE'),('IT-5001','THEORY OF COMPUTATION'),('IT-5002','PPL'),('IT-5003','COMPUTER NETWORK'),('IT-5004','DIGITAL COMMUNICATION'),('it555','sap');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
