def is_prime(n):
    if n in [2, 3, 5, 7]:
       return True
    if n % 2 == 0:
       return False
    r = 3
    while r*r <= n:
        if n%r == 0:
           return False
        r += 2
    return True
prime_num = []
count = 0
for num in range(2,100000000):
    if is_prime( num ):
        count += 1
        prime_num.append(num)
        if count == 10001:
           print( prime_num[10000] )
           break
