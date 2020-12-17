with open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec10Input.txt") as f:
    s = f.read().strip().split("\n")

inputs = [int(x) for x in s]

# file = open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec10Input.txt")
# lines = file.readlines()
# inputs = []
oneDiff = 0
threeDiff = 0
lineTemp = ""

# for line in lines:
#     inputs.append(line)

# inputs.sort()
# print(inputs)
# print(len(inputs))
# for line in inputs:
#     if (lineTemp):
#         if (int(line) - int(lineTemp) == 1):
#             oneDiff += 1
#         elif (int(line) - int(lineTemp) == 3):
#             threeDiff += 1
#         lineTemp = line
#     else:
#         lineTemp = line
# print(oneDiff)
# print(threeDiff)
# print((oneDiff+1) * (threeDiff+1))

import collections
lines = sorted([0]+[*map(int,open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec10Input.txt").readlines())])
lines.append(max(lines)+3)
count = collections.defaultdict(int)
for i in range(1,len(lines)): count[lines[i]-lines[i-1]]+=1
print(count[1]*count[3])

arrange = [1]+[0]*lines[-1]
for i in lines[1:]: arrange[i] = arrange[i-3] + arrange[i-2] + arrange[i-1]
print(arrange[-1])

start = 0
end = False
tempCheck = []
allChecks = []
def checkNextThree(first):
    tempCheck.append(first)
    if(first != 168):
        if (inputs.__contains__(first + 1)):
            first += 1
            tempCheck.append(first)
        elif (inputs.__contains__(first + 2)):
            first += 2
            tempCheck.append(first)
        elif (inputs.__contains__(first + 3)):
            first += 3
            tempCheck.append(first)
        else:
            end = True
            first = 168
    if (first == 168):
        if (end == False):
            if (allChecks.__contains__(tempCheck) == False):
                allChecks.append(tempCheck)
