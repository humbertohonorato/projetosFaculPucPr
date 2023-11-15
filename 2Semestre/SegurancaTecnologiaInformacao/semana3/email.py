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
