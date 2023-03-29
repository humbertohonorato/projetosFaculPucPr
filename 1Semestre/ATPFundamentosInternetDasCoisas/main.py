import monitor_temperatura_umidade, conecta_wifi

print("Inicializando MAIN")
conecta_wifi.connect()
monitor_temperatura_umidade()
