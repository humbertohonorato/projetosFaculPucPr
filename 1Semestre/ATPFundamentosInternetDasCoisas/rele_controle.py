import machine

def estado(novo_estado=False, num_pino=13):
    """
    Liga ou desliga o relé (True para ligar, False para desligar).
    """
    try:
        pin = machine.Pin(num_pino, machine.Pin.OUT)
        pin.value(novo_estado)
        if novo_estado:
            print("Relé no pino {} ligado".format(num_pino))
        else:
            print("Relé no pino {} desligado".format(num_pino))
    except Exception as e:
        print("Erro ao controlar relé no pino {}: {}".format(num_pino, e))

