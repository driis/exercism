Bob = function() {
	var responses = {
		"WATCH OUT!": 										"Woah, chill out!",		
		"1, 2, 3 GO!": 										"Woah, chill out!",
		"ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!": 	"Woah, chill out!",
		"Does this cryogenic chamber make me look fat?" : 	"Sure.",
		"": 												"Fine, be that way!"
	}
	return {
		hey: function(phrase) {
			var response = responses[phrase];			
			return response || "Whatever.";
		}
	}
}