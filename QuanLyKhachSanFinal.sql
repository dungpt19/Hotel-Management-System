USE [master]
GO
/****** Object:  Database [QuanLyKhachSan]    Script Date: 23/10/2022 18:58:27 ******/
CREATE DATABASE [QuanLyKhachSan]
GO
ALTER DATABASE [QuanLyKhachSan] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyKhachSan].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyKhachSan] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyKhachSan] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyKhachSan] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanLyKhachSan] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyKhachSan] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyKhachSan] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyKhachSan] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [QuanLyKhachSan]
GO
/****** Object:  Table [dbo].[ChiTietDichVu]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietDichVu](
	[MaCTDV] [int] IDENTITY(1,1) NOT NULL,
	[MaDatPhong] [int] NOT NULL,
	[MaDichVu] [nvarchar](50) NOT NULL,
	[DonGia] [money] NOT NULL,
	[SoLuong] [float] NOT NULL CONSTRAINT [DF_ChiTietDichVu_SoLuong]  DEFAULT ((1)),
	[ThanhTien] [money] NULL,
 CONSTRAINT [PK_ChiTietDichVu] PRIMARY KEY CLUSTERED 
(
	[MaCTDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietLuong]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietLuong](
	[MaChiTietLuong] [nvarchar](50) NOT NULL,
	[MaNhanVien] [nvarchar](50) NULL,
	[SoNgayNghi] [int] NULL,
	[SoNgayLam] [int] NULL,
	[NgayNhanLuong] [date] NULL,
	[TongNhan] [money] NULL,
 CONSTRAINT [PK_NhanLuong] PRIMARY KEY CLUSTERED 
(
	[MaChiTietLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[DatPhong]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DatPhong](
	[MaDatPhong] [int] IDENTITY(1,1) NOT NULL,
	[MaKhachHang] [nvarchar](50) NOT NULL,
	[MaPhong] [nvarchar](50) NOT NULL,
	[LoaiHinhThue] [bit] NULL,
	[NgayThue] [datetime] NULL CONSTRAINT [DF_DatPhong_NgayThue]  DEFAULT (getdate()),
	[NgayRaDuKien] [datetime] NULL,
	[SoNguoi] [int] NULL CONSTRAINT [DF_DatPhong_SoNguoi]  DEFAULT ((1)),
	[TenUser] [nvarchar](50) NOT NULL,
	[TinhTrang] [nvarchar](50) NULL CONSTRAINT [DF_DatPhong_TinhTrang]  DEFAULT (N'Chưa thanh toán'),
	[TienDatCoc] [money] NULL CONSTRAINT [DF_DatPhong_TienDatCoc]  DEFAULT ((0)),
 CONSTRAINT [PK_DatPhong] PRIMARY KEY CLUSTERED 
(
	[MaDatPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MaDichVu] [nvarchar](50) NOT NULL,
	[TenDichVu] [nvarchar](50) NOT NULL,
	[DonVi] [nvarchar](50) NOT NULL,
	[DonGia] [money] NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_DichVu] PRIMARY KEY CLUSTERED 
(
	[MaDichVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[MaDatPhong] [int] NOT NULL,
	[TenUser] [nvarchar](50) NOT NULL,
	[TenKhachHang] [nvarchar](50) NOT NULL,
	[MaPhong] [nvarchar](50) NOT NULL,
	[SoNgayThue] [float] NULL,
	[SoGioThue] [float] NULL,
	[TienPhong] [money] NULL,
	[PhuThuCheckin] [money] NULL,
	[PhuThuCheckout] [money] NULL,
	[TienDichVu] [money] NULL,
	[ThanhTien] [money] NOT NULL,
	[NgayThanhToan] [date] NULL,
	[GhiChu] [nvarchar](max) NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Khac]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khac](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[GiaTriSo] [float] NULL,
	[GiaTriTG] [time](7) NULL,
	[MoTa] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKhachHang] [nvarchar](50) NOT NULL,
	[MaLoaiKH] [nvarchar](50) NOT NULL,
	[TenKhachHang] [nvarchar](50) NOT NULL,
	[Tuoi] [int] NULL,
	[GioiTinh] [bit] NULL CONSTRAINT [DF_KhachHang_GioiTinh]  DEFAULT ('true'),
	[SoDienThoai] [char](10) NULL CONSTRAINT [DF_KhachHang_SoDienThoai]  DEFAULT (N'0123456789'),
	[SoCMND] [char](12) NULL CONSTRAINT [DF_KhachHang_SoCMND]  DEFAULT (N'123456789111'),
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[LoaiKhachHang]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhachHang](
	[MaLoaiKH] [nvarchar](50) NOT NULL,
	[TenLoaiKH] [nvarchar](50) NOT NULL,
	[TienGiam] [int] NULL,
	[MoTa] [nvarchar](max) NULL,
 CONSTRAINT [PK_LoaiKhachHang] PRIMARY KEY CLUSTERED 
(
	[MaLoaiKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiPhong]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiPhong](
	[MaLoaiPhong] [nvarchar](50) NOT NULL,
	[TenLoaiPhong] [nvarchar](50) NOT NULL,
	[GiuongDon] [int] NULL,
	[GiuongDoi] [int] NULL,
	[GiaTheoGio] [money] NULL,
	[GiaTheoNgay] [money] NULL,
 CONSTRAINT [PK_LoaiPhong] PRIMARY KEY CLUSTERED 
(
	[MaLoaiPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Luong]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Luong](
	[MaLuong] [nvarchar](50) NOT NULL,
	[LuongTheoGio] [money] NOT NULL,
	[SoGioLam] [int] NOT NULL,
	[GhiChu] [nvarchar](max) NULL CONSTRAINT [DF_Luong_NgayBatDauLam]  DEFAULT (getdate()),
 CONSTRAINT [PK_Luong] PRIMARY KEY CLUSTERED 
(
	[MaLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [nvarchar](50) NOT NULL,
	[TenNhanVien] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NULL CONSTRAINT [DF_NhanVien_GioiTinh]  DEFAULT ('true'),
	[NgaySinh] [date] NULL,
	[SoDienThoai] [char](10) NULL,
	[MaLuong] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[Hinh] [nvarchar](max) NULL,
	[NgayBatDauLam] [date] NULL CONSTRAINT [DF_NhanVien_NgayBatDauLam]  DEFAULT (getdate()),
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [nvarchar](50) NOT NULL,
	[MaLoaiPhong] [nvarchar](50) NOT NULL,
	[DienTich] [int] NULL,
	[MaTang] [int] NULL CONSTRAINT [DF_Phong_MaTang]  DEFAULT ((1)),
	[GiuongDon] [int] NULL CONSTRAINT [DF_Phong_GiuongDon]  DEFAULT ((0)),
	[GiuongDoi] [int] NULL CONSTRAINT [DF_Phong_GiuongDoi]  DEFAULT ((0)),
	[Hinh] [nvarchar](max) NULL,
	[TinhTrang] [nvarchar](50) NULL CONSTRAINT [DF_Phong_TinhTrang]  DEFAULT (N'trống'),
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_Phong] PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [nvarchar](50) NOT NULL,
	[TenQuyen] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[User]    Script Date: 23/10/2022 18:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[TenUser] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](50) NULL,
	[NgayLap] [date] NOT NULL CONSTRAINT [DF_User_NgayLap]  DEFAULT (getdate()),
	[MaQuyen] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
	[MaNhanVien] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[TenUser] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[ChiTietDichVu] ON

SET IDENTITY_INSERT [dbo].[ChiTietDichVu] OFF
INSERT [dbo].[ChiTietLuong] ([MaChiTietLuong], [MaNhanVien], [SoNgayNghi], [SoNgayLam], [NgayNhanLuong], [TongNhan]) VALUES (N'1', N'NV1', 0, 3, CAST(N'2022-06-24' AS Date), 445000.0000)

SET IDENTITY_INSERT [dbo].[DatPhong] ON 

INSERT [dbo].[DatPhong] ([MaDatPhong], [MaKhachHang], [MaPhong], [LoaiHinhThue], [NgayThue], [NgayRaDuKien], [SoNguoi], [TenUser], [TinhTrang], [TienDatCoc]) VALUES (1, N'KH02', N'001', 0, CAST(N'2012-06-27 13:18:12.170' AS DateTime), NULL, 1, N'admin', N'PAID', NULL)
INSERT [dbo].[DatPhong] ([MaDatPhong], [MaKhachHang], [MaPhong], [LoaiHinhThue], [NgayThue], [NgayRaDuKien], [SoNguoi], [TenUser], [TinhTrang], [TienDatCoc]) VALUES (2, N'KH01', N'010', 0, CAST(N'2012-06-29 13:18:12.170' AS DateTime), NULL, 1, N'tinphan', N'UNPAID', NULL)

SET IDENTITY_INSERT [dbo].[DatPhong] OFF
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'DV01', N'SPA', N'service', 60, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'DV02', N'Coca', N'can', 2, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'DV03', N'Washing Clothes', N'kg', 5, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'DV04', N'Beer', N'can', 3, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'DV05', N'Kayak', N'service', 70, N'')

SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (1, 002, N'admin', N'Phan Hoàng Trọng Tín', N'002', 0, 1, 70000.0000, NULL, NULL, 0.0000, 70000.0000, CAST(N'2022-04-14' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (2, 014, N'admin', N'Phan Hoàng Trọng Tín', N'001', 0, 1, 60000.0000, NULL, NULL, 0.0000, 60000.0000, CAST(N'2019-05-17' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (3, 013, N'admin', N'Phan Hoàng Trọng Tín', N'001', 0, 1, 60000.0000, NULL, NULL, 474000.0000, -466000.0000, NULL, NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (4, 004, N'tinphan', N'Phan Hoàng Trọng Tín', N'004', 0, 1, 90000.0000, 0.0000, 0.0000, 0.0000, 90000.0000, CAST(N'2022-11-26' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (5, 009, N'tinphan', N'Nguyễn Văn Tàig', N'001', 2, 0, 400000.0000, 0.0000, 0.0000, 0.0000, 285000.0000, CAST(N'2022-12-07' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (6, 010, N'admin', N'Nguyễn Văn Tàic', N'005', 10, 0, 10000000.0000, 0.0000, 0.0000, 120000.0000, 10120000.0000, CAST(N'2022-12-07' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (7, 001, N'admin', N'Nguyễn Văn Tài', N'006', 15, 0, 3000000.0000, 0.0000, 100000.0000, 32000.0000, 3132000.0000, CAST(N'2022-12-11' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (8, 019, N'tinphan', N'Nguyễn Văn Tài', N'002', 1, 0, 300000.0000, 0.0000, 150000.0000, 40000.0000, -10000.0000, CAST(N'2022-12-12' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (9, 015, N'tinphan', N'Nguyễn Văn Tài', N'002', 0, 22, 1540000.0000, 0.0000, 0.0000, 0.0000, 1386000.0000, CAST(N'2022-12-22' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (10, 012, N'tinphan', N'Nguyễn Văn Tài', N'005', 1, 2, 1000000.0000, 0.0000, 0.0000, 33000.0000, 933000.0000, CAST(N'2022-12-23' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (11, 003, N'tinphan', N'Nguyễn Văn Tài', N'001', 1, 2, 200000.0000, 0.0000, 0.0000, 434000.0000, 534000.0000, CAST(N'2022-12-23' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (12, 004, N'admin', N'Trương Quang Huy', N'006', 5, 0, 1000000.0000, 60000.0000, 100000.0000, 20000.0000, 1180000.0000, CAST(N'2022-12-28' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (13, 015, N'admin', N'Trương Quang Huy', N'004', 0, 127, 11430000.0000, 0.0000, 0.0000, 0.0000, 11330000.0000, CAST(N'2022-12-28' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (14, 016, N'admin', N'Trương Quang Huy', N'003', 0, 140, 11200000.0000, 0.0000, 0.0000, 0.0000, 10080000.0000, CAST(N'2022-12-28' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (15, 019, N'admin', N'Trương Quang Huy', N'007', 0, 28, 1680000.0000, 0.0000, 0.0000, 1000.0000, 1581000.0000, CAST(N'2022-01-07' AS Date), NULL)
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaDatPhong], [TenUser], [TenKhachHang], [MaPhong], [SoNgayThue], [SoGioThue], [TienPhong], [PhuThuCheckin], [PhuThuCheckout], [TienDichVu], [ThanhTien], [NgayThanhToan], [GhiChu]) VALUES (16, 020, N'tinphan', N'Trương Quang Huy', N'002', 0, 242, 16940000.0000, 0.0000, 0.0000, 30000.0000, 15093000.0000, CAST(N'2022-01-07' AS Date), NULL)
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
SET IDENTITY_INSERT [dbo].[Khac] ON 

INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (3, 6, CAST(N'12:00:00' AS Time), N'Past First Checkin Time')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (4, 1, CAST(N'12:00:00' AS Time), N'Past Second Checkin Time')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (5, 2, CAST(N'14:00:00' AS Time), N'Past First Checkout Time')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (6, 5, CAST(N'14:00:00' AS Time), N'Past First Checkout Time')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (7, 30, NULL, N'First Checkin Surcharge')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (8, 50, NULL, N'Second Checkin Surcharge')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (9, 20, NULL, N'First Checkout Surcharge')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (10,30, NULL, N'Second Checkout Surcharge')
SET IDENTITY_INSERT [dbo].[Khac] OFF
INSERT [dbo].[KhachHang] ([MaKhachHang], [MaLoaiKH], [TenKhachHang], [Tuoi], [GioiTinh], [SoDienThoai], [SoCMND]) VALUES (N'KH01', N'4', N'Phan Hoàng Trọng Tín', 21, 0, N'0968386379  ', N'195050389')
INSERT [dbo].[KhachHang] ([MaKhachHang], [MaLoaiKH], [TenKhachHang], [Tuoi], [GioiTinh], [SoDienThoai], [SoCMND]) VALUES (N'KH02', N'2', N'Nguyễn Văn Tài', 21, 1,N'0957234638', N'195050710')
INSERT [dbo].[KhachHang] ([MaKhachHang], [MaLoaiKH], [TenKhachHang], [Tuoi], [GioiTinh], [SoDienThoai], [SoCMND]) VALUES (N'KH03', N'1', N'Trương Quang Huy', 21, 0, N'094567389', N'185050162')

INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [TienGiam], [MoTa]) VALUES (N'1', N'Normal', 0, N'')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [TienGiam], [MoTa]) VALUES (N'2', N'Silver', 20, N'')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [TienGiam], [MoTa]) VALUES (N'3', N'Gold', 30, N'')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [TienGiam], [MoTa]) VALUES (N'4', N'Diamond', 40, N'')

INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiuongDon], [GiuongDoi], [GiaTheoGio], [GiaTheoNgay]) VALUES (N'1', N'Regular Room', NULL, NULL, 60, 1100)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiuongDon], [GiuongDoi], [GiaTheoGio], [GiaTheoNgay]) VALUES (N'2', N'Superior Room', NULL, NULL, 70, 1800)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiuongDon], [GiuongDoi], [GiaTheoGio], [GiaTheoNgay]) VALUES (N'3', N'Deluxe Room', NULL, NULL, 80, 2500)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiuongDon], [GiuongDoi], [GiaTheoGio], [GiaTheoNgay]) VALUES (N'4', N'Suite (SUT)', NULL, NULL, 100, 4000)

INSERT [dbo].[Luong] ([MaLuong], [LuongTheoGio], [SoGioLam], [GhiChu]) VALUES (N'PartStaff', 80, 4, N'Part time Staff')
INSERT [dbo].[Luong] ([MaLuong], [LuongTheoGio], [SoGioLam], [GhiChu]) VALUES (N'FullStaff', 100, 8, N'Full time Staff')
INSERT [dbo].[Luong] ([MaLuong], [LuongTheoGio], [SoGioLam], [GhiChu]) VALUES (N'Manager', 150, 8, N'4 Dua code Do An')

INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [SoDienThoai], [MaLuong], [DiaChi], [Hinh], [NgayBatDauLam], [GhiChu]) VALUES (N'NV1', N'Phạm Tiến Đạt', 1, CAST(N'2001-05-13' AS Date), N'195050762', N'Manager', N'345 Huynh Tinh Cua', N'Dat.jpg', CAST(N'2022-03-05' AS Date), N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [SoDienThoai], [MaLuong], [DiaChi], [Hinh], [NgayBatDauLam], [GhiChu]) VALUES (N'NV2', N'Nguyễn Hảo Vân Anh', 1, CAST(N'2000-04-12' AS Date), N'153466676', N'PartStaff', N'36 Nguyễn Thái Sơn', null, CAST(N'2022-04-04' AS Date), N'')

INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'001', N'1', 20, 1, 1, 0, NULL, N'Cleaning', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'002', N'1', 30, 1, 2, 0, NULL, N'Cleaning', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'003', N'1', 40, 1, 1, 0, NULL, N'Cleaning', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'004', N'1', 50, 1, 1, 1, NULL, N'Cleaning', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'005', N'1', 50, 1, 1, 1, NULL, N'Cleaning', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'006', N'1', 20, 1, 1, 0, NULL, N'Cleaning', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'007', N'1', 20, 1, 1, 0, NULL, N'Cleaning', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'008', N'1', 11, 1, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'009', N'1', 20, 1, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'010', N'1', 20, 1, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'011', N'2', 20, 1, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'012', N'2', 20, 1, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'013', N'2', 20, 1, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'014', N'2', 30, 2, 2, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'015', N'2', 20, 2, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'016', N'3', 20, 2, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'017', N'3', 20, 2, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'018', N'3', 20, 2, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'019', N'3', 20, 3, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'020', N'3', 20, 2, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'021', N'3', 20, 2, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'022', N'3', 20, 3, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'023', N'3', 20, 3, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'024', N'3', 20, 3, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'025', N'4', 20, 3, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'026', N'4', 20, 3, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'027', N'4', 20, 4, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'028', N'4', 20, 4, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'029', N'4', 20, 4, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'030', N'4', 20, 4, 1, 0, NULL, N'Empty', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'031', N'4', 20, 4, 1, 0, NULL, N'Empty', N'')

INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (N'NhanVien', N'Staff', NULL)
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (N'QuanLy', N'Manager', NULL)
INSERT [dbo].[User] ([TenUser], [MatKhau], [NgayLap], [MaQuyen], [GhiChu], [MaNhanVien]) VALUES (N'admin', N'admin', CAST(N'2022-06-25' AS Date), N'QuanLy', NULL, N'NV1')
INSERT [dbo].[User] ([TenUser], [MatKhau], [NgayLap], [MaQuyen], [GhiChu], [MaNhanVien]) VALUES (N'tinphan', N'tinphan', CAST(N'2022-06-22' AS Date), N'NhanVien', NULL, N'NV2')

ALTER TABLE [dbo].[ChiTietDichVu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDichVu_DatPhong] FOREIGN KEY([MaDatPhong])
REFERENCES [dbo].[DatPhong] ([MaDatPhong])
GO
ALTER TABLE [dbo].[ChiTietDichVu] CHECK CONSTRAINT [FK_ChiTietDichVu_DatPhong]
GO
ALTER TABLE [dbo].[ChiTietDichVu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDichVu_DichVu] FOREIGN KEY([MaDichVu])
REFERENCES [dbo].[DichVu] ([MaDichVu])
GO
ALTER TABLE [dbo].[ChiTietDichVu] CHECK CONSTRAINT [FK_ChiTietDichVu_DichVu]
GO
ALTER TABLE [dbo].[ChiTietLuong]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietLuong_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[ChiTietLuong] CHECK CONSTRAINT [FK_ChiTietLuong_NhanVien]
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DatPhong_KhachHang] FOREIGN KEY([MaKhachHang])
REFERENCES [dbo].[KhachHang] ([MaKhachHang])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK_DatPhong_KhachHang]
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DatPhong_Phong] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK_DatPhong_Phong]
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DatPhong_User] FOREIGN KEY([TenUser])
REFERENCES [dbo].[User] ([TenUser])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK_DatPhong_User]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_DatPhong] FOREIGN KEY([MaDatPhong])
REFERENCES [dbo].[DatPhong] ([MaDatPhong])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_DatPhong]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_LoaiKhachHang] FOREIGN KEY([MaLoaiKH])
REFERENCES [dbo].[LoaiKhachHang] ([MaLoaiKH])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_LoaiKhachHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_Luong] FOREIGN KEY([MaLuong])
REFERENCES [dbo].[Luong] ([MaLuong])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_Luong]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_LoaiPhong] FOREIGN KEY([MaLoaiPhong])
REFERENCES [dbo].[LoaiPhong] ([MaLoaiPhong])
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_LoaiPhong]
GO
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [FK_User_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [FK_User_NhanVien]
GO
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [FK_User_Quyen] FOREIGN KEY([MaQuyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [FK_User_Quyen]
GO
USE [master]
GO
ALTER DATABASE [QuanLyKhachSan] SET  READ_WRITE 
GO
