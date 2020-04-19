# Projeto V2

Esse repositório representa a implementação do BackEnd(Servidor)
 com o FrontEnd(Interface do Usuário)
 
##-- Como Utilizar --

Acesse localhost:4200 para a interface gráfica


##-- Implmentação Angular --

Clique [aqui](https://github.com/Salsicha1001/AngularOficina) para saber mais sobre a implementação do angular


##-- Implementação do Servidor --

A comunicação com o servidor é localhost:8080/< tabela >/<função>

O servidor é dividido entre 4 pastas principais:
    
    ->Controllers -- Intercepta a comunicação com o angular
    ->Service -- Realiza a regra de negócio das informações do repository
    ->Repository -- Busca as informações no Bando de Dados
    ->Models -- Modelos utilizado nas pastas anteriores -
    
O arquivo ProjetoHelioV2.java é utilizado para configuração do spring.
Esse arquivo é responsável pela comunicação com o Banco de Dados, Angular.

Vale atentar às seguintes configurações no **_ProjetoHelioV2Application#getDataSource_**

    ->driverClassName - Driver Java de comunicação com o banco
        *Cada banco de dados tem sua comunicação padrão, no caso do Mysql, já está configurado
        *Caso queira alterar o banco, pesquise na internet
        *E lembre-se de baixar ele, seja pelo pom.xml, ou pelo JAR
    ->url - link de comunicação com o banco de dados
    ->username - usuário de comunicação com o banco de dados
    ->password - senha do usuário de comunicação com o banco de dados
    
Vale atentar também às seguintes configurações no **_ProjetoHelioV2Application#hibernateProperties_**
 
    ->hibernate.hbm2ddl.auto define como o hibernate irá trabalhar com as tabelas no banco de dados
        *Existem três opções:
        *update -- atualiza, ou cria a tabela no banco de dados
        *create -- cria a tabela no banco de dados
        *create-delete -- cria a tabela no início do programa, e o deleta no fim
    ->hibernate.dialect -- define a forma que o hibernate irá se comunicar com o banco de dados
        *Essa opção é afetada diretamente pela driverClassName, já que ambas definem como conectar com o banco de dados
        
O servidor é montado da seguinte forma:

    -primeiro é desenvolvido a Entidade que vai se trabalhar na pasta Models
    -Criar a classe < entidade >Repository, extender BaseService e colocá-la na pasta Repository/api
    -Criar a classe < entidade >RepositoryImpl, extender a classe anterior e colocá-la na pasta Repository
    -Criar a classe < entidade >Services, extender BaseService e colocá-la na pasta Services/api
    -Criar a classe < entidade >ServicesImpl, extender a classe anterior e colocá-la na pasta Services
    -Criar a classe < entidade >RestController, extender a classe BaseController, e colocá-la na pasta Controllers
    
Utilize as classes já desenvolvidas para o melhor entendimento desse funcionamento.




###-- Regras para Implementação --

Nunca implemente na master sem o devido cuidado

Se quiser realizar testes utilize uma branch separada
