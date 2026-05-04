Feature: Navigating to the login page of the Sauce Demo app
	Scenario Outline:
	Given I am on the Login page of the Sauce App
	When I enter valid "<username>" and "<password>"
	And I click the login button
	Then I should be taken to the Home Page 
	Examples:
	| username 		 		  | password 	 |
	| standard_user	 		  | secret_sauce |
	#| locked_out_user		  | secret_sauce |
	#| problem_user	 		  | secret_sauce |
	#| performance_glitch_user| secret_sauce |
	#| error_user 	 		  | secret_sauce |
	#| visual_user 			  | secret_sauce |					