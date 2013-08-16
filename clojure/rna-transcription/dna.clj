(ns dna)

(defn- strand-convert [ch]
    (if (= \T ch) \U ch)
)

(defn to-rna [dna]
    (apply str (map strand-convert dna))
)