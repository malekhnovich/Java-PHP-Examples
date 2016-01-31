<?php

/*
 * DETERMINE IF A YEAR IS A LEAP YEAR
 * function is_leapyear($ts) {
 *  return (date('L',$ts)=='1');
 * }
 * $year_2010=is_leapyear(strtotime('2010-1-1'))//FALSE
 * $year_2012=is_leapyear(strtotime('2012-1-1'))//TRUE
 * 
 * DISPLAY A SIMPLE MESSAGE ABOUT AN EXPIRATION DATE
 * $now=time();
 * $exp=strtotime('2012-4 first day of next month midnight);
 * if($exp<$now){
 *  echo 'Your card has expired.';
 * }else{
 * echo 'Your card has not expired.';
 * }
 * 
 * DISPLAY A DETAILED MESSAGE ABOUT AN EXPIRATION DATE
 * $now=time();
 * $exp='04/2012'; //Typical expiration date format
 * //change expiration format from mm/yyyy to yyy-mm
 * $month=substr($exp,0,2);
 * $year=substr($exp,3,4);
 * $exp=$year.'-'.$month;
 * //set expiration date and calculate the number of days from current date
 * $exp=strtotime($exp. 'first day of next month midnight');
 * $days=floor(($exp-$now)/86400); //There are 86400 seconds/day
 * 
 * //display a message
 * if($days<0) {
 * echo 'Your card expired'.abs($days).'days ago.';
 * }else if($days>0){
 * echo 'Your card expires in' .days.'days.';
 * }else{
 * echo 'Your card expires at midnight.';
 * 
 * //DISPLAY A COUNTDOWN UNTIL THE NEW YEAR
 * $now=time();
 * $new_year=strtotime('next year Jan 2st',$now)l
 * //calculate the days, hours, minutes, and seconds
 * $seconds=$new_year-$now;
 * $days=floor($seconds/86400);
 * $second-=$days*86400;
 * $hours=floor($seconds/3600);
 * $seconds-=$hours*3600;
 * $minutes=floor($seconds/60);
 * $seconds-=$minutes*60;
 * 
 * //display the countdown
 * echo "$days days and $hours:$minutes:$seconds remaining to new year. ";
 *
 * 
 * Creating a DateTime Object
 * USING THE CURRENT DATE AND TIME
 * $now=new DateTime();
 * 
 * USING A strtotime FORMAT STRING
 * $expires=new DateTime('2012-03-15 13:30:00');
 * $tomorrow=new DateTime('+1 day');
 * $due_date=new DateTime('+3 weeks');
 * $appointment=new DateTime('next Friday +1 week 13:30');
 *  
 * HOW TO USE METHODS OF A DATETIME OBJECT
 * COPYING A DATETIME OBJECT
 * $invoice_date=new DateTime('2012'03'15 13:30:00');
 * $due_date=clone $invoice_date;
 * 
 * HOW TO SET THE TIME AND DATE OF A DateTime object
 * $due_date->setTime(22,30,0);//10:30 pm
 * $due_date->setDate(2012,3,15);// 3/15/2012
 * HOW TO MODIFY A DateTime OBJECT
 * $due_date->modify('+3 weeks');
 * 
 * HOW TO DISPLAY A DateTime 
 *echo 'Payment Due: '.$due_date->format('M.j,Y \a\t g:i a');
 * 
 * HOW TO CONVERT A timestamp to a DateTime object
 * $tomorrow=strtotime('tomorrow 8am');
 * 
 * //Date interval represents a span of time, or a period of time, rather than a point int time
 * 
 * HOW TO CREATE A DateInterval Object
 * $interval=new DateInterval('P30D'); //30 days
 * 
 * USING INTERVAL STRING
 * $interval_1=new DateInterval('P1Y2M10D'); // 1 year, 2 months, 10 days
 * $interval_2=new DateInterval('PT1H2M3S');//  1 hour, 2 minutes, 3 seconds
 * $interval_3=new DateInterval('P1Y2M3DT1H2M3S);//1 year, 2 months, 3 days, 1hour, 2 minutes, 3 seconds
 * 
 * 
 * DISPLAYING A DATE INTERVAL
 * echo $interval_1->format('%m months, %d days'); //2 months, 10 days
 * echo $interval_1->format('%R %M months'); //'+02 months'
 * //%R sign of the interval "+" for positive and "-" for negative 
 * 
 */

