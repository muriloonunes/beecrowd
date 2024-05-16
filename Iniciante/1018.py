valor_inicial = int(input())
valor = valor_inicial
notas = [100,50,20,10,5,2,1]
quantidade = [0]*len(notas)

for i in range(len(notas)):
    quantidade[i] =valor//notas[i]
    valor %= notas[i]
    
print(valor_inicial)
print(f"{quantidade[0]} nota(s) de R$ 100,00")
print(f"{quantidade[1]} nota(s) de R$ 50,00")
print(f"{quantidade[2]} nota(s) de R$ 20,00")
print(f"{quantidade[3]} nota(s) de R$ 10,00")
print(f"{quantidade[4]} nota(s) de R$ 5,00")
print(f"{quantidade[5]} nota(s) de R$ 2,00")
print(f"{quantidade[6]} nota(s) de R$ 1,00")
