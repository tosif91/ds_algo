n = 45612
b1 = 8

conv = 0
pow = 0

while n!=0:
    r = n % 10
    conv += r* b1**pow
    pow +=1
    n //= 10

print(conv)
