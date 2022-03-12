n1 = 4567
n2 = 327612
b = 8

# code/////
pow = 0
c = 0
conv = 0

while n1 != 0 or n2 != 0 or c != 0:
    d1 = n1 % 10
    d2 = n2 % 10

    d = d1 + d2 + c
    if d >= b:
        c = d // b
        d = d % b
    else:
        c=0
    conv += d * 10 ** pow
    print(conv)
    n1 //= 10
    n2 //= 10
    pow +=1

print(conv)


