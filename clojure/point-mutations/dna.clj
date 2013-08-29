(ns dna)

(defn- different? [first second]
  (if (= first second)
    0
    1))

(defn hamming-distance [first second]
  (reduce + (map different? first second)))