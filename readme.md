### Tasks
####done
1. Create functional interface with method that accepts three int values and return int value. 
Create lambda functions (as variables in main method) what implements this interface:
- First lambda returns max value
- Second – average
Invoke thous lambdas.
####done
2. Implement pattern Command. Each command has its name (with which it is invoked) and one 
string argument. You should implement 4 commands with next ways: command as lambda function, 
as method reference, as anonymous class, as object of command class. User enters command name 
and argument into console, your app invokes corresponding command.
####done
3. Create a few methods that returns list (or array) of random integers. Methods should use 
streams API and should be implemented using different Streams generators.
- Count average, min, max, sum of list values. Try to count sum using both reduce and sum Stream methods
- Count number of values that are bigger than average.
####in process
4. Create application. User enters some number of text lines (stop reading text when user enters empty line).
Application returns:
- Number of unique words
- Sorted list of all unique words
- Word count. Occurrence number of each word in the text (e.g. text “a s a” -> a-2 s-1 ). Use grouping collector.
- Occurrence number of each symbol except upper case characters.

