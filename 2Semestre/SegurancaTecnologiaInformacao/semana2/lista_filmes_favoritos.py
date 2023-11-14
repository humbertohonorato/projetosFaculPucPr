# Criação de uma lista vazia
lista_de_filmes = []

# Adição de 5 filmes à lista
for _ in range(5):
    nome_filme = input("Digite o nome de um filme: ")
    lista_de_filmes.append(nome_filme)

# Impressão dos filmes e suas posições na lista
print("\nLista de Filmes Favoritos:")
for posicao, filme in enumerate(lista_de_filmes, 1):
    print(f"{posicao}. {filme}")
