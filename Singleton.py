def singleton(nums):
    return (3 * sum(set(nums)) - sum(nums)) / 2

a = [12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7]
print ("The element with single occurrence is ", int(singleton(a)))
