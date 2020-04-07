#!/usr/bin/python

import os

"""
Copy out the parts of the flag and paste them in your browser without the '*/', '--->', and the '0'.
"""

F1 = os.system("curl -s  https://2019shell1.picoctf.com/problem/11196/ | grep -o 'picoCTF.*'")
F2 = os.system("curl -s https://2019shell1.picoctf.com/problem/11196/mycss.css | grep -o 't3c.*'")
F3 = os.system("curl -s https://2019shell1.picoctf.com/problem/11196/myjs.js | grep -o '_lu.*'")
Flag = str(F1+F2+F3)
print(Flag)
