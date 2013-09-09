(ns school)

(defn add [store student grade]
  (merge-with concat store {grade [student]}))

(defn grade [store grade]
  (store grade []))

(defn- sort-grade [[key value]] 
  {key (sort value)})

(defn sorted [store]
  (into (sorted-map) 
    (apply merge (map sort-grade store))))