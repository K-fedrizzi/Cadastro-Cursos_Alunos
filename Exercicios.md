### Exercícios de Programação de Dispositivo Moveis P1

#### Responda e justifique as questões abaixo:

1. **O Android é uma pilha de software dividido em varias camadas e possui código fonte aberto. Cite e explique resumidamente cada camada.**

   **Resposta:** 

   **Camada de Abstração:** Fornece interfaces que expõem capacidade de hardware do dispositivo para estrutura do Java, consiste em módulos de biblioteca que implementa uma interface para um tipo especifico de componente tipo modulo de câmera e bluetooth, faz chamada por um framework API para acessar o hardware do dispositivo. Possui bibliotecas de execução como android Runtime e também do C e C++.

   **Camada Java API Framework:** Nessa camada ficam os APIs de gerenciadores como de atividades, janelas, recursos, notificações etc, Os APIs forma blocos de programação que simplifica a reutilização de componentes e serviços. 

   Possui uma estrutura com  um sistema de visualização com listas, grades, caixas de texto, botões, etc. 

   Possui gerenciador de notificação que permite que o aplicativo exiba alertas. 

   Possui um gerenciador de atividade que gerencia ciclo de vida dos aplicativos.

   Possui provedores de conteúdo que permite aplicativos acessem dados de outros aplicativos. 

   **Camada de Aplicativos do Sistema:** Nessa camada possui um conjunto de aplicativos principais como e-mail, envio de sms, calendários, navegadores de internet, câmera, contatos etc.

    Possui instalação do androide de alguns componentes que podem ser instalado como SDK Platform, Google APIs, Google Repository, Intel ou ARM System Images.

   

2. **Cada Activity do Android deve obrigatoriamente ser declarada no arquivo AndroidManifest.xml. Em relação a uma Activity:**

   - **O que e uma Activity e como são organizadas?** 

     **Resposta:** 

     Ela é uma única tela da aplicação(único modulo e independente esta relacionado diretamente com outra tela de interface de usuário e suas funcionalidades). São organizadas em pilhas(Last in First out) e possuem um ciclo de vida.

   - **Quais estados podem estar uma Activity?**

     **Resposta:** O estado dela e determinado pela sua posição na pilha.

     **Resumed:** Atividade esta em primeiro plano na tela, tem foco do usuário (chama-se estado de execução).

     **Paused:** Atividade ainda esta visível, mas outra atividade esta em foco(em primeiro plano). Outra atividade esta visível por cima desta e esta parcialmente transparente ou não cobre inteiramente a tela.

     **Stopped:** Atividade esta totalmente suplantada por outra(atividade passa para o segundo plano). ela não fica mais visível p/ o usuário e pode ser eliminada pelo sistema se a memoria for necessário em outro processo.

3. **O SDK Manager instala as plataformas do Android criando Emuladores para cada Sistema Operacional. Cite e explique quais são os pacotes instalados pelo SDK Manager?**

   **Resposta:**

   SDK Platform

   Google APIs

   Google Repository

   Intel ou ARM System Images

   Android Support Library

   Extras do Google Play Store

   Documentation, Samples e Sources

4. **Cite e explique os quatro principais arquivos dos projetos Android.**

   **Resposta:**

   1. **Manifest**: contém o arquivo AndroidManifest.xml. 

   2. **java:** contém os arquivos de código-fonte do Java, incluindo o código de teste do JUnit.

   3. **recursos:** contém todos os recursos que não são código, como layouts XML, strings de IU e imagens em bitmap. 

   4. **gradle:** Contém todos os arquivos da compilação.

      

