celsius_str = input("Ingrese la temperatura en °C: ")

celsius = float(celsius_str)

fahrenheit = (celsius * 9 / 5) + 32

print(f"{celsius_str} °C equivalen a {fahrenheit:.1f} °F")
