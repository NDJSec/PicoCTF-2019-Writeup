#!/usr/bin/python
import os

USER = raw_input("Enter your username: ")
os.system("ssh " + USER + "@2019shell1.picoctf.com \"cd /problems/strings-it_3_8386a6aa560aecfba03c0c6a550b5c51; strings strings | grep -i pico\"")
