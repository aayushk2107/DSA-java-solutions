/*Got confused between kadane and questions like find maximum element in the array

why cause they are similar the major difference is 

KADANE="A linear algorithm that finds the maximum subarray by keeping a prefix-based local sum ,deciding at each step whether to extend or restart ,discarding prefixes that reduces future potential,and recording the global maximum separately""


QUESTIONS LIKE MAXIMUM ELEMENT IN THE ARRAY/ACCUMULATION STYLE="Always include every element (no prefix discarded),just accumulate and update the global maximum - no suffix/prefix decisions needed"


KEY IDENTIFIERS FOR KADANE

Decision at each step: “extend previous or start fresh”

Local + global separation: tracking current sum separately from max sum

Discarding negative prefixes: the algorithm “throws away” previous sums that hurt future sums

Contiguous subarray: Kadane works on consecutive elements

O(n) linear scan: no nested loops, just one pass