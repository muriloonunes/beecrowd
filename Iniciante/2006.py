tipo_cha = int(input())
respostas = list(map(int, input().split()))
acertos = respostas.count(tipo_cha)
print(acertos)
