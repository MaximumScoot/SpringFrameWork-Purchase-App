
# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
## C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
#### -Customized the shop name and alignment in HTML. -> mainscreen.html, line 31.
#### -Changed the background color and customizing the top header font -> mainscreen.html, lines 18-25.
#### -Added an image to spice up the page (created reference directory = /src/main/resources/static/images/) -> mainscreen.html, line 32.
## D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
#### -Mapped an AboutUsForm Spring controller in the main screen controller. -> MainScreenControllerr.java, lines 57-60.
#### -Created the controller reference in mainscreen.html for AboutUsForm.html as a centered button. Added seperation to create a navigation bar. -> mainscreen.html, lines 34-38.
#### -Created AboutUsForm.html as an about us page in /src/main/resources/templates. Added CSS wrapper to match the mainscreen (lines 15-22) -> AboutUsForm.html, new file.
## E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
#### -Added in-house parts repository to BootStrap -> BootStrapData.java, line 35.
#### -Instantiated 5 sample inventory parts, setting values and saving to parts repository -> BootStrapData.java, lines 68-101.
#### -Added a condition so sample parts do not overwrite existing data in the database. -> BootStrapData.java, line 65.
#### -Instantiated 5 sample inventory products, setting values and saving to product repository -> BootStrapData.java, lines 107-120.
#### -Added a condition so sample products do not overwrite existing data in the database. -> BootStrapData.java, line 105.
#### -Changed and updated the database -> /src/resources/application.properties, line 6.
## F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
### •  The “Buy Now” button must be next to the buttons that update and delete products.
### • The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
### •  Display a message that indicates the success or failure of a purchase.
#### -Added new mapping for a buy now product option that indicates either success or failure base on if the inventory is empty or not. Also reduces the inventory by 1, sets and saves the product option with the new inventory value. -> AddProductController.java, lines 177-200.
#### -Created new HTML form for failure of purchase. ->/src/resources/templates/failure.html.
#### -Created new HTML form for success of purchase. ->/src/resources/templates/success.html.
#### -Added new 'Buy Now' button under Products in mainscreen next to 'Update' and 'Delete' that maps to "/buyProduct" in AddProductController.java. -> mainscreen.html, line 106.
## G.  Modify the parts to track maximum and minimum inventory by doing the following:
### •  Add additional fields to the part entity for maximum and minimum inventory.
### •  Modify the sample inventory to include the maximum and minimum fields.
### •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
### •  Rename the file the persistent storage is saved to.
### •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
#### -Created two variables and mapping for min and max Parts. -> Part.java, lines 32-35.
#### -Added setters and getters for min and max variables for parts. -> Part.java, lines 90-96.
#### -Added Min Inventory and Max Inventory headers for parts on main screen. -> mainscreen.html, lines 57-58.
#### -Added mapping for parts minInv and maxInv on main screen. -> mainscreen.html, lines 68-69.
#### -Added min and max inventory values to parts objects in BootStrap. ->BootStrapData.java, lines 72-73, 81-82, 90-91, 99-100, 108-109.
#### -Updated database version. -> application.properties, line 6.
#### -Added additional text input forms so user can set inputs for min and max inventory for InHouse Parts. -> InhousePartForm.html, lines 26-30.
#### -Added titles to each entry form for InHouse Parts. -> InhousePartForm.html, line 16, 18, 21, 24.
#### -Added additional text input forms so user can set inputs for min and max inventory for Outsourced Parts. -> OutsourcedPartForm.html, lines 27-31.
#### -Added titles to each entry form for Outsourced Parts. -> OutsourcedPartForm.html, line 17, 19, 22, 25.
#### -Created new validator for the inventory values. -> /src/main/java/com/example/demo/validators/InventoryValidator.java.
#### -Created new validator interface. -> /src/main/java/com/example/demo/validators/ValidInventory.java.
#### -Created validator conditions for min and max inventory. -> InventoryValidator.java, lines 29-47.
#### -Added inventory validator annotation in the Part class. -> Part.java, line 23.
#### -With Thymeleaf, made it so validator error messages appear if exceptions are blocking InHouse Part form submit. -> InhousePartForm.html, lines 32-38.
#### -With Thymeleaf, made it so validator error messages appear if exceptions are blocking Outsourced Part form submit. -> OutsourcedPartForm.html, lines 33-39.
## H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
### •  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
### •  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
### •  Display error messages when adding and updating parts if the inventory is greater than the maximum.
#### -Added form headers for product name, price and inventory. -> productForm.html, lines 17, 19, 22.
#### -Added min and max inventory fields for available and associated parts on the product form. -> productForm.html, lines 48, 49, 70, 71.
#### -Added min and max inventory headers for Available Parts and Associated parts. -> productForm.html, lines 40, 41, 64, 65.
#### -Updated database version. -> application.properties, line 6.
#### -Added a condition to EnufPartsValidator that would also throw an error message when associated part would go below the part's minimum inventory. -> EnufPartsValidator.java, lines 38-40.
#### -Validators for updating/adding parts going below minimum inventory already added previously.
#### -Validators for updating/adding parts going above maximum inventory already added previously.
## I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
####  -Made tester and valid. -> /src/test/PartTest/, lines 160-195.
## J.  Remove the class files for any unused validators in order to clean your code.
#### -Deleted unused validator for cleanup. ->/src/main/java/com/example/demo/validators/DeletePartValidator.java
#### -Deleted unused validator form for cleanup. ->/src/main/java/com/example/demo/validators/ValidDeletePart.java
