#!/usr/bin/python

e4 = int('0x15', 16)
e8 = int('0xc', 16)
while e8 <= int('0xa3d3', 16):
    e4 += int('0x1', 16)
    e8 += int('0xaf', 16)
print(hex(e4))