#!/usr/bin/python

import os

USER = raw_input("Enter your username: ")
os.system("ssh "+ USER + "@2019shell1.picoctf.com \"cd /problems/first-grep--part-ii_0_b68f6a4e9cb3a7aad4090dea9dd80ce1/files; grep -r pico\" ")
