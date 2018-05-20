def twoSum(arr, S):
  sum = []
  hashTable = {}
  for i in range(0, len(arr)):
    sumMinusElement = S - arr[i]
    if sumMinusElement in hashTable:
      sum.append([arr[i], sumMinusElement])
    hashTable[arr[i]] = arr[i]
  return sum

print(twoSum([2,3,9,-4,4,1], 5))      
