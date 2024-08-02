#Largest among 3 Numbers

#!/bin/bash

echo Enter first number
read num1
echo Enter second number
read num2
echo Enter third number
read num3

if [ $num1 -ge $num2 ] && [ $num1 -ge $num3 ];
then echo First number is greatest

elif [ $num2 -ge $num1 ] && [ $num2 -ge $num3 ];
then echo Second number is greatest

else
echo Third number is greatest

fi