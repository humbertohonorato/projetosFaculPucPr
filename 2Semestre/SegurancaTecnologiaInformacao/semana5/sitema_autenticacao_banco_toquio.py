import hashlib

class SistemaAutenticacao:
    def __init__(self):
        # Inicializa a lista de usuários
        self.usuarios = {}
        # Carrega os usuários do arquivo ao iniciar o sistema
        self.carregar_usuarios()

    def carregar_usuarios(self):
        try:
            # Tenta abrir o arquivo de usuários
            with open('usuarios.txt', 'r') as file:
                for line in file:
                    nome, senha_hash = line.strip().split(',')
                    self.usuarios[nome] = senha_hash
            print("Usuários carregados com sucesso.")
        except FileNotFoundError:
            print("Nenhum arquivo de usuários encontrado. Será criado ao salvar.")

    def salvar_usuarios(self):
        # Salva os usuários no arquivo
        with open('usuarios.txt', 'w') as file:
            for nome, senha_hash in self.usuarios.items():
                file.write(f"{nome},{senha_hash}\n")

    def cadastrar_usuario(self, nome, senha):
        # Usa MD5 para armazenar senhas de forma "segura"
        hashed_senha = hashlib.md5(senha.encode()).hexdigest()
        self.usuarios[nome] = hashed_senha
        print(f"Usuário {nome} cadastrado com sucesso!")
        # Salva os usuários após cada cadastro
        self.salvar_usuarios()

    def autenticar_usuario(self, nome, senha):
        if nome in self.usuarios:
            # Verifica se a senha fornecida coincide com a senha armazenada
            hashed_senha = hashlib.md5(senha.encode()).hexdigest()
            if self.usuarios[nome] == hashed_senha:
                print(f"Bem-vindo, {nome}!")
            else:
                print("Autenticação inválida!!")
        else:
            print("Autenticação inválida!!")

# Exemplo de uso
sistema = SistemaAutenticacao()

while True:
    print("\n1. Cadastrar Usuário")
    print("2. Autenticar Usuário")
    print("3. Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == '1':
        nome = input("Digite o nome do usuário: ")
        senha = input("Digite a senha: ")
        sistema.cadastrar_usuario(nome, senha)
    elif opcao == '2':
        nome = input("Digite o nome do usuário: ")
        senha = input("Digite a senha: ")
        sistema.autenticar_usuario(nome, senha)
    elif opcao == '3':
        print("Saindo do programa. Até logo!")
        break
    else:
        print("Opção inválida. Tente novamente.")