file = open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec14Input.txt")
lines = file.readlines()
mem = [None] * 100000
memSpots = []
numArray = [0] * 36
memTemp = [0] * 36
duplicates = []

for line in lines:
    if line.startswith('mask'):
        mask = line[-37:].strip()
    else :
        memTemp = [0] * 36
        numArray = [0] * 36
        i = 35
        memIn = line.index(']')
        memSpot = line[4:memIn]
        memSpots.append(memSpot)
        eq = line.index('=')
        num = int (line[eq+1:])
        # print(num)
        # print(memSpot)
        while num > 0:
            # print(num)
            if num >= 2**i:
                # print(2**i)
                # print('i')
                # print(i)
                numArray[35-i] = 1
                num -= 2**i
            if num == 1:
                # print('YEAH')
                numArray[35] = 1
                num = 0
            i -= 1
        j = 0
        while j < len(numArray):
            # print("IN HERE")
            if (mask[j] == '1'):
                # print(j)
                # print('mask i s1')
                memTemp[j] = 1
            elif mask[j] == '0':
                memTemp[j] = 0
            elif numArray[j] == 1:
                memTemp[j] = 1
            else:
                memTemp[j] = 0
            j += 1
        # print(mask)
        # print(memTemp)
        # print(memSpot)
        mem[int(memSpot)] = memTemp

print("Duplicate elements in given array: ");
#Searches for duplicate element
for i in range(0, len(memSpots)):
    for j in range(i+1, len(memSpots)):
        if(memSpots[i] == memSpots[j]):
            print(memSpots[j]);
            duplicates.append(memSpots[j])
noDupes = list(dict.fromkeys(memSpots))
total = 0
for spot in noDupes:
    memLine = mem[int(spot)]
    k = 0
    while k < len(memLine):
        if memLine[k] == 1:
            # print(k)
            # print(2**(35-k))
            total += 2**(35-k)
        elif memLine[k] == '1':
            total += 2**(35-k)
        k += 1
print(total)
