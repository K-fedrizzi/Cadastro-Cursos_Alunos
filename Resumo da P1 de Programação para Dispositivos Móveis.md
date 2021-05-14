### Programação para Dispositivos Móveis 

#### Aula 2 - ARQUITETURA

#####  O Android

- é uma pilha de software com base no Linux, 

- dividido em várias camadas, 

- possui diversos componentes, 

- confia no kernel do Linux para executar suas funcionalidades 

  - Ex: encadeamento e gerenciamento de memória. aproveita os  principais recursos de segurança do Linux. 
  - Ex: um usuário não pode alterar dados de outro usuário.

  ##### Kernel do Linux

-  Responsável por gerenciar todos os drivers 

  - audio 
  - USB, 
  - câmera, 
  - bluetooth, 
  - wifi, etc 

  Permite que fabricantes desenvolvam drivers de hardware para um kernel conhecido;

  ##### Camada de abstração de hardware (HAL)

  - fornece interfaces que expõem as capacidades de hardware do dispositivo para a estrutura do Java.

  - consiste em módulos de biblioteca que implementam uma interface para um tipo específico de componente de hardware, como:

    módulo de câmera, bluetooth.	

  - Quando uma Framework API faz uma chamada para acessar o hardware do dispositivo,

    ​	o sistema Android carrega o módulo da biblioteca para este componente de hardware.

  ##### Bibliotecas de Execução do Android 

  ##### Android Runtime (ART)

  contém as principais bibliotecas em tempo de execução da linguagem de programação Java, cada aplicativo executa o próprio processo com uma instância própria do Android Runtime (ART). O ART é projetado para executar várias máquinas virtuais em dispositivos com baixa memória.

  ##### Bibliotecas Nativas do C e do C++

  Vários componentes e serviços principais do sistema Android Runtime (ART) e da Camada de abstração de hardware (HAL).

   são implementados por código nativo que exige bibliotecas nativas programadas em C e C++.



##### Camada Java API Framework:

- Nesta camada estão as APIs dos Gerenciadores de:
  - Atividades, 
  - Janelas, 
  - Recursos, 
  - Notificações, etc.

- APIs formam blocos de programação simplificando a reutilização de componentes e serviços de sistema

##### Estrutura da Java API

- Um sistema de visualização, com listas, grades, caixas de texto, botões, etc 
- Um gerenciador de recursos, fornecendo acesso a recursos sem código como gráficos e arquivos de layout, 
- Um gerenciador de notificação que permite que os aplicativos exibam alertas, 
- Um gerenciador de atividade que gerencia o ciclo de vida dos aplicativos, 
- Provedores de conteúdo que permite que aplicativos acessem dados de outros aplicativos.

##### Camada de Aplicativos do Sistema

- conjunto de aplicativos principais para:
  - e-mail, 
  - envio de SMS, 
  - calendários,
  -  navegador de internet, 
  - câmera, 
  - contatos etc.

##### Instalação do Android

- Alguns componentes que podem ser instalados:
  - SDK Platform: Plataforma da versão utilizada no Android.
  - Google APIs: API equivalente à de cada versão padrão do Android, mas que carregue serviços exclusivos do Google como o Google Maps.
  - Google Repository: Repositório utilizado pela Google.
  - Intel ou ARM System Images: Imagem de sistema necessária para executar o Emulator.

##### Android Virtual Device Manager (AVD)

- É o gestor de máquinas virtuais para execução do emulador

##### Componentes da Interface do usuário

1. Barra de ferramentas: permite executar ações como executar aplicativos e inicializar ferramentas. 

2. Barra de navegação: ajuda na navegação pelo projeto e na abertura de arquivos para edição. 
3.  Janela do editor: local em que você cria e modifica código. 
4.  Barra da janela de ferramentas: fica fora da janela do IDE e contém os botões que permitem expandir ou recolher a janela de cada ferramenta. 
5.  Janela das ferramentas: dá acesso a tarefas como gerenciamento de projetos, controle de versão, etc. 
6. Barra de status: mostra o status do projeto e do próprio IDE, além de advertências e mensagens.

##### Arquivos dos projetos Android:

1. Manifest: contém o arquivo AndroidManifest.xml. 

2. java: contém os arquivos de código-fonte do Java, incluindo o código de teste do JUnit.

3. recursos: contém todos os recursos que não são código, como layouts XML, strings de IU e imagens em bitmap. 

4. gradle: Contém todos os arquivos da compilação.

##### Sistema de compilação Gradle

- Cada projeto tem um arquivo de compilação. 

- Esse sistema de compilação é executado como uma ferramenta integrada no menu do Android Studio e de forma independente na linha de comando. 

- O nome dos arquivos de compilação do Android Studio é build.gradle. 

