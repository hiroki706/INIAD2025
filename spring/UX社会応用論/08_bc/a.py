import itertools

abc = {'a': 900, 'b': 2500, 'c': 3000}

sum = 3000

for w in itertools.permutations(abc, 3):
    total = 0
    print(w)
    ABC = [0, 0, 0]
    for i in range(3):
        if total < sum:
            total += abc[w[i]]
            ABC[i] = abc[w[i]]
        ABC[i] = abc[w[i]]

#                 A   B    C
# ('a', 'b', 'c') 900 1600 500
# ('a', 'c', 'b') 900  0 2100
# ('b', 'a', 'c') 0 2500 500
# ('b', 'c', 'a') 0 2500 500
# ('c', 'a', 'b') 0 0 3000
# ('c', 'b', 'a') 0 0 3000
#                 1800/6 6600/6 9600/6
#                 300 1100 1600
