<?PHP
/** SET A COOKIE IN THE BROWSER
 * $name='userid';
 * $value='rharris';
 * $expire=strotime('+1 year');
 * $path='/';
 * setCookie($name,$value, $expire, $path);
 * 
 * GET THE VALUE OF A COOKIE FROM THE BROWSER
 * $userid=$_COOKIE['userid']; //userid is rharris
 * 
 * DELETE A COOKIE FROM THE BROWSER
 * $expire=strotime('-1 year');
 * setCookie('userid',$expire,'/');
 * 
 * START A SESSION WITH THE DEFAULT COOKIE PARAMETERS
 * session_start();
 * 
 * SYNTAX OF THE session_set_cookie_params function
 * session_set_cookie_params($lifetime, $path, $domain, $secure, $httponly)
 * 
 * START A SESSION WITH CUSTOM COOKIE PARAMETERS
 * $lifetime=60*60*24*365;//1 year in seconds
 * session_set_cookie_params($lifetime, '/');
 * session_start();
 * 
 * SET AND GET SCALAR VARIABLES
 * SET A VARIABLE IN A SESSION
 * $_SESSION['product_code']='MBT-1753';
 * GET A VARIABLE FROM A SESSION
 * $product_code=$_SESSION['product_code'];
 * 
 * HOW TO SET AND GET ARRAYS
 * SET AN ARRAY IN A SESSION
 * if(!isset($_SESSION['cart'])){
 * $_SESSION['cart']['key']='value';
 * 
 * ADD AN ELEMENT TO AN ARRAY THAT' STORED IN A SESSION
 * $_SESSION['cart']['key']='value1';
 * $_SESSION['cart']['key']='value2';
 * }
 * 
 * GET AND USE AN ARRAY THAT'S STORED IN A SESSION
 * $cart=$_SESSION['cart'];
 * foreach($cart as $item) {
 * echo '<li>'.$item.'<li>';
 * }
 * REMOVE VARIABLES FROM A SESSION
 * REMOVE A SESSION VARIABLE
 * unset($_SESSION['cart']);
 * 
 * REMOVE ALL SESSION VARIABLES
 * $_SESSION=array();
 * 
 * END A SESSION
 * $_SESSION=array();//clear session data from array
 * //it is done by making the array empty
 * session_destroy();//Clean up the session ID
 * 
 * DELETE THE SESSION COOKIE FROM THE BROWSER
 * $name=session_name(); //get name of session cookie
 * $expire=strtotime('-1 year'); //Create exp date in the past
 * $params=session_get_cookie_params(); //Get Session Params
 * $path=$params['path'];
 * $domain=$params['domain'];
 * $secure=$params['secure'];
 * $httponly=$params['httponly'];
 * setCookie($name,'',$expire,$path,$domain, $secure, $httponly);
 * 
 * GET THE NAME OF THE SESSION COOKIE
 * $name=session_name(); //By default, PHPSESID
 * GET THE VALUE OF THE SESSION ID
 * $id=session_id(); //For example, lljeflfo5ogi5gjt
 * SET THE SESSION ID
 * session_id('abc123');
 */

