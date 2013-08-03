Bob = function() {
	isEmpty = function(phrase){
		return phrase.length === 0;
	};
	isShouting = function(phrase){
		return phrase.toUpperCase() === phrase;
	};
	isQuestion = function(phrase){
		return phrase.lastIndexOf('?') === phrase.length - 1;
	};

	return {
		hey: function(phrase) {
			if (isEmpty(phrase)) {
				return "Fine, be that way!";
			}
			if (isShouting(phrase)) {
				return "Woah, chill out!";
			}
			if (isQuestion(phrase)) {
				return "Sure.";
			}
			return "Whatever.";
		}
	};
};