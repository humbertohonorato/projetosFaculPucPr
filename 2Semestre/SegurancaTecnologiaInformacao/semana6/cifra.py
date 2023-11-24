import time
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.asymmetric import rsa, padding
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.backends import default_backend
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
import base64

def gerar_par_de_chaves_rsa(tamanho_chave):
    private_key = rsa.generate_private_key(
        public_exponent=65537,
        key_size=tamanho_chave,
        backend=default_backend()
    )
    public_key = private_key.public_key()
    return private_key, public_key

def cifrar_rsa(mensagem, chave_publica):
    mensagem_bytes = mensagem.encode('utf-8')
    start_time = time.time()
    ciphertext = chave_publica.encrypt(
        mensagem_bytes,
        padding.OAEP(
            mgf=padding.MGF1(algorithm=hashes.SHA256()),
            algorithm=hashes.SHA256(),
            label=None
        )
    )
    end_time = time.time()
    return base64.b64encode(ciphertext), end_time - start_time

def decifrar_rsa(ciphertext, chave_privada):
    ciphertext = base64.b64decode(ciphertext)
    start_time = time.time()
    mensagem_bytes = chave_privada.decrypt(
        ciphertext,
        padding.OAEP(
            mgf=padding.MGF1(algorithm=hashes.SHA256()),
            algorithm=hashes.SHA256(),
            label=None
        )
    )
    end_time = time.time()
    return mensagem_bytes.decode('utf-8'), end_time - start_time

def gerar_chave_aes():
    return base64.urlsafe_b64encode(os.urandom(16))

def cifrar_aes(mensagem, chave_aes):
    cipher = Cipher(algorithms.AES(chave_aes), modes.ECB(), backend=default_backend())
    encryptor = cipher.encryptor()
    mensagem_bytes = mensagem.encode('utf-8')
    start_time = time.time()
    ciphertext = encryptor.update(mensagem_bytes) + encryptor.finalize()
    end_time = time.time()
    return base64.b64encode(ciphertext), end_time - start_time

def decifrar_aes(ciphertext, chave_aes):
    ciphertext = base64.b64decode(ciphertext)
    cipher = Cipher(algorithms.AES(chave_aes), modes.ECB(), backend=default_backend())
    decryptor = cipher.decryptor()
    start_time = time.time()
    mensagem_bytes = decryptor.update(ciphertext) + decryptor.finalize()
    end_time = time.time()
    return mensagem_bytes.decode('utf-8'), end_time - start_time

# Exemplo de uso
private_key, public_key = gerar_par_de_chaves_rsa(2048)
mensagem_original = "Esta é a mensagem secreta"

# Cifrar e decifrar usando RSA
mensagem_cifrada_rsa, tempo_cifrar_rsa = cifrar_rsa(mensagem_original, public_key)
mensagem_decifrada_rsa, tempo_decifrar_rsa = decifrar_rsa(mensagem_cifrada_rsa, private_key)

print(f"Mensagem original: {mensagem_original}")
print(f"Mensagem cifrada (RSA): {mensagem_cifrada_rsa.decode()}")
print(f"Mensagem decifrada (RSA): {mensagem_decifrada_rsa}")
print(f"Tempo de cifragem (RSA): {tempo_cifrar_rsa} segundos")
print(f"Tempo de decifragem (RSA): {tempo_decifrar_rsa} segundos")

# Gerar chave AES
chave_aes = gerar_chave_aes()

# Cifrar e decifrar usando AES
mensagem_cifrada_aes, tempo_cifrar_aes = cifrar_aes(mensagem_original, chave_aes)
mensagem_decifrada_aes, tempo_decifrar_aes = decifrar_aes(mensagem_cifrada_aes, chave_aes)

print(f"Mensagem cifrada (AES): {mensagem_cifrada_aes.decode()}")
print(f"Mensagem decifrada (AES): {mensagem_decifrada_aes}")
print(f"Tempo de cifragem (AES): {tempo_cifrar_aes} segundos")
print(f"Tempo de decifragem (AES): {tempo_decifrar_aes} segundos")
