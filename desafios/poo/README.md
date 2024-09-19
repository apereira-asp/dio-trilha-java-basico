classDiagram
    Iphone7 <|-- ReprodutorMusical
    Iphone7 <|-- AparelhoTelefonico
    Iphone7 <|-- NavegadorNaInternet
    


    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorNaInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
