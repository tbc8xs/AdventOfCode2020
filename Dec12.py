file = open("C://Users//Timothy Callahan//Documents//AdventOfCode2020//Dec12Input.txt")
lines = file.readlines()
print(lines)
allLines = []
for line in lines:
    line = line.strip()
    allLines.append(line)
facing = "E"
east = 0
west = 0
north = 0
south = 0
#N, S, E, W
waypoint = [1, 0, 10, 0]
for line in allLines:
    direction = line[0]
    distance = line[1:]
    print(direction)
    print(distance)
    distance = int(distance)
    if (direction == 'E'):
        waypoint[2] += distance
    elif (direction == 'N'):
        waypoint[0] += distance
    elif (direction == 'S'):
        waypoint[1] += distance
    elif (direction == 'W'):
        waypoint[3] += distance
    elif (direction == 'F'):
        east += waypoint[2] * distance
        north += waypoint[0] * distance
        west += waypoint[3] * distance
        south += waypoint[1] * distance
        # if (facing == 'E'):
        #     east += distance
        # elif (facing == 'N'):
        #     north += distance
        # elif (facing == 'S'):
        #     south += distance
        # elif (facing == 'W'):
        #     west += distance
    elif (direction == 'R'):
        if (distance == 90):
            waypoint = [waypoint[3], waypoint[2], waypoint[0], waypoint[1]]
            # if (facing == 'E'):
            #     facing = 'S'
            # elif (facing == 'S'):
            #     facing = 'W'
            # elif (facing == 'W'):
            #     facing = 'N'
            # elif (facing == 'N'):
            #     facing = 'E'
        if (distance == 180):
            waypoint = [waypoint[1], waypoint[0], waypoint[3], waypoint[2]]
            # if (facing == 'E'):
            #     facing = 'W'
            # elif (facing == 'S'):
            #     facing = 'N'
            # elif (facing == 'W'):
            #     facing = 'E'
            # elif (facing == 'N'):
            #     facing = 'S'
        if (distance == 270):
            waypoint = [waypoint[2], waypoint[3], waypoint[1], waypoint[0]]
            # if (facing == 'E')
            #     facing = 'N'
            # elif (facing == 'S'):
            #     facing = 'E'
            # elif (facing == 'W'):
            #     facing = 'S'
            # elif (facing == 'N'):
            #     facing = 'W'
    elif (direction == 'L'):
        if (distance == 90):
            waypoint = [waypoint[2], waypoint[3], waypoint[1], waypoint[0]]
            # if (facing == 'E'):
            #     facing = 'N'
            # elif (facing == 'S'):
            #     facing = 'E'
            # elif (facing == 'W'):
            #     facing = 'S'
            # elif (facing == 'N'):
            #     facing = 'W'
        if (distance == 180):
            waypoint = [waypoint[1], waypoint[0], waypoint[3], waypoint[2]]
            # if (facing == 'E'):
            #     facing = 'W'
            # elif (facing == 'S'):
            #     facing = 'N'
            # elif (facing == 'W'):
            #     facing = 'E'
            # elif (facing == 'N'):
            #     facing = 'S'
        if (distance == 270):
            waypoint = [waypoint[3], waypoint[2], waypoint[0], waypoint[1]]
            # if (facing == 'E'):
            #     facing = 'S'
            # elif (facing == 'S'):
            #     facing = 'W'
            # elif (facing == 'W'):
            #     facing = 'N'
            # elif (facing == 'N'):
            #     facing = 'E'

horiz = abs(east - west)
vert = abs(north - south)
manhattan = horiz + vert
print(manhattan)