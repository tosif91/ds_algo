n = 23543
b1 = 6
b2 = 8

conv_to_decimal = 0
pow = 0
# b1 -> D
while n!= 0:
    r = n % 10
    conv_to_decimal += r * b1 ** pow
    pow +=1
    n //=10

conv_to_b2=0
pow = 0
# D -> b2
while conv_to_decimal != 0:
    r = conv_to_decimal % b2
    conv_to_b2 += r * 10 ** pow
    pow += 1
    conv_to_decimal //= 10

print(conv_to_b2)