5. **Uma aplicação é formada por código e recursos(Resources).**

   - **O que são Resources?** 

     **Resposta:**  tudo que não é código, incluindo arquivos de layout, pacotes de linguagem, imagens, arquivos de áudio/vídeo, etc.  

     

   - **Quais os Resources do projeto Android?** 

     **Resposta:** MyActivity.java, source code Java

     

   - **Como são definidos e acessados os recursos a partir do arquivo Java?**

     **Resposta:** São definido de forma declarativa através do XML. Cada resources tem um nome/identificador
     
     podem ser acessados no código Java através da classe R, que funciona como um centralizador entre mundo Java e o mundo dos resources.(gera automaticamente e nem precisa modifica-lo, recriando em caso de mudanças no diretório res/).
     
     

6. **O que é um Constraint Layout e como definir a posição de uma view no Constraint Layout?**

   ​                                                                             **Resposta:**

   Permite que agente cria layouts grandes e complexos com uma hierarquia no seu XML, sem a necessidade de ficar aninhado um monte de layout uns dentro dos outros, e similar ao Relative Layout, uma vez que todas as views se relacionam entre si e com parent(são mais flexível e mais fácil de usar).Possui melhores características, o que nos permite interfaces bem distribuídas e simples de construir.

   Para definir a posição de uma view no constraintLayout deve adicionar ao menos uma constraint Horizontal, e um vertical para a view, e cada constraint representa uma conexão ou alinhamento em relação a outra view.

   

7. **Descreva em detalhes o ciclo de vida de uma Activity citando quais métodos do ciclo de vida são invocados a cada Transição. Desenhe e descreva!**

   **Resposta:**

   **onCreate()** É método chamado quando atividade e criada pela primeira vez, e onde se deve fazer toda a configuração estática normal, criar exibições, vincular dados a listas etc. Esse método recebe um objeto Bundle(pacote) contendo o estado anterior da atividade, caso estado seja capturado. Sempre seguido de onStart.

   

   **onStart():** Método chamado logo antes da atividade se torna visível ao usuário. seguido de onResume().

   

   **onResume():** Método chamado logo antes da atividade iniciar a interação com o usuário. Nesse ponto a atividade estará no topo da pilha de atividades com entrada do usuário direcionada a ela. Sempre seguido de onPause().

   

   **onPause():** Método é chamado quando sistema esta preste a retomar outra atividade. Usado para confirmar alterações não salvas a dados persistentes, animações interrompidas e outras coisas que talvez estejam consumindo CPU. Deve fazer tudo rápido porque próxima atividade não será retomada ate ela retornar. Seguido de onResume() se atividade retornar para frente ou de onStop() se ficar visível ao usuário.

   

   **onStop():** Método chamado quando atividade não esta mais visível ao usuário, Isso pode acontecer pq ela esta sendo destruída ou pq outra atividade dois retomada e esta conbrido-a. Seguido de onRestart() se atividade estiver voltando a interagir com o usuário ou onDestroy() se estiver saindo.

   

   **onRestart():** Método chamado depois que atividade tiver sido interrompida, logo antes de ser reiniciada. Sempre seguindo de onStart().

   

   **onDestroy():** Método chamado antes de a atividade ser destruída, e a ultima chamada que a atividade recebera, pode ser chamado pq atividade esta finalizando(alguém chamou finsh())ou pq o sistema esta destruído temporário essa instancia da atividade para poupar espaço. É possível distinguir entre essas duas situações com método isFinishing().

   

8. **Activities podem utilizar Extras ou Bundles. O que são essas informações e quais métodos são utilizados para adicionar estas informações?**

   **Resposta:** 

   **Extras:** São pares de valor-chave que carregam informações adicionais necessárias para realizar a ação solicitada. Algumas ações determina tipos de URIs de dados e outras usam determinados extras. É Possível adicionar dados extras com diversos métodos putExtra(), cada um aceita dois parâmetros nome principal e valor. 

   -----------------------------------------------------------

   **Bundles:** São objetos utilizados entre atividades com a intenção de passar informação entre os componentes. Representa um conjunto de pares "chave/valor". Permite guardar valores de qualquer tipo primitivo. chave sempre vai ser tipo String, já valor pode usar tipos primitivos e objetos do tipo String etc.

   **Métodos:**  inserir na Intent com PutExtra().

   

