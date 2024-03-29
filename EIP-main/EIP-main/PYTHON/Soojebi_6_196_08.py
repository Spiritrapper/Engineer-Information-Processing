a = "REMEMBER NOVEMBER"
b = a[:3] + a[12:16]
c = "R AND %s"% "STR" #"문자열 포맷팅 %s" %에 들어가는게 변수일땐 % 변수명 문자열일땐 % "str"
print(b+c)
