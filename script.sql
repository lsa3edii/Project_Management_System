USE [master]
GO
/****** Object:  Database [ProjectManagement]    Script Date: 12/22/2022 4:27:58 PM ******/
CREATE DATABASE [ProjectManagement]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ProjectManagement', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\ProjectManagement.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ProjectManagement_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\ProjectManagement_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [ProjectManagement] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ProjectManagement].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ProjectManagement] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ProjectManagement] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ProjectManagement] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ProjectManagement] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ProjectManagement] SET ARITHABORT OFF 
GO
ALTER DATABASE [ProjectManagement] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [ProjectManagement] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ProjectManagement] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ProjectManagement] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ProjectManagement] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ProjectManagement] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ProjectManagement] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ProjectManagement] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ProjectManagement] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ProjectManagement] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ProjectManagement] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ProjectManagement] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ProjectManagement] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ProjectManagement] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ProjectManagement] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ProjectManagement] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ProjectManagement] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ProjectManagement] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ProjectManagement] SET  MULTI_USER 
GO
ALTER DATABASE [ProjectManagement] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ProjectManagement] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ProjectManagement] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ProjectManagement] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ProjectManagement] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [ProjectManagement] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [ProjectManagement] SET QUERY_STORE = OFF
GO
USE [ProjectManagement]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Admin](
	[id] [int] NOT NULL,
	[name] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
 CONSTRAINT [Admin_pk] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[attendance]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[attendance](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[enter_time] [varchar](20) NULL,
	[exit_time] [varchar](20) NULL,
	[date] [varchar](20) NULL,
	[employee_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[employee]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee](
	[id] [int] NOT NULL,
	[name] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[position] [varchar](20) NOT NULL,
	[penalty] [int] NULL,
	[tl_id] [int] NULL,
	[pm_id] [int] NULL,
	[admin_id] [int] NULL,
 CONSTRAINT [employee_manager_pk] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[project_manager]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[project_manager](
	[id] [int] NOT NULL,
	[name] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[position] [varchar](20) NOT NULL,
	[admin_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[projects]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[projects](
	[id] [int] NOT NULL,
	[project_name] [varchar](20) NOT NULL,
	[progress] [varchar](20) NOT NULL,
	[tl_id] [int] NULL,
	[pm_id] [int] NULL,
 CONSTRAINT [projects_pk] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[reports]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[reports](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[report] [varchar](100) NULL,
	[employee_id] [int] NULL,
	[tl_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tasks]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tasks](
	[id] [int] NOT NULL,
	[task_name] [varchar](20) NOT NULL,
	[task_state] [varchar](20) NOT NULL,
	[employee_id] [int] NULL,
	[tl_id] [int] NULL,
	[project_id] [int] NULL,
 CONSTRAINT [tasks_pk] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[team_leader]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[team_leader](
	[id] [int] NOT NULL,
	[name] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[position] [varchar](20) NOT NULL,
	[pm_id] [int] NULL,
	[admin_id] [int] NULL,
 CONSTRAINT [team_leader_pk] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[vacation]    Script Date: 12/22/2022 4:27:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[vacation](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[day_from] [varchar](20) NULL,
	[day_to] [varchar](20) NULL,
	[reson] [varchar](20) NULL,
	[state] [varchar](20) NULL,
	[employee_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[attendance]  WITH CHECK ADD  CONSTRAINT [employee_attendance_fk] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[attendance] CHECK CONSTRAINT [employee_attendance_fk]
GO
ALTER TABLE [dbo].[employee]  WITH CHECK ADD  CONSTRAINT [admin_employee_fk] FOREIGN KEY([admin_id])
REFERENCES [dbo].[Admin] ([id])
GO
ALTER TABLE [dbo].[employee] CHECK CONSTRAINT [admin_employee_fk]
GO
ALTER TABLE [dbo].[employee]  WITH CHECK ADD  CONSTRAINT [leader_employee_fk] FOREIGN KEY([tl_id])
REFERENCES [dbo].[team_leader] ([id])
GO
ALTER TABLE [dbo].[employee] CHECK CONSTRAINT [leader_employee_fk]
GO
ALTER TABLE [dbo].[employee]  WITH CHECK ADD  CONSTRAINT [manager_employee_fk] FOREIGN KEY([pm_id])
REFERENCES [dbo].[project_manager] ([id])
GO
ALTER TABLE [dbo].[employee] CHECK CONSTRAINT [manager_employee_fk]
GO
ALTER TABLE [dbo].[project_manager]  WITH CHECK ADD  CONSTRAINT [admin_manager_fk] FOREIGN KEY([admin_id])
REFERENCES [dbo].[Admin] ([id])
GO
ALTER TABLE [dbo].[project_manager] CHECK CONSTRAINT [admin_manager_fk]
GO
ALTER TABLE [dbo].[projects]  WITH CHECK ADD  CONSTRAINT [leader_projects_fk] FOREIGN KEY([tl_id])
REFERENCES [dbo].[team_leader] ([id])
GO
ALTER TABLE [dbo].[projects] CHECK CONSTRAINT [leader_projects_fk]
GO
ALTER TABLE [dbo].[projects]  WITH CHECK ADD  CONSTRAINT [manager_projects_fk] FOREIGN KEY([pm_id])
REFERENCES [dbo].[project_manager] ([id])
GO
ALTER TABLE [dbo].[projects] CHECK CONSTRAINT [manager_projects_fk]
GO
ALTER TABLE [dbo].[reports]  WITH CHECK ADD  CONSTRAINT [employee_reports_fk] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[reports] CHECK CONSTRAINT [employee_reports_fk]
GO
ALTER TABLE [dbo].[reports]  WITH CHECK ADD  CONSTRAINT [leader_reports_fk] FOREIGN KEY([tl_id])
REFERENCES [dbo].[team_leader] ([id])
GO
ALTER TABLE [dbo].[reports] CHECK CONSTRAINT [leader_reports_fk]
GO
ALTER TABLE [dbo].[tasks]  WITH CHECK ADD  CONSTRAINT [employee_tasks_fk] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[tasks] CHECK CONSTRAINT [employee_tasks_fk]
GO
ALTER TABLE [dbo].[tasks]  WITH CHECK ADD  CONSTRAINT [leader_tasks_fk] FOREIGN KEY([tl_id])
REFERENCES [dbo].[team_leader] ([id])
GO
ALTER TABLE [dbo].[tasks] CHECK CONSTRAINT [leader_tasks_fk]
GO
ALTER TABLE [dbo].[tasks]  WITH CHECK ADD  CONSTRAINT [projects_tasks_fk] FOREIGN KEY([project_id])
REFERENCES [dbo].[projects] ([id])
GO
ALTER TABLE [dbo].[tasks] CHECK CONSTRAINT [projects_tasks_fk]
GO
ALTER TABLE [dbo].[team_leader]  WITH CHECK ADD  CONSTRAINT [admin_leader_fk] FOREIGN KEY([admin_id])
REFERENCES [dbo].[Admin] ([id])
GO
ALTER TABLE [dbo].[team_leader] CHECK CONSTRAINT [admin_leader_fk]
GO
ALTER TABLE [dbo].[team_leader]  WITH CHECK ADD  CONSTRAINT [manager_leader_fk] FOREIGN KEY([pm_id])
REFERENCES [dbo].[project_manager] ([id])
GO
ALTER TABLE [dbo].[team_leader] CHECK CONSTRAINT [manager_leader_fk]
GO
ALTER TABLE [dbo].[vacation]  WITH CHECK ADD  CONSTRAINT [employee_vacation_fk] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[vacation] CHECK CONSTRAINT [employee_vacation_fk]
GO
USE [master]
GO
ALTER DATABASE [ProjectManagement] SET  READ_WRITE 
GO
