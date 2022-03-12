def baseAddition(p1,p2,b):
    add = 0
    pow = 0
    c = 0
    while p1 != 0 or p2 != 0 or c != 0:
        d1 = p1 % 10
        d2 = p2 % 10
        d = d1 + d2 + c
        
        if d >= b:
            c = d//b
            d = d % b
        else:
            c = 0
        add += d * 10 ** pow
        pow += 1 
        p1 //=10
        p2 //=10        
    return add
    
# def ends here

def multiplication(n2,d1,b):
    pow = 0
    conv = 0
    c = 0
    while n2 != 0 or c != 0:
        d2 = n2 % 10
        d = (d1 * d2) + c
        if d >= b:
            c = d // b
            d = d % b
        else:
            c = 0
        conv += d * 10 ** pow
        pow +=1
        n2 //= 10
    return conv

def main():
    n2 = 45
    n1 = 4321
    # faith is n2 > n1
    if n2 < n1 :
        temp = n1
        n1 = n2
        n2 = temp
    b = 6
    temp = n2
    mpow = 0
    mNum = 0
    while n1 != 0:
        d1 = n1 % 10
        n2 = temp
        conv = multiplication(n2,d1,b)
        conv = conv * 10 ** mpow 
        mNum = baseAddition(mNum,conv,b)
        mpow +=1
        n1 //= 10
    print(mNum)


if __name__ == "__main__":
    main()