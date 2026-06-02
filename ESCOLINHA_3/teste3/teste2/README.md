# Estrutura de Pastas — Colégio São Rafael

## Organização dos Arquivos

Os arquivos do projeto foram organizados em pastas separadas para melhor manutenção e escalabilidade:

```
teste2/
├── html/
│   ├── index.html                 # Página principal
│   ├── mais-noticias.html         # Página com mais notícias
│   │
│   ├── Notícias Principais:
│   ├── bloco-b.html               # Reforma do bloco B
│   ├── quadra.html                # Nova quadra coberta
│   ├── olimpiada.html             # Olimpíada Interna
│   ├── semana-cultural.html       # Semana Cultural
│   ├── festa-junina.html          # Festa Junina
│   ├── fachada.html               # Pintura externa
│   ├── sala-tecnologia.html       # Sala de tecnologia
│   │
│   ├── Mais Notícias:
│   ├── dia-do-professor.html      # Dia do Professor
│   ├── feira-ciencias.html        # Feira de Ciências
│   ├── intercambio.html           # Programa de Intercâmbio
│   ├── bolsas-estudos.html        # Bolsas de Estudos
│   ├── campeonato-esportivo.html  # Campeonato Esportivo
│   ├── cursao-idiomas.html        # Cursos de Idiomas
│   ├── biblioteca-maior.html      # Biblioteca Expandida
│   └── mostra-talentos.html       # Mostra de Talentos
│
├── css/
│   ├── styles.css                 # Estilos da página principal
│   └── noticia.css                # Estilos das páginas de notícia
│
└── imagens/
    └── [Aqui irão as imagens do projeto]
```

## Descrição das Pastas

### `/html`
Contém todos os arquivos HTML do projeto:
- **index.html**: Página inicial com 6 notícias principais e botão "Ver mais notícias"
- **mais-noticias.html**: Galeria com 8 notícias adicionais
- Páginas detalhadas de cada notícia com conteúdo completo

### `/css`
Contém os arquivos de estilos CSS:
- **styles.css**: Estilos gerais, cards, grid, botão de mais notícias
- **noticia.css**: Estilos específicos das páginas internas de notícias

### `/imagens`
Pasta dedicada para armazenar all as imagens do projeto (referências nos HTML apontam para `../imagens/`)

## Como Usar

### Para abrir a página inicial:
Abra `/html/index.html` no navegador

### Para adicionar novas notícias:
1. Copie um arquivo HTML existente da pasta `/html`
2. Renomeie e edite o conteúdo
3. Adicione os links correspondentes nas páginas index e mais-noticias
4. Atualize os caminhos de CSS (`../css/`)

### Para adicionar imagens:
1. Coloque as imagens na pasta `/imagens`
2. Referencie nos HTML com `../imagens/nome-da-imagem.jpg`

### Para editar estilos:
- Estilos gerais: edite `/css/styles.css`
- Estilos de notícias: edite `/css/noticia.css`

## Estrutura de Links

Os links entre páginas usam caminhos relativos (`./` para arquivos no mesmo nível):
- De `html/index.html` para `html/festa-junina.html`: `./festa-junina.html`
- Referência a CSS de qualquer página HTML: `../css/styles.css`

## Próximos Passos

1. **Adicionar imagens** na pasta `/imagens`
2. **Preencher conteúdo real** nas páginas de notícias
3. **Criar página de contato** ou **página "Sobre" a escola**
4. **Adicionar menu de navegação** no topo (opcional)
5. **Implementar responsividade mobile** se necessário

---

**Atualizado em:** 2 de junho de 2026
**Desenvolvido para:** Colégio São Rafael
