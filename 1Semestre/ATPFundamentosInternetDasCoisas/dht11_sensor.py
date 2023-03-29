import dht, machine

def ler_temperatura_umidade(pino=15):
    """
    Lê o sensor DHT11 e retorna a temperatura e a umidade.
    """
    try:
        sensor = dht.DHT11(machine.Pin(pino))
        sensor.measure()
        temp, umid = sensor.temperature(), sensor.humidity()
        
        if temp is not None and umid is not None:
            print("Leitura do sensor DHT11 realizada com sucesso: Temperatura={}°C, Umidade={}%"\
                  .format(temp, umid))
            return temp, umid
        else:
            raise ValueError("Leitura do sensor DHT11 falhou: valores inválidos lidos.")
    except Exception as e:
        print("Erro ao ler sensor DHT11: {}".format(str(e)))
        raise e