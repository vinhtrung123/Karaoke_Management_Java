CREATE DATABASE QL_Karaoke

CREATE TABLE Users (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    Username NVARCHAR(50),
    Passwords NVARCHAR(50),
    AccessLevel NVARCHAR(50)
);

CREATE TABLE PHONG (
    MAPHONG  NVARCHAR(20) PRIMARY KEY,
    TRANGTHAI INT,
    ThoiGianBatDau DATETIME,
    GiaGio DECIMAL(18,0) NOT NULL
);

CREATE TABLE DichVu (
     ID INT IDENTITY(1,1) PRIMARY KEY,
     TENDV  NVARCHAR(20),
	 DONGIA DECIMAL(18,0),
	 LOAIDV NVARCHAR(20),
);

CREATE TABLE DichVuThem (
     ID INT IDENTITY(1,1) PRIMARY KEY,
	 MAPHONG NVARCHAR(20),
     TENDV NVARCHAR(20),
	 DONGIA DECIMAL(18,0),
	 SOLUONG INT,
	 THANHTIEN DECIMAL(18,0) NOT NULL,
     CONSTRAINT FK_DichVuThem_Ban FOREIGN KEY (MAPHONG) REFERENCES PHONG(MAPHONG),
);

CREATE TABLE HoaDon (
    MAHD INT PRIMARY KEY IDENTITY(1,1),
	MAPHONG NVARCHAR(20),
    NGAYLAP DATE NOT NULL,
	TONGCONG DECIMAL(18,0) NOT NULL,
	GiamGia int,
    TONGTIEN DECIMAL(18,0) NOT NULL,
    CONSTRAINT FK_HoaDon_Ban FOREIGN KEY (MAPHONG) REFERENCES PHONG(MAPHONG)
);

CREATE TABLE CTHD (
    MACTHD INT PRIMARY KEY IDENTITY(1,1),
    MAHD INT,
    TENDV NVARCHAR(20),
	DONGIA DECIMAL(18,0),
    SOLUONG INT,
    THANHTIEN DECIMAL(18,0) NOT NULL,
    CONSTRAINT FK_CTHD_HoaDon FOREIGN KEY (MAHD) REFERENCES HoaDon(MAHD),
);



-- Insert data into USERS table
INSERT INTO USERS (Username, Passwords, AccessLevel) VALUES
('TrangMinh', '789', 'Admin'),
('BaoNgoc', '123', 'staff');

-- Insert data into Ban table
INSERT INTO PHONG(MAPhong, TRANGTHAI, ThoiGianBatDau, GiaGio) VALUES
('1', 0, GETDATE(), 150000),
('2', 0, GETDATE(), 150000),
('3', 0, GETDATE(), 150000),
('4', 0, GETDATE(), 150000),
('5', 0, GETDATE(), 150000),
('6', 0, GETDATE(), 150000),
('vip1', 0, GETDATE(), 250000),
('vip2', 0, GETDATE(),  250000),
('vip3', 0, GETDATE(),  250000);


-- Insert data into DICHVU table
INSERT INTO DICHVU (TENDV, DONGIA,LOAIDV) VALUES
(N'7up', 20000,1),
(N'Bia Heniken', 25000,1),
(N'Bia tiger Nâu', 25000,1),
(N'Bia Tiger Bạc', 20000,1),
(N'7up', 20000,1),
(N'coca', 20000,1),
(N'mì gói', 20000,0),
(N'mì trứng', 20000,0),
(N'combo trái cây lớn', 300000,0),
(N'combo trái cây nhỏ', 200000,0),
(N'pepsi', 20000,1),
(N'trứng thêm', 10000,0),
(N'trà đá đường', 25000,1),
(N'trà đá', 20000,1);

