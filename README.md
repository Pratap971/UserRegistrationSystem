# User Registration System -  

A simple Java console-based user registration and authentication system. Users can register, log in, and view registered usernames.

## Features
- User **registration** with username and password
- User **login** authentication
- Displays **list of registered users**
- **Menu-driven system** for user interaction
- Prevents duplicate usernames

## Technologies Used
- **Java** (Core Java)
- **HashMap** (for storing user credentials)
- **Scanner** (for user input)

## How to Run
1. Clone the repository or download the `Register.java` and `UserRegistrationTest.java` files.
2. Open the files in an IDE (Eclipse, IntelliJ, VS Code) or compile them using the command line.
3. Compile the program:
javac Register.java UserRegistrationTest.java
 
4. Run the program:
   java UserRegistrationTest
  
5. Follow the on-screen options to register, log in, or view users.

## Example Usage  

1. Register
2. Login
3. Display Users
4. Exit
Choose an option: 1
Enter username: JohnDoe
Enter password: mypassword123
User registered successfully!

Choose an option: 2
Enter username: JohnDoe
Enter password: mypassword123
Login successful!

Choose an option: 3
Registered Users: [JohnDoe]

## Error Handling
- Prevents duplicate usernames during registration.
- Invalid login attempts are handled with an error message.




