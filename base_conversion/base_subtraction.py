from tkinter import N


n1 = 65451
n2 = 323

# faith is n2>n1

if n2 < n1:
    temp = n1
    n1 = n2
    n2 = temp
#
pow = 0
b = 6
conv = 0
c = 0

while n2 != 0:
    d1 = n1 % 10
    d2 = n2 % 10

    d = c + d2 - d1

    if d < 0:
        c = -1
        d += b
    else:
        c = 0

    conv += d * 10 ** pow
    pow += 1
    n1 //= 10
    n2 //= 10

print(conv)
