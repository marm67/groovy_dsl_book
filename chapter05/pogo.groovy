class POGO {
	def a = 0
	def b = 0
	def c = 0
}

def pogo1 = new POGO(a:1, b:2, c:3)
assert pogo1.a == 1
assert pogo1.b == 2
assert pogo1.c == 3

def pogo2 = new POGO(b:2, c:4)
assert pogo2.b == 2
assert pogo2.c == 4