- Quando você importa um projeto existente, o Android Studio gera automaticamente os arquivos de compilação necessários.

  ##### Uma aplicação é composta de: código e resources. 

- **Resources:** tudo que não é código, incluindo: 

  - arquivos de layout, pacotes de linguagem, imagens, arquivos de audio/video, etc 
  - Utilização de Resources... por que? 
    - Separar apresentação dos dados (layout) do gerenciamento, Prover resources alternativos para suportar dispositivos específicos (ex. Pacotes de linguagem).
  - Resources são definidos de uma forma declarativa através do XML. 
  - Cada resource tem um nome/identificador. 
  - Resource pode ser acessados no código Java através da classe R, que funciona como um centralizador entre o mundo Java e o mundo dos resources. 
  - Gerado Automaticamente, nem precisa modificá-lo. 
- Recriado em caso de mudanças no diretório res/.
  
##### Android Activities
  
  - Uma activity corresponde a uma única tela da aplicação.
  - Uma aplicação pode ser composta de múltiplas telas
  - Home Activity e mostrado quando o usuário abre a aplicação
- Diferentes activities podem trocar informações entre elas
  
##### android app utilizam ambas abordagem:
  
**Abordagem Declarativa**
  
- XML Code  -> Define o **layout** e **recursos** usados pela aplicação
  
**Abordagem com programação**
  
- Java code  -> Gerencia os **eventos** e manipula a **interação com** o usuário
  
**Views** 
  
Podem gerar eventos que podem ser gerenciadas pelo android-developer
  
Exemplos: public void onClick(View arg0){
  
​		if(arg0 == Button){
  
​					//Manage Button events
  
​       }
  
}
  
O Gerenciador de Activity é responsável por criar, 
  
destruir, gerenciar activities.
  
 ##### Activities podem estar em diferentes estados: 
  
  - starting, 
  - running, 
  - stopped, 
  - destroyed, 
  - paused. 
- Somente uma activity podem estar rodando em um dado momento,
  
Activities são organizadas em uma pilha, e possuem um ciclo de vida
  
As activities são organizadas em pilhas (Last in first out) 
  
O estado delas é determinado pela sua posição na pilha 
  
Quando uma activity inicia, ela fica ativa no topo da pilha, quando o usuário aciona o botão back, a activity logo abaixo na pilha se torna ativa.
  
----------------
  
##### 		Activity
  
  - A classe Activity fornece uma tela com a qual os usuários podem interagir para fazer algo, como:
    - tirar uma foto, 
    - ver um mapa, etc
  - é responsável por controlar os eventos da tela:
  - herda atributos e métodos da classe android.app.Activity,
  - deve sobrescrever o método onCreate (boundle),
  
- responsável por realizar a inicialização necessária para executar a aplicação.
  
- Cada Activity deve obrigatoriamente ser declarada no arquivo AndroidManifest.xml
  
    - O atributo android: name é o único necessário — especifica o nome da classe da atividade.
    - O elemento  especifica que esse é o “principal” ponto de entrada do aplicativo. 
  - Só uma atividade deve ter a ação "main"e a categoria "launcher".
  
  ##### Android
  
  #####  Início de uma atividade
  
    - Para iniciar outra atividade, é possível chamar startActivity() passando uma Intent 
    - A intent especifica a atividade exata que deve ser iniciada (que pode ser até de um outro aplicativo). 
    - Um intent também pode portar pequenas quantidades de dados a serem usados pela atividade iniciada.
      - Intent intent = new Intent(this, SegundaTela.class); 
    - startActivity(intent);
  

  
##### Encerramento de uma atividade 

  - Para encerrar uma atividade
    - chame o método finish(); 
    - Também é possível encerrar uma atividade separada iniciada anteriormente chamando finishActivity().

##### Uma atividade pode existir essencialmente em três estados:

- **Resumed:** A atividade está em primeiro plano na tela e tem o foco do usuário (em geral, chama-se esse estado de “em execução”).
-  **Paused:** A atividade ainda está visível, mas outra atividade está em foco (em primeiro plano). outra atividade está visível por cima desta e está parcialmente transparente ou não cobre inteiramente a tela.
- **Stopped:** A atividade está totalmente suplantada por outra (a atividade passa para "segundo plano"). ela não fica mais visível para o usuário e pode ser eliminada pelo sistema se a memória for necessária em outro processo.

##### Métodos de retorno de chamada do ciclo de vida

**onCreate()** 

- Chamado quando a atividade é criada pela primeira vez. 

- É onde se deve fazer toda a configuração estática normal — criar exibições, vincular dados a listas etc. 

- Esse método recebe um objeto Bundle (pacote) contendo o estado anterior da atividade, caso esse estado tenha sido capturado. Sempre seguido de onStart().

