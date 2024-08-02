#!/bin/bash

echo Enter the number
read num;

case $num in
1)
echo "Monday"
;;

2)
echo "Tuesday"

;;

3)
echo "Wednesday"

;;

4)
echo "Thrusday"

;;

5)
echo "Friday"

;;

6)
echo "saturday"

;;

7)
echo "Sunday"

*)
echo "Invalid number"

;;

esac