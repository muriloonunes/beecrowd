c = float(input())  #casos de teste
contador = 0
while contador<c:
    palavra = input()
    tempo = (len(palavra))/100
    print(f"{tempo:.2f}")
    contador+=1