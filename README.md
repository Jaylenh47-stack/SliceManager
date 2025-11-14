# Who and Why
My name is Jaylen Hayden, a Year Up United student who was tasked with creating a point of sales application for a pizzeria for my capstone project. This application demonstrates my understanding of the course learnings so far, especially object oriented programming principles.

# What it does
The slice manager handles all of the procedures necessary for a pizzeria to get a customer to checkout.
The application starts by displaying the home screen

![image alt](https://github.com/Jaylenh47-stack/SliceManager/blob/f3fa4b6d0f393a3a475780b3f54c527e9119ec79/homeScreen.PNG)

Pressing 1 takes you to the order menu where a customer can customize their order and checkout

![image alt](https://github.com/Jaylenh47-stack/SliceManager/blob/f3fa4b6d0f393a3a475780b3f54c527e9119ec79/OrderScreen.PNG)

![image alt](https://github.com/Jaylenh47-stack/SliceManager/blob/38d1c4b116d24b3193ec95a35b467fd53e2a771d/addPizza.PNG)

When a customer is done with the checkout process the receipt is saved to the file.
![image alt](https://github.com/Jaylenh47-stack/SliceManager/blob/a6539b33cb08ac60932320266681f52819dc94da/receipt.PNG)

# Something I struggled with

Adding toppings to the pizza was more difficult for me than I expected because toppings is an array list and there is a problem if
a topping with a value of null is added. Originally, I created a topping before the switch case and I set the description of the topping to "".
This caused a problem when I input 0 to escape the menu because a null topping was added to the pizza. In the screenshot below, I changed the topping
to be created after I get a description from the user and added an if statement to handle the null case.

![image alt](https://github.com/Jaylenh47-stack/SliceManager/blob/a6539b33cb08ac60932320266681f52819dc94da/addingToppings.PNG)

# Interesting piece of code

In my first capstone project, I used a lambda expression to organize transactions without really understanding much about lambdas or why it was working.
After further learning in the course, I was able to use streams and lambdas to calculate the price of the toppings array list

![image alt](https://github.com/Jaylenh47-stack/SliceManager/blob/a6539b33cb08ac60932320266681f52819dc94da/toppingsPricing.PNG)

# Installation
This application can be run with a text editor such as IntelliJ and JDK23

# Contributions
Much of the code was inspired from previous projects I have made in my repositories, as well as assistance from My instructor Matt Christenson's github  https://github.com/orgs/YearUpFall25-S6/repositories, 
and several of my Year Up classmates.

