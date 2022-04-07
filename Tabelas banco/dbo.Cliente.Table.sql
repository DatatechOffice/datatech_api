USE [API]
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 06/04/2022 22:25:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cliente](
	[id_cliente] [nchar](10) NOT NULL,
	[nome_do_cliente] [nchar](10) NULL,
	[solução] [nchar](10) NULL,
	[objetivo] [nchar](10) NULL,
	[entrega_minimas] [nchar](10) NULL,
	[entregas_possiveis] [nchar](10) NULL,
 CONSTRAINT [PK_Cliente] PRIMARY KEY CLUSTERED 
(
	[id_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