**onStart()** 

- Chamado logo antes de a atividade se tornar visível ao usuário. 

- Seguido de onResume().

**onResume()** 

- Chamado logo antes da Atividade iniciar a interação com o usuário. 
- Nesse ponto, a atividade estará no topo da pilha de atividades com a entrada do usuário direcionada a ela. 
- Sempre seguido de onPause().

**onPause()**

- Chamado quando o sistema está prestes a retomar outra atividade. 
- Esse método normalmente é usado para confirmar alterações não salvas a dados persistentes, animações interrompidas e outras coisas que talvez estejam consumindo CPU. 
- Deve fazer tudo bem rapidamente porque a próxima atividade não será retomada até ela retornar. 
- Seguido de onResume() se a atividade retornar para a frente ou de onStop() se ficar invisível ao usuário.

**onStop()**

- Stop() Chamado quando a atividade não está mais visível ao usuário.
-  Isso pode acontecer porque ela está sendo destruída ou porque outra atividade (uma existente ou uma nova) foi retomada e está cobrindo-a. 
- Seguido de onRestart() se a atividade estiver voltando a interagir com o usuário ou onDestroy() se estiver saindo.

**onRestart()**

- Chamado depois que atividade tiver sido interrompida, logo antes de ser reiniciada. 
- Sempre seguido de onStart().

**onDestroy()**

- Chamado antes de a atividade ser destruída. 
- É a última chamada que a atividade receberá. 
- Pode ser chamado porque a atividade está finalizando (alguém chamou finish() ) ou porque o sistema está destruindo temporariamente essa instância da atividade para poupar espaço. 
- É possível distinguir entre essas duas situações com o método isFinishing().

##### Activities podem utilizar Extras

- Pares de valor-chave que carregam informações adicionais necessárias para realizar a ação solicitada. 
- Algumas ações usam determinados tipos de URIs de dados e outras usam determinados extras.
-  É possível adicionar dados extras com diversos métodos putExtra(), cada um aceitando dois parâmetros: o nome principal e o valor. 
- Também é possível criar um objeto Bundle com todos os dados extras e, em seguida, inserir o Bundle na Intent com putExtras().

##### Activities podem utilizar Bundle(Pacotes)

- Bundle(Pacotes)
  - são objetos utilizados entre atividades com intenções 
  - passar informações entre componentes. 
  - representa um conjunto de pares "chave/valor". 
  - permite guardar valores de qualquer tipo primitivo.

- Os objetos Bundle devem ser usados:
  - pelos processos com transações IPC, 
  - entre atividades com intents 
  - e para armazenar o estado transitório nas alterações de configuração
- Pode-se adicionar dados diretamente ao Bundle da Intent através dos métodos putExtra() da própria Intent. 
- Os extras são compostos de chave/valor.
-  A chave é sempre do tipo String. 
- O valor você pode usar os tipos de dados primitivos (int, float, . . . ) e objetos do tipo String, etc.

-----------------------------------------------

#### Layouts

- O layout define a estrutura visual para uma interface do usuário, como a IU de uma atividade. 
- É possível criar layouts XML para diferentes orientações de tela e diferentes tamanhos de tela.
-  Cada arquivo de layout deve conter exatamente um elemento raiz, que deve ser um objeto View ou ViewGroup.
  - Com o elemento raiz definido, é possível adicionar objetos

- O arquivo layout deverá ser salvo com uma extensão .xml no diretório res/layout/

##### Carregamento do recurso XML

- Ao compilar o aplicativo, cada arquivo de layout XML é compilado em um recurso View. 
- Deve-se carregar o recurso de layout do código do aplicativo na implementação de retorno de chamada Activity.onCreate().
  - Para isso, chame setContentView(), passando a referência para o recurso de layout na forma: R.layout.layout_file_name.

#### Parâmetros do layout

-  Todos os grupos de exibições contêm largura e altura (layout_width e layout_height). 
- É possível especificar largura e altura com medidas exatas,
-  Porém é recomendado usar uma destas constantes:
  - wrap_content instrui a exibição a se redimensionar de acordo com as medidas exigidas pelo conteúdo. 
  - match_parent instrui a exibição a assumir o maior tamanho permitido pelo grupo de exibições pais.

##### Posição do layout

- As exibições têm uma localização, expressa como um par de coordenadas esquerda e topo e duas dimensões, expressas como largura e altura. 
- A unidade de localização e de dimensões é o pixel.
-  É possível recuperar a localização de uma exibição chamando os métodos getLeft() e getTop().
  - getLeft() retorna a coordenada esquerda, ou X, do retângulo que representa a exibição. 
  - getTop() retorna a coordenada topo, ou Y, do retângulo que representa a exibição.

