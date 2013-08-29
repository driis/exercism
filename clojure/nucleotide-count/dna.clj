(ns dna)

(defn- assert-allowed-strand [strand]
  (let [allowed-nucleotide #{\A \T \C \G \U}]
    (when-not (allowed-nucleotide strand)
      (throw (Exception. "invalid nucleotide")))))

(defn nucleotide-counts [dna-string]
  (let [empty {\A 0, \T 0, \C 0, \G 0}]
    (merge empty (frequencies dna-string))))

(defn count [strand dna-string]
  (assert-allowed-strand strand)
  (let [dna (nucleotide-counts dna-string)]
    (get (nucleotide-counts dna-string) strand 0)))