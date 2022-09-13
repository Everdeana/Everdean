# 딕셔너리(Dictionary)

example_dictionary = {
    "키값A":"값A",
    "키값B":"값B",
    "키값C":"값C",
    "키값D":"값D",
}
print(example_dictionary)
print(type(example_dictionary))
print("items():", example_dictionary)
print()
for key, element in example_dictionary.items():
    print("dictionary[{}] = {}".format(key, element))
