package sqlExercises;
//https://en.wikibooks.org/wiki/SQL_Exercises/The_computer_store
public class Exercise1 {
}

/*CREATE TABLE Manufacturers (
  Code INTEGER,
  Name VARCHAR(255) NOT NULL,
  PRIMARY KEY (Code)
);

CREATE TABLE Products (
  Code INTEGER,
  Name VARCHAR(255) NOT NULL ,
  Price DECIMAL NOT NULL ,
  Manufacturer INTEGER NOT NULL,
  PRIMARY KEY (Code),
  FOREIGN KEY (Manufacturer) REFERENCES Manufacturers(Code)
);
INSERT INTO Manufacturers(Code,Name) VALUES(1,'Sony');
INSERT INTO Manufacturers(Code,Name) VALUES(2,'Creative Labs');
INSERT INTO Manufacturers(Code,Name) VALUES(3,'Hewlett-Packard');
INSERT INTO Manufacturers(Code,Name) VALUES(4,'Iomega');
INSERT INTO Manufacturers(Code,Name) VALUES(5,'Fujitsu');
INSERT INTO Manufacturers(Code,Name) VALUES(6,'Winchester');

INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(1,'Hard drive',240,5);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(2,'Memory',120,6);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(3,'ZIP drive',150,4);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(4,'Floppy disk',5,6);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(5,'Monitor',240,1);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(6,'DVD drive',180,2);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(7,'CD drive',90,2);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(8,'Printer',270,3);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(9,'Toner cartridge',66,3);
INSERT INTO Products(Code,Name,Price,Manufacturer) VALUES(10,'DVD burner',180,2);

--select Name from Products;
--select Name, Price from Products
--select Name from Products where Price<=200
--select * from Products where Price between 60 and 120
--select Name, Price*100 As PriceCents from Products
--select AVG(Price) from Products
--select AVG(Price) from Products where Manufacturer=2
--select Count(*) from Products where Price>=180
--select Name,Price from Products where Price>=180 order by Price desc, Name asc
--select * from Products p inner join Manufacturers m on p.Manufacturer= m.Code
--select p.Name, p.Price, m.Name from Products p inner join Manufacturers m on p.Manufacturer= m.Code
--select avg(Price), Manufacturer from Products group by Manufacturer
--select avg(p.Price), m.Name from Products p inner join Manufacturers m on p.Manufacturer= m.Code group by m.Name having avg(Price)>=150
--select Name ,Price from Products where Price = (select min(Price) from Products)
--select m.Name, p.Name, p.Price from Manufacturers m inner join Products p on m.Code = p.Manufacturer where p.Price= (select max(Price) from Products p where p.Manufacturer = m.Code)
--insert into Products(Code,Name,Price,Manufacturer) Values(11, 'LoudSpeakers', 70, 2);

--update Products set Name='Laser Printer' where Code=8;
--select * from Products
update Products set Price= Price - (0.1*Price);
select * from Products
*/
