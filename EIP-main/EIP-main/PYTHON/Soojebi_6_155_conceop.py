a = "soojebi"
b = "fdaf"
c = 1.00
d = 1.0000
e = 1.0000


print("%s %s %.2d" % (a, b, c) )  # 변수 a와 b를 튜플 형태로 전달해야 합니다.
print("%s %s %.2d %d %2.2f" % (a, b, c,d,e) )  # 변수 a와 b를 튜플 형태로 전달해야 합니다.
print(a)
print(a, b)
print(f"{a} {b}")
print("{0} {1}".format(a,b))
print("{} {} {}".format(a,b,c))