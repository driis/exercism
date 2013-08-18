"use strict";

var Beer = {};

Beer.verse = function(count) {
    var countString = function(count) {
        if (count === 0)
            return "no more bottles";
        if (count === 1)
            return "1 bottle"
        return count.toString() + " bottles";
    };

    var bottleString = function (count) {
        if (count === 1)
            return "it";
        return "one";
    };

    if (count === 0)
        return "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n";

    return countString(count) + " of beer on the wall, " + countString(count) + 
        " of beer.\nTake " + bottleString(count) + " down and pass it around, " + 
        countString(count - 1) + " of beer on the wall.\n"
};

Beer.sing = function(begin, end) {
    var result = "";
    end = end || 0; 
    for(; begin>=end ; begin--) {
        result = result + Beer.verse(begin) + (begin === end ? "" : "\n");
    }
    return result;
};


module.exports = Beer;