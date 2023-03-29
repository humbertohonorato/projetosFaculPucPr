import dht11_sensor, rele_controle,  time, server

# Configuração de limites
LIMIT_TEMP = 31
LIMIT_HUMID = 70

while True:
    """
    Looping a cada 15 segundos que mede a temperatura e umidade,
    envia para o servidor, liga ou desliga o rele de acordo com a necessidade
    """
    try:
        # Leitura de temperatura e umidade
        temp, humid = dht11_sensor.ler_temperatura_umidade()
        server.send_data_to_thingspeak(temp,humid)s

        # Verificação de limites para ligar o rele
        if temp > LIMIT_TEMP and humid > LIMIT_HUMID:
            print("Temperatura: {}, Umidade: {} - Ligando relé".format(temp, humid))
            rele_controle.estado(True)
        else:
            print("Temperatura: {}, Umidade: {} - Desligando relé".format(temp, humid))
            rele_controle.estado(False)
        
        time.sleep(15)
    except Exception as e:
        print("Erro: {}".format(str(e)))
        time.sleep(15)