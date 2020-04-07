# Flag Shop

## Category
General Skills

## Points 
300

## Description
There's a flag shop selling stuff, can you buy a flag? [Source](https://2019shell1.picoctf.com/static/cf15b93155d8b2361ca2fc2c61ee4d5f/store.c). Connect with **nc 2019shell1.picoctf.com 60851**.

## Solution
To solve this first you want to look at the source code 

if(number_flags > 0){
    int total_cost = 0;
    total_cost = 900*number_flags;
    printf("\nThe final cost is: %d\n", total_cost);
    if(total_cost <= account_balance){
        account_balance = account_balance - total_cost;
        printf("\nYour current balance after transaction: %d\n\n", account_balance);
    }
    else{
        printf("Not enough funds to complete purchase\n");
    }


}

Here we can see that the variable total_cost is a 4 byte signed integer

This means that if we give it a large enough number allowing us to overwrite our balance with a negitive number allowing us to increase our balance to the amount we need for the flag.

There are ways to solve this with python but any number larger that 3400000 will allow us to overwrite and get the amount we need for the flag

Once we have the go to buy flags and choose 1337 Flag to get your flag.

[Solution Script](https://github.com/NDJSec/PicoCTF-2019-Writeup/blob/master/General_Skills/Flag_shop/Solution.py)
