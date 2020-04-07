#!/usr/bin/python
"""
Press Enter at the end of the script in order to get the flag
"""
import os 

USER = raw_input("Enter your username: ")
os.system("ssh " + USER + "@2019shell1.picoctf.com \"nc 2019shell1.picoctf.com 47229 | grep -i pico\"")
