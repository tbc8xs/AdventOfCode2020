import re
file = open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec16Input.txt")
line1 = file.readlines()
lines = []
for line in line1:
    lines.append(line.strip())
pastRules = False
rangeArray = []
total = 0

for line in lines:
    if (line[0:5]=='nearb'):
        pastRules = True
    if (pastRules == False):
        line = re.split("-| ", line)
        # print(line)
        if len(line) == 7:
            rangeArray.append(line[2])
            rangeArray.append(line[3])
            rangeArray.append(line[5])
            rangeArray.append(line[6])
        elif len(line) == 6:
            rangeArray.append(line[1])
            rangeArray.append(line[2])
            rangeArray.append(line[4])
            rangeArray.append(line[5])
    # print (rangeArray)
    elif pastRules == True  & (line[0:5] != 'nearb'):
        print(line)
        line = line.split(",")
        print(line)
        for item in line:
            inRange = False
            j = 0
            while j < len(rangeArray) - 2:
                if int(item) in range(int(rangeArray[j]), int(rangeArray[j+1])):
                    inRange = True
                j += 2
            if (inRange == False):
                total += int(item)


print(total)