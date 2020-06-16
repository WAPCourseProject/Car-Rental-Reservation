<%--
  Created by IntelliJ IDEA.
  User: Grace
  Date: 6/14/2020
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <meta name="description" content />
  <meta name="author" content />
  <title>CRRS - Login</title>
  <link rel="icon" type="image/x-icon" href="https://bernietes.github.io/res/front/assets/img/favicon.png"/>
  <link href="https://bernietes.github.io/res/back/css/sb-admin-2.css" rel="stylesheet" />
  <script data-search-pseudo-elements defer src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/all.min.js" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.24.1/feather.min.js" crossorigin="anonymous"></script>
</head>
<body class="bg-primary">
<div id="layoutAuthentication">
  <div id="layoutAuthentication_content">
    <main>
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-5">
            <div class="card shadow-lg border-0 rounded-lg mt-5">
              <div class="card-header justify-content-center"><h3 class="font-weight-light my-4">Login</h3></div>
              <div class="card-body">
                <label>${error_message}</label>
                <form method="post" >
                  <div class="form-group"><label class="small mb-1" for="inputUserName">User Name</label><input class="form-control py-4" id="inputUserName" name="inputUserName" type="text" value="${cookie.userName.value}" placeholder="Enter user name" required/></div>
                  <div class="form-group"><label class="small mb-1" for="inputPassword">Password</label><input class="form-control py-4" id="inputPassword" name="inputPassword" type="password" value="${cookie.password.value}" placeholder="Enter password" required/></div>
                  <div class="form-group">
                    <div class="custom-control custom-checkbox"><input class="custom-control-input" id="rememberPasswordCheck" ${cookie.remember.value} name="rememberPasswordCheck" value="remember" type="checkbox" /><label class="custom-control-label" for="rememberPasswordCheck">Remember password</label></div>
                  </div>
                  <div class="form-group d-flex align-items-center justify-content-between mt-4 mb-0"><a class="small" href="forget-password">Forgot Password?</a><button type="submit" class="btn btn-primary">Login</button></div>
                </form>
              </div>

              <div class="card-footer text-center">
                <div class="small"><a href="register">Need an account? Sign up!</a></div>
                <div class="small"><a href="home">Go Back to Home</a></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </div>
  <div id="layoutAuthentication_footer">
    <footer class="footer mt-auto footer-dark">
    </footer>
  </div>
</div>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="https://bernietes.github.io/res/back/js/sb-admin-2.js"></script>

</body>
</html>
