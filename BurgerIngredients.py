class Solution:
    def numOfBurgers(self, tomatoSlices: int, cheeseSlices: int) -> List[int]:
        if tomatoSlices == 0 or cheeseSlices ==0:
            return [0,0]
        elif tomatoSlices%2>0:
            return []
        else:
            small = ((4*cheeseSlices)-tomatoSlices)/2
            jumbo = cheeseSlices - small
            
            if (small>=0 and jumbo>=0):
                return [int(jumbo),int(small)]
            else:
                return []