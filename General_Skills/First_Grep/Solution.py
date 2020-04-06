#!/usr/bin/python
import os

USER = raw_input("Enter your username: ")
os.system("ssh " + USER + "@2019shell1.picoctf.com \"cd /problems/first-grep_3_2e09f586a51352180a37e25913f5e5d9; cat file | grep -i pico\"")
