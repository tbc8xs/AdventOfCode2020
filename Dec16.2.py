import re
file = open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec16Input.txt")
line1 = file.readlines()
lines = []
for line in line1:
    lines.append(line.strip())
pastRules = False
rangeArray = []
total = 0
nearby = []

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
        nearby.append(line)
        # print(line)
        lineSplit = line.split(",")
        # print(line)
        for item in lineSplit:
            inRange = False
            j = 0
            while j < len(rangeArray) - 2:
                if int(item) in range(int(rangeArray[j]), int(rangeArray[j+1])):
                    inRange = True
                j += 2
            if (inRange == False):
                nearby.remove(line)

# print(nearby)
# Add all first elements, all second elements, etc to arrays
# if all in array of first elements in range (): thats the rule

array0 = []
array1 = []
array2 = []
array3 = []
array4 = []
array5 = []
array6 = []
array7 = []
array8 = []
array9 = []
array10 = []
array11 = []
array12 = []
array13 = []
array14 = []
array15 = []
array16 = []
array17 = []
array18 = []
array19 = []

for line in nearby:
    line = line.split(",")
    array0.append(line[0])
    array1.append(line[1])
    array2.append(line[2])
    array3.append(line[3])
    array4.append(line[4])
    array5.append(line[5])
    array6.append(line[6])
    array7.append(line[7])
    array8.append(line[8])
    array9.append(line[9])
    array10.append(line[10])
    array11.append(line[11])
    array12.append(line[12])
    array13.append(line[13])
    array14.append(line[14])
    array15.append(line[15])
    array16.append(line[16])
    array17.append(line[17])
    array18.append(line[18])
    array19.append(line[19])

a19field1 = True
a19field2 = True
a19field3 = True
a19field4 = True
a19field5 = True
a19field6 = True
a19field7 = True
a19field8 = True
a19field9 = True
a19field10 = True
a19field11 = True
a19field12 = True
a19field13 = True
a19field14 = True
a19field15 = True
a19field16 = True
a19field17 = True
a19field18 = True
a19field19 = True
a19field20 = True
for item in array19:
    # print(item)
    if (int(item) not in range(int(rangeArray[0]), int(rangeArray[1]))) & (int(item) not in range(int(rangeArray[2]), int(rangeArray[3]))):
        a19field1 = False
    if (int(item) not in range(int(rangeArray[4]), int(rangeArray[5]))) & (int(item) not in range(int(rangeArray[6]), int(rangeArray[7]))):
        a19field2 = False
    if (int(item) not in range(int(rangeArray[8]), int(rangeArray[9]))) & (int(item) not in range(int(rangeArray[10]), int(rangeArray[11]))):
        a19field3 = False
    if (int(item) not in range(int(rangeArray[12]), int(rangeArray[13]))) & (int(item) not in range(int(rangeArray[14]), int(rangeArray[15]))):
        a19field4 = False
    if (int(item) not in range(int(rangeArray[16]), int(rangeArray[17]))) & (int(item) not in range(int(rangeArray[18]), int(rangeArray[19]))):
        a19field5 = False
    if (int(item) not in range(int(rangeArray[20]), int(rangeArray[21]))) & (int(item) not in range(int(rangeArray[22]), int(rangeArray[23]))):
        a19field6 = False
    if (int(item) not in range(int(rangeArray[24]), int(rangeArray[25]))) & (int(item) not in range(int(rangeArray[26]), int(rangeArray[27]))):
        a19field7 = False
    if (int(item) not in range(int(rangeArray[28]), int(rangeArray[29]))) & (int(item) not in range(int(rangeArray[30]), int(rangeArray[31]))):
        a19field8 = False
    if (int(item) not in range(int(rangeArray[32]), int(rangeArray[33]))) & (int(item) not in range(int(rangeArray[34]), int(rangeArray[35]))):
        a19field9 = False
    if (int(item) not in range(int(rangeArray[36]), int(rangeArray[37]))) & (int(item) not in range(int(rangeArray[38]), int(rangeArray[39]))):
        a19field10 = False
    if (int(item) not in range(int(rangeArray[40]), int(rangeArray[41]))) & (int(item) not in range(int(rangeArray[42]), int(rangeArray[43]))):
        a19field11 = False
    if (int(item) not in range(int(rangeArray[44]), int(rangeArray[45]))) & (int(item) not in range(int(rangeArray[46]), int(rangeArray[47]))):
        a19field12 = False
    if (int(item) not in range(int(rangeArray[48]), int(rangeArray[49]))) & (int(item) not in range(int(rangeArray[50]), int(rangeArray[51]))):
        a19field13 = False
    if (int(item) not in range(int(rangeArray[52]), int(rangeArray[53]))) & (int(item) not in range(int(rangeArray[54]), int(rangeArray[55]))):
        a19field14 = False
    if (int(item) not in range(int(rangeArray[56]), int(rangeArray[57]))) & (int(item) not in range(int(rangeArray[58]), int(rangeArray[59]))):
        a19field15 = False
    if (int(item) not in range(int(rangeArray[60]), int(rangeArray[61]))) & (int(item) not in range(int(rangeArray[62]), int(rangeArray[63]))):
        a19field16 = False
    if (int(item) not in range(int(rangeArray[64]), int(rangeArray[65]))) & (int(item) not in range(int(rangeArray[66]), int(rangeArray[67]))):
        a19field17 = False
    if (int(item) not in range(int(rangeArray[68]), int(rangeArray[69]))) & (int(item) not in range(int(rangeArray[70]), int(rangeArray[71]))):
        a19field18 = False
    if (int(item) not in range(int(rangeArray[72]), int(rangeArray[73]))) & (int(item) not in range(int(rangeArray[74]), int(rangeArray[75]))):
        a19field19 = False
    if (int(item) not in range(int(rangeArray[76]), int(rangeArray[77]))) & (int(item) not in range(int(rangeArray[78]), int(rangeArray[79]))):
        a19field20 = False
print(a19field1)
print(a19field2)
print(a19field3)
print(a19field4)
print(a19field5)
print(a19field6)
print(a19field7)
print(a19field8)
print(a19field9)
print(a19field10)
print(a19field11)
print(a19field12)
print(a19field13)
print(a19field14)
print(a19field15)
print(a19field16)
print(a19field17)
print(a19field18)
print(a19field19)
print(a19field20)
