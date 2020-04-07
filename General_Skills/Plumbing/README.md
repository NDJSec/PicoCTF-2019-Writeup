# Plumbing

## Category
General Skills

## Points 
200

## Description
Sometimes you need to handle process data outside of a file. Can you find a way to keep the output from this program and search for the flag? Connect to **2019shell1.picoctf.com 18944**.

## Solution
Solve this you will need to connect to the sever provided and pipe the output to grep to get the flag.

This can be done with nc (sever address) | grep -i pico

This connect the sever and take the output and pass it to the grep command which in this case will output all lines with pico in it which will give you your flag. 

[Solution Script](https://github.com/NDJSec/PicoCTF-2019-Writeup/blob/master/General_Skills/Plumbing/Solution.py)
