# Pedir el dato como texto para mantener el formato original introducido por el usuario
celsius_str = input("Ingrese la temperatura en °C: ")

# Convertir a número para operar
celsius = float(celsius_str)

# Realizar la conversión
fahrenheit = (celsius * 9 / 5) + 32

# Imprimir exacto como en el ejemplo (redondeado a 1 decimal)
print(f"{celsius_str} °C equivalen a {fahrenheit:.1f} °F")
