for _ in range(int(input())):
    n = int(input())
    s = input()
    if s.find("code") < s.find("chef"):
        print("AC")
    else:
        print("WA")
