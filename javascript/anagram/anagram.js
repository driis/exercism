function Anagram(word) {

    function isAnagram(candidate) {
        if (word.length !== candidate.length)
            return false;

        for(var i = 0 ; i < word.length ; i++) {
            var charPos = candidate.indexOf(word.charAt(i));
            if (charPos === -1)
                return false;

            candidate = removeCharAt(candidate, charPos);
        }

        return true;
    };

    function removeCharAt(str, index) {
        return str.slice(0,index) + str.slice(index + 1);
    }

    return {
        match: function(candidates) {
            return candidates.filter(isAnagram);
        }
    };    
};
module.exports = Anagram;