# Week-Two-Inhouse-II
Week two inhouse lab

This lab contains 2 files, a main file and a class called Money.

Money is designed to hold a dual value of dollars and cents.

Take a look at the code. Fill out the constructor, the getters (and setters if any) and the method.

One method is included, the add method.

The add method takes an existing object, adds the value of another object and returns a NEW object with the value of both objects added together.

Now, you need to make the following changes:

1.  The add() method does not normalize values. In other words, if you have more than 99 cents, it does not convert that to dollars and add that correctly. Fix this.
2. Fix the constructor to do the same.
3. Set the constructor so as to not allow negative amounts.
4. Create a subtract() method that works similar to the add method. For now, if the result is negative, simply print an error message.