# web-customer-tracker
A basic spring mvc/hibernate project, side project for my own interests and practice

I wanted to review the basics of Spring MVC and Hibernate, what better way then to make CRUD MVC application!

My application is just a basic customer tracker of sorts, a admin(me) can add his/her customers to the list, customers have first name, 
last name, and email. There is also a link to either update the customer or delete the customer. For best practices i should have a lot of the things inside try catch blocks, i will get to this.

I just did this to go over spring's mvc configurations and how a spring application was done before spring boot. I linked this application 
to a MYSQL database and used the Hibernate framework to make my life easy, Hibernate allows me to query the databse for my mapped objects much 
easier then a normal standard jdbc connection, not to mention i wont have to keep repeating the jdbc code. 

If anyone out there is actually viewing this, I hope you try to make a similar application as well, it teaches you the 
basics of enterprise development in Java and gives a deeper meaning when we use Spring Boot.

Functionality (so far) - 

Home Page - A List of all current Customers, add button to lead to form page to add new customer.
![screenshot 7](https://user-images.githubusercontent.com/16232033/39972973-0ff1ac5c-56e7-11e8-806c-b828f62ebf03.png)
when you click on add, you go to this form, which you fill out accordingly, then hit save and you should have a new customer added.
![screenshot 9](https://user-images.githubusercontent.com/16232033/39972974-1438b652-56e7-11e8-933a-93298d7d7a8b.png)

Added a Delete link, it will prompt user if they want to delete, used some js for that, if they hit ok, it will delete the customer
![screenshot 10](https://user-images.githubusercontent.com/16232033/40034705-19806d18-57cc-11e8-9acd-b56191866d96.png)

Also added search, you can search by first name/last name, if you hit enter on blank you just get the normal list of all customers
![screenshot 11](https://user-images.githubusercontent.com/16232033/40034706-198c691a-57cc-11e8-95a5-a4e59b08f3b8.png)

with that I think i'm done with just practicing mvc, moving on to practice boot, you know what they say, practice makes you perfect!

might convert this all into a rest api one of these days and add some exception handling, its causing me to freak out when i see my code without try catch blocks.
