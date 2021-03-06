create database Projeto_Oficial;

create table Pessoa(
                codigo_pessoa int auto_increment primary key,
                nome_pessoa varchar (200),
                cpf_pessoa varchar (15),
                endereco_pessoa varchar(200),
                email_pessoa varchar (100),
                senha_pessoa varchar(20)
);

create table Produto(
               codigo_produto int(11) auto_increment primary key,
               descricao_produto varchar(200),
               preco_produto double(15,2)
);

Create table carrinho(
       codigo_carrinho int primary key auto_increment, 
       codigo_pessoa int(11),
       codigo_produto int(11),
       preco_produto double(15,2),
       descricao_produto varchar(200)
);

Create table Frete(
		codigo_envio int not null auto_increment primary key,
        codigo_pessoa int(11),
		endereco_pessoa varchar(100),
		complemento varchar(225),
		cep varchar(8)
);

Create table Pagamento(
		codigo_pagamento int auto_increment primary key,
        codigo_pessoa int(11) not null,
		nome_titular varchar(100),
		numero_cartao varchar(16) not null
);

Create table Confirmacao(
		
        codigo_confirmacao int not null auto_increment primary key,
		codigo_pessoa int(11) not null,
        codigo_produto int(11) not null,
        data_compra Date    
);

alter table Confirmacao add constraint foreign key (codigo_pessoa) references Pessoa(codigo_pessoa);
alter table Confirmacao add constraint foreign key(codigo_carrinho) references carrinho(codigo_carrinho);

select * from carrinho;
select * from pagamento;
select * from Confirmacao;
select * from pessoa;
select * from produto;
select * from frete;



