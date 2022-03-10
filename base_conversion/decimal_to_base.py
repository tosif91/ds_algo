n = 48567
b = 6

conv = 0
pow = 0

while n != 0:
    r = n % b
    conv += r * 10**pow
    pow += 1
    n //= 10

print(conv)