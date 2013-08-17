"use strict";
function countString(count) {
    if (count === 0)
        return "no more bottles";
    if (count === 1)
        return "1 bottle"
    return count.toString() + " bottles";
}

function bottleString (count) {
    if (count === 1)
        return "it";
    return "one";
}

var Beer = {
    verse: function(count) {
        if (count === 0)
            return "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n";

        return countString(count) + " of beer on the wall, " + countString(count) + 
            " of beer.\nTake " + bottleString(count) + " down and pass it around, " + 
            countString(count - 1) + " of beer on the wall.\n"
    },
    sing: function(begin, end) {
        var result = "";
        end = end || 0; 
        for(; begin>=end ; begin--) {
            result = result + Beer.verse(begin) + (begin === end ? "" : "\n");
        }
        return result;
    }
};

module.exports = Beer;