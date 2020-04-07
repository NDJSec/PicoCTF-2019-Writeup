#!/usr/bin/python

import os

USER = raw_input("Enter your username: ")
os.system("ssh " + USER + "@2019shell1.picoctf.com \"cd /problems/where-is-the-file_4_f26b413d005c16c61f127740ab242b35; cat .cant_see_me\"")
