@ZULL-749
Feature: 


		#@ZULL-747
		 Background:
		    Given  the user is logged in
		    When  the user navigates to Company on the main page and clicks Add News
		

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # User should be able to select the type of information under preview text 
	# # User should be able to select a date and set a time under preview text
	# # User should be able to add and remove a picture under details
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # User should be able to select Text, HTML, and Visual Editor
	# # User should be able to send news
	@ZULL-743 @ZULL-748
	Scenario: TC-001 Select the type of information
		    Then  user can select the type of information
			

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # User should be able to select the type of information under preview text 
	# # User should be able to select a date and set a time under preview text
	# # User should be able to add and remove a picture under details
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # User should be able to select Text, HTML, and Visual Editor
	# # User should be able to send news
	@ZULL-744 @ZULL-748
	Scenario: TC-002 Add tags under details
		    When the user types the world in the Title inputbox
		    And the user clicks on Details
		    And the user types picture in the tags inputbox
		    And the user clicks on Save
		    Then user is able to add tags under details
			

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # User should be able to select the type of information under preview text 
	# # User should be able to select a date and set a time under preview text
	# # User should be able to add and remove a picture under details
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # User should be able to select Text, HTML, and Visual Editor
	# # User should be able to send news
	@ZULL-745 @ZULL-748
	Scenario: TC-003 Select Text, HTML, and Visual Editor
		    When the user clicks on Text, HTML, and Visual Editor
		    Then User is able to select Text, HTML, and Visual Editor
			

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # User should be able to select the type of information under preview text 
	# # User should be able to select a date and set a time under preview text
	# # User should be able to add and remove a picture under details
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # User should be able to select Text, HTML, and Visual Editor
	# # User should be able to send news
	@ZULL-746 @ZULL-748
	Scenario: TC-004 Send news
		    When the user types Expert Roundup: How Technology is Shaping the Future of Life Sciences in the Title inputbox
		    And the user typeS Industry leaders share perspectives on moving the life sciences industry forward under the text.
		    And the user clicks on Save and add
		    Then the page title contains "Company"
		