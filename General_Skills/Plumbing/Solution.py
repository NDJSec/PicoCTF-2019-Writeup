#!/usr/bin/python

import os

port = raw_input("Enter the port from the prompt: ")
os.system("nc 2019shell1.picoctf.com " + port + "| grep -i pico")

