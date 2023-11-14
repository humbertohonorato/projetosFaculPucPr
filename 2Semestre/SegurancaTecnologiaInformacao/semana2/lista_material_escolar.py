# Criação do primeiro dicionário com 3 itens
dic_material_escolar1 = {
    '001': 'Lápis',
    '002': 'Caderno',
    '003': 'Borracha'
}

# Criação do segundo dicionário vazio
dic_material_escolar2 = {}

# Solicitação de 5 itens ao usuário para o segundo dicionário
while len(dic_material_escolar2) < 5:
    codigo_produto = input("Digite o código do produto: ")
    tipo_material = input("Digite o tipo do material: ")
    dic_material_escolar2[codigo_produto] = tipo_material

# Atualização do primeiro dicionário com o conteúdo do segundo
dic_material_escolar1.update(dic_material_escolar2)

# Impressão de todos os elementos da lista
print("\nLista de Material Escolar:")
for codigo, tipo in dic_material_escolar1.items():
    print(f"Código: {codigo}, Tipo: {tipo}")
