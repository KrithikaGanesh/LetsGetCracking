def twoSum(arr, S):
  sum = []
  for i in range(0, len(arr)):
    for j in range(i+1, len(arr)):
      if (arr[i] + arr[j] == S):
        sum.append([arr[i], arr[j]])
  return sum

print(twoSum([2,3,4,1,9,-4], 5))  
