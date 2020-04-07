#!/usr/bin/python

"""
Type in the path of the directory given to get the flag
This is need because of a parsing error with 'str(directory)'
"""

import os 

directory = os.system("curl -s https://2019shell1.picoctf.com/problem/32229/robots.txt | grep -o '/.*'")
path = raw_input("Enter the directory just printed: ")
Flag = os.system("curl https://2019shell1.picoctf.com/problem/32229/"+path+" | grep -i pico")
print(Flag)