9. **Um Space Color é usado para identificar uma organização especıfica de cores. Qual Resource e utilizado para criar cores para a aplicação? Cite uma forma de definição de cores no Android.**

   

10. **Os recursos de string fornecem strings de texto para o aplicativo com estilo e formatação de texto opcional.**

    - **Quais os três tipos de recursos que podem fornecer strings ao seu aplicativo?** 

      **Resposta:**

      **String:** Recurso XML que fornece uma só string. 

      **Matriz de strings** Recurso XML que fornece uma matriz de strings. 

      **Strings de quantidade (plurais)** Recurso XML que contém diferentes strings para pluralização.

      Todas as Strings podem aplicar algumas marcações de estilo e argumentos de formatação.

    - **Quais métodos permitem recuperar uma String?** 

      **Resposta:**

      String string = getString(R.string.hello);

      ou pode-se usar também getText(int) para recuperar uma string. 

      o getText(int) manterá qualquer estilo de texto avançado aplicado à string.

      

    - **Cite três exemplos de estilos que podem ser adicionados as strings HTML.**

      **Resposta:**
      
      < b > para texto em negrito. 
      
      < i > para texto em itálico. 
      
      < u > para sublinhar o texto.

    

11. **Explique qual a utilidade das classes RadioGroup e RadioButton**?


​      **Resposta:**

​	Usadas para criar um escopo de exclusão múltipla para um conjunto de botões RadioButton.

​	Tem capacidade de selecionar somente um RadioButton do conjunto, quando usuário seleciona um radioButtonos outros sao 	automaticamente desmarcados. Inicialmente todos os botões de radio estão desmarcados. A seleção e identificada pelo id exclusivo do botão conforme definido no arquivo XML.



12.**Os Controles giratórios (Spinners) oferecem uma forma rápida de selecionar um valor de um conjunto. Cite uma forma que pode ser utilizada para preencher o controle giratório.**

**Resposta:**

As opções fornecidas para controle giratório pode ter qualquer origem mas deve ser informado por meio de um SpinnerAdapter como um ArrayAdapter, se as opções estiver disponíveis em uma matriz ou em um CursorAdapter, se as poções estiver disponíveis em uma consulta de banco de dados.

13.**Como localizamos um elemento adicionado no layout(botão, textView ou editView) e manipulamos na classe Java?**

**Resposta:** 

Cada arquivo de layout deve conter exatamente um elemento raiz, que deve ser um objeto View ou ViewGroup.(Com o elemento raiz definido e possível adicionar objetos).

Através da extensão.xml no diretório res/layout/.



14.**Descreva duas formas de codificação/implementação para que os Buttons possam responder a ação do click do usuário.**

**Resposta:**



15.**Os intents permitem iniciar uma atividade em outro aplicativo descrevendo uma ação simples que você gostaria de executar.**

**Resposta:**

Para iniciar outra atividade, é possível chamar startActivity() passando uma Intent.

a Intent serve para especificar a atividade exata que deve ser iniciada (que pode ser ate de um outro aplicativo). também pode ser portar pequenas quantidades de dados a serem usados pela atividade iniciada.

- **Cite 5 exemplos de ações que podem ser realizadas com intents.** 

  **Resposta:**

    Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);

    Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER);

   Intent intent = new Intent(Intent.ACTION_INSERT);

   Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

   Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);

  

