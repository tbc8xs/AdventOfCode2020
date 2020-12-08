file = open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec8Input.txt")
lines = file.readlines()
allLines = []
oldLines = []
acc = 0
oldI = [];

for line in lines:
    allLines.append(line)

i = 0
while i < len(allLines):
    line = allLines[i]
    print(line)
    if (oldI.__contains__(i)):
        break
    # if oldLines.__contains__(line):
    #     break
    else:
        oldI.append(i)
    ins = line[0:3]
    pos = line[4]
    num = line[5:]
    print(ins)
    print(pos)
    print(num)
    if ins == 'nop':
        print('nop hit')
        i += 1
    if ins == 'acc':
        if (pos == '+'):
            print('adding ' + num)
            acc += int(num)
            print('acc: ' + str(acc))
        else:
            print('subtracting ' + num)
            acc -= int(num)
            print('acc: ' + str(acc))

        i += 1
    if ins == 'jmp':
        if (pos == '+'):
            print('jumping up ' + num)
            i += int(num)
        else:
            print('jumping back ' + num)
            i -= int(num)
print(i)
print(oldI)
print(max(oldI))
print(acc)
#1038 change jmp -199 to nop -199 line 328
