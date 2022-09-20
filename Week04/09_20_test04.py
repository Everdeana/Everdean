myList = [30, 10, 20]
print("current List: %s" %myList)

myList.append(40) #add 40 to the end of the list
print("List after append(40): %s" %myList)

print("pop-extracted value: %s" %myList.pop())
print("List after pop(): %s" %myList)
'''
pop: (__index: SupportsIndex = ..., /) -> int
Remove and return item at index (default last).
Raises IndexError if list is empty or index is out of range.
'''

myList.sort()
print("myList after sorting: %s" %myList)

# Insert, add, delete, and change data in the list
myList.insert(2, 210)
print("myList after data insertion: %s" %myList)

myList.remove(210)
print("myList after data deletion: %s" %myList)
