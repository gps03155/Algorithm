num = int(raw_input())

f0, f1, fn = 0, 1, 0

for i in range(0, num):
    fn = f0 + f1
    f0 = f1
    f1 = fn

print f0