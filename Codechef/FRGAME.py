def f(a,b,c1,c,d):
	    if c1==3:
	        if (a>=b):
	           print("N")
	        else:
	            print("S")
	        return
	    if c1==1:
	        if (a>=b):
	           f(a,b+c,c1+1,c,d)
	        else:
	            f(a+c,b,c1+1,c,d)
	    elif c1==2:
	        if (a>=b):
	           f(a,b+d,c1+1,c,d)
	        else:
	            f(a+d,b,c1+1,c,d)
              
for _ in range(int(input())):
	a,b,c,d = map(int,input().split())
	c1=1
	f(a,b,c1,c,d)
