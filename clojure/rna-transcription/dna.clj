(ns dna)

(defn- strand-convert [ch]
    (cond 
        (= \T ch) \U
        :else ch
        )
)

(defn to-rna [dna]
    (apply str (map strand-convert dna))
)