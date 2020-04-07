#!/usr/bin/python

import os 

"""
Take the strings and piece them together to get the flag 
For the last few only do what is in ''
"""

F1 = os.system("curl -s https://2019shell1.picoctf.com/problem/12280/ | grep -o 'pico'")
F2 = os.system("curl -s https://2019shell1.picoctf.com/problem/12280/ | grep -o 'CTF{'" )
F3 = os.system("curl -s https://2019shell1.picoctf.com/problem/12280/ | grep -o 'no.*'")
F4 = os.system("curl -s https://2019shell1.picoctf.com/problem/12280/ | grep -o 'lie.*'")
F5 = os.system("curl -s https://2019shell1.picoctf.com/problem/12280/ | grep -o 'ts.*'")
F6 = os.system("curl -s https://2019shell1.picoctf.com/problem/12280/ | grep -o 'lz.*'")
F7 = os.system("curl -s https://2019shell1.picoctf.com/problem/12280/ | grep -o '*7.*'")

Flag = F1+F2+F3+F4+F5+F6+F7
print(Flag)
