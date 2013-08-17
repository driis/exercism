(ns dna)

(def Thymine \T)
(def Uracil  \U)

(defn- strand-convert [ch]
    (if (= Thymine ch) 
        Uracil 
        ch)
)

(defn to-rna [dna]
    (apply str (map strand-convert dna))
)