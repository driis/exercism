(ns school)

(defn add [store student grade]
  (merge-with concat store {grade [student]}))

(defn grade [store grade]
  (get store grade []))

(defn- sort-grade [grade] 
  {(first grade) (sort (second grade))})

(defn sorted [store]
  (into (sorted-map) 
    (apply merge (map sort-grade store))))