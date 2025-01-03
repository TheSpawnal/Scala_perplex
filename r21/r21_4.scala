

for (x <- l if x.length > 5)
  yield for(y <- x if y > 4) yield y + 3

A: l.map(x => x.map(y => y + 3).filter(y => y > 4)).filter(x => x.length > 5)

Wrong order: it maps before filtering
Maps on outer level instead of flatMap
Wrong filter order: checks y > 4 before adding 3

B: l.filter(x => x.length > 5).flatMap(x => x.filter(y => y > 4).map(y => y + 3))

Correct filter order: x.length > 5 first
Uses flatMap for nested yields
Correct inner transformation: filter y > 4 then map y + 3

C: l.flatMap(x => x.map(y => y + 3).filter(y => y > 4)).filter(x => x.length > 5)

Wrong order: length check after processing elements
Wrong filter order: adding 3 before checking y > 4

D: l.filter(x => x.length > 5).map(x => x.filter(y => y > 4).map(y => y + 3))

Similar to B but uses map instead of flatMap for nested results
Will result in nested collection unlike original