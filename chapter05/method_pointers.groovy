def list = ["A", "B", "C"]

def addit = list.&add // method pointers are ugly

addit "D"

assert list == ["A", "B", "C", "D"]