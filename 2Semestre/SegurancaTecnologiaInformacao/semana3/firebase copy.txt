import pyrebase

firebaseConfig = {
  "apiKey": "AIzaSyCB4BBs_-R-JygVdrO5MgkxL9B9t0jN46M",
  "authDomain": "fir-pucpr-72e91.firebaseapp.com",
  "projectId": "fir-pucpr-72e91",
  "storageBucket": "fir-pucpr-72e91.appspot.com",
  "messagingSenderId": "377895248241",
  "appId": "1:377895248241:web:00336793be368323bcd6d0",
  "measurementId": "G-2XY8PVVLNB"
}

firebase = pyrebase.initialize_app(firebaseConfig)
db = firebase.database()
auth = firebase.auth()
storage = firebase.storage()

# cria usuario no firebase
try:
    user = input("Digite seu e-mail: ")
    password = input("Digite sua senha, com pelo menos 6 caracteres: ")

    if len(password) < 6:
        raise ValueError("A senha deve ter pelo menos 6 caracteres.")

    status = auth.create_user_with_email_and_password(user, password)
    print("Usuário criado com sucesso!")
except Exception as e:
    print("Erro durante a criação do usuário:", str(e))

# autentica usuario
try:
    user = input("Digite seu e-mail: ")
    password = input("Digite sua senha, com pelo menos 6 caracteres: ")

    if len(password) < 6:
        raise ValueError("A senha deve ter pelo menos 6 caracteres.")

    status = auth.sign_in_with_email_and_password(user, password)
    id_token = status["idToken"]

    print("Resultado: ", status)
    print("Token: ", id_token)

    info = auth.get_account_info(id_token)
    print("Info: ", info)
except Exception as e:
    print("Erro durante a criação do usuário:", str(e))



import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

try:
    server = "smtp.gmail.com"
    port = 587
    username = "seu_email@gmail.com"
    password = "sua_senha"

    mail_from = "seu_email@gmail.com"
    mail_to = "seu_email@gmail.com"
    mail_subject = "Segurança da Tecnologia da Informação"
    mail_body = "Olá Mundo, Python é Legal!!"

    mensagem = MIMEMultipart()
    mensagem['From'] = mail_from
    mensagem['To'] = mail_to
    mensagem['Subject'] = mail_subject
    mensagem.attach(MIMEText(mail_body, 'plain'))

    connection = smtplib.SMTP(server, port)
    connection.starttls()
    connection.login(username, password)
    connection.send_message(mensagem)
    connection.quit()

    print("E-mail enviado com sucesso!")

except Exception as e:
    print("Erro ao enviar e-mail:", str(e))
