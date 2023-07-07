
### Q) How you handle Exception in Spring boot?

- `Try -Catch-finally`
- `@ControlAdvice` : Handle Global exception
- `@ExceptionHandler`: It provides a mechanism to treat exceptions that are thrown during execution of handlers(Controller operations). 
- `@ResponseStatus` : Using @ResponseStatus we can get our defined error status rather than only 500
@ExceptionHandler and @ControllerAdvice are used to define a central point for treating exceptions and wrapping them up in a class. 

