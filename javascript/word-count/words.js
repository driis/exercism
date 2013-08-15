function Words(sentence){
    "use strict";
    
    return { count: countWords(sentence) };

    function countWords(sentence){
        sentence = sentence.toLowerCase();
        var wordMatches = sentence.match(/\w+/g);
        return wordMatches.reduce(function(acc, word) {
            acc[word] = (acc[word] || 0) + 1;
            return acc;
        }, {});
    }
};

module.exports = Words;