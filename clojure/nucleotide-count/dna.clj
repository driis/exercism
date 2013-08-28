(ns dna)

(defn nucleotide-counts [dna-string]
  (let [empty {\A 0, \T 0, \C 0, \G 0}]
    (merge empty (frequencies dna-string))))

(defn count [strand dna-string]
  (let [allowed-nucleotide [\A \T \C \G \U]]
    (when (not (some #{strand} allowed-nucleotide))
       (throw (Exception. "invalid nucleotide"))))

  (let [dna (nucleotide-counts dna-string)]
    (get (nucleotide-counts dna-string) strand 0)))