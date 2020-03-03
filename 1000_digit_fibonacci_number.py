def fib ( LIMIT ):

    index = 2 
    fibonacci = [1,1]

    while index < LIMIT:
        new = fibonacci[index - 1] + fibonacci[index - 2]
        
        if len(str(new)) == 1000:
           return index + 1
        else:
           fibonacci.append(new)
        index += 1
    
print(fib(10000))