- **De um exemplo de como iniciar uma outra atividade chamada Segunda Atividade utilizando um intent.**

  Para iniciar outra atividade, é possível chamar startActivity() passando uma Intent  
  
  
  
  16. **A tarefa mais básica efetuada pelo método onCreate e carregar um layout. O layout define a estrutura visual para uma interface do usuário, como a IU de uma atividade.**
  
  - **Em qual diretório o arquivo layout .xml devera ser salvo?** 
  
      **Resposta:** extensão.xml no diretório res/layout/ 
  
    ​	
  
  - **Qual método chama um layout dentro do .onCreate() para carregar o recurso de layout do codigo do aplicativo?**
  
    **Resposta: **setContentView();  
  
  
  
  - **Como fazer a referencia a um arquivo de layout chamado layout file name?**
  
    **Resposta:**  R.layout.layout_file_name  



17. **Em relação a View:**

-  **Todos os grupos de exibições contem largura e altura. O que significam os parâmetros: wrap content e match parent?** 

****  **Resposta:** 

​	**wrap_content :** Instrui a exibição a se redimensionar de acordo com as medidas exigidas pelo conteúdo.  

​	**match_parent :** instrui a exibição a assumir o maior tamanho permitido pelo grupo de exibições pais.  



- **Cite três tipos de margens que podem ser utilizadas para especificar espaços em componentes da View.**

  **Resposta:**

  marginTop

  marginLeft

  marginRight

  

-   **Como funciona o Layout Relativo e o Layout Linear.** 

  **Resposta:**

​	**Layout Linear:** Organiza os filhos em uma única linha horizontal ou vertical. 

​							 	Cria uma barra de rolagem se o comprimento da janela excede o comprimento da tela. 

​								É um grupo de visualização que alinha todos os filhos em uma única direção vertical ou horizontal pode especificar 								a direção do layout com atributo android:orientation. é compatível com a atribuição de uma ponderação a filhos 								individuais com o atributo android:layout_weidht. 

​								Esse atributo confere um valor de importância a uma visualização em relação a quantidade de espaço que ela deve 								ocupar na tela. 

​						  	Um valor de ponderação maior permite que ela se expanda para preencher qualquer espaço restante na visualização 							  pai.

​						      Ponderação padrão é zero.

​								Distribuição desigual - Se houver três campos de texto, dois deles tiverem uma ponderação 1,  o terceiro tiver uma 								ponderação 2 (em vez de 0),  o último será declarado mais importante que os outros e ficará com metade do espaço 								total restante,  os dois primeiros campos compartilharão o resto igualmente.  

​	**Layout Relativo:**  Permite especificar a localização de objetos filhos relativos entre si (filho A á esquerda do filho B) ou relativos aos 								   pais(alinhados no topo do pai).

​									

- **Explique para que são utilizados um Adapter, um ArrayAdapter e um SimpleCursorAdapter.** 

  **Resposta:**

  **Adapter:** Para recuperar os dados de uma fonte externa e cria uma View que representa cada entrada de dados.

  

   **ArrayAdapter:** Usa esse adaptador quando a fonte de dados for uma matriz. Cria uma exibição para cada item de matriz chamado toString() em cada item e posicionando o conteúdo em uma TextView.

  **** Exemplo para exibir uma matriz de strings em uma ListView, inicialize um novo ArrayAdapter especificando o layout e a matriz de String (myString), em seguida chame o setAdpter() na ListView.

  

  **SimpleCursorAdapter:** Utilizado quando os dados vierem de um cursor. É necessário especificar um layout para cada linha no cursor e que colunas no cursor devem ser inseridas. 

  Exemplo: Pode-se executar uma consulta que retorna um cursor que contem uma linha para cada pessoa e colunas para os nomes e números, depois, crie uma matriz de strings que especifique quais colunas do cursor estarão no layout para cada resultado, e uma matriz de números inteiros especificando as exibições correspondentes em que cada coluna deve ser colocada.

  

- **Cite e explique quais os tipos de dimensões no Android.** 

     **Layout_widht e Layout_heidht**	

   **São recomendados:**

    **wrap_content:** instrui a exibição a se redimensionar de acordo com as medidas exigidas pelo conteúdo.  

    **match_parent:** instrui a exibição a assumir o maior tamanho permitido pelo grupo de exibições pais.

    

