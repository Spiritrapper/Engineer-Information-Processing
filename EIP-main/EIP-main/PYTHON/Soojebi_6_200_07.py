class A:  # 부모 클래스
    a = 0
    def __init__(self):
        self.a +=2
    def fn(self):
        self.a += 3
        
class B(A): # 자식클래스로 A상속
    def __init__(self):   # 오버라이딩 
        self.a += 5
    def fn(self):
        self.a += 7
        
a = B()  # 5
a.fn()   # 5 +7 = 12 
print(a.a)  #객체a 가 a필드값을 참조