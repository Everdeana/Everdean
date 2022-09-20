# Declaration of a list with an empty number
aa = []
# Number of elements in the list (four)

# print("-----case1-----")
for i in range(0, 4):
    aa.append (0) # add as append
    
# print("-----case2-----")    
sum = 0
for i in range(0, 4):
    aa[i] = int(input(str(i + 1) + "번째 정수:"))
    print(aa[i])
    print(type(aa[i]))

# print("-----case3-----")    
sum = aa[0] + aa[1] + aa[2] + aa[3]        
print("result=%d" %sum)