- Esses métodos retornam a localização da exibição em relação ao pai correspondente.

##### Tamanho, preenchimento e margens

- O tamanho de uma exibição é expresso por largura e altura, chamando getWidth() e getHeight().

##### Layouts comuns

- Cada subclasse da classe ViewGroup fornece um modo exclusivo de exibições aninhadas dentro dela.

  ![layout](C:\Users\Karina Fedrizzi\Desktop\layout.PNG)

##### Criação de layouts com um adaptador

- Quando o conteúdo do layout é dinâmico, é possível usar um layout que torne AdapterView

  - uma subclasse para preencher o layout com exibições em tempo de execução.

- Uma subclasse da classe AdapterView usa um Adapter para agrupar dados ao seu layout.

- O Adapter se comporta como um intermediário entre a fonte dos dados e o layout do AdapterView 

- O Adapter recupera os dados (de uma fonte como uma matriz ou uma consulta de banco de dados).

  ![adptação](C:\Users\Karina Fedrizzi\Desktop\adptação.PNG)

##### ConstraintLayout

- permite que você crie layouts grandes e complexos com uma hierarquia no seu XML
  - sem a necessidade de ficar aninhando um monte de layouts uns dentro dos outros
- é similar ao Relative Layout, uma vez que todas suas views se relacionam entre si e com o parent,
  - mas é mais flexível e mais fácil de usar
- também possui as melhores características do LinearLayout,
  - o que nos permite interfaces bem distribuídas e simples de construir.

##### Constraint

- Constraints significa algo como “restrições” ou “limitações”, 
- as restrições são o cerne por trás do funcionamento deste layout manager, 
- Para definir a posição de uma view no ConstraintLayout, você deve adicionar ao menos:
  - uma constraint horizontal 
  - uma vertical para a view
- Cada constraint representa uma conexão ou alinhamento em relação à outra view.

#### LinearLayout

- é um grupo de visualizações que alinha todos os filhos em uma única direção **vertical ou horizontal**. 

- pode-se especificar a direção do layout com o atributo android: orientation

  ![Capturar](C:\Users\Karina Fedrizzi\Desktop\Capturar.PNG)

##### Ponderação do layout

- O LinearLayout também é compatível com a atribuição de uma ponderação a filhos individuais com o atributo android:layout_weight. 
- Este atributo confere um valor de "importância"a uma visualização em relação à quantidade de espaço que ela deve ocupar na tela.
-  Um valor de ponderação maior permite que ela se expanda para preencher qualquer espaço restante na visualização pai. 
- A ponderação padrão é zero.

##### Distribuição Desigual

- Se houver três campos de texto 
- dois deles tiverem uma ponderação 1, 
- o terceiro tiver uma ponderação 2 (em vez de 0),
-  o último será declarado mais importante que os outros e ficará com metade do espaço total restante, 
- os dois primeiros campos compartilharão o resto igualmente.

-------------------------

####  Recursos Strings, Cores e Spinner

**Recurso: Strings**

- Os recursos de string fornecem strings de texto para o aplicativo com estilo e formatação de texto opcional. Existem três tipos de recursos que podem fornecer strings ao seu aplicativo:

  - **String:** Recurso XML que fornece uma só string. 
  - **Matriz de strings** Recurso XML que fornece uma matriz de strings. 
  - **Strings de quantidade (plurais)** Recurso XML que contém diferentes strings para pluralização.

- Todas as strings podem aplicar algumas marcações de estilo e argumentos de formatação.

  #### String

- String única que pode ser referenciada do aplicativo ou de outros arquivos de recurso (como um layout XML). 
- LOCALIZAÇÃO DO ARQUIVO:
  
  - res/values/string.xml
- TIPO DE DADOS DO RECURSO COMPILADO:
  
  - Ponteiro do recurso para um String.
- REFERÊNCIA DO RECURSO:
  - Em Java: R.string.string_name 
  - Em XML: @string/string_name

#### Recuperando Strings

- Para recuperar uma string pode se usar: 
  - String string = getString(R.string.hello);
-  ou pode-se usar também getText(int) para recuperar uma string. 
- o getText(int) manterá qualquer estilo de texto avançado aplicado à string.

#### Formatação e estilo de strings

