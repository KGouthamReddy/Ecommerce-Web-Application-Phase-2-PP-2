<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Login</title>
    </head>
    <body>
        <div th:if="${param.error}">
            Invalid username or password.
        </div>
        <div th:if="${param.logout}">
            You have been logged out.
        </div>
        <br><form th:action="@{/login}" method="post">
            <pre>
            <div><label> Username : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <div><input type="submit" value="Sign In"/></div>
            </pre>
        </form>
        <br>
        <a href="/">Return to Home Page</a>
    </body>
</html>