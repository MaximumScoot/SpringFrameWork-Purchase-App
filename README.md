
# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
## C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
#### -Customized the shop name and alignment in HTML. -> mainscreen.html, line 31
#### -Changed the background color and customizing the top header font -> mainscreen.html, lines 18-25
#### -Added an image to spice up the page -> mainscreen.html, line 32
## D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
#### -Mapped an AboutUsForm Spring controller in the main screen controller. -> MainScreenControllerr.java, lines 57-60
#### -Created the controller reference in mainscreen.html for AboutUsForm.html as a centered button. Added seperation to create a navigation bar. -> mainscreen.html, line 34-38
#### -Created AboutUsForm.html as an about us page in /src/main/resources/templates. Added CSS wrapper to match the mainscreen (lines 15-22) -> AboutUsForm.html, new file
## E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
## F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
### •  The “Buy Now” button must be next to the buttons that update and delete products.
### • The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
### •  Display a message that indicates the success or failure of a purchase.
## G.  Modify the parts to track maximum and minimum inventory by doing the following:
### •  Add additional fields to the part entity for maximum and minimum inventory.
### •  Modify the sample inventory to include the maximum and minimum fields.
### •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
### •  Rename the file the persistent storage is saved to.
### •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
## H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
### •  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
### •  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
### •  Display error messages when adding and updating parts if the inventory is greater than the maximum.
## I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
## J.  Remove the class files for any unused validators in order to clean your code.