- Se a string contiver um apostrofo (')
  - você deve colocar uma barra invertida ( \') ou inserir a string em aspas duplas (”aaa”). 

- Você pode adicionar estilo as suas strings com marcação HTML. 
- São elementos HTML permitidos: 
  - < b > para texto em negrito. 
  - < i > para texto em itálico. 
  - < u > para sublinhar o texto.

##### Matriz de strings

- Matriz de strings que pode ser referenciada pelo aplicativo. 
- LOCALIZAÇÃO DO ARQUIVO: 
  - res/values/string_array_name.xml 
- TIPO DE DADOS DO RECURSO COMPILADO:
  -  Ponteiro de recurso para uma matriz de Strings.
-  REFERÊNCIA DO RECURSO: Em Java: 
  - R.array.string_array_name

##### Strings de quantidade (plurais)

- Diferentes idiomas têm diferentes regras de concordância gramatical de número. 
- Essa distinção entre singular e plural é muito comum. 
- O conjunto completo permitido pelo Android é zero, one, two, few, many e other. o Android fornece métodos como o getQuantityString(). 
- usadas apenas para plurais. 
  - Ex: "one book", "two books”.
- LOCALIZAÇÃO DO ARQUIVO: 
  - res/values/plural_name.xml R
- EFERÊNCIA DO RECURSO: 
  - Em Java: R.plurals.plural_name

#####  Recurso: Cores

- Um Space Color é usado para identificar uma organização específica de cores. 

- Cada espaço de cores é caracterizado por um modelo de cores que define como um valor de cor é representado
  - por exemplo, o modelo de cores RGB (Red, Green, Blue) define um valor de cor com 3 números. 
- Cada componente de uma cor deve estar dentro de um intervalo válido, específico para cada espaço de cores
- O valor começa com o caracter (#) seguido por informaões Alpha-Red-Green-Blue em um dos seguintes formatos:
  - \#RGB 
  - #ARGB 
  - #RRGGBB 
  - #AARRGGBB

##### Spinners

- Controles giratórios (Spinners)

  - Os controles giratórios oferecem uma forma rápida de selecionar um valor de um conjunto. 
  - Por padrão, um controle giratório mostra o valor selecionado naquele momento. 
  - Um toque no controle giratório mostra um menu suspenso com todos os outros valores disponíveis, dos quais o usuário pode selecionar um novo valor. 
  - É possível adicionar um controle giratório ao layout com o objeto Spinner. Normalmente, isso é feito no layout XML com um elemento < Spinner >.

  ##### Preencher o controle giratório com escolhas do usuário

- As opções fornecidas para o controle giratório poderão ter qualquer origem, mas deverão ser informadas por meio de um SpinnerAdapter,
  - como um ArrayAdapter, se as opções estiverem disponíveis em uma matriz, 
  - ou em um CursorAdapter, se as opções estiverem disponíveis em uma consulta de banco de dados.
- Ex: se as opções disponíveis no controle giratório forem predeterminadas, você poderá fornecê-las com uma matriz de strings definida em um arquivo de recursos de string.

##### RadioGroup e RadioButton

- Esta classe é usada para criar um escopo de exclusão múltipla para um conjunto de botões RadioButton. 
- provê a capacidade de selecionar somente um RadioButton do conjunto,
-  quando o usuário seleciona um RadioButton, os outros são automaticamente desmarcados. 
- Inicialmente, todos os botões de rádio estão desmarcados. 
- A seleção é identificada pelo id exclusivo do botão, conforme definido no arquivo de layout XML.

--------------------------------------

#### List View e Grid View

##### Adaptador

- É possível preencher um AdapterView como ListView ou GridView vinculando a instância de AdapterView a um Adapter,

-  O Adapter recupera dados de uma fonte externa e cria uma View que representa cada entrada de dados. 

- Os dois adaptadores mais comuns são: 

  - ArrayAdapter. 

  - SimpleCursorAdapter.

##### ArrayAdapter

- Use esse adaptador quando a fonte de dados for uma matriz.

-  O ArrayAdapter cria uma exibição para cada item de matriz chamando toString() em cada item e posicionando o conteúdo em uma TextView. 

- Ex: Para exibir uma matriz de strings em uma ListView

  - inicialize um novo ArrayAdapter especificando o layout e a matriz de strings (myString),

  - Em seguida, chame o setAdapter() na ListView.

##### SimpleCursorAdapter

- Esse adaptador é utilizado quando os dados vierem de um Cursor.

-  É necessário especificar um layout para cada linha no Cursor e que colunas no Cursor devem ser inseridas, 

- Ex: Para criar uma lista de nome e número de telefone de pessoas,

  -  pode-se executar uma consulta que retorna um Cursor que contém uma linha para cada pessoa e colunas para os nomes e números. 

  - depois, crie uma matriz de strings que especifique quais colunas do Cursor estarão no layout para cada resultado 

  - e uma matriz de números inteiros especificando as exibições correspondentes em que cada coluna deve ser colocada.

##### Visualização em lista

- A ListView é um grupo de exibições que exibe uma lista de itens roláveis. 

- Os itens da lista são inseridos automaticamente na lista usando um Adapter 

  - O Adpter obtém conteúdo de uma origem como uma matriz ou consulta de banco de dados 

  - depois converte cada resultado de item em uma exibição.

##### Processamento de eventos de clique

- Para responder a eventos de clique em cada item em um AdapterView, implemente a interface AdapterView.OnItemClickListener:

#### GridLayout

- GridLayout foi introduzido na API nível 14.
-  Seu principal objetivo é resolver problemas de alinhamento e desempenho em outros layouts é utilizado principalmente para alinhar as exibições nas células, nas interceptações horizontais e verticais de uma linha invisível. 
- Cada exibição é colocado em uma célula e as células são numeradas com os índices horizontal e vertical.

##### O GridLayout não faz qualquer rolagem; 

- para ter rolagem, deve-se colocar o GridLayout em um ScrollView. 
  - Os dados devem ser preenchidos no GridLayout para
  -  que o ScrollView saiba o espaço total que é para rolar. 
- O GridLayout também não fornece diretamente a seleção ou interação por "item", 
  - porque é apenas um gerenciador de layout.

#### GridView

- GridView é um ViewGroup que exibe itens em uma grade rolável bidimensional. 
- Os itens são inseridos automaticamente no layout usando um ListAdapter. 
- as exibições são recuperadas do adaptador. 
- Todos os elementos devem ter o mesmo tamanho. 
- A diferença de um ListView é que os itens são colocados em uma grade em vez de em uma lista.

##### Atributos 

**android:columnWidth:** Especifica a largura fixa para cada coluna. 

**android:gravity:** Especifica a gravidade dentro de cada célula. 

**android:horizontalSpacing:** Define o espaçamento horizontal padrão entre as colunas. 

**android:numColumns:** Define quantas colunas mostrar. 

**android:stretchMode:** Define como as colunas devem se estender para preencher o espaço vazio disponível, se houver. **android:verticalSpacing:** Define o espaçamento vertical padrão entre linhas.

##### Classe BaseAdapter

- Classe para um Adaptador que pode ser usado tanto no ListView (implementando a interface ListAdapter especializada) quanto no Spinner (implementando a interface SpinnerAdapter especializada). 
- Alguns métodos a serem implementandos:
  - public int getCount() 
  - public Object getItem(int position) 
  -  public long getItemId(int position) 
  -  public View getView(int position, View convertView, ViewGroup parent)

---------------------------------------------

####  Fragmentos

- Um Fragmento representa o comportamento ou uma parte da interface do usuário na Activity. 
- É possível combinar vários fragmentos em uma única atividade.
  - e reutilizar um fragmento em diversas atividades
- Um fragmento é como uma seção modular de uma atividade
  - tem o próprio ciclo de vida, 
  - recebe os próprios eventos de entrada, 
  - pode ser adicionado ou removido em uma atividade
- Um fragmento deve sempre ser embutido em uma atividade 
- O ciclo de vida de um fragmento é diretamente impactado pelo ciclo de vida da atividade do host.
  - quando a atividade é pausada, todos os fragmentos também são. 
  - quando a atividade é destruída, todos os fragmentos também são.
- Cada fragmento é processado de forma independentemente, como adicionar ou removê-los.
  - os fragmentos são adicionados na pilha de retorno da atividade, 
  - cada entrada da pilha é um registro da transação do fragmento que ocorreu. 
  - a pilha de retorno permite que o usuário inverta uma transação (navegue para trás pressionando o botão Voltar).
- É possível inserir um fragmento no layout
  - declarando-o no arquivo de layout da atividade, como um elemento  
  - ou no código do aplicativo adicionando-o a um ViewGroup existente.
- No entanto, não é necessário que um fragmento faça parte do layout da atividade;
  - é possível usar um fragmento como um trabalhador invisível da atividade.
- O Android introduziu os fragmentos no Android 3.0 (API de nível 11)
  - para suportar projetos de telas grandes como dos tablets.
- Como a tela do tablet é muito maior que a do celular, há mais espaço para combinar componentes da UI. 
- Ao dividir o layout de uma atividade em fragmentos, é possível modificar a aparência da atividade em tempo de execução.
- Cada fragmento deve ser projetado como um componente modular e reutilizável da atividade.
- Cada fragmento define o próprio layout e comportamento com os próprios retornos de chamada do ciclo de vida.
- Ao projetar o aplicativo para ser compatível com tablets e celulares.
  - pode-se reutilizar os fragmentos em diferentes configurações de layout com base no espaço de tela.

##### Exemplo de como dois módulos de UI definidos pelos fragmentos podem ser combinados no tablet e no celular.

![Capturar](C:\Users\Karina Fedrizzi\Desktop\Capturar.PNG)



##### Criação de um fragmento

- Para criar um fragmento, é preciso criar uma subclasse de Fragment. 
- A classe Fragment tem um código que é muito parecido com o de uma Activity.
  - contém métodos semelhantes aos de uma atividade, como **onCreate(), onStart(), onPause() e onStop()**.
- Para converter um aplicativo para usar os fragmentos
  - basta mover o código dos métodos da atividade para os respectivos métodos do fragmento.
- Geralmente, deve-se implementar pelo menos os seguintes métodos de ciclo de vida:
  - **onCreate()** → chamado ao criar o fragmento 
  - **onCreateView()** → chamado no momento que o fragmento desenhar a interface do usuário pela primeira vez. 
  - **onPause()** → chamado com o primeiro indício de que o usuário está saindo do fragmento.

##### Adição de uma interface do usuário

- Para fornecer um layout para um fragmento, deve-se implementar o método onCreateView(), 
  
  - que será chamado no momento em que o fragmento deve desenhar o layout. 
- Para inflar um layout definido no XML 
  
- O método **onCreateView()** fornece um objeto **LayoutInflate**r
  
- O parâmetro container é o pai de **ViewGroup** (da atividade) onde o fragmento será inserido. 

- O parâmetro **savedInstanceState** é um Bundle que fornece dados sobre a instância anterior do fragmento.

- O método **inflate()** usa três argumentos: 

  - O ID de recurso do layout que será inflado. 
  - O ViewGroup que será pai do layout inflado. 

  - Um booleano que indica se o layout inflado deve ser anexado a ViewGroup. 
    - o valor falso indicaria que o sistema já está inserindo o layout inflado no container 
    - o valor verdadeiro criaria um grupo de exibições redundante no layout final.

  #### Há três maneiras de fornecer um ID para um fragmento que é utilizado para restaurar um fragmento:

  - especificando um código exclusivo ao android:id 
  - especificando uma string exclusiva ao atributo android:tag 
  - em caso de não fornecer nenhuma das alternativas anteriores, o sistema usará o código da exibição do container.

- Gerencia de fragmentos:

- O método **FragmentManager** permite gerenciar os fragmentos na atividade. 

  - chamando o método **getFragmentManager()**.

  #### Algumas funções do FragmentManager incluem:

  - Adquirir fragmentos existentes na atividade, com findFragmentById() ou findFragmentByTag(). 
  - Retirar os fragmentos da pilha de retorno com popBackStack(). 
  - Registrar uma escuta para as alterações na pilha de retorno com addOnBackStackChangedListener().

    #### Transações com fragmentos

- Cada transação é um conjunto de alterações que você deseja realizar ao mesmo tempo. 
- Pode-se realizar ações como adicionar, remover, substituir. 
  
  - os métodos são **add(), remove() e replace(),** respectivamente. 
- **O método commit()** efetiva a transação à atividade.

#### Exemplo de transações com fragmentos

- Antes de chamar commit(), pode-se chamar addToBackStack() para adicionar a transação a uma pilha de retorno de transações de fragmentos. 
- A pilha de retorno é gerenciada pela atividade e permite que o usuário retorne ao estado anterior do fragmento ao pressionar o botão Voltar.

#### Comunicação com a atividade

- Uma dada instância de um fragmento é diretamente vinculada à atividade que o contém, 
- O fragmento pode acessar a instância Activity com getActivity()
-  Da mesma forma, a atividade pode chamar métodos no fragmento adquirindo uma referência para o Fragment no **FragmentManager** usando **findFragmentById()** ou **findFragmentByTag().**

#### Processamento do ciclo de vida dos fragmentos

##### Um fragmento pode existir em três estados:

- **Resumed:** O fragmento é visível na atividade em execução. 

- **Paused:** Outra atividade está em primeiro plano, mas a atividade em que esse fragmento se encontra ainda está visível (a atividade de primeiro plano é parcialmente transparente ou não cobre a tela inteira). 

- **Stopped:** O fragmento não é visível. A atividade do host foi interrompida ou o fragmento foi removido da atividade mas adicionado à pilha de retorno. Um fragmento interrompido ainda está ativo (todas as informações de estado estão retidas no sistema).

- É possível reter o estado de um fragmento usando um Bundle quando a atividade for eliminada e precisar restaurar o estado do fragmento. 

- Pode-se salvar o estado durante o retorno de chamada de **onSaveInstanceState()** do fragmento e restaurá-lo no: 

  - **onCreate(),** 

  - **onCreateView() ou,**

  - **onActivityCreated().**

----------------------------------------------

#### Menu

- Menus são componentes comuns da interface do usuário em diversos tipos de aplicativos. 

- O menu apresenta uma interface amigável ao usuário

  -  fornece uma barra de opções para apresentar as ações comuns do aplicativo.

  #### Há três tipos fundamentais de menus: 

- Menu de opções e barra de aplicativos 

- Modo de ação contextual e menu de contexto 

- Menu pop-up

#### Menu de opções e barra de aplicativos

- O menu de opções é a coleção principal de itens de menu para uma atividade.
-  É onde se deve colocar as ações que têm impacto global no aplicativo, como: 
- "Cancelar“, 
- "Buscar", 
- "Escrever e-mail", 
- "Configurações".



- Modo de ação contextual e menu de contexto
  - Um menu de contexto é um menu flutuante que aparece quando o usuário realiza um clique longo em um elemento. 
  - como um clique longo em um item da ListView. 
  - Ele fornece ações que afetam o conteúdo selecionado ou a estrutura do contexto.
- Um menu de contexto é um menu flutuante que aparece quando o usuário realiza um clique longo em um elemento. como um clique longo em um item da ListView Ele fornece ações que afetam o conteúdo selecionado ou a estrutura do contexto.

- Menu pop-up 

  - Um menu pop-up exibe itens em uma lista vertical ancorada à exibição que apresentou o menu. 

  ​        bom para fornecer ações adicionais relacionadas a um conteúdo específico. 

  - As ações em um menu pop-up não devem afetar diretamente o conteúdo correspondente 

  - para isso que servem as ações contextuais.

- Definição de um menu em XML:

  - O menu e todos os seus itens devem ser definidos em um recurso de menu XML. 
  - É possível inflar o recurso do menu (carregá-lo como um objeto Menu) na atividade.

### Para definir o menu, crie um arquivo XML dentro do diretório res/menu/ do projeto e crie o menu com os seguintes elementos:

- < menu > Define um Menu (recipiente para os itens de menu) Um elemento < menu > deve ser o nó raiz Pode reter um ou mais elementos < item > e < group >.
-  < item > Cria um MenuItem (um único item em um menu) Pode conter um elemento < menu > aninhado para criar um submenu. 
- < group > Um contêiner invisível e opcional para < item >. Permite categorizar itens para que compartilhem propriedades como estado ativo e visibilidade.
- Atributos mais importantes do  de menu:

#### Atributos mais importantes do<item>  de menu

- android:id

  - droid:id Um ID de recurso exclusivo do item. 
  - Permite que o aplicativo reconheça o item quando o usuário o seleciona.

- android:icon

  - Uma referência a uma figura para ícone do item.

- android:title

  - Uma referência a uma string para título do item

- android:showAsAction

  - Especifica quando e como esse item deve aparecer como um item de ação na barra de aplicativos.

  #### Criação de um menu de opções

  - É preciso inflar o recurso do menu
    -  converter o recurso XML em um objeto programável usando **MenuInflater.inflate().**
  -  O método **add()** permite adicionar itens de menu 
  - O método **findItem()** permite recuperar os itens de menu.
  - O método onCreateOptionsMenu() é modificado 
    - para especificar o menu de opções para uma atividade.

  #### Processamento de eventos de clique

  - O método onOptionsItemSelected() é chamado quando um item do menu é selecionado 
    - inclusive os itens de ação na barra de aplicativos 
  - O método getItemId() retorna o ID único para o item de menu
    - definido pelo atributo android:id no recurso de menu 
    - ou em um número inteiro fornecido ao método add()
  - Quando processar um item de menu com sucesso, retorne true.
    - Caso contrário deverá chamar a implementação de superclasse de onOptionsItemSelected() que retornará falso.

  #### Criação de um Menu de contexto flutuante

  - Registre o View ao qual o menu de contexto deve estar associado chamando registerForContextMenu() e passe-o para View. 
  - Se a atividade usar ListView ou GridView e você quiser que cada item forneça o mesmo menu de contexto, 
    - registre todos os itens para um menu de contexto passando ListView ou GridView para registerForContextMenu(). 
  - Implemente o método onCreateContextMenu() em sua Activity ou Fragment.
  - Quando a exibição registrada receber um evento de clique longo, o sistema chamará o método onCreateContextMenu(). É aqui que você define os itens de menu, geralmente inflando um recurso de menu.

  #### Uso de itens de menu marcáveis

  -  Os itens de menu no menu de ícones (do menu de opções) não podem exibir uma caixa de seleção ou um botão de rádio. 
  - Caso escolha tornar marcáveis os itens no menu de ícones, pode-se definir o comportamento marcável
    - para itens individuais de menu usando o atributo **android:checkable** no elemento  
    - ou para um grupo inteiro com o atributo **android:checkableBehavior** no elemento.

  

  - O atributo android:checkableBehavior aceita: 
    - single 
      - Somente um item do grupo pode ser marcado (botões de rádio) 

  - all 
    - Todos os itens podem ser marcados (caixas de seleção) 

  - none 
    - Nenhum item é marcável

  -----------------------------------------------------------------

  

  

  





