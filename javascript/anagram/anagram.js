function Anagram(word) {
    "use strict";
    
    var normalizedWord = normalize(word);

    function isAnagram(candidate) {
        return normalize(candidate) === normalizedWord;
    }

    function normalize(str) {
        return str.split("").sort().join("");
    }

    return {
        match: function(candidates) {
            return candidates.filter(isAnagram);
        }
    };    
};
module.exports = Anagram;