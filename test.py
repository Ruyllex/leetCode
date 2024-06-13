def decorador_saludo(func):
    def wrapper(nombre):
        print("Hola", end=' ')
        func(nombre)
        print("¡Bienvenido!")
    return wrapper

@decorador_saludo
def saludar(nombre):
    print(nombre)

# Uso del decorador
saludar("Juan")