- **O que é uma ListView e qual método e utilizado para preencher a ListView?**

  **Resposta:**

  Visualização em lista -  ListView é um  grupo de exibições que exibe uma lista de itens roláveis. Os itens da lista são inseridos automaticamente na lista usando um adapter(O adpter obtém conteúdo de uma origem como uma matriz ou consulta de banco de dados, depois converte cada resultado de item em uma exibição).

   

18. **Para que serve um Toast e um SnackBar? Faça uma comparação dos dois recursos.** 

    **Resposta:**

    **Toast:** Fornecer feedback simples sobre uma operação em um pequeno popup. Preenche a quantidade de espaço necessário para a mensagem. Activity atual permanece visível e interativa. Desaparecem automaticamente após um tempo limite.

    

    **SnackBar:** É um novo componente introduzido com a biblioteca de material Design como um substituto de um toast. São utilizados para mostrar mensagens na parte inferior do aplicativo com deslizamento ativado. Pode conter um botão de ação opcional.

    Tem um botão UNDO, que restaura o item que acabou de ser removido.

     **Comparações :**

     Diferença e que  Toast as mensagens podem ser personalizadas e impressas em qualquer lugar da tela. Já o Snackbar só pode ser exibido na parte inferior da tela. 

    ​    Outra diferença que uma mensagem do Toast não tem botão de ação ja o Snackbar pode ter o botãode ação opcional. no entanto o snackbar não deve ter mais de um botão de ação.

    Outra diferença e que Toast não pode desativar mensagem ate que o limite de tempo termine, ja o Snackbar pode ser apagado antes do limite de tempo.

    

19. **Crie um Toast para exibir a frase “Programação para dispositivos moveis” e exiba-o por um tempo longo.**

    **Resposta:**

    Context context = getApplicationContext();

    CharSequence text = "Programação para dispositivos moveis ";

    int duration = Toast.LENGHT_SHORT;

    Toast toast =  Toast.makeText(content, text, duration);

    toast.show();

    

20. **Descreva o código para reproduzir um áudio sound3.mp3 utilizando um objeto MediaPlayer.** 

    **Resposta:**

    MedialPlayer mediaPlayer = MediaPlayer.create(context, R.raw.sound_file_1);

    mediaPlayer.start();

    

21. **Descreva os estados de um objeto MediaPlayer?**

    **Resposta:**

    Quando é criado um novo Media Player, ele está no estado ocioso  

    É inicializado chamando o método setDataSource().

    Passa para preparado com o método prepare() ou prepareAsync().  

    A partir deste estado pode ir para os estados executando, pausado ou Playback Completed chamando métodos como start(), pause() e seekTo().  

    Com o método stop(), para de executar.  

    

22. **O que é um Floating Action Button?** 

    **Resposta:**

    É um botão flutuante que é usado para executar uma ação, tem forma de ícone circular. Apenas um botão e recomendado por tela para representar a ação mais comum.

    

23. **Em relação aos Menus:**

- **Explique os três tipos fundamentais de Menus.**  

    **Resposta:** 

​	**Menu de opções e barra de aplicativos:**

​	Possui opções e a coleção principal de itens de menu para uma atividade(Cancelar, Buscar, Escrever e-mail, Configurações).

​	**Modo de ação contextual e menu de contexto:**

​     Menu de contexto é um menu flutuante que aparece quando o usuário realiza um clique longo em um elemento. Com um clique longo em um item da ListView. Fornece ações que afetam o conteúdo selecionado ou estrutura do contexto.



**Menu pop-up:**

​     Exibe itens em uma lista vertical ancorada a exibição que apresentou o menu(fornece ações adicionais relacionadas a um conteúdo especifico). As ações em um menu pop-up não deve afetar diretamente o conteúdo correspondente para isso que serve as ações contextuais. Definições de um menu em XML.



