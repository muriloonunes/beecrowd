a,b,c=list(map(float,input().split()))
if b > a and b > c: 
    temp = a
    a = b
    b = temp
elif c > a:
    temp = a
    a = c
    c = temp
        
if a >= b + c:
    print("NAO FORMA TRIANGULO")
else:
    if a * a == b * b + c * c:
        print("TRIANGULO RETANGULO")
    elif a * a > b * b + c * c:
        print("TRIANGULO OBTUSANGULO")
    elif a * a < b * b + c * c:
        print("TRIANGULO ACUTANGULO")
    if a == b and b == c:
        print("TRIANGULO EQUILATERO")
    elif a == b or b == c or a == c:
        print("TRIANGULO ISOSCELES")