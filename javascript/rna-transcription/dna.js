var DNA = function(dna) {
    "use strict";

    return {
        toRNA : function() {
            return dna.replace(/T/g, 'U');
        }
    };
};

module.exports = DNA;