- **Na definição de um item de menu, quais os atributos mais importantes?** 

  **android:id**  ->  droid:id Um ID de recurso exclusivo do item. Permite que o aplicativo reconheça o item quando o usuário o seleciona.

  **android:icon** - > Uma referência a uma figura para ícone do item.

  **android:title** - > Uma referência a uma string para título do item.

  **android:showAsAction** - > Especifica quando e como esse item deve aparecer como um item de ação na barra de aplicativos.

  

-  **Qual método e modificado para especificar o menu de opções para uma atividade e qual método é chamado quando um item do menu e selecionado?**

   Para especificar o menu de opções para uma atividade o método onCreateOptionsMenu() é modificado.

​	Quando um item do menu é selecionado método onOptionsItemSelected(). 



24. **O que é um GridView e quais seus principais atributos.**

    É um ViewGroup que exibe itens em uma grade rolável bidimensional, Itens são inseridos automaticamente no layout usando um ListAdpter, exibições recuperada do adaptador, elementos devem ter mesmo tamanho. A diferença de um ListView é que os itens são colocado em uma grade em vez de uma lista.

    

    **Atributos:** 

    **android:columnWidth:** Especifica a largura fixa para cada coluna. 

    **android:gravity:** Especifica a gravidade dentro de cada célula. 

    **android:horizontalSpacing:** Define o espaçamento horizontal padrão entre as colunas. 

    **android:numColumns:** Define quantas colunas mostrar. 

    **android:stretchMode:** Define como as colunas devem se estender para preencher o espaço vazio disponível, se houver. **android:verticalSpacing:** Define o espaçamento vertical padrão entre linhas.

    

25. **Fragmentos:**

    

    **a) Explique o que é e por que foi criado.** 

    **Resposta:**

    Fragmentos representa comportamento ou uma parte da interface do usuário na activity, é possível combinar vários fragmento em diversas atividades.

    Um fragmento é como uma seção modular de uma atividade e tem próprio ciclo de vida, recebe os próprios eventos de entrada, pode ser adicionado ou removido em uma atividade. eles deve sempre ser embutido em uma atividade. 

    O ciclo de vida é diretamente impactado pelo ciclo devida da atividade do host.(quando atividade e pausada todos os fragmentos também são, e quando a atividade e destruída, todos os fragmentos também são). Cada um processado de forma independente, como adicionar ou remove-los.(são adicionado na pilha de retorno da atividade, e cada entrada da pilha e um registro da transação do fragmento que ocorreu, a pilha de retorno permite que o usuário inverta uma transação).

    

    **b) E possível adicionar mais de um fragmento a uma atividade?** 

    **Resposta:**

    sim é possível combinar vários fragmentos em uma única atividade.

    

    **c) Quais as formas de inserir um fragmento em um layout?** 

    **Resposta:**

    declarando-o no arquivo de layout da atividade, como um elemento  

    ou no código do aplicativo adicionando-o a um ViewGroup existente.

    

    **d) Como é criado um fragmento?** 

    **Resposta:**

    Para criar um fragmento, é preciso criar uma subclasse de Fragment.  A classe Fragment tem um código que é muito parecido com o de uma Activity. contém métodos semelhantes aos de uma atividade, como **onCreate(), onStart(), onPause() e onStop()**.

    

    **e ) Quais métodos geralmente são geralmente implementados em seu ciclo de vida? Qual método fornece um layout para um fragmento?**

    **onCreate()** → chamado ao criar o fragmento 

    **onCreateView()** → chamado no momento que o fragmento desenhar a interface do usuário pela primeira vez. 

    **onPause()** → chamado com o primeiro indício de que o usuário está saindo do fragmento.

    Para fornecer um layout para um fragmento, deve-se implementar o método onCreateView().(que será chamado no momento em que o fragmento deve desenhar o layout.)