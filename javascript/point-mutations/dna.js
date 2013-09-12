var DNA = function(dna) {
    "use strict";
    dna = dna.split("");
    
    return {
        hammingDistance: function(otherDna) {
            otherDna = otherDna.split("");
            var longest = dna.length > otherDna.length ? dna : otherDna;
            var shortest = dna.length > otherDna.length ? otherDna : dna;

            return shortest.reduce(function(acc, val, index) {
                if (val !== longest[index]) {
                    acc++;
                }
                return acc;
            }, 0);
        }
    };
};
module.exports = DNA;