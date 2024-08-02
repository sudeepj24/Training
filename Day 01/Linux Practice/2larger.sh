#Program to display largest of 2 numbers

#!/bin/bash

echo Enter number 1
read num_1
echo Enter number 2
read num_2

if [ $num_1 -gt $num_2 ]; then
echo Number 1 is greater

else
echo Number 2 is greater

fi