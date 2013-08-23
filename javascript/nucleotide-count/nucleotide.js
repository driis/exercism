var DNA = function (sequence) {
    var validNucleotides = ['A','T','C','G','U'];

    function emptyDNA() {
        return { A: 0, T: 0, C: 0, G: 0 };
    }

    function countNucleotide(acc, nucleotide) {
        acc[nucleotide] = acc[nucleotide] + 1;
        return acc;
    }

    function calculateSequence() {
        var nucleotides = sequence.split("");
        var seq = nucleotides.reduce(countNucleotide, emptyDNA());
        return seq;        
    }

    sequence = calculateSequence();

    return {
        nucleotideCounts: sequence,
        count: function(nucleotide) {
            if (validNucleotides.indexOf(nucleotide) === -1)
                throw new Error("Invalid Nucleotide");
            return sequence[nucleotide] || 0;
        }
    };
}

module.exports = DNA;