file = open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec13Input.txt")
lines = file.readlines()
lowMod = 10000000000
lowId = 0
othArr = []
others = lines[1]
othArr = others.split(",")
num = lines[0]
for element in othArr:
    if element != 'x':
        element = int (element)
        bigEl = 0
        while(bigEl < int (num)):
            bigEl += element
        tempMod = bigEl - int (num)
        if tempMod < lowMod:
            print(tempMod)
            lowMod = tempMod
            lowId = element
print(lowId)
print(lowMod)
print(lowMod * lowId)