produtos = int(input())
contador = 0
preco_total = 0

while contador < produtos:
    codigo, quantidade = map(int, input().split())
    preco_produto = 0

    if codigo == 1001:
        preco_produto = quantidade * 1.5
    elif codigo == 1002:
        preco_produto = quantidade * 2.5
    elif codigo == 1003:
        preco_produto = quantidade * 3.5
    elif codigo == 1004:
        preco_produto = quantidade * 4.5
    elif codigo == 1005:
        preco_produto = quantidade * 5.5

    contador += 1
    preco_total += preco_produto

print('{:.2f}'.format(preco_total))
