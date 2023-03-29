from wifi_lib import connect_wifi
import network
 
def connect(ssid="ISAAH SIILVA 1", password="91324a913"):
    """
    Espera receber mas envia um ssid e password padrão e verifica se foi possivel conectar.
    """
    
    station = connect_wifi(ssid, password)
    if station == False:
        print("Nao conectado!...")
    else:
        print("Conectado!...")




