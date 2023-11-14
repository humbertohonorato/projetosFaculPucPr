# Estrutura de lista para armazenar os dados dos alunos
dados_alunos = []

# Estrutura de dicionário para armazenar os dados de cada aluno com a matrícula como chave
alunos = {}

# Cadastro de cinco alunos
for _ in range(5):
    matricula = input("\nAdicione um valor para matrícula: ")
    nome = input("Adicione um valor para nome: ")
    sobrenome = input("Adicione um valor para sobrenome: ")
    email = input("Adicione um valor para e-mail: ")

    # Adiciona os dados do aluno à lista
    dados_alunos.append({'Matrícula': matricula, 'Nome': nome,
                        'Sobrenome': sobrenome, 'E-mail': email})

    # Adiciona os dados do aluno ao dicionário com a matrícula como chave
    alunos[matricula] = {'Nome': nome, 'Sobrenome': sobrenome, 'E-mail': email}

# Impressão dos dados de todos os alunos e suas matrículas
print("\nDados de Todos os Alunos:")
for aluno in dados_alunos:
    print(f"\nMatrícula: {aluno['Matrícula']}")
    print(f"Nome: {aluno['Nome']} {aluno['Sobrenome']}")
    print(f"E-mail: {aluno['E-mail']}")
