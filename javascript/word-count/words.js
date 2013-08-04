function Words(sentence){
    "use strict";
    sentence = sentence.toLowerCase();
    var wordMatches = sentence.match(/\w+/g);
    var result = {};
    for(var idx = 0 ; idx < wordMatches.length ; idx++) {
        result[wordMatches[idx]] = (result[wordMatches[idx]] || 0) + 1;
    }
    return { count: result };
};

module.exports = Words;