import urequests, time

def send_data_to_thingspeak(temperatura, umidade):
    """
    Envia dados de temperatura e umidade para o ThingSpeak usando a API REST.
    """
    api_key = "0TTD524WBKCNQ5LY"
    url = "https://api.thingspeak.com/update?api_key={}&field1={}&field2={}".format(api_key, temperatura, umidade)

    try:
        print("Enviando dados para ThingSpeak...")
        response = urequests.get(url)
        response.close()
        if response.status_code == 200:
            print("Dados enviados com sucesso!")
        else:
            print("Erro ao enviar os dados. Código de status: ", response.status_code)
    except Exception as e:
        print("Ocorreu um erro ao enviar os dados: ", e)
