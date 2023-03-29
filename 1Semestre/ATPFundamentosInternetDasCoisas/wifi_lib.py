import network, time

def connect_wifi(ssid, password):
    """
    Espera receber um ssid e password faz a conexão com a internet wifi
    """
    station = network.WLAN(network.STA_IF)
    station.active(True)
    station.connect(ssid, password)
    print("Tentando conectar...")
    for t in range(50):
        if station.isconnected():
            print("Conectado!")
            return True
        time.sleep(0.1)
    print("Falha ao conectar!")
    return False

