
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>${PageTitle}</title>
    <link rel="stylesheet" href="${rc.getContextPath()}/resources/styles/style.default.css" type="text/css" />
    <link rel="stylesheet" href="${rc.getContextPath()}/resources/styles/style.navyblue.css" type="text/css" />

    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery-migrate-1.1.1.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery-ui-1.9.2.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/modernizr.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/bootstrap.min.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/jquery.cookie.js"></script>
    <script type="text/javascript" src="${rc.getContextPath()}/resources/scripts/admin/custom.js"></script>
    <script type="text/javascript">
        /*$(document).ready(function(){
            $(':submit').live('click', function() { // This event fires when a button is clicked
                var button = $(this).val();
                $.ajax({ // ajax call starts
                    url: 'serverside.php', // JQuery loads serverside.php
                    data: 'button=' + $(this).val(), // Send value of the clicked button
                    dataType: 'json', // Choosing a JSON datatype
                    success: function(data) // Variable data contains the data we get from serverside
                    {
                        $('#wines').html(''); // Clear #wines div

                        if (button == 'all') { // If clicked buttons value is all, we post every wine
                            for (var i in data.red) {
                                $('#wines').append('Red wine: ' + data.red[i] + '<br/>');
                            }
                            for (var i in data.white) {
                                $('#wines').append('White wine: ' + data.white[i] + '<br/>');
                            }
                        }
                        else if (button == 'red') { // If clicked buttons value is red, we post only red wines
                            for (var i in data) {
                                $('#wines').append('Red wine: ' + data[i] + '<br/>');
                            }
                        }
                        else if (button == 'white') { // If clicked buttons value is white, we post only white wines
                            for (var i in data) {
                                $('#wines').append('White wine: ' + data[i] + '<br/>');
                            }
                        }
                    }
                });
                return false; // keeps the page from not refreshing
            });
        }); */

        jQuery(document).ready(function(){
            jQuery('#login').submit(function(){
                var u = jQuery('#username').val();
                var p = jQuery('#password').val();
                if(u == '' && p == '') {
                    jQuery('.login-alert').fadeIn();
                    return false;
                }
            });

            jQuery("#signUpBtn").bind("click", function(){
                jQuery.ajax({
                    url: "registrationUser",
                    type: "POST",
                    data: {username : jQuery("#usernameReg").val(), password : jQuery("#passwordReg").val()},
                    dataType: "json"
                });
            })
        });

        /*function signUp(){

        } */
    </script>
</head>

<body class="loginpage">

<div class="loginpanel">
    <div class="loginpanelinner">
        <div class="logo animate0 bounceIn">damoments - login</div>
        <form id="login" action="${rc.getContextPath()}/authenticateUser" method="post">
            <div class="inputwrapper login-alert">
                <div class="alert alert-error">Invalid username or password</div>
            </div>
            <div class="inputwrapper animate1 bounceIn">
                <input type="text" name="username" id="username" placeholder="Enter any username" />
            </div>
            <div class="inputwrapper animate2 bounceIn">
                <input type="password" name="password" id="password" placeholder="Enter any password" />
            </div>
            <div class="inputwrapper animate3 bounceIn">
                <button name="submit">Sign In</button>
            </div>
            <div class="inputwrapper animate4 bounceIn">
                <label><input type="checkbox" class="remember" name="signin" /> Keep me sign in</label>
            </div>

        </form>
    </div><!--loginpanelinner-->



    <div class="registrationpanelinner">
        <div class="logo animate0 bounceIn">damoments - sign-up</div>
        <div class="inputwrapper animate1 bounceIn">
            <input type="text" name="usernameReg" id="usernameReg" placeholder="Enter any username" />
        </div>
        <div class="inputwrapper animate1 bounceIn">
            <input type="password" name="passwordReg" id="passwordReg" placeholder="Enter any secured password" />
        </div>
        <div class="inputwrapper animate1 bounceIn">
            <input type="password" name="cnfPasswordReg" id="cnfPasswordReg" placeholder="Re-Type Password" />
        </div>

        <div class="inputwrapper animate1 bounceIn">
            <span class="formwrapper">
                <div class="radio" ><span class=""><input type="radio" name="radiofield" style="opacity: 0;" value="male"></span></div> Male &nbsp; &nbsp;
                <div class="radio" ><span class=""><input type="radio" name="radiofield" style="opacity: 0;" value="female"></span></div> Female &nbsp; &nbsp;
            </span>
        </div>
        <div class="inputwrapper animate3 bounceIn">
            <button name="submit" id="signUpBtn">Sign up</button>
        </div>
    </div>
</div><!--loginpanel-->

<div class="loginfooter">
    <p>&copy; 2013. Rovers. All Rights Reserved.</p>
</div>

</body>
</html>
