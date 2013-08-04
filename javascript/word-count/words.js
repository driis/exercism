function Words(sentence){
    "use strict";
    var idx;
    sentence = sentence.toLowerCase();
    var wordMatches = sentence.match(/\w+/g);
    var result = {};
    for(idx = 0 ; idx < wordMatches.length ; idx++) {
        result[wordMatches[idx]] = (result[wordMatches[idx]] || 0) + 1;
    }
    return { count: result };
};

module.exports = Words;