function Words(sentence){
    "use strict";
    
    return { count: countWords(sentence) };

    function countWords(sentence){
        sentence = sentence.toLowerCase();
        var wordMatches = sentence.match(/\w+/g);
        var result = {};
        for(var idx = 0 ; idx < wordMatches.length ; idx++) {
            result[wordMatches[idx]] = (result[wordMatches[idx]] || 0) + 1;
        }    
        return result;
    }
};

module.exports = Words;